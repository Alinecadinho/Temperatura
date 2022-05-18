package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Fa�a um programa que receba a temperatura m�dia dos 6 primeiros meses do ano e armazene-as em uma lista.
Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia,
e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
*/

public class Temperatura {
	 public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        List<Float> temp_6meses = new ArrayList<Float>();
	        float soma = 0F;

	        for (int i = 1; i <= 6; i++) {

	            System.out.println("Temperatura do M�s " + i + ": ");
	            float temp = scanner.nextFloat();
	            temp_6meses.add(temp);
	            soma += temp;

	        }

	        float media_6meses = soma / temp_6meses.size();
	        System.out.printf("M�dia Semestral das Temperaturas: %.2f\n", media_6meses + "�C");

	        for (float temp : temp_6meses) {

	            if (temp > media_6meses) {

	                int indice = temp_6meses.indexOf(temp);

	                switch (indice) {
	                    case 0:
	                        System.out.println((indice + 1) + " - Janeiro: " + temp + "�C");
	                        break;
	                    case 1:
	                        System.out.println((indice + 1) + " - Fevereiro: " + temp + "�C");
	                        break;
	                    case 2:
	                        System.out.println((indice + 1) + " - Mar�o: " + temp + "�C");
	                        break;
	                    case 3:
	                        System.out.println((indice + 1) + " - Abril: " + temp + "�C");
	                        break;
	                    case 4:
	                        System.out.println((indice + 1) + " - Maio: " + temp + "�C");
	                        break;
	                    case 5:
	                        System.out.println((indice + 1) + " - Junho: " + temp + "�C");
	                        break;

	                }

	            }

	        }

	    }
	}
     


