/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_20;



import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Libreria {
    private final ArrayList <Libro> libros = new ArrayList();
    
    public void foundBook(){
        String found = JOptionPane.showInputDialog("Introduce título que desee buscar ");
            for(Libro a :libros)
                if(a.getTitulo().equalsIgnoreCase(found)){
                    JOptionPane.showMessageDialog(null,a);
                }
        
    }
    public void addBook(Libro a){
        libros.add(a);
    }
    public void sellBook(int z){
        libros.remove(z);
    }
    public String showBooks(){
       Collections.sort(libros, null);
          String z="";
          for(Libro l:libros){
              z+="\n" + l.toString();
          }
          return z;
    
    }
    public void unsuscribeBook(){
        for(int i=0;i<libros.size();i++)
            if(libros.get(i).getNumUnidades()==0)
                libros.remove(i);
            
    }

    
   
}