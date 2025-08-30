package br.com.mariojp.solid.srp;

public class ReceiptFormatter {

    public String format(Order order, double tax, double total, double subtotal) {
        StringBuilder recibo = new StringBuilder();
        recibo.append("=== RECIBO === \n");
        for (Item itens : order.getItems()){
            recibo.append(itens.getName() + " x" + itens.getQuantity() + " = " + itens.getTotalPrice());
        }
        recibo.append("Subtotal: " + subtotal + "\n");
        recibo.append("Tax: " + tax + "\n");
        recibo.append("Total: " + total + "\n");

        return recibo.toString();
    }
}
