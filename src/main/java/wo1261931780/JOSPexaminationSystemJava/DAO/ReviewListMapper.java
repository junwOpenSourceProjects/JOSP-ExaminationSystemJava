package wo1261931780.JOSPexaminationSystemJava.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.JOSPexaminationSystemJava.entity.ReviewList;

/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.dao
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description
*/
@Mapper
public interface ReviewListMapper extends BaseMapper<ReviewList> {
    int updateBatch(List<ReviewList> list);

    int updateBatchSelective(List<ReviewList> list);

    int batchInsert(@Param("list") List<ReviewList> list);

    int insertOrUpdate(ReviewList record);

    int insertOrUpdateSelective(ReviewList record);
}
