package SkyPro.TheTwoCourse.CoursePaper.Repeatability;

import SkyPro.TheTwoCourse.CoursePaper.Tasks.Task;

public class Annual extends Task implements Repeatability {
    public Annual(String heading, String task, String description) {
        super(heading, task, description);
    } // Ежегодная

    @Override
    public void nextDateAndTimeOfExecution() {

    }

}
