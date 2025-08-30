package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		TaxCalculator calculator = new TaxCalculator();
		var taxa = calculator.calculadora(subtotal);
		double total = subtotal + taxa;

		ReceiptFormatter recibo = new ReceiptFormatter();
		return recibo.format(order, taxa, total, subtotal);
	}
}
