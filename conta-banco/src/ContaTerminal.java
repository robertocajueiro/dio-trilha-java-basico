import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe scanner

        Scanner sc = new Scanner(System.in);

        //TODO: Exibir as mensagens para o nosso usuários
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta !");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite o nome do Cliente !");
        String nome = sc.nextLine(); 
        sc.nextLine();

        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = sc.nextDouble();

        //TODO: Exibir as mensagens para o nosso usuários

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
        sc.close();
    }
}
