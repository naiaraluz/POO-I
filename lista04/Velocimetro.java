
package lista04;


public class Velocimetro {
    private int velocidade;
    private boolean parado;

    public Velocimetro() {
        this.velocidade = 0;
        this.parado = true;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0 && velocidade <=200){
            this.velocidade = velocidade;
            if (this.velocidade==0){
                this.parado = true;
            }else {
                this.parado = false;
            }
        } else {
            System.out.println("Velocidade Inválida (0km/h à 200km/h)");
        }
    }

    public boolean getParado() {
        return this.parado;
    }

    public void setParado(boolean parado) {
        this.parado = parado;
    }
    
    
    public void acelerar(){
        if (this.velocidade >= 200){
            System.out.println("Não é possível acelerar mais, "
                    + "velocidade no limite!");
        }else {
            this.parado = false;
            this.velocidade += 5;
        }
        
    }
    
    public void freiar(){
        if (this.velocidade == 0){
            System.out.println("Não é possível freiar mais, "
                    + "o carro já está parado!");
            this.parado = true;
        }else {
            this.velocidade -= 5;
            if(this.velocidade == 0){
                this.parado = true;
            }
        }
    }
    
    public void status(){
        System.out.println("=================");
        System.out.println("Parado? " + this.parado);
        System.out.println("Velocidade: " + this.velocidade + "km/h");
        System.out.println("=================");
    }
    
}
