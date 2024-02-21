package Logica;

public abstract class Persona {
    public double peso;
    public double altura;
    public int edad;

    public Persona(double peso, double altura, int edad) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public double calcular_tmb() {
        return 0;
    }

    public abstract double calcularTMB();
}
