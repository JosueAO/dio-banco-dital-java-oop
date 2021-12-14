
public class Main {

	public static void main(String[] args) {
		Cliente josue = new Cliente();
		josue.setNome("Josué");
		
		Conta cc = new ContaCorrente(josue);
		Conta poupanca = new ContaPoupanca(josue);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
