package lesson7;

public class Dog {
    String name;
    String race;
    int age;
    Integer maxRun;
    Integer maxJump;
    Integer maxSwim;

    public Dog() {
    }

    public Dog(String name, String race, Integer maxRun, Integer maxJump, Integer maxSwim) {
        this.name = name;
        this.race = race;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public void run(Integer run) {
        if (this.maxRun == null) {
            System.out.println("Собака " + this.name + " породы " + this.race + " не умеет бегать.");
        } else {
            if (maxRun < run) {
                System.out.println("Собака " + this.name + " породы " + this.race + " не смогла пробежать " + run + " метров, пробежав " + this.maxRun + " метров, она устала.");
            } else {
                System.out.println("Собака " + this.name + " породы " + this.race + " пробежала " + run + " метров.");
            }
        }
    }

    public void jump(Integer jump) {
        if (this.maxJump == null) {
            System.out.println("Собака " + this.name + " породы " + this.race + " не умеет прыгать.");
        } else {
            if (maxJump < jump) {
                System.out.println("Собака " + this.name + " породы " + this.race + " не смогла перепрыгнуть стену высотой " + jump + " метров, она не умеет прыгать выше " + this.maxJump + " метров.");
            } else {
                System.out.println("Собака " + this.name + " породы " + this.race + " перепрыгнула стену высотой " + jump + " метров.");
            }
        }
    }

    public void swim(Integer swim) {
        if (this.maxSwim == null) {
            System.out.println("Собака " + this.name + " породы " + this.race + " не умеет плавать.");
        } else {
            if (maxSwim < swim) {
                System.out.println("Собака " + this.name + " породы " + this.race + " не смогла переплыть реку шириной " + swim + " метров, проплыв " + this.maxSwim + " метров, она утонула.");
            } else {
                System.out.println("Собака " + this.name + " породы " + this.race + " переплыла реку шириной " + swim + " метров.");
            }
        }
    }

}
