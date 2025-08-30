package br.com.mariojp.solid.srp;

public class TaxCalculator {

    public Double calculadora(Double subtotal){
        var taxa = Double.parseDouble(System.getProperty("tax.rate"));
        return subtotal * taxa;
    }

}
