public class ClassName {
    private String CourseTitle;
    private int CourseCode;
    private double Credit;
    private String InstructorName;

    public static void main(String[] args) {

    }

    public void Classname(String CourseTitle, int CourseCode, double Credit, String InstructorName) {
        this.CourseTitle = CourseTitle;
        this.CourseCode = CourseCode;
        this.Credit = Credit;
        this.InstructorName = InstructorName;
    }

    public String TitleGetter() {
        return CourseTitle;
    }

    public void TitleSetter(String CourseTitle) {
        this.CourseTitle = CourseTitle;
    }

    public int CodeGetter() {
        return CourseCode;
    }

    public void CodeSetter(int CourseCode) {
        this.CourseCode = CourseCode;
    }

    public double CreditGetter() {
        return Credit;
    }

    public void CreditSetter(double Credit) {
        this.Credit = Credit;
    }

    public String InstructorGetter() {
        return InstructorName;
    }

    public void InstructorSetter(String InstructorName) {
        this.InstructorName = InstructorName;
    }

    public String toString() {
        return "Course Title: " + CourseTitle + "\nCourse Code: " + CourseCode + "\nCredit: " + Credit
                + "\nInstructor Name: " + InstructorName;
    }
}
