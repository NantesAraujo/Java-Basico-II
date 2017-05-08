class ContaPoupanca extends Conta{

	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 3;
	}

	public void depositar(double valor){
		this.saldo = this.saldo + valor - 0.10;
	}
	
}