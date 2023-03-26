package wo1261931780.JOSPexaminationSystemJava.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.JOSPexaminationSystemJava.entity.AcademyLine;

/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.dao
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description 
*/
@Mapper
public interface AcademyLineMapper extends BaseMapper<AcademyLine> {
    int updateBatch(List<AcademyLine> list);

    int updateBatchSelective(List<AcademyLine> list);

    int batchInsert(@Param("list") List<AcademyLine> list);

    int insertOrUpdate(AcademyLine record);

    int insertOrUpdateSelective(AcademyLine record);
}