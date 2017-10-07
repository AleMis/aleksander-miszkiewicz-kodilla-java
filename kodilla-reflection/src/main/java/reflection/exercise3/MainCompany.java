package reflection.exercise3;

public class MainCompany {

    public static void main (String args[]) {

        ClassAnnotationScanner.printClassWhichUsesDatabaseAnnotation();
        ClassAnnotationScanner.printMethodsWhichUsesAddObjectAnnotation();
        ClassAnnotationScanner.printMethodsWhichUsesPrintObjectListAnnotation();
    }
}
