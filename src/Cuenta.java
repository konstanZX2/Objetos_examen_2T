import java.util.Scanner;

public class Cuenta {
    Scanner escaneado = new Scanner(System.in);

    String nombreDelCliente;
    String numeroDeLaCuenta;
    double saldo;             //Atributos

    public Cuenta(String nombreDelCliente, String numeroDeLaCuenta, double saldo) { //Parametros
        this.nombreDelCliente = nombreDelCliente;
        this.numeroDeLaCuenta = numeroDeLaCuenta;
        this.saldo = saldo;                            //Variables
    }//Este es el constructor tiene los parametros que se me pedian por ser los atributos.


    public String getNombreDelCliente() {            //Los getters para coger el valor asociado al objeto.
        return nombreDelCliente;                     //Creo todos porque no molestan
    }

    public String getNumeroDeLaCuenta() {
        return numeroDeLaCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombreDelCliente(String nombreDelCliente) {         //Los setters se supone que son para cambiar el valor del objeto una vez creado
        this.nombreDelCliente = nombreDelCliente;                     //Creo todos porque no molestan
    }

    public void setNumeroDeLaCuenta(String numeroDeLaCuenta) {
        this.numeroDeLaCuenta = numeroDeLaCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean Depositar(){                        //Los diferentes metodos
        System.out.println("Introduce el dinero a depositar");
        double deposito = escaneado.nextDouble();
        boolean exito= false;
        if (deposito>0){
        saldo+=deposito;
        exito=true;
        }else if (deposito<0){
            System.out.println("No se pudo realizar su operacion");
            exito=false;
        }return exito;
    }

    public boolean Retirar() {
        boolean exito = false;
        System.out.println("Introduce el dinero a retirar");
        double retirada = escaneado.nextDouble();
        if (retirada > saldo) {
            System.out.println("No se pudo realizar su operacion");
            exito = false;
        } else if (saldo > retirada) {
            saldo -= retirada;
            exito = true;
        }return exito;
    }

    public boolean Transferencia(){
        System.out.println("Introduce la cuenta de destino");
        String CuentaDestino= escaneado.next();
        System.out.println("Introduce el importe de la transferencia");
        double transferencia= escaneado.nextDouble();
        boolean exito=false;


        if (saldo<transferencia){
            System.out.println("No se puede realizar la transferencia");
            exito=false;}
        else if (saldo>transferencia && numeroDeLaCuenta==CuentaDestino){
            saldo +=transferencia;
            exito=true;
        }return exito;


    }
    public void MostrarResultados(){        //Para ver los resultados
        System.out.println(numeroDeLaCuenta);
        System.out.println(nombreDelCliente);
        System.out.println(saldo);


    }
}
