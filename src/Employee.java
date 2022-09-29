import java.io.Serializable;

public class Employee implements Serializable {
    public String fio;
    public int age;
    public String jobTitle;
    public WageRate wageRate;

    public Employee(){}

//    public Employee(String fio, int age, String jobTitle, WageRate wageRate) {
//        this.fio = fio;
//        this.age = age;
//        this.jobTitle = jobTitle;
//        this.wageRate = wageRate;
//    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public WageRate getWageRate() {
        return wageRate;
    }

    public void setWageRate(WageRate wageRate) {
        this.wageRate = wageRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", wageRate=" + wageRate +
                '}';
    }
}
