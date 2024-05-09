// Implement the below interface so that you are able to run the code inside main method.

interface Greater {  
    // if this.object>o. object return true else false
    public boolean isGreater(Object o);
}

class Employee implements Greater {
    int salary;
    Employee(int salary) {
        this.salary = salary;
    }
    public boolean isGreater(Object o) {
        Employee e = (Employee) o;
        if (this.salary > e.salary) {
            return true;
        } else {
            return false;
        }
    }
}
class Circle implements Greater {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    public boolean isGreater(Object o) {
        Circle c = (Circle) o;
        if (this.radius > c.radius) {
            return true;
        } else {
            return false;
        }
    }
}


public class interface1 {
    public static void main(String[] args) {
        Greater e = new Employee(10);
        Greater e2 = new Employee(100);
        System.out.println(e.isGreater(e2));
        Circle c1 = new Circle(100);
        Circle c2 = new Circle(20);
        System.out.println(c2.isGreater(c1));
    }
}
