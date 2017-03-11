
package alurajavaii;


public class AtualizadorDeConta {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeConta(double selic){
        this.selic = selic;
    }
    public void roda(Conta c){
        System.out.println("Saldo anterior: "+c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo atual: "+c.getSaldo());
        this.saldoTotal += c.getSaldo();
        
    }
    public double SaldoTotal(){
        return this.saldoTotal;
    }
  
}
