
package javaapplication17;

import javax.swing.JOptionPane;


public class JavaApplication17 {

    
    public static void main(String[] args) {
    
        alumno al;
        String nom;
        int not;
    for(int i=0;i<5;i++){
        al= new alumno();
    nom= al.lerNome();
    not=al.calcularNota();
    al.darValores(nom, not);
    //al.darValores(al.lerNome(), al.calcularNota());
    //al.setNome(al.lerNome());
    }
    
    
}
}
