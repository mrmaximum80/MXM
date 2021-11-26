package lesson7;

public class Tiger {
    String name;
    int age;
    Integer maxRun;
    Integer maxJump;
    Integer maxSwim;

    public Tiger() {
    }

    public Tiger(String name, Integer maxRun, Integer maxJump, Integer maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public void run(Integer run) {
        if (this.maxRun == null) {
            System.out.println("Тигр " + this.name + " не умеет бегать.");
        } else {
            if (maxRun < run) {
                System.out.println("Тигр " + this.name + " не смог пробежать " + run + " метров, пробежав " + this.maxRun + " метров, он устал.");
            } else {
                System.out.println("Тигр " + this.name + " пробежал " + run + " метров.");
            }
        }
    }

    public void jump(Integer jump) {
        if (this.maxJump == null) {
            System.out.println("Тигр " + this.name + " не умеет прыгать.");
        } else {
            if (maxJump < jump) {
                System.out.println("Тигр " + this.name + " не смог перепрыгнуть стену высотой " + jump + " метров, он не умеет прыгать выше " + this.maxJump + " метров.");
            } else {
                System.out.println("Тигр " + this.name + " перепрыгнул стену высотой " + jump + " метров.");
            }
        }
    }

    public void swim(Integer swim) {
        if (this.maxSwim == null) {
            System.out.println("Тигр " + this.name + " не умеет плавать.");
        } else {
            if (maxSwim < swim) {
                System.out.println("Тигр " + this.name + " не смог переплыть реку шириной " + swim + " метров, проплыв " + this.maxSwim + " метров, он утонул.");
            } else {
                System.out.println("Тигр " + this.name + " переплыл реку шириной " + swim + " метров.");
            }
        }
    }
}
