package SkyPro.TheTwoCourse.OOPLesson1;

class Human {
    int yearOfBirth; // дата рождения
    String name; // имя
    String town; // город проживания
    String job; // должность
    Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }

    }
    Human(String name, String town, String job) {
        this(0, name, town, job);
    }
    Human(int yearOfBirth, String town, String job) {
        this(yearOfBirth, "Информация не указана", town, job);
    }
}
