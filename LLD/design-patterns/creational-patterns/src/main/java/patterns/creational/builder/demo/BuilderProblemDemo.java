package patterns.creational.builder.demo;

import patterns.creational.builder.problem.TravelPackageProblem;
import patterns.creational.builder.problem.TravelPackageProblem.Booking;

public class BuilderProblemDemo {
    public static void main(String[] args) {
        TravelPackageProblem travelPackageProblem = new TravelPackageProblem();

        Booking familyVacation = travelPackageProblem.createFamilyVacation();
        Booking budgetTrip = travelPackageProblem.createBrokenBudgetTrip();

        System.out.println(familyVacation.summary());
        System.out.println(familyVacation.validationWarning());
        System.out.println("Insurance: " + familyVacation.hasTravelInsurance());

        System.out.println(budgetTrip.summary());
        System.out.println(budgetTrip.validationWarning());
        System.out.println("Problem: long constructors make invalid combinations easy to create.");
    }
}
