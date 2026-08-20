package patterns.behavioral.mediator.problem;

public class CheckoutMediatorProblem {
    private boolean addressValid;
    private boolean paymentValid;
    private boolean inventoryReserved;

    public void updateAddress(boolean valid) {
        addressValid = valid;
        if (!valid) {
            paymentValid = false;
            inventoryReserved = false;
        }
    }

    public void updatePayment(boolean valid) {
        paymentValid = valid && addressValid;
    }

    public void reserveInventory() {
        inventoryReserved = addressValid && paymentValid;
    }

    public String status() {
        return "address=" + addressValid + ", payment=" + paymentValid + ", inventory=" + inventoryReserved;
    }
}
