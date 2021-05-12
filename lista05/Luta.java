

package lista05;


import java.util.Random;

public class Luta {
    Random random = new Random();
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
            
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    public void lutar(){
        if (this.aprovada == true){
            System.out.println("----------------------------");
            System.out.println("Lutadores de hoje: ");
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            int vencedor = random.nextInt(2);
            
            switch (vencedor){
            case 0:
                System.out.println("----------------------------");
                System.out.println("Empatou!");
                System.out.println("Lutadores: "+this.desafiado.getNome() + ", " + this.desafiante.getNome());
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
            case 1:
                System.out.println("----------------------------");
                System.out.println("Vencedor: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            case 2:
                System.out.println("----------------------------");
                System.out.println("Vencedo: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

            }
        } else {
            System.out.println("----------------------------");
            System.out.println("Luta não pode acontecer");
        }
    }
            
    
}
