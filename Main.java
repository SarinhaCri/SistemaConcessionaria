import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<carro> carros = new ArrayList<>();

    
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n=== SISTEMA DE CONCESSIONÁRIA ===");
                System.out.println("1. Criar novo carro");
                System.out.println("2. Ver total de carros criados");
                System.out.println("3. Ver total de passageiros em todos os carros");
                System.out.println("4. Listar todos os carros e seus passageiros");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Digite a placa do carro: ");
                        String placa = scanner.nextLine();

                        System.out.print("Digite a quantidade de passageiros: ");
                        int passageiros = scanner.nextInt();
                        scanner.nextLine(); 

                        if (passageiros < 0) {
                            System.out.println("Quantidade inválida de passageiros.");
                            break;
                        }

                        carro novoCarro = new carro(placa, passageiros);
                        carros.add(novoCarro);
                        System.out.println("Carro criado com sucesso!");
                    }
                    case 2 -> System.out.println("Total de carros criados: " + carro.getTotalCarros());
                    case 3 -> {
                        int totalPassageiros = 0;
                        for (carro c : carros) {
                            totalPassageiros += c.getPassageiros();
                        }
                        System.out.println("Total de passageiros em todos os carros: " + totalPassageiros);
                    }
                    case 4 -> {
                        if (carros.isEmpty()) {
                            System.out.println("Nenhum carro cadastrado.");
                        } else {
                            System.out.println("--- Lista de Carros ---");
                            for (carro c : carros) {
                                System.out.println("Placa: " + c.getPlaca() + " | Passageiros: " + c.getPassageiros());
                            }
                        }
                    }
                    case 0 -> System.out.println("Encerrando o sistema...");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }

            } while (opcao != 0);
        }
    }
}
