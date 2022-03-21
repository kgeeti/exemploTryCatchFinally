/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.kge.exemplotrycatchfinally;

/**
 *
 * @author Suporte-TI
 */
public class DividePorZeroSemTratamento {
    
    // demonstra o lançamento de exceção quando dividido por zero
    public static int quociente(int dividendo, int divisor) {
        return dividendo / divisor;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe dividendo: ");
        int auxDividendo = teclado.nextInt();
        
        System.out.println("Informe divisor  : ");
        int auxDivisor = teclado.nextInt();
        
        int resultado = quociente(auxDividendo, auxDivisor);
        
        System.out.println("Resultado da divisão:" + resultado);
    }
}
