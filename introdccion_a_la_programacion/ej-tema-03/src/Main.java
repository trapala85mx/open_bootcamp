public class Main {
    public static void main(String[] args) {

        sum(1,2,3);
        Coche mi_coche = new Coche();
        System.out.println("El número actual de puertas es: " + mi_coche.puertas);
        mi_coche.incrementa_puertas();
        System.out.println("Agregando 1 puerta, ahora el coche tiene " + mi_coche.puertas + " puerta(s)");
    }

    public static void sum(float a, float b, float c){
        System.out.println(a+b+c);
    }
}

class Coche{

    int puertas;

    public void incrementa_puertas(){
        this.puertas += 1;
    }
}