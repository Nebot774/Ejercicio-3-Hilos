public class Main {
 public static void main(String[] args) {
   Hilo[] hilos=new Hilo[4];//declaramos 5 hilos


     //bucle for en el que recorremos el array de hilos los instanciamos
     //y los iniciamos
     for(int i=0;i<hilos.length;i++){
         hilos[i]=new Hilo();
         hilos[i].start();
     }

     for(Hilo hilo:hilos){
         try{
             hilo.join();
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

     }

     System.out.println("El valor del contador es:"+Hilo.contador);

  }
 }











