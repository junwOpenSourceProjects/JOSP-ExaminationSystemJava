package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import wo1261931780.JOSPexaminationSystemJava.DAO.ScoreBakcupMapper;
import wo1261931780.JOSPexaminationSystemJava.entity.ScoreBakcup;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-04-12-21  星期四
*@description
*/
@Service
public class ScoreBakcupService extends ServiceImpl<ScoreBakcupMapper, ScoreBakcup> {

    
    public int updateBatch(List<ScoreBakcup> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<ScoreBakcup> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<ScoreBakcup> list) {
        return baseMapper.batchInsert(list);
    }
    
    public boolean insertOrUpdate(ScoreBakcup record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(ScoreBakcup record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
