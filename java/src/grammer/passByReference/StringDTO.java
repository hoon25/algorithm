package grammer.passByReference;


public class StringDTO {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringDTO(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StringDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
