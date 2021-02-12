package vasko.collections.map;

import java.util.Objects;
//Объект названия дисциплины и оценки по ней.
public class SubjectGrade {
    private final String subject;
    private final int grade;

    public SubjectGrade(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectGrade that = (SubjectGrade) o;
        return grade == that.grade && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, grade);
    }

    @Override
    public String toString() {
        return "Grade " + subject + " " + grade;
    }
}
