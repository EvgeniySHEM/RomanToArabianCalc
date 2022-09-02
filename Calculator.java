package programms.Calk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        int firstValue = 0;
        int secondValue = 0;
        for(;;) {
        System.out.println("Введите арифметическое выражение через пробел с числами от 1(I) до 10(X):");
        String arifmeticValue = (new Scanner(System.in).nextLine());
        String [] values = arifmeticValue.split(" ");
        HashMap<String, Integer> romanAndArabian = new HashMap<>(){{
            put("I",1);put("II",2);put("III",3);put("IV",4);put("V",5);
            put("VI",6);put("VII",7);put("VIII",8);put("IX",9);put("X",10);
            put("XI",11);put("XII",12);put("XIII",13);put("XIV",14);put("XV",15);
            put("XVI",16);put("XVII",17);put("XVIII",18);put("XIX",19);put("XX",20);
            put("XXI",21);put("XXII",22);put("XXIII",23);put("XXIV",24);put("XXV",25);
            put("XXVI",26);put("XXVII",27);put("XXVIII",28);put("XXIX",29);put("XXX",30);
            put("XXXI",31);put("XXXII",32);put("XXXIII",33);put("XXXIV",34);put("XXXV",35);
            put("XXXVI",36);put("XXXVII",37);put("XXXVIII",38);put("XXXIX",39);put("XL",40);
            put("XLI",41);put("XLII",42);put("XLIII",43);put("XLIV",44);put("XLV",45);
            put("XLVI",46);put("XLVII",47);put("XLVIII",48);put("XLVIX",49);put("L",50);
            put("LI",51);put("LII",52);put("LIII",53);put("LIV",54);put("LV",55);
            put("LVI",56);put("LVII",57);put("LVIII",58);put("LVIX",59);put("LX",60);
            put("LXI",61);put("LXII",62);put("LXIII",63);put("LXIV",64);put("LXV",65);
            put("LXVI",66);put("LXVII",67);put("LXVIII",68);put("LXVIX",69);put("LXX",70);
            put("LXXI",71);put("LXXII",72);put("LXXIII",73);put("LXXIV",74);put("LXXV",75);
            put("LXXVI",76);put("LXXVII",77);put("LXXVIII",78);put("LXXVIX",79);put("LXXX",80);
            put("LXXXI",81);put("LXXXII",82);put("LXXXIII",83);put("LXXXIV",84);put("LXXXV",85);
            put("LXXXVI",86);put("LXXXVII",87);put("LXXXVIII",88);put("LXXXIX",89);put("XC",90);
            put("XCI",91);put("XCII",92);put("XCIII",93);put("XCIV",94);put("XCV",95);
            put("XCVI",96);put("XCVII",97);put("XCVIII",98);put("XCVIV",99);put("C",100);
            put("-I",-1);put("-II",-2);put("-III",-3);put("-IV",-4);put("-V",-5);
            put("-VI",-6);put("-VII",-7);put("-VIII",-8);put("-IX",-9);put("N",0);
        }};
            if (romanAndArabian.containsKey(values[0]) && !(romanAndArabian.containsKey(values[2])) ||
                    !(romanAndArabian.containsKey(values[0])) && romanAndArabian.containsKey(values[2])) {
                System.out.println("Вы ввели отличающиеся языки исчисления, попробуйте снова:");
                continue;
            }
            if (romanAndArabian.containsKey(values[0])) {
                firstValue = romanAndArabian.get(values[0]);
            } else {
                firstValue = Integer.parseInt(values[0]);
            }

            if (romanAndArabian.containsKey(values[2])) {
                secondValue = romanAndArabian.get(values[2]);
            } else {
                secondValue = Integer.parseInt(values[2]);
            }

            char operation = values[1].charAt(0);
            int result = 0;

            if(firstValue<=0 || firstValue>10 || secondValue<=0 || secondValue>10) {
                System.out.println("Вы ввели недопустимый диапазон значения числа, попробуйте снова:");
                continue;
            }

            switch (operation) {
                case '+' -> result = firstValue + secondValue;
                case '-' -> result = firstValue - secondValue;
                case '/' -> result = firstValue / secondValue;
                case '*' -> result = firstValue * secondValue;
                default -> System.out.println("Вы ввели неправильную арифметическую операцию");
            }
            if (romanAndArabian.containsKey(values[0])) {

                resultToRoman(romanAndArabian, result);

            } else {
                System.out.println("Результат: " + result);
            }
        }
    }

    public static void resultToRoman(Map<String, Integer> map, int result) {
        String result1;
        for (Map.Entry entry: map.entrySet()) {
            if(entry.getValue().equals(result)){
                result1 = (String) entry.getKey();
                System.out.println(result1);
            }
        }
    }
}
