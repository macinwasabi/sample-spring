package sample.mapper.gen;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sample.entity.gen.Student;
import sample.entity.gen.StudentExample;

@Mapper
public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    long countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int deleteByPrimaryKey(Long studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int insert(Student row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int insertSelective(Student row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    Student selectByPrimaryKey(Long studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int updateByExampleSelective(@Param("row") Student row, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int updateByExample(@Param("row") Student row, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int updateByPrimaryKeySelective(Student row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int updateByPrimaryKey(Student row);
}