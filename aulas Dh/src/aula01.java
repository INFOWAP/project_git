import java.util.Scanner;

public class aula01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println(nome + " há quantos anos trabalha nesta empresa? ");
        double tempo = scanner.nextDouble();
        System.out.println(nome + " qual é o seu salário atual? ");
        double salario = scanner.nextDouble();
        scanner.close();
        double novoSalario = salario + (salario * 0.10);
        if (tempo >=10) {
            System.out.printf("%s, seu salario atual é: R$%.2f, e seu novo salario será R$%.2f.", nome, salario, novoSalario);
        } else {
            System.out.printf("%s, você ainda não tem direito a receber aumento", nome);
        }
	}
}


