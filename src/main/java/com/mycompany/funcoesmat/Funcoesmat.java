
package com.mycompany.funcoesmat;

/**
 *
 * @author aluno
 */
public class Funcoesmat {

    public static void main(String[] args) {
 double x = 3.0;
 double y = 4.0;
 double z = -5.0;
 double a,b,c;
 
 a = Math.sqrt(x);
 b = Math.sqrt(y);
 c = Math.sqrt(25.0);
 
        System.out.println("RESULTADO EM RAIZ QUADRADA");
        System.out.println("raiz quadrada de " + x + " = " +a);
        System.out.println("raiz quadrada de " + x + " = " +b);
        System.out.println("raiz quadrada de 25 = " + c);
        
        //potência
        a = Math.pow(x,y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 2.0);
        
        System.out.println("RESULTADO DA POTENCIA");
        System.out.println(x + "elevado a " + y + " = " + a);
                System.out.println(x + "elevado ao quadrado" +b);
                        System.out.println(x + " 5 elevado ao quadrado = " +c);
                        
                        
                        


    }
}
