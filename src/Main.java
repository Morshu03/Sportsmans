public class Main {
    public static void main(String[] args) {

        Footballer footballer = new Footballer("Андрей Аршавин", "Зенит", 43);
        System.out.println("Футболист " + footballer.getName()
                + " состоит в команде: " + footballer.getTeam()
                + ". Сейчас ему: " + footballer.getAge());
        footballer.run();
        footballer.scoringGoals(111);
        System.out.println();

        Footballer footballer2 = new Footballer("Андрей Канчельскис", "Динамо (Брянск)", 55);
        System.out.println("Футболист " + footballer2.getName()
                + " состоит в команде: " + footballer2.getTeam()
                + ". Сейчас ему: " + footballer2.getAge());
        footballer2.run();
        footballer2.scoringGoals(26);
        System.out.println();

        HockeyPlayer hockeyPlayer = new HockeyPlayer("Александр Самонов", "Салават Юлаев", 29);
        System.out.println("Хоккеист " + hockeyPlayer.getName()
                + " состоит в команде: " + hockeyPlayer.getTeam()
                + ". Сейчас ему: " + hockeyPlayer.getAge());
        hockeyPlayer.run();
        hockeyPlayer.timeOnTheSite(11628);
        System.out.println();

        HockeyPlayer hockeyPlayer2 = new HockeyPlayer("Александр Овечкин", "Вашингтон Кэпиталз", 39);
        System.out.println("Хоккеист " + hockeyPlayer2.getName()
                + " состоит в команде: " + hockeyPlayer2.getTeam()
                + ". Сейчас ему: " + hockeyPlayer2.getAge());
        hockeyPlayer2.run();
        hockeyPlayer2.timeOnTheSite(1348);
        System.out.println();

        Skier skier = new Skier("Нагейкина Светлана", "Динамо", 59);
        System.out.println("Лыжница " + skier.getName()
                + " состоит в команде: " + skier.getTeam()
                + ". Сейчас ей: " + skier.getAge());
        skier.run();
        skier.totalPointsInTheSprint(150);
        System.out.println();

        Skier skier2 = new Skier("Егорова Любовь", "СССР, Россия", 58);
        System.out.println("Лыжница " + skier2.getName()
                + " состоит в команде: " + skier2.getTeam()
                + ". Сейчас ей: " + skier2.getAge());
        skier2.run();
        skier2.totalPointsInTheSprint(346);
        System.out.println();

    }
}
