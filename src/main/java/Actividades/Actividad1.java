package Actividades;

public class Actividad1 {
    //Metodo main
    public static void main(String[] args){
        Celular miCelular = new Celular("Rojo", "Metal", "Iphone", 128.0);
        String ColorCelular = miCelular.getColor();
        System.out.println(ColorCelular);
        miCelular.setColor("Verde");
    }
}
