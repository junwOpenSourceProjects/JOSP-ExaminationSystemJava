package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.JOSPexaminationSystemJava.entity.AcademyGenerateScore;
import wo1261931780.JOSPexaminationSystemJava.DAO.AcademyGenerateScoreMapper;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description
*/
@Service
public class AcademyGenerateScoreService extends ServiceImpl<AcademyGenerateScoreMapper, AcademyGenerateScore> {

    
    public int updateBatch(List<AcademyGenerateScore> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<AcademyGenerateScore> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<AcademyGenerateScore> list) {
        return baseMapper.batchInsert(list);
    }
    
    public boolean insertOrUpdate(AcademyGenerateScore record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(AcademyGenerateScore record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
