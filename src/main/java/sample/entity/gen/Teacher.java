package sample.entity.gen;

import java.util.Date;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_id
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    private Long teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.family_name
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    private String familyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.first_name
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.created_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.updated_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_id
     *
     * @return the value of teacher.teacher_id
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_id
     *
     * @param teacherId the value for teacher.teacher_id
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.family_name
     *
     * @return the value of teacher.family_name
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.family_name
     *
     * @param familyName the value for teacher.family_name
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.first_name
     *
     * @return the value of teacher.first_name
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.first_name
     *
     * @param firstName the value for teacher.first_name
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.created_at
     *
     * @return the value of teacher.created_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.created_at
     *
     * @param createdAt the value for teacher.created_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.updated_at
     *
     * @return the value of teacher.updated_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.updated_at
     *
     * @param updatedAt the value for teacher.updated_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
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
        Teacher other = (Teacher) that;
        return (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getFamilyName() == null ? other.getFamilyName() == null : this.getFamilyName().equals(other.getFamilyName()))
            && (this.getFirstName() == null ? other.getFirstName() == null : this.getFirstName().equals(other.getFirstName()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getFamilyName() == null) ? 0 : getFamilyName().hashCode());
        result = prime * result + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}