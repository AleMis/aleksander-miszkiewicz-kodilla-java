package food2door;

public class Supplier {

    private String supplierName;

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    @Override
    public String toString() {
        return supplierName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier supplier = (Supplier) o;

        return supplierName.equals(supplier.supplierName);
    }

    @Override
    public int hashCode() {
        return supplierName.hashCode();
    }
}
