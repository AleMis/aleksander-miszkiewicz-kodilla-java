package reflection.exercise3;

import java.util.List;

@DatabaseAnnotation(name = "Database", value = "This class hel to create database from List")
public class Database<U> {

    private List<U> database;

    public Database(List<U> database) {
        this.database = database;
    }

    public List<U> getDatabase() {
        return database;
    }

    @AddObjectAnnotation(task = "This method add new object to database")
    public List<U> addToDatabase(U object) {
        database.add(object);
        return database;
    }

    @PrintObjectListsAnnotation(task = "This method print list of the objects")
    public void printDatabase() {
        database.stream().forEach(System.out::println);
    }
}
