public class Hilo extends Thread{
    //definimos contador
    static int contador=0;
    //definimos la cantidad de vueltas que dara el for
    private static final int CantidadAumentosVariables=500;

    //metodo que iniciamos un processo
    @Override
    public void run(){
      for  (int i=0;i<CantidadAumentosVariables;i++){
          synchronized (Hilo.class) {//usamos el synchronized para que solo pueda modificarlo un processo a la vez
              contador++;//por cada vuelta aumentamos el contador
          }
      }

    }

    public int devolverContador(){
        return contador;
    }


}
