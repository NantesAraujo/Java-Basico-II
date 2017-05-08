class Conta{
	
	protected double saldo = 0;

	public void sacar(double valorASerSacado){
		if(this.saldo > valorASerSacado){
			this.saldo -= valorASerSacado;
		}
	}

	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}


	public double getSaldo(){
		return this.saldo;
	}

	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	public void atualiza(double taxa){
		this.saldo += (this.saldo * taxa);
	}
}