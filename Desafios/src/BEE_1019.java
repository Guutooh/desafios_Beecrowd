/*
 Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

 import java.util.Scanner;
 
public class BEE_1019 {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        int tempo = input.nextInt();

        int horas = tempo /3600;
        tempo -= horas * 3600;

        int minutos = tempo / 60;
        tempo -= minutos *60;

        int segundos = tempo;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        input.close();

    }
}
