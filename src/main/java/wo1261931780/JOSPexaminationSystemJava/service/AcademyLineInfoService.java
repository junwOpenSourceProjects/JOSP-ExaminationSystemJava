package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.JOSPexaminationSystemJava.entity.AcademyLineInfo;
import java.util.List;
import wo1261931780.JOSPexaminationSystemJava.DAO.AcademyLineInfoMapper;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-04-21-40  星期三
*@description
*/
@Service
public class AcademyLineInfoService extends ServiceImpl<AcademyLineInfoMapper, AcademyLineInfo> {

    
    public int updateBatch(List<AcademyLineInfo> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<AcademyLineInfo> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<AcademyLineInfo> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(AcademyLineInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(AcademyLineInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
