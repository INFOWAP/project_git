import java.util.Scanner;

public class aula01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Qual � o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println(nome + " h� quantos anos trabalha nesta empresa? ");
        double tempo = scanner.nextDouble();
        System.out.println(nome + " qual � o seu sal�rio atual? ");
        double salario = scanner.nextDouble();
        scanner.close();
        double novoSalario = salario + (salario * 0.10);
        if (tempo >=10) {
            System.out.printf("%s, seu salario atual �: R$%.2f, e seu novo salario ser� R$%.2f.", nome, salario, novoSalario);
        } else {
            System.out.printf("%s, voc� ainda n�o tem direito a receber aumento", nome);
        }
	}
}


