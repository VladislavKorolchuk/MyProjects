package SkyPro.TheTwoCourse.CollectionHash.Part3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    static Set<Passport> passportSet = new HashSet<>();
    public static void main(String[] args) {

        //-------------------- Домашнее задание 3 ----------------------
        //------------------------- Задание2 ---------------------------

        ArrayList<String> multiplicationTable = new ArrayList<>(28);
        Set<String> task = new HashSet<>(15);
        int index = 0;
        for (int i = 2; i < 9; i++) {
            for (int j = 2; j < 9; j++) {
                if (j >= i) {
                    String str = Integer.toString(i) + "*" + Integer.toString(j) + "=";
                    multiplicationTable.add(index, str);
                    index++;
                }
            }
        }

        for (int i = 0; i < 28; i++) {
            task.add(multiplicationTable.get((int) (Math.random() * 28)));
            if (task.size() >= 15) {
                break;
            }
        }
        int i = 1;
        for (String str : task) {
            System.out.println("Задание" + i + ": " + str);
            i++;
        }

        //------------------------- Задание3 ---------------------------
        LocalDate birthDay1 = LocalDate.of(1974, 5, 2);
        Passport passport = new Passport("111222", "Корольчук", "Владислав", "Викторович", birthDay1);
        addPassport(passport);
        System.out.println(passport.toString());
        LocalDate birthDay2 = LocalDate.of(1974, 2, 28);
        Passport passport1 = new Passport("222333", "Демидова", "Ольга", "Станиславовна", birthDay2);
        addPassport(passport1);
        LocalDate birthDay3 = LocalDate.of(1973, 10, 25);
        Passport passport3 = new Passport("123456", "Иванов", "Александр", "Петрович", birthDay3);
        addPassport(passport3);
        // Проверка перезаписи
        Passport passport4 = new Passport("111222", "Сидоров", "Владислав", "Викторович", birthDay1);
        addPassport(passport4);
        System.out.println(passport4.toString());

        getPassport("123456"); // Поиск по номеру и вывод в консоль

    }
    static void addPassport(Passport passport){
        if (!passportSet.add(passport)){
            Iterator<Passport> passportIterator=passportSet.iterator();
            while (passportIterator.hasNext()){
                if (passportIterator.next().getPassportNumber().equals(passport.getPassportNumber())){
                    passportIterator.remove();
                    passportSet.add(passport); // Перезапись новых значений
                }
            }
        }
    }

    static void getPassport(String numpas) {
        for (Passport passport1: passportSet){
            if (passport1.getPassportNumber().equals(numpas)){
                System.out.println(passport1.getPassportNumber() + ' ' + passport1.getSurname() + ' ' + passport1.getName());
            }
        }
    }

}
