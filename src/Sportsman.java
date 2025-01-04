public class Sportsman {
    private final String name;
    private final String team;
    private final int age;

    public Sportsman(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void run(){
        System.out.println("Спортсмен бежит");
    }

}
