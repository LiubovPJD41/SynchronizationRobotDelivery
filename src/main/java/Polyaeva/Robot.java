package Polyaeva;

import java.util.Random;
//import java.util.concurrent.Callable;

public class Robot {      //implements Callable {
    public static final String LETTERS= "RLRFR";
    public static final int LENGTH = 100;
    public static final char SYMBOL= 'R';

    public static String generateRoute(String LETTERS, int LENGTH) {
        Random random = new Random();
        StringBuilder route = new StringBuilder();
        for (int i = 0; i < LENGTH; i++) {
            route.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        }
        return route.toString();
    }

    public static Integer freq(String string, char SYMBOL) {
        Integer freq = (int) string.chars().filter(ch -> ch == SYMBOL).count();
        return freq;
    }

  //  @Override
   // public Integer call() throws Exception {
     //   String result = generateRoute(letters, length);
      //  int freq = freq(result, symbol);
     //   return freq;
  //  }
}