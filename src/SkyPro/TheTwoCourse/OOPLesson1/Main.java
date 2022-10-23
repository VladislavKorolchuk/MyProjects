package SkyPro.TheTwoCourse.OOPLesson1;

public class Main {
    public static void main(String[] args) {

        Human Maksim = new Human(35, "Максим", "Минск", "бренд-менеджер");
        System.out.println("Привет! Меня зовут " + Maksim.name + " Я из города " + Maksim.town + " Я родился в " + (2022 - Maksim.yearOfBirth) + " году. Я работаю на должности " + Maksim.job + " Будем знакомы!");
        // Human Maksim = new Human();
        // Maksim.name = "Максим";
        // Maksim.yearOfBirth = 35;
        // Maksim.town = "Минск";
        //System.out.println("Привет! Меня зовут " + Maksim.name + " Я из города " + Maksim.town + " Я родился в " + (2022 - Maksim.yearOfBirth) + " году. Будем знакомы!");

        Human Ania = new Human(29, "Аня", "Москва", "методист образовательных программ");
        System.out.println("Привет! Меня зовут " + Ania.name + " Я из города " + Ania.town + " Я родился в " + (2022 - Ania.yearOfBirth) + " году. Я работаю на должности " + Ania.job + " Будем знакомы!");
        //Human Ania = new Human();
        //Ania.name = "Аня";
        //Ania.yearOfBirth = 29;
        //Ania.town = "Москва";
        //System.out.println("Привет! Меня зовут " + Ania.name + " Я из города " + Ania.town + " Я родился в " + (2022 - Ania.yearOfBirth) + " году. Будем знакомы!");

        Human Kate = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        System.out.println("Привет! Меня зовут " + Kate.name + " Я из города " + Kate.town + " Я родился в " + (2022 - Kate.yearOfBirth) + " году. Я работаю на должности " + Kate.job + " Будем знакомы!");
        //Human Kate = new Human();
        //Kate.name = "Катя";
        //Kate.yearOfBirth = 28;
        //Kate.town = "Калининград";
        //System.out.println("Привет! Меня зовут " + Kate.name + " Я из города " + Kate.town + " Я родился в " + (2022 - Kate.yearOfBirth) + " году. Будем знакомы!");

        Human Artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println("Привет! Меня зовут " + Artem.name + " Я из города " + Artem.town + " Я родился в " + (2022 - Artem.yearOfBirth) + " году. Я работаю на должности " + Artem.job + " Будем знакомы!");
        //Human Artem = new Human();
        //Artem.name = "Артем";
        //Artem.yearOfBirth = 27;
        //Artem.town = "Москва";
        //System.out.println("Привет! Меня зовут " + Artem.name + " Я из города " + Artem.town + " Я родился в " + (2022 - Artem.yearOfBirth) + " году. Будем знакомы!");

        //Maksim.job = "бренд-менеджер";
        //System.out.println("Привет! Меня зовут " + Maksim.name + " Я из города " + Maksim.town + " Я родился в " + (2022 - Maksim.yearOfBirth) + " году. Я работаю на должности " + Maksim.job + " Будем знакомы!");
        //Ania.job = "методист образовательных программ";
        //System.out.println("Привет! Меня зовут " + Ania.name + " Я из города " + Ania.town + " Я родился в " + (2022 - Ania.yearOfBirth) + " году. Я работаю на должности " + Ania.job + " Будем знакомы!");
        //Kate.job = "продакт-менеджер";
        //System.out.println("Привет! Меня зовут " + Kate.name + " Я из города " + Kate.town + " Я родился в " + (2022 - Kate.yearOfBirth) + " году. Я работаю на должности " + Kate.job + " Будем знакомы!");
        //Artem.job = "директор по развитию бизнеса";
        //System.out.println("Привет! Меня зовут " + Artem.name + " Я из города " + Artem.town + " Я родился в " + (2022 - Artem.yearOfBirth) + " году. Я работаю на должности " + Artem.job + " Будем знакомы!");


        Car carLadaGranta = new Car("Lada", "Granta", "1,7", "желтый", 2015, "Россия");
        // Сar carLadaGranta = new Сar();
        //carLadaGranta.brand = "Lada";
        //carLadaGranta.model = "Granta";
        //carLadaGranta.engineVolume = "1,7";
        //carLadaGranta.productionYear = 2015;
        //carLadaGranta.color = "желтый";
        //carLadaGranta.productionCountry = "Россия";
        System.out.print(carLadaGranta.brand + " " + carLadaGranta.model + ", " + carLadaGranta.productionYear + " год выпуска, сборка ");
        System.out.println(carLadaGranta.productionCountry + " цвет, " + carLadaGranta.color + ", объем двигателя — " + carLadaGranta.engineVolume + " л.");

        Car carAudiA8 = new Car("Audi", "A8", "50 L TDI quattro", "черный", 2020, "Германия");
        //Сar carAudiA8 = new Сar();
        //carAudiA8.brand = "Audi";
        //carAudiA8.model = "A8";
        //carAudiA8.engineVolume = "50 L TDI quattro";
        //carAudiA8.productionYear = 2020;
        //carAudiA8.color = "черный";
        //carAudiA8.productionCountry = "Германия";
        System.out.print(carAudiA8.brand + " " + carAudiA8.model + ", " + carAudiA8.productionYear + " год выпуска, сборка ");
        System.out.println(carAudiA8.productionCountry + " цвет, " + carAudiA8.color + ", объем двигателя — " + carAudiA8.engineVolume + " л.");

        Car carBMWZ8 = new Car("BMW", "Z8", "3,0", "черный", 2020, "Германия");
        //Сar carBMWZ8 = new Сar();
        //carBMWZ8.brand = "BMW";
        //carBMWZ8.model = "Z8";
        //carBMWZ8.engineVolume = "3,0";
        //carBMWZ8.productionYear = 2021;
        //carBMWZ8.color = "черный";
        //carBMWZ8.productionCountry = "Германия";
        System.out.print(carBMWZ8.brand + " " + carBMWZ8.model + ", " + carBMWZ8.productionYear + " год выпуска, сборка ");
        System.out.println(carBMWZ8.productionCountry + " цвет, " + carBMWZ8.color + ", объем двигателя — " + carBMWZ8.engineVolume + " л.");

        Car carKiaSportage = new Car("Kia", "Sportage 4-го поколения", "2,4", "красный", 2018, "Южная Корея");
        //Сar carKiaSportage = new Сar();
        //carKiaSportage.brand = "Kia";
        //carKiaSportage.model = "Sportage 4-го поколения";
        //carKiaSportage.engineVolume = "2,4";
        //carKiaSportage.productionYear = 2018;
        //carKiaSportage.color = "красный";
        //carKiaSportage.productionCountry = "Южная Корея";
        System.out.print(carKiaSportage.brand + " " + carKiaSportage.model + ", " + carKiaSportage.productionYear + " год выпуска, сборка ");
        System.out.println(carKiaSportage.productionCountry + ", цвет " + carKiaSportage.color + ", объем двигателя — " + carKiaSportage.engineVolume + " л.");

        Car carHyundaiAvante = new Car("Hyundai", "Avante", "1,6", "оранжевый", 2016, "Южная Корея");
        //Сar carHyundaiAvante = new Сar();
        //carHyundaiAvante.brand = "Hyundai";
        //carHyundaiAvante.model = "Avante";
        //carHyundaiAvante.engineVolume = "1,6";
        //carHyundaiAvante.productionYear = 2016;
        //carHyundaiAvante.color = "оранжевый";
        //carHyundaiAvante.productionCountry = "Южная Корея";
        System.out.print(carHyundaiAvante.brand + " " + carHyundaiAvante.model + ", " + carHyundaiAvante.productionYear + " год выпуска, сборка ");
        System.out.println(carHyundaiAvante.productionCountry + ", цвет " + carHyundaiAvante.color + ", объем двигателя — " + carHyundaiAvante.engineVolume + " л.");


        Human Artem1 = new Human(-27, null, "Москва", "директор по развитию бизнеса");
        System.out.println("Привет! Меня зовут " + Artem1.name + " Я из города " + Artem1.town + " Я родился в " + (2022 - Artem1.yearOfBirth) + " году. Я работаю на должности " + Artem1.job + " Будем знакомы!");
        Car carHyundaiAvante1 = new Car(null, "Avante", "1,6", "оранжевый", 0, "Южная Корея");
        System.out.print(carHyundaiAvante1.brand + " " + carHyundaiAvante1.model + ", " + carHyundaiAvante1.productionYear + " год выпуска, сборка ");
        System.out.println(carHyundaiAvante1.productionCountry + ", цвет " + carHyundaiAvante1.color + ", объем двигателя — " + carHyundaiAvante1.engineVolume + " л.");
    }
}
