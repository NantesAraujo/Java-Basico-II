class AtualizadorDeContas{
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}

	public void roda(Conta conta){
		System.out.println("Saldo anterior: " + conta.getSaldo());
		conta.atualiza(this.selic);
		System.out.println("Saldo atual: " + conta.getSaldo());
		this.saldoTotal = conta.getSaldo();
	}

	public double getSaldoTotal(){
		return this.saldoTotal;
	}
}