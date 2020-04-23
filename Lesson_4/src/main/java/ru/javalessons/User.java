package main.java.ru.javalessons;

abstract class User {

    private Integer id;
    private String name;
    private String email;
    private Integer KPI;

    public User(Integer id, String name, String email, Integer KPI) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.KPI = KPI;
    }

    public User() {}

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public void setKPI(Integer KPI) {
        this.KPI = KPI;
    }

    public Integer getKPI() {
        return KPI;
    }

    public void print() {
        System.out.print("ID: " + this.id +
                            "; Name: " + this.name +
                            "; Email: " + this.email +
                            "; KPI: " + this.KPI);
    }
}