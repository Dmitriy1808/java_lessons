public class Manager extends User implements CSV {

    public String getTag() {
        return "Manager";
    }

    @Override
    public String toCSV() {
        return String.format("%d;%s;%s", this.getId(), this.getName(), this.getEmail());
    }

    @Override
    public void fromCSV(String str) {
        String[] arr = str.split(";");
        this.setId(Integer.parseInt(arr[0]));
        this.setName(arr[1]);
        this.setEmail(arr[2]);
    }
}