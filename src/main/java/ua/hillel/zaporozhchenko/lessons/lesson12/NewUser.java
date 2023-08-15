package ua.hillel.zaporozhchenko.lessons.lesson12;

public class NewUser {
        final String name;
        final int birthDay;
        final int birthMonth;
        final int birthYear;
        final String email;
        final String phone;
        public String surname;
        public int weight;
        public int pulse;
        public int countSteps;
        int age;


    NewUser(String name, String surname, int birthDay, int birthMonth, int birthYear, String email, String phone
            , int weight, int pulse, int countSteps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pulse = pulse;
        this.countSteps = countSteps;
        this.age = 2023 - birthYear;
        }

    public int getAge() {
        return age;
    }

    void printAccountInfo() {
        System.out.println("Name = " + name + '\n' + "Surname = " + surname + '\n' + "DOB = " + birthDay
                + "." + birthMonth + "." + birthYear + '\n' + "Email = " + email + '\n' + "Phone = "
                + phone + '\n' + "Weight = " + weight + '\n' + "Pulse = " + pulse + '\n' +
                "Steps = " + countSteps + '\n' + "Age = " + getAge());
    }
}

