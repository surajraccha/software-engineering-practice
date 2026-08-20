package patterns.structural.adapter.problem;

public class PaymentAdapterProblem {
    public String payWithCard(int amount) {
        CardGateway gateway = new CardGateway();
        return gateway.chargeCard(amount);
    }

    public String payWithWallet(int amount) {
        WalletGateway gateway = new WalletGateway();
        return gateway.sendMoney(String.valueOf(amount));
    }

    static class CardGateway {
        String chargeCard(int amount) {
            return "Card charged: " + amount;
        }
    }

    static class WalletGateway {
        String sendMoney(String amountText) {
            return "Wallet debited: " + amountText;
        }
    }
}
