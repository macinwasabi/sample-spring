package sample.mapper.gen;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sample.entity.gen.ClassInfo;
import sample.entity.gen.ClassInfoExample;
import sample.entity.gen.ClassInfoKey;

@Mapper
public interface ClassInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    long countByExample(ClassInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int deleteByExample(ClassInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int deleteByPrimaryKey(ClassInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int insert(ClassInfo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int insertSelective(ClassInfo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    List<ClassInfo> selectByExample(ClassInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    ClassInfo selectByPrimaryKey(ClassInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int updateByExampleSelective(@Param("row") ClassInfo row, @Param("example") ClassInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int updateByExample(@Param("row") ClassInfo row, @Param("example") ClassInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int updateByPrimaryKeySelective(ClassInfo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class_info
     *
     * @mbg.generated Sun May 19 17:10:55 JST 2024
     */
    int updateByPrimaryKey(ClassInfo row);
}