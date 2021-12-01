package lesson7;

public class Tiger {
    private String name;
    private int age;
    private static final Integer MAX_RUN = 1000;
    private static final Integer MAX_JUMP = 3;
    private static final Integer MAX_SWIM = 50;

    public Tiger(String name) {
        this.name = name;
    }

    public void run(Integer run) {
        if (this.MAX_RUN == null) {
            System.out.println("Тигр " + this.name + " не умеет бегать.");
        } else {
            if (MAX_RUN < run) {
                System.out.println("Тигр " + this.name + " не смог пробежать " + run + " метров, пробежав " + this.MAX_RUN + " метров, он устал.");
            } else {
                System.out.println("Тигр " + this.name + " пробежал " + run + " метров.");
            }
        }
    }

    public void jump(Integer jump) {
        if (this.MAX_JUMP == null) {
            System.out.println("Тигр " + this.name + " не умеет прыгать.");
        } else {
            if (MAX_JUMP < jump) {
                System.out.println("Тигр " + this.name + " не смог перепрыгнуть стену высотой " + jump + " метров, он не умеет прыгать выше " + this.MAX_JUMP + " метров.");
            } else {
                System.out.println("Тигр " + this.name + " перепрыгнул стену высотой " + jump + " метров.");
            }
        }
    }

    public void swim(Integer swim) {
        if (this.MAX_SWIM == null) {
            System.out.println("Тигр " + this.name + " не умеет плавать.");
        } else {
            if (MAX_SWIM < swim) {
                System.out.println("Тигр " + this.name + " не смог переплыть реку шириной " + swim + " метров, проплыв " + this.MAX_SWIM + " метров, он утонул.");
            } else {
                System.out.println("Тигр " + this.name + " переплыл реку шириной " + swim + " метров.");
            }
        }
    }
}
