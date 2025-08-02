public class EmployeeSystem {
    Employee[] employees = new Employee[100];
    int count = 0;

    public void add(Employee e) {
        employees[count++] = e;
    }

    public Employee search(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) return employees[i];
        }
        return null;
    }

    public void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                count--;
                break;
            }
        }
    }

    public void list() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].name + " - " + employees[i].position);
        }
    }

    public static void main(String[] args) {
        EmployeeSystem sys = new EmployeeSystem();
        sys.add(new Employee(1, "Alice", "Manager", 60000));
        sys.add(new Employee(2, "Bob", "Engineer", 40000));
        sys.list();
        sys.delete(1);
        sys.list();
    }
}
