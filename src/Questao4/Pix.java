package Questao4;

public class Pix extends Pagamento {
        @Override
        public double processar (double valor){
            double total = valor * 0.90;
            return valor - total;
        }
}
