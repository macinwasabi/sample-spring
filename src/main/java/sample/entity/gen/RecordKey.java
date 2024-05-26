package sample.entity.gen;

public class RecordKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.student_id
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    private Long studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.subject_id
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    private Long subjectId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.student_id
     *
     * @return the value of record.student_id
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.student_id
     *
     * @param studentId the value for record.student_id
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.subject_id
     *
     * @return the value of record.subject_id
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.subject_id
     *
     * @param subjectId the value for record.subject_id
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RecordKey other = (RecordKey) that;
        return (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getSubjectId() == null ? other.getSubjectId() == null : this.getSubjectId().equals(other.getSubjectId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        return result;
    }
}