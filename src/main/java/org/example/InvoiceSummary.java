package org.example;

public class InvoiceSummary {

    public final int numOfRides;
    public final int totalFare;
    public final int averageFare;

    public InvoiceSummary(int numOfRides, int totalFare) {
        this.numOfRides = numOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.numOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numOfRides == that.numOfRides && totalFare == that.totalFare && averageFare == that.averageFare;
    }
}