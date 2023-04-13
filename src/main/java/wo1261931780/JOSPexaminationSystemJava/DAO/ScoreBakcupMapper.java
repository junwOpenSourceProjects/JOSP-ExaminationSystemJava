package wo1261931780.JOSPexaminationSystemJava.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.JOSPexaminationSystemJava.entity.ScoreBakcup;

/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.DAO
*@author liujiajun_junw
*@Date 2023-04-12-21  星期四
*@description 
*/
@Mapper
public interface ScoreBakcupMapper extends BaseMapper<ScoreBakcup> {
    int updateBatch(List<ScoreBakcup> list);

    int updateBatchSelective(List<ScoreBakcup> list);

    int batchInsert(@Param("list") List<ScoreBakcup> list);

    int insertOrUpdate(ScoreBakcup record);

    int insertOrUpdateSelective(ScoreBakcup record);
}