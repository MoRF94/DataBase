/**
 * Created by victo on 27.04.2016.
 */
public class Person implements IWorker{

    protected String name, surname;
    protected int age;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getPersonInformation(){
        return name + " " + surname + " " + age;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if(age < 18) return;
        this.age = age;
    }

    public double computeSalary() {
        return 0;
    }
}
