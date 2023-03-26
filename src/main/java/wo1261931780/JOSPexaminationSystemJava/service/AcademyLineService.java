package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import wo1261931780.JOSPexaminationSystemJava.dao.AcademyLineMapper;
import wo1261931780.JOSPexaminationSystemJava.entity.AcademyLine;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description
*/
@Service
public class AcademyLineService extends ServiceImpl<AcademyLineMapper, AcademyLine> {

    
    public int updateBatch(List<AcademyLine> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<AcademyLine> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<AcademyLine> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(AcademyLine record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(AcademyLine record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
