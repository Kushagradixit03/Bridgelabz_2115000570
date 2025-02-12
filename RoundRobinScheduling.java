class Process {
    int processId;
    int burstTime;
    int priority;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head;

    public RoundRobinScheduler() {
        this.head = null;
    }

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            newProcess.next = head;
        } else {
            Process current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newProcess;
            newProcess.next = head;
        }
    }

    public void removeProcess(int processId) {
        if (head == null) return;
        Process current = head, prev = null;
        do {
            if (current.processId == processId) {
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

    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes available.");
            return;
        }
        Process current = head;
        do {
            System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }

    public void roundRobinExecution(int timeQuantum) {
        if (head == null) return;
        Process current = head;
        do {
            if (current.burstTime > timeQuantum) {
                current.burstTime -= timeQuantum;
            } else {
                removeProcess(current.processId);
            }
            current = current.next;
        } while (head != null);
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(1, 15, 1);
        scheduler.addProcess(2, 25, 2);
        scheduler.addProcess(3, 45, 3);

        System.out.println("Processes:");
        scheduler.displayProcesses();

        System.out.println("After round robin execution with time quantum of 10:");
        scheduler.roundRobinExecution(10);
        scheduler.displayProcesses();
    }
}
