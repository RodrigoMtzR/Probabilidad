package probabilidad;

import java.util.Scanner;
public class Probabilidad {

 public static void main(String[] args) {
  int valor [] = new int[10];
  int sumatoria = 0;
  float media = 0;
  double varianza = 0.0;
  double desviacion= 0.0;
  int moda = 0;
  int maximarepeticion = 0; 
  Scanner entrada = new Scanner(System.in);
  
  System.out .println("Ingrese el valor de 10 numeros"
                                     +" como muestra");
  for (int i = 0; i < 10; i++ ){
   
   System.out.print("Ingrese el valor " + (i + 1) + ":");
   valor[i] = entrada.nextInt();
   
   sumatoria = sumatoria + valor[i];
    
  }
  entrada.close();
  
  media = sumatoria / 10; 
  
 
  for(int i = 0 ; i < 10; i++){
   double rango;
   rango = Math.pow(valor[i] - media, 2f);
   varianza = varianza + rango;
  }
  varianza = varianza / 10f;
  desviacion = Math.sqrt(varianza);
  
  for(int i=0; i<valor.length; i++){
	  int repeticiones = 0;
	  for(int j=0; j<valor.length; j++){
	  if(valor[i] == valor[j])
	  repeticiones++;
	  }
	  if(repeticiones > maximarepeticion){
	  moda = valor[i];
	  maximarepeticion = repeticiones;
	  }
  
  System.out.println("Media: " + media);
  System.out.println("Varianza: " + varianza);
  System.out.println("Desvianción Estándar: " + desviacion);
  System.out.println("Moda: " + moda + " y se repitio " + maximarepeticion + "veces");
 }

}
}
