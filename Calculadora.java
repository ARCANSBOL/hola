package calculadora;


import java.util.Scanner;

/**
 *
 * @author Arcans
 */
public class Calculadora {

   public static void main(String args[]){ 
   Operaciones op= new Operaciones();
   int operando1;
   int operando2;
   String operador;
   Scanner entrada = new Scanner(System.in); 
   
 
System.out.println("INGRESE EL PRIMER NÚMERO"); operando1=entrada.nextInt();
System.out.println("INGRESE EL SEGUNDO NÚMERO"); operando2=entrada.nextInt();

System.out.println("QUE DESEA HACER CON LOS NUMEROS: "); 
System.out.println("PARA SUMAR DIGITE: + "); 
System.out.println("PARA RESTAR DIGITE: - "); 
System.out.println("PARA MULTIPLICAR DIGITE: * "); 
System.out.println("PARA DIVIDIR DIGITE: / ");

System.out.println("DIGITE LA OPERACIÓN"); operador=entrada.next();
       


  if (   null == operador){
    System.out.println("LA OPCIÓN NO EXISTE");
}
else   switch (operador) {
           case "+":
                int suma=op.calcularSuma();
               System.out.println("LA SUMA DE: "+operando1+" + "+operando2+" es: "+suma);
               break;

        
           default:
               System.out.println("LA OPCIÓN NO EXISTE");
               break;
    }
       /*Operaciones mostar=new Operaciones();*/
       
      
   }
   /*Scanner entrada = new Scanner(System.in); 
   int operando1;
   int operando2;
   String operador;



System.out.println("INGRESE EL PRIMER NÚMERO"); operando1=entrada.nextInt();
System.out.println("INGRESE EL SEGUNDO NÚMERO"); operando2=entrada.nextInt();

System.out.println("QUE DESEA HACER CON LOS NUMEROS: "); 
System.out.println("PARA SUMAR DIGITE: + "); 
System.out.println("PARA RESTAR DIGITE: - "); 
System.out.println("PARA MULTIPLICAR DIGITE: * "); 
System.out.println("PARA DIVIDIR DIGITE: / ");

System.out.println("DIGITE LA OPERACIÓN"); operador=entrada.next();

if (   null == operador){
    System.out.println("LA OPCIÓN NO EXISTE");
}
else   switch (operador) {
           case "+":
               int suma=calcularResta(operando1,operando2);
               System.out.println("LA SUMA DE: "+operando1+" + "+operando2+" es: "+suma);
               break;
           case "-":
               int resta=calcularResta(operando1,operando2);
               System.out.println("LA RESTA DE: "+operando1+" - "+operando2+" es: "+resta);
               break;
           case "*":
               int multiplicacion=calcularMultiplicacion(operando1,operando2);
               System.out.println("LA MULTIPLICACIÓN DE: "+operando1+" * "+operando2+" es: "+multiplicacion);
               break;
           case "/":
               double division=calcularDivision(operando1,operando2);
               System.out.println("LA DIVISIÓN DE: "+operando1+" / "+operando2+" es: "+division);
               break;
           default:
               System.out.println("LA OPCIÓN NO EXISTE");
               break;
    }

}


public static int calcularSuma(int operando1, int operando2){ return operando1+operando2;
}
public static int calcularResta(int operando1, int operando2){ return operando1-operando2;
}
public static int calcularMultiplicacion(int operando1, int operando2){ return operando1*operando2;
}
public static double calcularDivision(int operando1, int operando2){ return (operando1/operando2);
}*/


    
}

