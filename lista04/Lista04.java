
package lista04;

public class Lista04 {

   
    public static void main(String[] args) {
        Velocimetro ac = new Velocimetro();
       
        ac.acelerar();
        ac.acelerar();
        ac.status();
        ac.freiar();
        ac.status();
        ac.freiar();
        ac.status();
        
        ac.setVelocidade(20);
        ac.status();
        
        ac.setVelocidade(300);
        
        ac.setVelocidade(0);
        ac.status();
        
        System.out.println("Teste Get Velocidade: " + ac.getVelocidade() + "km/h");
        
        
    }
    
}
