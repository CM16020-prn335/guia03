
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
     * @return Devuelve un String de 20 caracteres o menos dependiendo del caso
     */
     public String getResume(String texto){
        String resultado="";
         if (texto==null) {
             resultado=null;
         }else{
            if (texto.length()<20) {
                for (int i = 0; i < texto.length(); i++) {
               resultado=resultado+texto.charAt(i);
               }
            }else{
            for (int i = 0; i < 20; i++) {
               resultado=resultado+texto.charAt(i);
               }
            }
         }
        return resultado;
    }
     /**
      * El metodo recive una cadena de texto y capitaliza cada palabra de dicha cadena ademas de cambiar espacios dobles o mayores por un solo espacio.
      * @param texto
      * @return String texto con palabras correctamente capitalizadas y con espacios simples
      */
     public String capitalizar(String texto){
         String resultado="";
         if (texto == null) {
             resultado=null;
         }else{
            texto=texto.toLowerCase();
            for (int i = 0; i < texto.length(); i++) {
                if (i==0) {
                    resultado+=texto.toUpperCase().charAt(i);
                    
                  }else if(texto.charAt(i)!=' '){
                      if (texto.charAt(i-1)==' ' && texto.charAt(i-3)==' ') {
                          
                          resultado+=texto.toUpperCase().charAt(i);
                          i++;
                      }else if(texto.charAt(i-1)==' '){
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
              }
         
         return resultado;
     }
     /**
      * El metodo cuenta el numero de coincidencia de palabras entre la frase y el texto
      * @param frase
      * @param texto
      * @return devuelve un entero con el numero de coincidencias encontradas
      */
     
    public int contarCoincidencias(String texto,String frase) {
        int coincidencias = 0, lev = 0, case1, case2;
        if (texto != null) {
            String search;
            if (frase.length() < texto.length()) {
                for (case1 = frase.length(); case1 <= texto.length(); case1++, lev++) {
                    search = "";
                    for (case2 = 0 + lev; case2 < frase.length() + lev; case2++) {
                        search += String.valueOf(texto.charAt(case2));
                    }
                    if (frase.equalsIgnoreCase(search)) {
                        coincidencias++;
                    }
                }

            } else {
                coincidencias = 0;
            }
            return coincidencias;
        } else {
            return 0;
        }
   }
}
