package patterns.structural.decorator.demo;

import patterns.structural.decorator.problem.InvoiceDecoratorProblem;

public class DecoratorProblemDemo {
    public static void main(String[] args) {
        InvoiceDecoratorProblem invoice = new InvoiceDecoratorProblem();
        System.out.println(invoice.render("text", true, true));
        System.out.println(invoice.render("html", true, false));
        System.out.println("Problem: optional features are hard-coded into one rendering method.");
    }
}
