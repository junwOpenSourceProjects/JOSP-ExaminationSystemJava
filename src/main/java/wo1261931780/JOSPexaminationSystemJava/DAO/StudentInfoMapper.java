package wo1261931780.JOSPexaminationSystemJava.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.JOSPexaminationSystemJava.entity.StudentInfo;

/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.DAO
*@author liujiajun_junw
*@Date 2023-04-21-40  星期三
*@description 
*/
@Mapper
public interface StudentInfoMapper extends BaseMapper<StudentInfo> {
    int updateBatch(List<StudentInfo> list);

    int updateBatchSelective(List<StudentInfo> list);

    int batchInsert(@Param("list") List<StudentInfo> list);

    boolean insertOrUpdate(StudentInfo record);

    int insertOrUpdateSelective(StudentInfo record);
}
