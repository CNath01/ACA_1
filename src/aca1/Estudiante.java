package aca1;

public class Estudiante {

    //1.-ATRIBUTOS
    private String nombre;
    private String asignatura;
    private String estado;
    private double n1;
    private double n2;
    private double n3;
    private double n4;
    private double n5;
    private double promedio;
    private double prom1;
    private double prom2;
    private double prom3;
    private double prom4;

    //2.-CONSTRUCTORES
    public Estudiante() {
    }

    public Estudiante( String nombre, String asignatura, String estado, double n1, double n2, double n3, double n4, double n5, double promedio, double prom1, double prom2, double prom3, double prom4) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.estado = estado;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.promedio = promedio;
        this.prom1 = prom1;
        this.prom2 = prom2;
        this.prom3 = prom3;
        this.prom4 = prom4;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        this.n4 = n4;
    }

    public double getN5() {
        return n5;
    }

    public void setN5(double n5) {
        this.n5 = n5;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getProm1() {
        return prom1;
    }

    public void setProm1(double prom1) {
        this.prom1 = prom1;
    }

    public double getProm2() {
        return prom2;
    }

    public void setProm2(double prom2) {
        this.prom2 = prom2;
    }

    public double getProm3() {
        return prom3;
    }

    public void setProm3(double prom3) {
        this.prom3 = prom3;
    }

    public double getProm4() {
        return prom4;
    }

    public void setProm4(double prom4) {
        this.prom4 = prom4;
    }

   

    @Override
    public String toString() {
        return "-----------------|ESTUDIANTES|----------------- " 
                + "\n-Nombre: " + nombre 
                + "\n-Estado: " + estado 
                + "\n -CALCULO DIFERENCIAL: " + prom1 
                + "\n -FUNDAMENTOS DE PROGRAMACIÓN: " + prom2 
                + "\n -POO: " + prom3
                + "\n -INGLES II: " + prom4 
                + "\n -DESARROLLO DE SOFTWARE: " + n5 
                + "\n\n -Promedio: " + promedio + '}';
    }

    
    

}
