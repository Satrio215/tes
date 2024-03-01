public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    public Student() {
        name = "";
        address = "";
        age = 0;
    }

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(double math) {
        mathGrade = math;
    }

    public void setEnglish(double english) {
        englishGrade = english;
    }

    public void setScience(double science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3.0; // Convert to double for accurate result
        return result;
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata-rata " + getAverage());
    }
}
