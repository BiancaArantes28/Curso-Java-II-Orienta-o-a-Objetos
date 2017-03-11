
package alurajavaii;


abstract class Conta {
    protected double saldo;
    protected String nome;
    protected int agencia;
    private int numero;

    @Override
    public String toString() {
        return "Saldo "+this.saldo;
    }

    @Override
    public boolean equals(Object obj) {
        Conta outraconta = (Conta) obj;
        return this.saldo == outraconta.saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    void imprime() {
        System.out.println("Nome: "+this.nome);
    }
    public void atualiza(double taxa){
        this.saldo += this.saldo*taxa;
        
    }
    public void deposita(double valor){
        this.saldo += valor;
    }
    public void saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            
        }else{
            System.out.println("Saque não autorizado!");
        }
    }
    
   
}
