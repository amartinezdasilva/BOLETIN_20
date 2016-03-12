
package boletin_20;

import javax.swing.JOptionPane;


public class Boletin_20 {

    public static void main(String[] args) {
 /*    Realiza un programa para levar o mantemento dunha librería. Para iso :
1- Realiza un diagrama de clases que reflicta as relación entre as clases  e logo implementa o programa tendo en conta :
Cada libro de levar : título , autor , ISBN (String ) , prezo , e numero de unidades.
O programa debe :
engadir libros
Vender ( borrar ) libros
Amosar  os libros que temos  ( Os libros deben estar ordenados polo campo titulo )
Dar de baixa os libros con numero de unidades =0
Consultar un libro determinado

Na aplicación do programa utiliza un menú con todas as opción .*/
   int option;
       Libreria ejemplo = new Libreria();
       boolean condition = true;
      
        do{
             option=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción \n 1.Añadir libro \n 2.Vender libro \n 3. Mostrar libros \n 4. Dar baja un libro \n 5. Consultar libro \n 6. Cerrar programa "));
        switch(option){
        case 1 :
            ejemplo.addBook(new Libro(JOptionPane.showInputDialog("Titulo:"),JOptionPane.showInputDialog("Autor:"),JOptionPane.showInputDialog("ISBN:"),Float.parseFloat(JOptionPane.showInputDialog("Prezo:")),Integer.parseInt(JOptionPane.showInputDialog("Unidades:"))));
            break;
        case 2 :
           int positionBook= Integer.parseInt(JOptionPane.showInputDialog("Posicion libro que quieras vender "));
            ejemplo.sellBook(positionBook);
            break;
        case 3 :
            JOptionPane.showMessageDialog(null,ejemplo.showBooks());
            break;
        case 4 :
            ejemplo.unsuscribeBook();
            break;
        case 5 :
            ejemplo.foundBook();
            break;
        case 6 :
            System.exit(0);
    }
    
        }while(condition);
    
}
}
