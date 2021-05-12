
package lista05;


public class Lista05 {

    public static void main(String[] args) {
        Lutador[] l = new Lutador[4];
        
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 110.8, 13, 0, 2);
        
        l[0].apresentar();
        l[0].ganharLuta();
        l[0].ganharLuta();
        l[0].perderLuta();
        l[0].empatarLuta();
        
        l[0].status();
        l[1].status();
        l[2].status();
        l[3].status();
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        
    }
    
}
