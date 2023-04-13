package wo1261931780.JOSPexaminationSystemJava.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import wo1261931780.JOSPexaminationSystemJava.entity.AcademyLineInfo;

import java.util.OptionalDouble;

/**
 * Created by Intellij IDEA.
 * Project:JOSP-ExaminationSystemJava
 * Package:wo1261931780.JOSPexaminationSystemJava.DTO
 *
 * @author liujiajun_junw
 * @Date 2023-04-20-41  星期三
 * @description
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AcademySubjectListDTO extends AcademyLineInfo {
	
	/**
	 * 录取均分
	 */
	private OptionalDouble checkedAverageScore;
	
	/**
	 * 录取最高分
	 */
	private Integer checkedHighScore;
	
	/**
	 * 录取最低分
	 */
	private Integer checkedLowScore;
	
	/**
	 * 复试均分
	 */
	private OptionalDouble reviewListAverageScore;
	
}
