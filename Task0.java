// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

public class Task0 {

  public static void main(String[] args) {
    String jewels = "aB";
    String stones = "aaaAbbbB";
    int [] jewelCount = new int[jewels.length()];
    
    for (char jewel : jewels.toCharArray()){
      for (char stone : stones.toCharArray()){
        if(stone == jewel){
          jewelCount[jewels.indexOf(jewel)] +=1;
          
        }

      }
    }
      System.out.println("jewels amount: ");
      for (char jewel : jewels.toCharArray()){
        System.out.printf("%c - %d\n", jewel, jewelCount[jewels.indexOf(jewel)]);
      }
}    }

  


