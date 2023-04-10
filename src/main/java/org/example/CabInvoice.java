package org.example;

public class CabInvoice {

    public double invoiceGenerator(double distance, int time) {
        double result = distance * 10 + time;
        if (result < 5) {
            return 5;
        }
        return result;
    }
    public double premiumInvoiceGenerator(double distance, int time) {
        double result = distance * 15 + time * 2;
        if (result < 20) {
            return 20;
        }
        return result;
    }

    public double invoiceGenerator(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.invoiceGenerator(ride.distance, ride.time);
        }
        return totalFare;
    }

    public InvoiceSummary invoiceGeneratorNew(Ride[] rides) {
        int totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.invoiceGenerator(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

    public InvoiceSummary invoiceGeneratorList(Ride[] rides, Ride[] ridesTwo,String type) {
        int fareUserOne = 0, fareUserTwo = 0, totalFare = 0;
        for (Ride ride : rides) {
            fareUserOne += this.invoiceGenerator(ride.distance, ride.time);
        }
        if (type.equals("normal")){
            for (Ride ride : ridesTwo) {
                fareUserTwo += this.invoiceGenerator(ride.distance, ride.time);
            }
        }else {
            for (Ride ride : ridesTwo) {
                fareUserTwo += this.premiumInvoiceGenerator(ride.distance, ride.time);
            }
        }
        totalFare=fareUserOne+fareUserTwo;
        return new InvoiceSummary(rides.length, totalFare);
    }
}