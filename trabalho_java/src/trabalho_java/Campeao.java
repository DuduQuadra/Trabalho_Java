package trabalho_java;

// Classe que representa o Campeão
class Campeao {
    private String nome;
    private int vida;
    private int ataque;
    private int armadura;

    // Construtor para inicializar o Campeão
    public Campeao(String nome, int vida, int ataque, int armadura) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
    }

    // Método para calcular e aplicar dano ao campeão
    public void takeDamage(int dano) {
        int danoRecebido = Math.max(1, dano - this.armadura); // Garante dano mínimo de 1
        this.vida = Math.max(0, this.vida - danoRecebido); // Garante que a vida não seja menor que 0
    }

    // Método para retornar o status atual do campeão
    public String status() {
        if (this.vida <= 0) {
            return this.nome + ": morreu";
        } else {
            return this.nome + ": " + this.vida + " de vida";
        }
    }

    // Métodos getters para obter os atributos necessários
    public int getAtaque() {
        return this.ataque;
    }

    public int getVida() {
        return this.vida;
    }
}