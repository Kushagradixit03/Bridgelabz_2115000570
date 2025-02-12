class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head;

    public TaskScheduler() {
        this.head = null;
    }

    public void addTask(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newTask;
            newTask.next = head;
        }
    }

    public void removeTask(int taskId) {
        if (head == null) return;
        Task current = head, prev = null;
        do {
            if (current.taskId == taskId) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    if (current.next == head) {
                        head = null;
                    } else {
                        prev = head;
                        while (prev.next != head) {
                            prev = prev.next;
                        }
                        head = current.next;
                        prev.next = head;
                    }
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task current = head;
        do {
            System.out.println("Task ID: " + current.taskId + ", Task Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    public void nextTask() {
        if (head != null) {
            head = head.next;
        }
    }
}

public class TaskSchedulerSystem {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(1, "Task1", 3, "2025-03-01");
        scheduler.addTask(2, "Task2", 1, "2025-03-02");
        scheduler.addTask(3, "Task3", 2, "2025-03-03");

        System.out.println("All Tasks:");
        scheduler.displayTasks();

        scheduler.removeTask(2);
        System.out.println("After removing Task 2:");
        scheduler.displayTasks();

        scheduler.nextTask();
        System.out.println("Next Task:");
        scheduler.displayTasks();
    }
}
