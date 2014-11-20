package bol10ej2;

import javax.swing.JOptionPane;

public class Juego {
    
     private int numint,jug1,jug2,aux;
        private boolean perdedor=true;
    
    public Juego(){
    numint=0;
    jug1=0;
    jug2=0;
    aux=0;
    }
    
    public void GenerarDatos(){
            jug1 = (int) (Math.random()*50+1);
           numint=10;
    }
    
    public void Evaluar(){
        int resta=0;
    for(int contador=0;contador!=numint;contador++){
            do{
            String respuesta3 =JOptionPane.showInputDialog("Juega tu numero entre 1 y 50:");
            jug2 = Integer.parseInt(respuesta3);
            }while(jug2<1||jug2>50);
            if(jug2==jug1){
                perdedor=false;
                JOptionPane.showMessageDialog(null, " ENHORABUENA!!!! \n HAS ACERTADO!!");
                contador=numint-1;
                break;
            }else{
                
                resta = Math.abs(jug1-jug2);
                
                if(resta>20 &&numint!=(contador+1)){
                JOptionPane.showMessageDialog(null,"El número está muy lejos \n Te quedan " +((numint-contador)-1)+ " intentos...");
                }else if(resta<=20&&resta>=10 && numint!=(contador+1)){
                JOptionPane.showMessageDialog(null, "El número está lejos \n Te quedan " +((numint-contador)-1)+ " intentos..." );
                }else if(resta<10&&resta>=5 && numint!=(contador+1)){
                    JOptionPane.showMessageDialog(null, "El número está cerca \n Te quedan " +((numint-contador)-1)+ " intentos..." );
                }else if(resta<5 && numint!=(contador+1)){
                JOptionPane.showMessageDialog(null, "El número está muy cerca \n Te quedan " +((numint-contador)-1)+ " intentos..." );
                }
            }
            }
            
        if (perdedor==true){
        JOptionPane.showMessageDialog(null, "    Has perdido!!!! \n EL número era el " +jug1+ "\n LASTIMAAAAA...!!!");
        }
    }
    
    
    
    
}
