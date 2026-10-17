package Questao5;

public class Main {
    public static void main(String[] args) {
        Personagem[] grupo = {
                new Guerreiro(),
                new Mago(),
                new Arqueiro()
        };

        System.out.println("--- Início do Turno de Combate ---");
        for (Personagem p : grupo) {
            p.atacar();
        }
        System.out.println("--- Fim do Turno de Combate ---");
    }
}
