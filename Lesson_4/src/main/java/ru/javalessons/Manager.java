package main.java.ru.javalessons;

public class Manager extends User implements CSV {

    public Manager() {}

    public Manager(Integer id, String name, String email, Integer KPI) {
        super(id, name, email, KPI);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("; Official: " + this.getTag());
    }

    public String getTag() {
        return "Manager";
    }

    @Override
    public String toCSV() {
        return String.format("%d;%s;%s", this.getId(), this.getName(), this.getEmail(), this.getKPI());
    }

    @Override
    public void fromCSV(String str) {
        String[] arr = str.split(";");
        this.setId(Integer.parseInt(arr[0]));
        this.setName(arr[1]);
        this.setEmail(arr[2]);
        this.setKPI(Integer.parseInt(arr[3]));
    }
}
