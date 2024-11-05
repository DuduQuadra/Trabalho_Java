package trabalho_java;

// Classe principal para executar o programa

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do primeiro campeão
        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int vida1 = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataque1 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armadura1 = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        // Cria o primeiro campeão
        Campeao campeao1 = new Campeao(nome1, vida1, ataque1, armadura1);

        // Entrada de dados do segundo campeão
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int vida2 = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataque2 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armadura2 = scanner.nextInt();

        // Cria o segundo campeão
        Campeao campeao2 = new Campeao(nome2, vida2, ataque2, armadura2);

        // Entrada do número de turnos
        System.out.print("Quantos turnos você deseja executar? ");
        int turnos = scanner.nextInt();

        // Cria e inicia o combate
        Combate combate = new Combate(campeao1, campeao2);
        combate.iniciar(turnos);

        scanner.close();
    }
}