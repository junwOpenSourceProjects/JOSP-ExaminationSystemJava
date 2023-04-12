package wo1261931780.JOSPexaminationSystemJava.DTO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import wo1261931780.JOSPexaminationSystemJava.entity.AcademyLineInfo;

/**
 * Created by Intellij IDEA.
 * Project:JOSP-ExaminationSystemJava
 * Package:wo1261931780.JOSPexaminationSystemJava.DTO
 *
 * @author liujiajun_junw
 * @Date 2023-04-20-41  星期三
 * @description
 */
@Data
public class AcademySubjectListDTO extends AcademyLineInfo {
	
	/**
	 * 录取均分
	 */
	private Integer CheckedAverageScore;
	
	/**
	 * 录取最高分
	 */
	private Integer CheckedHighScore;
	
	/**
	 * 录取最低分
	 */
	private Integer CheckedLowScore;
	
	/**
	 * 复试均分
	 */
	private Integer ReviewListAverageScore;
	
}
