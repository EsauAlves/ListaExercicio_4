package Questao4;

public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Boleto();
        Pagamento p3 = new Pix();

        double valor= 100.0;

        p1.processar(valor);
        p2.processar(valor);
        p3.processar(valor);
    }
}