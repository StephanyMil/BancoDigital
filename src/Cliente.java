import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        String nome = "Stephany Milhomem";
        String tipoDeConta = "Corrente";
        double saldo = 5000.00;
        int opcao = 0;
        Scanner escolha = new Scanner(System.in);

        System.out.println("********************");
        System.out.println("Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo Bancário: " + saldo);
        System.out.println("********************");

        String menu = """
                ** Digite a opção que deseja **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while (opcao !=4) {
            System.out.println(menu);
            opcao = escolha.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O saldo atual é: " + saldo);
                    break;

                case 2:
                    System.out.println("Qual o valor que deseja transferir?");
                    double valor = escolha.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não há saldo para realizar a transferência.");
                    } else {
                        saldo -= valor;
                        System.out.println("Novo saldo: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Valor recebido: ");
                    double captacao = escolha.nextDouble();
                    saldo += captacao;
                    System.out.println("Novo saldo: " + saldo);
                    break;

                case 4:
                    System.out.println("Volte sempre!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}