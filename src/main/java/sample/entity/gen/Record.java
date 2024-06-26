package sample.entity.gen;

import java.util.Date;

public class Record extends RecordKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.score
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.created_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.updated_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.score
     *
     * @return the value of record.score
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.score
     *
     * @param score the value for record.score
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.created_at
     *
     * @return the value of record.created_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.created_at
     *
     * @param createdAt the value for record.created_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.updated_at
     *
     * @return the value of record.updated_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.updated_at
     *
     * @param updatedAt the value for record.updated_at
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
        Record other = (Record) that;
        return (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getSubjectId() == null ? other.getSubjectId() == null : this.getSubjectId().equals(other.getSubjectId()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
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
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}