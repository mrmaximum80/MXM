package lesson7;

public class Cat {
    private String name;
    private String color;
    private int age;
    private static final Integer MAX_RUN = 200;
    private static final Integer MAX_JUMP = 2;
    private static final Integer MAX_SWIM = null;

    public Cat(String name) {
        this.name = name;
    }

    public void run(Integer run) {
        if (this.MAX_RUN == null) {
            System.out.println("Кошка " + this.name + " не умеет бегать.");
        } else {
            if (MAX_RUN < run) {
                System.out.println("Кошка " + this.name + " не смогла пробежать " + run + " метров, пробежав " + this.MAX_RUN + " метров, она устала.");
            } else {
                System.out.println("Кошка " + this.name + " пробежала " + run + " метров.");
            }
        }
    }

    public void jump(Integer jump) {
        if (this.MAX_JUMP == null) {
            System.out.println("Кошка " + this.name + " не умеет прыгать.");
        } else {
            if (MAX_JUMP < jump) {
                System.out.println("Кошка " + this.name + " не смогла перепрыгнуть стену высотой " + jump + " метров, она не умеет прыгать выше " + this.MAX_JUMP + " метров.");
            } else {
                System.out.println("Кошка " + this.name + " перепрыгнула стену высотой " + jump + " метров.");
            }
        }
    }

    public void swim(Integer swim) {
        if (this.MAX_SWIM == null) {
            System.out.println("Кошка " + this.name + " не умеет плавать.");
        } else {
            if (MAX_SWIM < swim) {
                System.out.println("Кошка " + this.name + " не смогла переплыть реку шириной " + swim + " метров, проплыв " + this.MAX_SWIM + " метров, она утонула.");
            } else {
                System.out.println("Кошка " + this.name + " переплыла реку шириной " + swim + " метров.");
            }
        }
    }
}