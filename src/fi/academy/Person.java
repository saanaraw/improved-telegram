package fi.academy;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
         this.name = name;
         this.age = age;
    }
    public Person() {
        this.name = "";
        this.age = 0;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return this.name + " , " + this.age;
    }

}
