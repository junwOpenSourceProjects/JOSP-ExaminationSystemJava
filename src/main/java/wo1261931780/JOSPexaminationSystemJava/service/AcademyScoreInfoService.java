package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.JOSPexaminationSystemJava.DAO.AcademyScoreInfoMapper;
import java.util.List;
import wo1261931780.JOSPexaminationSystemJava.entity.AcademyScoreInfo;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-04-21-40  星期三
*@description
*/
@Service
public class AcademyScoreInfoService extends ServiceImpl<AcademyScoreInfoMapper, AcademyScoreInfo> {

    
    public int updateBatch(List<AcademyScoreInfo> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<AcademyScoreInfo> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<AcademyScoreInfo> list) {
        return baseMapper.batchInsert(list);
    }
    
    public boolean insertOrUpdate(AcademyScoreInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(AcademyScoreInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
