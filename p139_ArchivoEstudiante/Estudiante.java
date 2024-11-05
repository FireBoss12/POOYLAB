package p139_ArchivoEstudiante;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private String Nombre;
    private int Edad;
    private float Promedio;
    private char Sexo;

    public Estudiante() { }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float promedio) {
        Promedio = promedio;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + Nombre + ", Edad=" + Edad + ", Promedio=" + Promedio + ", Sexo=" + Sexo + "]";
    }
}
