class Bicycle {

    private String brand;
    private Integer frame_size;

    public Bicycle(String brand) {
	    this.brand = brand;
	    this.frame_size = 0;
	}

    public String get_brand() {
        return brand;
    }

    public Integer get_frame_size() {
        return frame_size;
    }

    public void set_brand(String str) {
        brand = str;
    }

    public void set_frame_size(Integer number) {
        frame_size = number;
    }

}

