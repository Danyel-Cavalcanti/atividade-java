import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 0;
        boolean sair = false;

        while (!sair) {
            System.out.println("\nBem-vindo ao Banco");
            System.out.println("Escolha uma opção:");
            System.out.println("1 -> Depositar");
            System.out.println("2 -> Sacar");
            System.out.println("3 -> Ver Saldo");
            System.out.println("4 -> Sair");
            System.out.print("Opção: ");

            String opcao = leitor.next();

            if (opcao.equals("1")) {
                System.out.print("Digite o valor a ser depositado: ");
                double valor = leitor.nextDouble();
                saldo += valor;

            } else if (opcao.equals("2")) {
                System.out.print("Digite o valor a ser sacado: ");
                double valor = leitor.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente, tente novamente");
                    continue;
                }
                saldo -= valor;

            } else if (opcao.equals("3")) {
                System.out.println("Seu saldo é de: R$ " + saldo);

            } else if (opcao.equals("4")) {
                System.out.println("Obrigado por usar nosso banco!, Volte Sempre!");
                sair = true;

            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
        leitor.close();
    }
}
