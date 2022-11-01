package SkyPro.TheTwoCourse.CoursePaper.Repeatability;

import SkyPro.TheTwoCourse.CoursePaper.Tasks.Task;

public class Weekly extends Task implements Repeatability {
    public Weekly(String heading, String task, String description) {
        super(heading, task, description);
    }

    @Override
    public void nextDateAndTimeOfExecution() {

    } // Еженедельная

}
