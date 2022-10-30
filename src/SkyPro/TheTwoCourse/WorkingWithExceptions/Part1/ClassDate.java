package SkyPro.TheTwoCourse.WorkingWithExceptions.Part1;

class ClassDate {

    static void metod(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (!login.matches("^[a-zA-Z0-9_]*$") & login.length()<=20){
            throw new WrongLoginException();
        }
        if (!(login.matches("^[a-zA-Z_]*$") & login.length()<=20 & password.equals(confirmPassword))) {
            throw new WrongPasswordException("Ошибка в пароле");
        }
    }

}
