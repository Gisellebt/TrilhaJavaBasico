import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       int numero = 1021;
       int agencia = 067-8;
       String nomeCliente = "Mario Andrade";
       double saldo = 237.48;
        //System.out.println("Hello, World!");
        //programa pergunta num de agencia
        System.out.println("Por favor, digite o número da Agência !");
        
        //usuario insere num de agencia
        Scanner sc = new Scanner(System.in);
        int numeroa = sc.nextInt();
        if(numeroa == numero){
        System.out.printf("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo+ " já está disponível para saque");
        }
    }
    }

