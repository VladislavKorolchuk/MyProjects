package SkyPro.TheTwoCourse.CoursePaper.Tasks;

import java.time.LocalDateTime;

public class Task {
    final int id;
    static int idGenerator=0;      // id генератор
    final String heading;              // Заголовок
    final String task;                 // Задача
    final String description;          // Описание задачи
    //final LocalDateTime dateTime;      // Дата и время задачи

    public Task(String heading, String task, String description) {
        this.id = idGenerator++;
        this.heading = heading;
        this.task = task;
        this.description = description;
    //    this.dateTime = dateTime;
    }
}
