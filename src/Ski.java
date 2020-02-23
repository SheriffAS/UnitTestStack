
    public class Ski {

        private String name;
        private String brand;
        private int lenght;
        private double radius;


        public Ski(String name, String brand, int lenght, double radius) {
            this.name = name;
            this.brand = brand;
            this.lenght = lenght;
            this.radius = radius;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getLenght() {
            return lenght;
        }

        public void setLenght(int lenght) {
            this.lenght = lenght;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }
