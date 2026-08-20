package patterns.behavioral.mediator.demo;

import patterns.behavioral.mediator.problem.CheckoutMediatorProblem;

public class MediatorProblemDemo {
    public static void main(String[] args) {
        CheckoutMediatorProblem checkout = new CheckoutMediatorProblem();
        checkout.updateAddress(true);
        checkout.updatePayment(true);
        checkout.reserveInventory();
        System.out.println(checkout.status());
        System.out.println("Problem: checkout steps directly coordinate each other's state rules.");
    }
}
