package wo1261931780.JOSPexaminationSystemJava.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.JOSPexaminationSystemJava.entity.AcademyGenerateScore;

/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.dao
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description
*/
@Mapper
public interface AcademyGenerateScoreMapper extends BaseMapper<AcademyGenerateScore> {
    int updateBatch(List<AcademyGenerateScore> list);

    int updateBatchSelective(List<AcademyGenerateScore> list);

    int batchInsert(@Param("list") List<AcademyGenerateScore> list);

    boolean insertOrUpdate(AcademyGenerateScore record);

    int insertOrUpdateSelective(AcademyGenerateScore record);
}
