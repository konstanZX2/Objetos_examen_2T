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
        return nombreDelCliente;
    }

    public String getNumeroDeLaCuenta() {
        return numeroDeLaCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombreDelCliente(String nombreDelCliente) {         //Los setters se supone que son para cambiar el valor del objeto una vez creado
        this.nombreDelCliente = nombreDelCliente;
    }

    public void setNumeroDeLaCuenta(String numeroDeLaCuenta) {
        this.numeroDeLaCuenta = numeroDeLaCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean Depositar(){                        //Los diferentes metodos

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
        double retirada = escaneado.nextDouble();
        if (retirada > saldo) {
            System.out.println("No se pudo realizar su operacion");
            exito = false;
        } else if (saldo > retirada) {
            saldo = -retirada;
            exito = true;
        }return exito;
    }

    public void Transferencia(){




    }
    public void MostrarResultados(String numeroDeLaCuenta, String nombreDelCliente, double saldo){        //Para ver los resultados



    }
}
