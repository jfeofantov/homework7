public class Plate {
    public class Plate {
        private int food;
        public Plate(int food) {
            this.food = food;
        }
        public void decreaseFood(int n) {
            food -= n;
        }
        public void info() {
            System.out.println("plate: " + food);
        }
    }
    public class Cat {
        private String name;
        private int appetite;
        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
        }
        public void eat(Plate p) {
            p.decreaseFood(appetite);
        }
    }
    public class MainClass {
        public static void main(String[] args) {
            Cat cat = new Cat("Barsik", 5);
            Plate plate = new Plate(100);
            plate.info();
            cat.eat(plate);
            plate.info();
        }
    }
}
