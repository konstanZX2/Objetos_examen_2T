public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Alejandro","ES1200212123",100);
        //he creado el objeto cuenta 1.
        Cuenta cuenta2= new Cuenta("Destino","ES12332343423",200);
        //he creado el objeto cuenta 2 que en este caso supongo que se podra usar como destino.
        cuenta1.Depositar();   //Que yo sepa se ponia simplemente cuenta1.Depositar(){ } y con eso valia pero me salia related problem.                 //Para probar los metodos
        cuenta1.Retirar();
        cuenta1.Transferencia();

    }
}
