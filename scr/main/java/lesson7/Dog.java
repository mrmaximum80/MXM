package lesson7;

public class Dog {
    String name;
    String breed;
    int age;
    private static final Integer MAX_RUN = 500;
    private static final Integer MAX_JUMP = 2;
    private static final Integer MAX_SWIM = 10;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void run(Integer run) {
        if (this.MAX_RUN == null) {
            System.out.println("Собака " + this.name + " породы " + this.breed + " не умеет бегать.");
        } else {
            if (MAX_RUN < run) {
                System.out.println("Собака " + this.name + " породы " + this.breed + " не смогла пробежать " + run + " метров, пробежав " + this.MAX_RUN + " метров, она устала.");
            } else {
                System.out.println("Собака " + this.name + " породы " + this.breed + " пробежала " + run + " метров.");
            }
        }
    }

    public void jump(Integer jump) {
        if (this.MAX_JUMP == null) {
            System.out.println("Собака " + this.name + " породы " + this.breed + " не умеет прыгать.");
        } else {
            if (MAX_JUMP < jump) {
                System.out.println("Собака " + this.name + " породы " + this.breed + " не смогла перепрыгнуть стену высотой " + jump + " метров, она не умеет прыгать выше " + this.MAX_JUMP + " метров.");
            } else {
                System.out.println("Собака " + this.name + " породы " + this.breed + " перепрыгнула стену высотой " + jump + " метров.");
            }
        }
    }

    public void swim(Integer swim) {
        if (this.MAX_SWIM == null) {
            System.out.println("Собака " + this.name + " породы " + this.breed + " не умеет плавать.");
        } else {
            if (MAX_SWIM < swim) {
                System.out.println("Собака " + this.name + " породы " + this.breed + " не смогла переплыть реку шириной " + swim + " метров, проплыв " + this.MAX_SWIM + " метров, она утонула.");
            } else {
                System.out.println("Собака " + this.name + " породы " + this.breed + " переплыла реку шириной " + swim + " метров.");
            }
        }
    }

}
