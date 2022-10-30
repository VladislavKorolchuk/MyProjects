package SkyPro.TheTwoCourse.OOPLesson2;

class Human {
    private int yearOfBirth; // дата рождения
    public String name; // имя
    public String town; // город проживания
    public String job; // должность
    Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null  || name.toString()=="") {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.toString()=="") {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job == null || job.toString()=="") {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
