package loops;

public class ApGpFibon {
    public static void main(String[] args){
        int starting=5;
        int length = 10;
        int diff = 2;
        String series = "5,7,9,11,13,15,17,19,21,23";

      for(int i=0;i<length;i++){
          System.out.println(starting);
          starting= starting+diff;
        }
    }
}
