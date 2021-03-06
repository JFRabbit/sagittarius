package org.sagittarius.mybatis.generator;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sagittarius.mybatis.generator.dto.Project;
import org.sagittarius.mybatis.generator.dto.ProjectCriteria;
import org.sagittarius.mybatis.generator.dto.ProjectKey;

public interface ProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    long countByExample(ProjectCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    int deleteByExample(ProjectCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    int deleteByPrimaryKey(ProjectKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    int insert(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    int insertSelective(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    List<Project> selectByExample(ProjectCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    Project selectByPrimaryKey(ProjectKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    int updateByExample(@Param("record") Project record, @Param("example") ProjectCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    int updateByPrimaryKeySelective(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Tue Jul 11 11:13:41 CST 2017
     */
    int updateByPrimaryKey(Project record);
}