public class Age {
    public static void main(String[] args) {
      int currentYear = 2022;
      int friendYear = 1995;
      int age = currentYear - friendYear;
      
      if (18 < age && age < 30) {
          System.out.println("Имя, поздравляю вы разобрались как работает if");
      }

      System.out.println("Моему Другу " + age +  " лет");
    }
}
