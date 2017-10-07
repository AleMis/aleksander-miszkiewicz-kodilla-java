package reflection.exercise3;

@MainClassAnnotation(name="Company", value = "This class creates company's object")
public class Company {

    private String name;
    private Integer numberOfEployees;

    public Company(String name, Integer numberOfEployees) {
        this.name = name;
        this.numberOfEployees = numberOfEployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfEployees() {
        return numberOfEployees;
    }

    public void setNumberOfEployees(Integer numberOfEployees) {
        this.numberOfEployees = numberOfEployees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", numberOfEployees=" + numberOfEployees +
                '}';
    }
}
