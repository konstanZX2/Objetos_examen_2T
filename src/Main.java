public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Alejandro","ES1200212123",100);
        //he creado el objeto cuenta 1.
        Cuenta cuenta2= new Cuenta("Destino","ES12332343423",200);
        //he creado el objeto cuenta 2 que en este caso supongo que se podra usar como destino.
        for (int i = 0; i < 1; i++) {//Para probar los metodos lo meto en un bucle for, porque sino se me corta despues de mostrar uno... quiza podria haber puesto un if para elegir el que quieres usar y eso pero bueno no tengo mas tiempo xd
            cuenta1.Depositar();
            cuenta1.MostrarResultados();
            cuenta1.Retirar();
            cuenta1.MostrarResultados();
            cuenta1.Transferencia();
            cuenta1.MostrarResultados();
        }


    }
}
