import org.junit.Test;

import static org.junit.Assert.*;

public class Assert {

    @Test
    void  testValorImpuestoSinDescuento(){

       Double valorImpuestoSinDescuento =
               Taxes.mostrarValorImpuestoSinDescuento(23.800000);

       Double valorImpuestoSinDescuentoEsperado = 476.0000;

     assertEquals(valorImpuestoSinDescuentoEsperado,valorImpuestoSinDescuento);

    }

    @Test
    void  testValorImpuestoConDescuentoProntoPago(){

        Double valorImpuesto = Taxes.mostrarValorImpuestoSinDescuento(23.800000);

       Double valorImpuestoDescuento=
               Taxes.calcularValorImpuesto(valorImpuesto,23.800000,1,2,2);

       Double valorImpuestoDescuentoEsperado = 23.800;
       assertEquals(valorImpuestoDescuentoEsperado,valorImpuestoDescuento);



    }


    @Test
    void  testValorImpuestoConDescuentoServicioPublico(){

        Double valorImpuesto = Taxes.mostrarValorImpuestoSinDescuento(23.800000);

        Double valorImpuestoDescuento=
                Taxes.calcularValorImpuesto(valorImpuesto,23.800000,2,1,2);

        Double valorImpuestoDescuentoEsperado = 119.0000;
        assertEquals(valorImpuestoDescuentoEsperado,valorImpuestoDescuento);

    }


    @Test
    void  testValorImpuestoConDescuentoTrasladoCuenta(){

        Double valorImpuesto = Taxes.mostrarValorImpuestoSinDescuento(23.800000);

        Double valorImpuestoDescuento=
                Taxes.calcularValorImpuesto(valorImpuesto,23.800000,2,2,1);

        Double valorImpuestoDescuentoEsperado =238.0000 ;
        assertEquals(valorImpuestoDescuentoEsperado,valorImpuestoDescuento);

    }



}
