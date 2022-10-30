package SkyPro.TheTwoCourse.OOPLesson2;

class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Human maksim = new Human(35, "Максим", "Минск", "бренд-менеджер");
        Human ania = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human kate = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(21, "Владимир", "Казань", null);
        HumanInfo(maksim);
        HumanInfo(ania);
        HumanInfo(kate);
        HumanInfo(artem);
        HumanInfo(vladimir);

        Flower rosa = new Flower(null, "Голландия", 35.59);
        Flower hrizantema = new Flower(null, null, 15.0, 5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower hypsofila = new Flower(null, "Турция", 19.5, 10);
        FlowerInfo(rosa);
        FlowerInfo(hrizantema);
        FlowerInfo(pion);
        FlowerInfo(hypsofila);
        costOfFlowers(rosa, rosa, rosa, hrizantema, hrizantema, hrizantema, hrizantema, hrizantema, hypsofila);
    }

    private static void HumanInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + " Я из города " + human.town + " Я родился в " + (2022 - human.getYearOfBirth()) + " году. Я работаю на должности " + human.job + " Будем знакомы!");
    }

    private static void FlowerInfo(Flower flower) {
        System.out.println("Цвет " + flower.getFlowerColor() + " страна " + flower.getCountry() + " стоимость " + flower.getCountry() + " срок стояния " + flower.lifeSpan);
    }

    private static void costOfFlowers(Flower... flowers) {
        double totalCost = 0;
        int min = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < min) {
                min = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            FlowerInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.printf("Стоимость букета - %.2f    ", totalCost);
        System.out.printf("Срок стояния  ", min);
    }

}

