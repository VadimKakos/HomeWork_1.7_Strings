public class Main {
    public static void main(String[] args) {

//        first task

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

//        second task

        firstName = firstName.toUpperCase();
        middleName = middleName.toUpperCase();
        lastName = lastName.toUpperCase();
        fullName = lastName + firstName + middleName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

//        third task

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);
    }
}