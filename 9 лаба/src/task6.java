import java.util.Scanner;

class KvnTeam {
    private String city;
    private boolean isUniversity;
    private String university;
    private String league;
    private String teamName;
    private int captainAge;
    private int totalMembers;
    private int under21Members;
    private int musicians;
    private int actors;
    private int membersInEducation;
    private int instruments;
    private double sponsorAmount;
    private double annualIncome;

    public KvnTeam(String city, boolean isUniversity, String university, String league, String teamName, int captainAge,
                   int totalMembers, int under21Members, int musicians, int actors, int membersInEducation,
                   int instruments, double sponsorAmount, double annualIncome) {
        this.city = city;
        this.isUniversity = isUniversity;
        this.university = university;
        this.league = league;
        this.teamName = teamName;
        this.captainAge = captainAge;
        this.totalMembers = totalMembers;
        this.under21Members = under21Members;
        this.musicians = musicians;
        this.actors = actors;
        this.membersInEducation = membersInEducation;
        this.instruments = instruments;
        this.sponsorAmount = sponsorAmount;
        this.annualIncome = annualIncome;
    }
    public String getCity() {
        return city;
    }
    public boolean isUniversity() {
        return isUniversity;
    }
    public String getUniversity() {
        return university;
    }
    public String getLeague() {
        return league;
    }
    public String getTeamName() {
        return teamName;
    }
    public int getCaptainAge() {
        return captainAge;
    }
    public int getTotalMembers() {
        return totalMembers;
    }
    public int getUnder21Members() {
        return under21Members;
    }
    public int getMusicians() {
        return musicians;
    }
    public int getActors() {
        return actors;
    }
    public int getMembersInEducation() {
        return membersInEducation;
    }
    public int getInstruments() {
        return instruments;
    }

    public double getSponsorAmount() {
        return sponsorAmount;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }
}

public class task6{
    public static void main(String[] args) {
        // Регламентированный ввод данных о командах КВН
        KvnTeam[] teams = readTeamsData();
        // Определение количества команд в каждой лиге по городам
        countTeamsByLeagueAndCity(teams);
        // Определение количества команд по городам, удовлетворяющих заданным условиям
        countTeamsByConditions(teams);
    }
    public static KvnTeam[] readTeamsData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество команд: ");
        int numTeams = scanner.nextInt();
        scanner.nextLine(); // Пропуск символа новой строки
        KvnTeam[] teams = new KvnTeam[numTeams];
        for (int i = 0; i < numTeams; i++) {
            System.out.println("Команда " + (i + 1) + ":");
            System.out.print("Город команды: ");
            String city = scanner.nextLine();
            System.out.print("Относится ли команда к ВУЗу (true/false): ");
            boolean isUniversity = scanner.nextBoolean();
            scanner.nextLine(); // Пропуск символа новой строки
            String university = "";
            if (isUniversity) {
                System.out.print("ВУЗ, к которому относится команда: ");
                university = scanner.nextLine();
            }
            System.out.print("Лига, в которой выступает команда: ");
            String league = scanner.nextLine();
            System.out.print("Название команды: ");
            String teamName = scanner.nextLine();
            System.out.print("Возраст капитана: ");
            int captainAge = scanner.nextInt();
            System.out.print("Количество участников: ");
            int totalMembers = scanner.nextInt();
            System.out.print("Количество участников младше 21 года: ");
            int under21Members = scanner.nextInt();
            System.out.print("Количество участников с музыкальным образованием: ");
            int musicians = scanner.nextInt();
            System.out.print("Количество участников с театральным образованием: ");
            int actors = scanner.nextInt();
            System.out.print("Количество участников, получающих образование: ");
            int membersInEducation = scanner.nextInt();
            System.out.print("Число музыкальных инструментов в собственности команды: ");
            int instruments = scanner.nextInt();
            System.out.print("Средняя сумма спонсорских взносов: ");
            double sponsorAmount = scanner.nextDouble();
            System.out.print("Средний доход команды от выступлений за год: ");
            double annualIncome = scanner.nextDouble();
            scanner.nextLine(); // Пропуск символа новой строки

            teams[i] = new KvnTeam(city, isUniversity, university, league, teamName, captainAge, totalMembers,
                    under21Members, musicians, actors, membersInEducation, instruments, sponsorAmount, annualIncome);
        }
        return teams;
    }
    public static void countTeamsByLeagueAndCity(KvnTeam[] teams) {
        // Инициализация счетчиков
        int regTeamsCount = 0;
        int univTeamsCount = 0;
        int cityTeamsCount = 0;
        // Обход массива команд и подсчет команд по заданным критериям
        for (KvnTeam team : teams) {
            if (team.getLeague().equalsIgnoreCase("Регулярная лига")) {
                regTeamsCount++;
            } else if (team.getLeague().equalsIgnoreCase("Университетская лига")) {
                univTeamsCount++;
            }
            if (team.getCity().equalsIgnoreCase("Москва")) {
                cityTeamsCount++;
            }
        }
        // Вывод результатов
        System.out.println("\nКоличество команд в регулярной лиге: " + regTeamsCount);
        System.out.println("Количество команд в университетской лиге: " + univTeamsCount);
        System.out.println("Количество команд в городе Москва: " + cityTeamsCount);
    }
    public static void countTeamsByConditions(KvnTeam[] teams) {
        // Инициализация счетчиков
        int captainAgeCount = 0;
        int under21MembersCount = 0;
        int sponsorAmountCount = 0;
        int instrumentsCount = 0;
        // Обход массива команд и подсчет команд по заданным условиям
        for (KvnTeam team : teams) {
            if (team.getCaptainAge() <= 39) {
                captainAgeCount++;
            }
            double under21Percent = (double) team.getUnder21Members() / team.getTotalMembers() * 100;
            if (under21Percent < 30) {
                under21MembersCount++;
            }
            double sponsorAmountRequired = team.getTotalMembers() * 100000;
            if (team.getSponsorAmount() == sponsorAmountRequired) {
                sponsorAmountCount++;
            }
            double instrumentsPerMember = (double) team.getInstruments() / team.getTotalMembers();
            if (instrumentsPerMember > 0.6) {
                instrumentsCount++;
            }
        }
        System.out.println("\nКоличество команд с капитанами возрастом до 39 лет: " + captainAgeCount);
        System.out.println("Количество команд, где количество участников младше 21 года меньше 30% от общего числа участников: " + under21MembersCount);
        System.out.println("Количество команд с суммой спонсорских взносов равной количеству человек в команде умноженных на 100000: " + sponsorAmountCount);
        System.out.println("Количество команд, где количество музыкальных инструментов на 1 участника более 0.6: " + instrumentsCount);
    }
}