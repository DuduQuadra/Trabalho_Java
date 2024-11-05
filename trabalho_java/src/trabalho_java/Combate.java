package trabalho_java;

// Classe que gerencia o Combate
class Combate {
    private Campeao campeao1;
    private Campeao campeao2;

    // Construtor para inicializar o combate com dois campeões
    public Combate(Campeao campeao1, Campeao campeao2) {
        this.campeao1 = campeao1;
        this.campeao2 = campeao2;
    }

    // Método para executar o combate por um número determinado de turnos
    public void iniciar(int turnos) {
        for (int i = 1; i <= turnos; i++) {
            if (campeao1.getVida() <= 0 || campeao2.getVida() <= 0) {
                break; // Encerra o combate se algum campeão tiver vida zero
            }

            // Cada campeão ataca o outro
            campeao1.takeDamage(campeao2.getAtaque());
            campeao2.takeDamage(campeao1.getAtaque());

            // Exibe o resultado do turno atual
            System.out.println("Resultado do turno " + i + ":");
            System.out.println(campeao1.status());
            System.out.println(campeao2.status());
            System.out.println();
        }
        System.out.println("### FIM DO COMBATE ###");
    }
}