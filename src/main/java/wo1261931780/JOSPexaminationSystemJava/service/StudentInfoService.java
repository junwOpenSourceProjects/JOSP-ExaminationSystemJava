package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.JOSPexaminationSystemJava.entity.StudentInfo;
import java.util.List;
import wo1261931780.JOSPexaminationSystemJava.DAO.StudentInfoMapper;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-04-21-40  星期三
*@description
*/
@Service
public class StudentInfoService extends ServiceImpl<StudentInfoMapper, StudentInfo> {

    
    public int updateBatch(List<StudentInfo> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<StudentInfo> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<StudentInfo> list) {
        return baseMapper.batchInsert(list);
    }
    
    public boolean insertOrUpdate(StudentInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(StudentInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
