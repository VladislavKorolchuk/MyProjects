package SkyPro.TheTwoCourse.CollectionHash.Part3;

import java.time.LocalDate;

final class Passport {
    private String passportNumber; // Номер паспорта
    private String surname;         // Фамилия
    private String name;            // Имя
    private String MiddleName;      // Отчество
    private LocalDate dateOfBirth;     // Дата рождения

    public Passport(String passportNumber, String surname, String name, String middleName, LocalDate dateOfBirth) {
        if (passportNumber==null || surname==null || name==null){
            throw new IllegalArgumentException("Введите корректные данные");
        }
        this.passportNumber = passportNumber;
        this.surname = surname;
        this.name = name;
        this.MiddleName = middleName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Паспорт " + passportNumber +
                ", фамилия " + surname +
                ", Имя " + name +
                ", Отчество " + MiddleName  +
                ", Дата рождения " + dateOfBirth;
    }

}
