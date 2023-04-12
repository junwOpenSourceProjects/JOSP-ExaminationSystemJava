package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.JOSPexaminationSystemJava.DAO.CollegeLineMapper;
import wo1261931780.JOSPexaminationSystemJava.entity.CollegeLine;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description
*/
@Service
public class CollegeLineService extends ServiceImpl<CollegeLineMapper, CollegeLine> {

    
    public int updateBatch(List<CollegeLine> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<CollegeLine> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<CollegeLine> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(CollegeLine record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(CollegeLine record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
