package wo1261931780.JOSPexaminationSystemJava.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import wo1261931780.JOSPexaminationSystemJava.DAO.ReviewListMapper;
import wo1261931780.JOSPexaminationSystemJava.entity.ReviewList;
/**
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.service
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description
*/
@Service
public class ReviewListService extends ServiceImpl<ReviewListMapper, ReviewList> {

    
    public int updateBatch(List<ReviewList> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<ReviewList> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<ReviewList> list) {
        return baseMapper.batchInsert(list);
    }
    
    public boolean insertOrUpdate(ReviewList record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(ReviewList record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
