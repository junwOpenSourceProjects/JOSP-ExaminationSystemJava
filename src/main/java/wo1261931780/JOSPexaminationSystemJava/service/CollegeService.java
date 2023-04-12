package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.JOSPexaminationSystemJava.DAO.CollegeMapper;
import wo1261931780.JOSPexaminationSystemJava.entity.College;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description
*/
@Service
public class CollegeService extends ServiceImpl<CollegeMapper, College> {

    
    public int updateBatch(List<College> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<College> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<College> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(College record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(College record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
