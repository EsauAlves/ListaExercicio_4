package Questao4;

class CartaoCredito extends Pagamento {
        @Override
        public double processar(double valor) {
            double total = valor * 1.05;
            return valor + total;
        }
}
