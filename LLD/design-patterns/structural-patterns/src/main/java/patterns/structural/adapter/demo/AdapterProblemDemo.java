package patterns.structural.adapter.demo;

import patterns.structural.adapter.problem.PaymentAdapterProblem;

public class AdapterProblemDemo {
    public static void main(String[] args) {
        PaymentAdapterProblem payment = new PaymentAdapterProblem();
        System.out.println(payment.payWithCard(500));
        System.out.println(payment.payWithWallet(500));
        System.out.println("Problem: client code knows two incompatible payment interfaces.");
    }
}
