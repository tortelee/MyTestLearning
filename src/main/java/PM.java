public class PM {
    private String id;
    private String name;
    private boolean gender;
    private  double salary;
    private double exp;
    private double bonus;

    public PM() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public double getExp() {
        return exp;
    }

    public double getBonus() {
        return bonus;
    }


    public PM(String id, String name, boolean gender, double salary, double exp, double bonus) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.exp = exp;
        this.bonus = bonus;
    }
}
