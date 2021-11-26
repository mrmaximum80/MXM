package lesson7;

public class Turtle {
    String name;
    int age;
    Integer maxRun;
    Integer maxJump;
    Integer maxSwim;

    public Turtle() {
    }

    public Turtle(String name, Integer maxRun, Integer maxJump, Integer maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public void run(Integer run) {
        if (this.maxRun == null) {
            System.out.println("Черепаха " + this.name + " не умеет бегать.");
        } else {
            if (maxRun < run) {
                System.out.println("Черепаха " + this.name + " не смогла проползти " + run + " метров, когда она проползла " + this.maxRun + " метров, она устала.");
            } else {
                System.out.println("Черепаха " + this.name + " проползла " + run + " метров.");
            }
        }
    }

    public void jump(Integer jump) {
        if (this.maxJump == null) {
            System.out.println("Черепаха " + this.name + " не умеет прыгать.");
        } else {
            if (maxJump < jump) {
                System.out.println("Черепаха " + this.name + " не смогла перепрыгнуть стену высотой " + jump + " метров, она не умеет прыгать выше " + this.maxJump + " метров.");
            } else {
                System.out.println("Черепаха " + this.name + " перепрыгнула стену высотой " + jump + " метров.");
            }
        }
    }

    public void swim(Integer swim) {
        if (this.maxSwim == null) {
            System.out.println("Черепаха " + this.name + " не умеет плавать.");
        } else {
            if (maxSwim < swim) {
                System.out.println("Черепаха " + this.name + " не смогла переплыть реку шириной " + swim + " метров, проплыв " + this.maxSwim + " метров, она устала.");
            } else {
                System.out.println("Черепаха " + this.name + " переплыла реку шириной " + swim + " метров.");
            }
        }
    }
}
