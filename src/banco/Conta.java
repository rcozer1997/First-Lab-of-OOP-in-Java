package banco;

public class Conta {
	static final double LIMITE_PADRAO = 100.00;
	static final double SALDO_PADRAO = 0.00;
	String numero;
	double saldo;
	double limite;
	Pessoa cliente;


Conta (String n, double s, double l, Pessoa c) {
	numero = n;
	saldo = s;
	limite = l;
	cliente = c;
}

Conta (String n, Pessoa c){
	numero = n;
	saldo = SALDO_PADRAO;
	limite = LIMITE_PADRAO;
	cliente = c;
}

public String toString() {
	return "Conta("+ numero + ", Saldo = " + saldo + ", Limite = " + limite + ", Cliente = " + cliente + ")";
}

public double disponivel() {
	double soma = saldo + limite;
	return soma;
}

public boolean saque(double gasto) {
	if(saldo > 0) {
		saldo = saldo - gasto;
		return true;
	}
	else
		System.out.print("Saldo insuficiente! ");
		return false;
}
public double deposito(double valor) {
	saldo = saldo + valor;
	return saldo;
}
}