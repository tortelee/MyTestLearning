public class SE {
    private String id;
    private String name;
    private boolean sex;
    private  double salary;
    private int hot;
    public SE(){
    }

    public SE(String id, String name, boolean sex, double salary, int hot) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.hot = hot;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public double getSalary() {
        return salary;
    }

    public int getHot() {
        return hot;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }
}
