package wo1261931780.JOSPexaminationSystemJava.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.JOSPexaminationSystemJava.entity.College;

/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.dao
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description 
*/
@Mapper
public interface CollegeMapper extends BaseMapper<College> {
    int updateBatch(List<College> list);

    int updateBatchSelective(List<College> list);

    int batchInsert(@Param("list") List<College> list);

    int insertOrUpdate(College record);

    int insertOrUpdateSelective(College record);
}