class TestaConta{

	public static void main(String[] args){
		ContaPoupanca conta = new ContaPoupanca();

		conta.depositar(100.0);
		conta.atualiza(0.2);

		System.out.println("saldo: " + conta.getSaldo());
	}

	
}