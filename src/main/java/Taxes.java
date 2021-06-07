import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        Scanner dcto = new Scanner(System.in);
        System.out.println("Ingrese valor del Vehiculo :");
        double valorVehiculo = entrada.nextDouble();

        System.out.println("Su valor a pagar por el impuesto sin descuento es:");
        System.out.println(
        mostrarValorImpuestoSinDescuento(valorVehiculo));



        System.out.println("Tiene descuento por pronto pago:");
        System.out.println("1 = SI");
        System.out.println("2 = NO");

        double dctoProntoPago = dcto.nextDouble();


        if (dctoProntoPago == 1 || dctoProntoPago == 2){
            System.out.println("Respuesta valida");

        }
        else {
            System.out.println("La respuesta no es correcta");
            System.out.println(dctoProntoPago);
        }

        System.out.println("Tiene descuento por Servicio Publico:");
        System.out.println("1 = SI");
        System.out.println("2 = NO");
        double dctoServicioPublico = dcto.nextDouble();
        if (dctoServicioPublico == 1 || dctoServicioPublico == 2){
            System.out.println("Respuesta valida");
        }
        else {
            System.out.println("La respuesta no es correcta");
        }

        System.out.println("Tiene descuento por Traslado cuenta:");
        System.out.println("1 = SI");
        System.out.println("2 = NO");
        double dctoTrasladoCuenta = dcto.nextDouble();
        if (dctoTrasladoCuenta == 1 || dctoTrasladoCuenta == 2){
            System.out.println("Respuesta valida");
        }
        else {
            System.out.println("La respuesta no es correcta");
        }

        //CALCULAR DESCUENTOS

        mostrarValorImpuestoConDescuento(
                calcularValorImpuesto(mostrarValorImpuestoSinDescuento(valorVehiculo),valorVehiculo,dctoProntoPago,
                        dctoServicioPublico,dctoTrasladoCuenta));

    }


    public static double calcularValorImpuesto(double valorImpuesto, double valorVehiculo,double dctoProntoPago,double dctoServicioPublico,double dctoTrasladoCuenta) {

        double descuentoProntoPago = (valorVehiculo * 1)/100;
        double descuentoServicioPublico = (valorVehiculo*5)/100;
        double descuentoTrasladoCuenta = (valorImpuesto * 10)/100;

        if (dctoProntoPago ==1 && dctoServicioPublico ==2 && dctoTrasladoCuenta ==2)
        {

            valorImpuesto = valorImpuesto - descuentoProntoPago;

        }
        else if (dctoProntoPago ==1 && dctoServicioPublico ==1 && dctoTrasladoCuenta ==2){
            valorImpuesto=(valorImpuesto - descuentoProntoPago) - descuentoServicioPublico ;

        }
        else if (dctoProntoPago ==1 && dctoServicioPublico ==1 && dctoTrasladoCuenta ==1){
            valorImpuesto=((valorImpuesto - descuentoProntoPago) - descuentoServicioPublico)- descuentoTrasladoCuenta;
        }
        else if (dctoProntoPago ==2 && dctoServicioPublico ==1 && dctoTrasladoCuenta ==2){
            valorImpuesto= valorImpuesto - descuentoServicioPublico;

        }
        else if (dctoProntoPago ==2 && dctoServicioPublico ==1 && dctoTrasladoCuenta ==1){
            valorImpuesto= (valorImpuesto - descuentoServicioPublico)-descuentoTrasladoCuenta;

        }
        else if (dctoProntoPago ==2 && dctoServicioPublico ==2 && dctoTrasladoCuenta ==1){
            valorImpuesto= (valorImpuesto -descuentoTrasladoCuenta);

        }
        else {
            mostrarValorImpuestoSinDescuento(valorVehiculo);
        }

        return valorImpuesto;

    }


    public static Double mostrarValorImpuestoSinDescuento(Double valorVehiculo){
        double valorImpuesto = (valorVehiculo * 20)/100;
        return valorImpuesto;
    }

    public static void mostrarValorImpuestoConDescuento(Double valorImpuesto){
        System.out.println("El valor a pagar es : ");
        System.out.println(valorImpuesto);

    }



}

