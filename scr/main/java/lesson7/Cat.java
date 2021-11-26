package lesson7;

public class Cat {
    String name;
    String color;
    int age;
    Integer maxRun;
    Integer maxJump;
    Integer maxSwim;

    public Cat() {
    }

    public Cat(String name, Integer maxRun, Integer maxJump, Integer maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public void run(Integer run) {
        if (this.maxRun == null) {
            System.out.println("Кошка " + this.name + " не умеет бегать.");
        } else {
            if (maxRun < run) {
                System.out.println("Кошка " + this.name + " не смогла пробежать " + run + " метров, пробежав " + this.maxRun + " метров, она устала.");
            } else {
                System.out.println("Кошка " + this.name + " пробежала " + run + " метров.");
            }
        }
    }

    public void jump(Integer jump) {
        if (this.maxJump == null) {
            System.out.println("Кошка " + this.name + " не умеет прыгать.");
        } else {
            if (maxJump < jump) {
                System.out.println("Кошка " + this.name + " не смогла перепрыгнуть стену высотой " + jump + " метров, она не умеет прыгать выше " + this.maxJump + " метров.");
            } else {
                System.out.println("Кошка " + this.name + " перепрыгнула стену высотой " + jump + " метров.");
            }
        }
    }

    public void swim(Integer swim) {
        if (this.maxSwim == null) {
            System.out.println("Кошка " + this.name + " не умеет плавать.");
        } else {
            if (maxSwim < swim) {
                System.out.println("Кошка " + this.name + " не смогла переплыть реку шириной " + swim + " метров, проплыв " + this.maxSwim + " метров, она утонула.");
            } else {
                System.out.println("Кошка " + this.name + " переплыла реку шириной " + swim + " метров.");
            }
        }
    }
}