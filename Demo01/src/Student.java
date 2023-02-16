import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double mathNum;
    private double yuWenNum;
    private double EngNum;


    public Student() {
    }

    public Student(String name, int age, double mathNum, double yuWenNum, double EngNum) {
        this.name = name;
        this.age = age;
        this.mathNum = mathNum;
        this.yuWenNum = yuWenNum;
        this.EngNum = EngNum;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return mathNum
     */
    public double getMathNum() {
        return mathNum;
    }

    /**
     * 设置
     * @param mathNum
     */
    public void setMathNum(double mathNum) {
        this.mathNum = mathNum;
    }

    /**
     * 获取
     * @return yuWenNum
     */
    public double getYuWenNum() {
        return yuWenNum;
    }

    /**
     * 设置
     * @param yuWenNum
     */
    public void setYuWenNum(double yuWenNum) {
        this.yuWenNum = yuWenNum;
    }

    /**
     * 获取
     * @return EngNum
     */
    public double getEngNum() {
        return EngNum;
    }

    /**
     * 设置
     * @param EngNum
     */
    public void setEngNum(double EngNum) {
        this.EngNum = EngNum;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", mathNum = " + mathNum + ", yuWenNum = " + yuWenNum + ", EngNum = " + EngNum + "总分："
                +(this.getMathNum()+this.getYuWenNum()+this.getEngNum())+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.mathNum, mathNum) == 0 && Double.compare(student.yuWenNum, yuWenNum) == 0 && Double.compare(student.EngNum, EngNum) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mathNum, yuWenNum, EngNum);
    }

    @Override
    public int compareTo(Student o) {
        int sum1 = (int)(this.getMathNum()+this.getYuWenNum()+this.getEngNum());
        int sum2 = (int)(o.getMathNum()+o.getYuWenNum()+o.getEngNum());

        int i = sum2 - sum1;

        i = i==0?(int)o.getMathNum()-(int)this.getMathNum():i;
        i = i==0?(int)o.getYuWenNum()-(int)this.getYuWenNum():i;
        i = i==0?(int)o.getEngNum()-(int)this.getEngNum():i;
        i = i==0?o.getAge()-this.getAge():i;
        i = i==0?o.getName().compareTo(this.getName()):i;

        return i;

    }
}
