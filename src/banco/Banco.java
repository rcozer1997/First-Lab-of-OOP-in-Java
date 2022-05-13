package banco;
import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = s.nextLine();
		System.out.println("Telefone: ");
		String telefone = s.nextLine();
		System.out.println("CPF: ");
		String cpf = s.next();
		System.out.println("Idade");
		int idade = s.nextInt();
		s.nextLine();
		System.out.println("Numero da conta: ");
		String numero = s.nextLine();
		
		Pessoa p = new Pessoa(nome, telefone, cpf, idade);
		Conta c = new Conta(numero, p);
		
		System.out.println(p);
		System.out.println(c);
		
		System.out.println("Deposito! ");
		System.out.println(c.deposito(250));
		System.out.println(c);
		
		System.out.println("Valor disponível para saque: ");
		System.out.println(c.disponivel());
		
	}

}
