package cn.qf.mybatis.test;

public class Emp {
    private Integer id;
    private String name;
    private String deg;
    private Double salary;
    private String dept;

    public Emp() {
    }

    public Emp(Integer id, String name, String deg, Double salary, String dept) {
        this.id = id;
        this.name = name;
        this.deg = deg;
        this.salary = salary;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deg='" + deg + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
