package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import wo1261931780.JOSPexaminationSystemJava.entity.RankInfo;
import wo1261931780.JOSPexaminationSystemJava.DAO.RankInfoMapper;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-04-21-40  星期三
*@description
*/
@Service
public class RankInfoService extends ServiceImpl<RankInfoMapper, RankInfo> {

    
    public int updateBatch(List<RankInfo> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<RankInfo> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<RankInfo> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(RankInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(RankInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
