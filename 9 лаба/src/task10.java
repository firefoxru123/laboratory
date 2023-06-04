import java.util.ArrayList;
import java.util.List;

public class task10{
    public static void main(String[] args) {
        String data = "Манекенщица1: Иванова; Мария; Сергеевна; Женский; Российская; 175; 55; 1998, 05, 15; 123456, Россия, Московская область, Центральный район, Москва, Улица1, 1, 1." +
                      "Манекенщица2: Петрова; Елена; Александровна; Женский; Российская; 170; 60; 1995, 10, 20; 654321, Россия, Московская область, Западный район, Москва, Улица2, 2, 2." +
                      "Манекенщица3: Сидорова; Анна; Васильевна; Женский; Российская; 180; 65; 2000, 01, 10; 987654, Россия, Московская область, Восточный район, Москва, Улица3, 3, 3.";

        String[] objects = data.split("\\.");
        List<Mannequin> mannequins = new ArrayList<>();
        for (String object : objects) {
            String[] fields = object.split(";");
            if (fields.length == 9) {
                String lastName = fields[0].trim();
                String firstName = fields[1].trim();
                String middleName = fields[2].trim();
                String gender = fields[3].trim();
                String nationality = fields[4].trim();
                int height = Integer.parseInt(fields[5].trim());
                int weight = Integer.parseInt(fields[6].trim());
                String[] birthDateFields = fields[7].trim().split(", ");
                int year = Integer.parseInt(birthDateFields[0]);
                int month = Integer.parseInt(birthDateFields[1]);
                int day = Integer.parseInt(birthDateFields[2]);
                String[] addressFields = fields[8].trim().split(", ");
                String postalCode = addressFields[0];
                String country = addressFields[1];
                String region = addressFields[2];
                String district = addressFields[3];
                String city = addressFields[4];
                String street = addressFields[5];
                String house = addressFields[6];
                String apartment = addressFields[7];
                Mannequin mannequin = new Mannequin(lastName, firstName, middleName, gender, nationality, height, weight, year, month, day, postalCode, country, region, district, city, street, house, apartment);
                mannequins.add(mannequin);
            }
        }
        int count = 0;
        Mannequin youngestMannequin = null;
        for (Mannequin mannequin : mannequins) {
            if (mannequin.getPhoneNumber().startsWith("+7") && mannequin.getAge() >= 20 && mannequin.getAge() <= 23) {
                count++;
                if (youngestMannequin == null || mannequin.getAge() < youngestMannequin.getAge()) {
                    youngestMannequin = mannequin;
                }
            }
        }
        System.out.println("Количество людей с российскими номерами телефона (телефон начинается на +7) и возрастом от 20 до 23 лет: " + count);
        if (youngestMannequin != null) {
            System.out.println("Самая молодая манекенщица: " + youngestMannequin.getFullName() + ", возраст: " + youngestMannequin.getAge());
        }
    }
}

class Mannequin {
    private String lastName;
    private String firstName;
    private String middleName;
    private String gender;
    private String nationality;
    private int height;
    private int weight;
    private int year;
    private int month;
    private int day;
    private String postalCode;
    private String country;
    private String region;
    private String district;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public Mannequin(String lastName, String firstName, String middleName, String gender, String nationality, int height, int weight, int year, int month, int day, String postalCode, String country, String region, String district, String city, String street, String house, String apartment) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gender = gender;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
        this.year = year;
        this.month = month;
        this.day = day;
        this.postalCode = postalCode;
        this.country = country;
        this.region = region;
        this.district = district;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }

    public String getPhoneNumber() {
        return postalCode;
    }

    public int getAge() {
        // Assuming current date is 2023-06-04
        int currentYear = 2023;
        int currentMonth = 5;
        int currentDay = 4;
        int age = currentYear - year;
        if (currentMonth < month || (currentMonth == month && currentDay < day)) {
            age--;
        }
        return age;
    }
}
