public class TaskManager {
    Task head;

    public void add(Task t) {
        t.next = head;
        head = t;
    }

    public void delete(int id) {
        Task current = head, prev = null;
        while (current != null) {
            if (current.taskId == id) {
                if (prev == null) head = current.next;
                else prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
        }
    }

    public void traverse() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp.taskName + " - " + temp.status);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.add(new Task(1, "Write Report", "Pending"));
        tm.add(new Task(2, "Review PR", "Done"));
        tm.traverse();
        tm.delete(1);
        tm.traverse();
    }
}
