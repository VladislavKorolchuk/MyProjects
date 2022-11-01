package SkyPro.TheTwoCourse.CoursePaper.Repeatability;

import SkyPro.TheTwoCourse.CoursePaper.Tasks.Task;

public class Monthly extends Task implements Repeatability {
    public Monthly(String heading, String task, String description) {
        super(heading, task, description);
    }  // Ежемесячная
    @Override
    public void nextDateAndTimeOfExecution() {

    }
}
