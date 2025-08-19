package things;

import java.util.ArrayList;
import java.util.List;

public class Quest {
    private String name;
    private List<task> tasks;

    public Quest(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addtask(task Task) {
        tasks.add(Task);
    }

    public int completeQuest() {
        int totalXP = 0;
        for (task Task : tasks) {
            if (!Task.isComplete()) {
                Task.taskComplete();
                totalXP += Task.XPGained();
            }
        }
        return totalXP;
    }

    public String getName() {
        return name;
    }
}