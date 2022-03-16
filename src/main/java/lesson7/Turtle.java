package lesson7;

public class Turtle {
    private String name;
    private int age;
    private static final Integer MAX_RUN = 20;
    private static final Integer MAX_JUMP = null;
    private static final Integer MAX_SWIM = 1000;

    public Turtle(String name) {
        this.name = name;
    }

    public void run(Integer run) {
        if (this.MAX_RUN == null) {
            System.out.println("Черепаха " + this.name + " не умеет бегать.");
        } else {
            if (MAX_RUN < run) {
                System.out.println("Черепаха " + this.name + " не смогла проползти " + run + " метров, когда она проползла " + this.MAX_RUN + " метров, она устала.");
            } else {
                System.out.println("Черепаха " + this.name + " проползла " + run + " метров.");
            }
        }
    }

    public void jump(Integer jump) {
        if (this.MAX_JUMP == null) {
            System.out.println("Черепаха " + this.name + " не умеет прыгать.");
        } else {
            if (MAX_JUMP < jump) {
                System.out.println("Черепаха " + this.name + " не смогла перепрыгнуть стену высотой " + jump + " метров, она не умеет прыгать выше " + this.MAX_JUMP + " метров.");
            } else {
                System.out.println("Черепаха " + this.name + " перепрыгнула стену высотой " + jump + " метров.");
            }
        }
    }

    public void swim(Integer swim) {
        if (this.MAX_SWIM == null) {
            System.out.println("Черепаха " + this.name + " не умеет плавать.");
        } else {
            if (MAX_SWIM < swim) {
                System.out.println("Черепаха " + this.name + " не смогла переплыть реку шириной " + swim + " метров, проплыв " + this.MAX_SWIM + " метров, она устала.");
            } else {
                System.out.println("Черепаха " + this.name + " переплыла реку шириной " + swim + " метров.");
            }
        }
    }
}
