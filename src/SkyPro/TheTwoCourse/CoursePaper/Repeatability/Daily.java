package SkyPro.TheTwoCourse.CoursePaper.Repeatability;

import SkyPro.TheTwoCourse.CoursePaper.Tasks.Task;

public class Daily extends Task implements Repeatability {
    public Daily(String heading, String task, String description) {
        super(heading, task, description);
    }  // Ежедневная

    @Override
    public void nextDateAndTimeOfExecution() {

    }

}
