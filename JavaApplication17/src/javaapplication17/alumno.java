
package javaapplication17;

import javax.swing.JOptionPane;


public class alumno {
    private String nome;
    private int nota;
     public alumno(){
         
     }
     public alumno(String nome,int nota){
         this.nome=nome;
         this.nota=nota;
     }
     public void darValores(String nome,int nota){
         this.nome=nome;
         this.nota=nota;
    }
    @Override
    public String toString(){
        return("nome: " + nome  + "nota =  "  +   nota);
        
       }
    public String lerNome(){
        String n=JOptionPane.showInputDialog("introduce nome");
        return n;
    }
    public float lerNota(){
        float no;
        do{
        String n=JOptionPane.showInputDialog("nota");
        no=Float.parseFloat(n);
        //float not= Float.parseFloat(JOptionPane.showInputDialog(n));
        }while(no<1 || no>10);
        return no;
        
    }
    public int  lerBoletin(){
       float boTotais= Float.parseFloat(JOptionPane.showInputDialog("introduce numero"));
       float boFeitos= Float.parseFloat(JOptionPane.showInputDialog("Feitos"));
       float resul=(float)boFeitos/boTotais*100;
       if(resul>=90)
           resul=2;
       else if (resul >=70 && resul <90)
           resul=1;
       else 
           resul=0;
        return (int) resul;
        
       
    }
    public int calcularNota(){
        float nota1=lerNota();
        float nota2=lerNota();
        int bole=lerBoletin();
        return (int) (nota1*0.4+nota2*0.4+bole);
        //return (int) (lerNota()*0.4+lerNota()*0.4+lerBoletin() );
    }
            
    }

