public class Salary {
    public double salary(SE se){
        System.out.println(se.getSalary());
        return se.getSalary();
    }
    public double salary(PM pm){
        System.out.println(pm.getSalary()+pm.getBonus());
        return pm.getSalary()+pm.getBonus();
    }

    public static void main(String[] args) {
        SE se = new SE("101","Tom",true,2000,3);
        PM pm = new PM("12","John",true,2000,2.5,1000);
        Salary salary = new Salary();
        salary.salary(se);
        salary.salary(pm);

    }
}
