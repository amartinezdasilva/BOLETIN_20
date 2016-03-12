
package boletin_20;


import java.util.Objects;

/**
 *
 * @author AAron
 */



public class Libro {
    String titulo,autor,ISBN;
    float prezo;
    int numUnidades;

    public Libro() {
    }
    
    public Libro(String titulo, String autor, String ISBN, float prezo, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numUnidades = numUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "t\u00edtulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", numUnidades=" + numUnidades + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
   
    public int compareTo(Libro t) {
        if(titulo.compareToIgnoreCase(t.titulo)<0){
            return -1;         
        }else if(titulo.compareToIgnoreCase(t.titulo)>0){
            return 1;
        }else{
            return 0;
        }
    }
}
