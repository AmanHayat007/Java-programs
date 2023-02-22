class Employee {
    int id;
    String name;

    Employee(int i, String n)
    {
        id = i;
        name = n;

    }
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args)
    {
        Employee e1 = new Employee(1000, "XYZ");
        Employee e2 = new Employee(1010, "ABC");

        e1.display();
        e2.display();

    }
}
