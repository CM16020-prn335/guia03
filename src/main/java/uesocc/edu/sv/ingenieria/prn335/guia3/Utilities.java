
package uesocc.edu.sv.ingenieria.prn335.guia3;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

@LocalBean
@Dependent
public class Utilities implements Serializable{
    /**
     * El metodo getResume recive una cadena de texto y devuelve los primeros 20 caracteres de esta.
     * @param texto
     * @return Devuelve un String de 20 caracteres
     */
     public String getResume(String texto){
        String resultado="";
        for (int i = 0; i < 20; i++) {
            resultado=resultado+texto.charAt(i);
        }
        return resultado;
    }
     /**
      * El metodo recive una cadena de texto y capitaliza cada palabra de dicha cadena.
      * @param texto
      * @return String texto
      */
     public String capitalizar(String texto){
         String resultado=" ";
         for (int i = 0; i < texto.length(); i++) {
             if (i==0) {
                 resultado+=texto.toUpperCase().charAt(i);
               }else if(texto.charAt(i)!=' '){
                   if (texto.charAt(i-1)==' ') {
                       i++;
                  }
                     resultado+=texto.charAt(i);
              }else{
                      if (texto.charAt(i+1)==' ') {
                         }else{
                          resultado+=" "+texto.toUpperCase().charAt(i+1);
                   }
              }
         }
          
         return resultado;
     }
     /**
      * El metodo cuenta el numero de coincidencia de palabras entre la frase y el texto
      * @param frase
      * @param texto
      * @return int coincidencias
      */
     public int contarCoincidencias(String frase, String texto){
         int coincidencia=0, posicion=0;
         
         posicion=texto.indexOf(frase);
         while (posicion != -1) {
            coincidencia++;
            posicion=texto.indexOf(frase, posicion+1 );
            
             
         }
         return coincidencia;
     }
}
