public abstract class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("This animal walks with " + this.legs + " legs");
    }

    public abstract void eat();
}
