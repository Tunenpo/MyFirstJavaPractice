    class Laptop {
    private int id;
    private String brand;

    public Laptop(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj == null||getClass() != obj.getClass()) {
            return false;

        }
        Laptop other = (Laptop) obj;
        return id == other.id && brand.equals(other.brand);
    }
    

}

