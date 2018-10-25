package SuperFizzBuzzPackage;

public class FizzBuzzClass {
    public static void main(String[] args) {
        SuperFizzBuzz superFizzBuzz = new SuperFizzBuzz(-12, 145);
        superFizzBuzz.add(3, "Fizz");
        superFizzBuzz.add(7, "Buzz");
        superFizzBuzz.add(38, "Bazz");
        superFizzBuzz.printFizzBuzz();

        SuperFizzBuzz superFizzBuzz1 = new SuperFizzBuzz(1, 100);
        superFizzBuzz1.add(3, "Fizz");
        superFizzBuzz1.add(5, "Buzz");
        superFizzBuzz1.printFizzBuzz();

        SuperFizzBuzz superFizzBuzz2 = new SuperFizzBuzz(-100, 120);
        superFizzBuzz2.add(4, "Frog");
        superFizzBuzz2.add(13, "Duck");
        superFizzBuzz2.add(9, "Chicken");
        superFizzBuzz2.printFizzBuzz();

        SuperFizzBuzz superFizzBuzz3 = new SuperFizzBuzz(-16, 247);
        superFizzBuzz3.add(244, "Anokhi");
        superFizzBuzz3.add(35, "Kastia");
        superFizzBuzz3.add(90, "June");
        superFizzBuzz3.add(11, "December");
        superFizzBuzz3.add(4, "Ghost");
        superFizzBuzz3.add(7, "Hello");
        superFizzBuzz3.printFizzBuzz();

        SuperFizzBuzz superFizzBuzz4 = new SuperFizzBuzz(-16, 16);
        superFizzBuzz4.add(2, "Philadelphia");
        superFizzBuzz4.add(4, "California");
        superFizzBuzz4.add(8, "Texas");
        superFizzBuzz4.add(16, "Boston");
        superFizzBuzz4.add(3, "NewYork");
        superFizzBuzz4.printFizzBuzz();
    }
}
