package banco;

public class Pessoa {
	String nome;
	String cpf;
	String tel;
	int idade;
	
	Pessoa(String n, String c, String t, int i){
		nome = n;
		cpf = c;
		tel = t;
		idade = i;
		
	}
	
	public String toString() {
		return "Pessoa("+ nome + ", CPF = " + cpf + ", Tel = " + tel + ", Idade = " + idade + ")";
	}
}
