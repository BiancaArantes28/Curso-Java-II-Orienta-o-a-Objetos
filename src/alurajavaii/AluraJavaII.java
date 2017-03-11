
package alurajavaii;


public class AluraJavaII {

    
    public static void main(String[] args) {
        
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        c1.setSaldo(500);
        c2.setSaldo(500);
        if(c1.equals(c2)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
        
        Teste te = new Teste();
        te.inverte("Teste");
        te.bagunca("Socorram-me, subi no ônibus em Marrocos");
    }
    
}
