package wo1261931780.JOSPexaminationSystemJava.DTO;

import lombok.Data;

/**
 * Created by Intellij IDEA.
 * Project:JOSP-ExaminationSystemJava
 * Package:wo1261931780.JOSPexaminationSystemJava.DTO
 *
 * @author liujiajun_junw
 * @Date 2023-04-20-40  星期三
 * @description
 */
@Data
public class StudentListDTO {

	
	
	/**
	 * 学生编号
	 */
	private String studentCode;
	
	/**
	 * 学生姓名
	 */
	private String studentName;
	
	/**
	 * 学科代码
	 */
	private String subjectCode;
	
	/**
	 * 学院名称
	 */
	private String academyName;
	
	/**
	 * 录取状态
	 */
	private String remark;
	
	/**
	 * 专项计划
	 */
	private String projects;
	
	/**
	 * 其它信息
	 */
	private String otherRemark;
	
	/**
	 * 研究方向
	 */
	private String studyForward;
	
	/**
	 * 政治
	 */
	private Integer scorePolite;
	
	/**
	 * 英语
	 */
	private Integer scoreEnglish;
	
	/**
	 * 专业课一
	 */
	private Integer scoreProfessional1;
	
	/**
	 * 专业课二
	 */
	private Integer scoreProfessional2;
	
	/**
	 * 初试总分
	 */
	private Integer scoreTotalFirst;
	
	/**
	 * 复试总分
	 */
	private Integer scoreTotalReview;
	
	/**
	 * 最终成绩
	 */
	private Integer scoreTotal;
	
	/**
	 * 公共课总分
	 */
	private Integer scoreTotalPublic;
	
	/**
	 * 专业课总分
	 */
	private Integer scoreTotalProfessional;
	
}
