
import controlador.ControladorOperaciones;
import java.util.Scanner;
import modelo.Operacion;
import vista.frmOperaciones;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

/**
 *
 * @author F20LAB207E02
 */
public class Session01 {

    public static void main(String[] args) {
        
        Operacion modelo = new Operacion(20,30);
        frmOperaciones vista = new frmOperaciones();
        
        ControladorOperaciones controlador = new ControladorOperaciones(modelo, vista);
        controlador.iniciar();
                
        /*
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("op1: ");
        int op1 = teclado.nextInt();
        System.out.println("op2: ");
        int op2 = teclado.nextInt();
        
        Operacion operacion1 = new Operacion(op1,op2);
        operacion1.printOps();
        
        System.out.println("suma: " + operacion1.sumar());
        */
    }
}
