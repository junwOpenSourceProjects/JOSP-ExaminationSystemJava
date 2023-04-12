package wo1261931780.JOSPexaminationSystemJava.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.JOSPexaminationSystemJava.entity.CollegeLine;

/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.dao
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description
*/
@Mapper
public interface CollegeLineMapper extends BaseMapper<CollegeLine> {
    int updateBatch(List<CollegeLine> list);

    int updateBatchSelective(List<CollegeLine> list);

    int batchInsert(@Param("list") List<CollegeLine> list);

    int insertOrUpdate(CollegeLine record);

    int insertOrUpdateSelective(CollegeLine record);
}
