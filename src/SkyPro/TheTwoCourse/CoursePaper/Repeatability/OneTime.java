package SkyPro.TheTwoCourse.CoursePaper.Repeatability;

import SkyPro.TheTwoCourse.CoursePaper.Tasks.Task;

public class OneTime extends Task implements Repeatability {
    public OneTime(String heading, String task, String description) {
        super(heading, task, description);
    }  // Однократная
    @Override
    public void nextDateAndTimeOfExecution() {

    }
}
