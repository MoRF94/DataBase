/**
 * Created by victo on 27.04.2016.
 */
public class Security extends Person {

    private int expirience;

    public Security(String name, String surname, int age, int expirience) {
        super(name, surname, age);
        this.expirience = expirience;
    }

    @Override
    public double computeSalary() {
        return expirience * 0.96;
    }
}
