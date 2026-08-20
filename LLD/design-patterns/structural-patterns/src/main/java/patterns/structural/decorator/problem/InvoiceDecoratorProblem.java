package patterns.structural.decorator.problem;

public class InvoiceDecoratorProblem {
    public String render(String format, boolean withTax, boolean withDiscount) {
        String invoice = "Invoice total: 1000";
        if (withTax) {
            invoice += " + tax: 180";
        }
        if (withDiscount) {
            invoice += " - discount: 100";
        }
        if ("html".equals(format)) {
            return "<p>" + invoice + "</p>";
        }
        return invoice;
    }
}
