package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.JOSPexaminationSystemJava.dao.NationalLineMapper;
import wo1261931780.JOSPexaminationSystemJava.entity.NationalLine;
import java.util.List;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description
*/
@Service
public class NationalLineService extends ServiceImpl<NationalLineMapper, NationalLine> {

    
    public int updateBatch(List<NationalLine> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<NationalLine> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<NationalLine> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(NationalLine record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(NationalLine record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
