import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Ramon Silva";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        double saldoAtual = saldoInicial;
        int dadoMenu = 0;

        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldoInicial);

        String descricao = """
                 
                 Operações:
                 
                 1 - Consultar saldos.
                 2 - Receber valor.
                 3 - Transferir valor.
                 4 - Sair.
                 
                 Digite a opção desejada:
                 
                """;


        Scanner sc = new Scanner(System.in);
        while (dadoMenu != 4) {
            System.out.println(descricao);
            dadoMenu = sc.nextInt();

            switch (dadoMenu) {
                case 1:
                    System.out.println("O Seu saldo atual é de: " + saldoAtual);
                    break;

                case 2:
                    System.out.println("Digite o valor do seu saque: ");
                    Scanner saque = new Scanner(System.in);
                    double sacar = saque.nextDouble();

                    if (sacar <= saldoAtual) {
                        saldoAtual -= sacar;
                        System.out.println("Sua solicitação foi realizada com sucesso. O seu saldo atual é de: " + saldoAtual);
                    } else {
                        System.out.println("Sua solicitação não foi realizada. Confira o seu saldo!");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor que queira transferir: ");
                    Scanner tranf = new Scanner(System.in);
                    double transferir = tranf.nextDouble();

                    if (saldoAtual >= transferir) {
                        saldoAtual -= transferir;
                        System.out.println("Sua solicitação foi realizada com sucesso. O seu saldo atual é de: " + saldoAtual);
                    } else {
                        System.out.println("Sua solicitação não foi realizada. Confira o seu saldo!");
                    }
                    break;

                case 4:
                    break;
                default:
                    System.out.println("Comando inválido!");
            }
        }
    }
}