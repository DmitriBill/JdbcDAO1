package ua.kiev.prog.shared;

public class Client {
    @Id
    private int id;

    private String name;
    private int age;

    public Client() {
    }

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Client {");
        if (this.id != 0) {
            str.append("id=");
            str.append(this.id);
            str.append(", ");
        }
        if (this.name != null) {
            str.append("name=");
            str.append(this.name);
            str.append(", ");
        }
        if (this.age != 0) {
            str.append("age=");
            str.append(this.age);
            str.append(", ");
        }
        str.deleteCharAt(str.length() - 1);
        str.deleteCharAt(str.length() - 1);
        str.append("}");
        return str.toString();
    }

    /*@Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
}
