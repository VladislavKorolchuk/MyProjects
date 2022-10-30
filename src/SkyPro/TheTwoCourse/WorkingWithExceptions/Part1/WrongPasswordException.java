package SkyPro.TheTwoCourse.WorkingWithExceptions.Part1;

class WrongPasswordException  extends Exception{

    public WrongPasswordException(String message) {
        super(message);
    }

}
