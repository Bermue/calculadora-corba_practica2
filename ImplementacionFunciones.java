import java.io.*;
import java.util.*;
import MCalculadora.*;



public class ImplementacionFunciones extends ICalculadoraPOA {
    public ImplementacionFunciones() {
        super();
    }

    public int sumar(Operadores ops) {
        return ops.a + ops.b;
    }

    public int restar(Operadores ops) {
        return ops.a - ops.b;
    }

    public int multiplicar(Operadores ops) {
        return ops.a * ops.b;
    }

    public int dividir(Operadores ops) {
        return ops.a / ops.b;
    }

    public double MPH_KMH(Operadores ops) {
        return ops.a * 1.609344;
    }

    public double IVA(Operadores ops) {
        return ops.a + (ops.a * 21 / 100);
    }

    public double Raiz(Operadores ops) {
        return Math.sqrt(ops.a) ;
    }


}