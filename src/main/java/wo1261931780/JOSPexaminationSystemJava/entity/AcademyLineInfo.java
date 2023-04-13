package wo1261931780.JOSPexaminationSystemJava.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Intellij IDEA.
 * Project:JOSP-ExaminationSystemJava
 * Package:wo1261931780.JOSPexaminationSystemJava.entity
 *
 * @author liujiajun_junw
 * @Date 2023-04-21-40  星期三
 * @description
 */

/**
 * 开源分数查询系统-院线表
 */
@ApiModel(description = "开源分数查询系统-院线表")
@Schema(description = "开源分数查询系统-院线表")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "academy_line_info")
public class AcademyLineInfo implements Serializable {
	/**
	 * 主键，专业代码
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "主键，专业代码")
	@Schema(description = "主键，专业代码")
	private String id;
	
	/**
	 * 专业名称
	 */
	@TableField(value = "subject_name")
	@ApiModelProperty(value = "专业名称,")
	@Schema(description = "专业名称")
	private String subjectName;
	
	/**
	 * 学院代码
	 */
	@TableField(value = "academy_code")
	@ApiModelProperty(value = "学院代码,")
	@Schema(description = "学院代码")
	private String academyCode;
	
	/**
	 * 学院名称
	 */
	@TableField(value = "academy_name")
	@ApiModelProperty(value = "学院名称,")
	@Schema(description = "学院名称")
	private String academyName;
	
	/**
	 * 培养类型
	 */
	@TableField(value = "training_mode")
	@ApiModelProperty(value = "培养类型,")
	@Schema(description = "培养类型")
	private String trainingMode;
	
	/**
	 * 学位类型
	 */
	@TableField(value = "degree_type")
	@ApiModelProperty(value = "学位类型,")
	@Schema(description = "学位类型")
	private String degreeType;
	
	/**
	 * 研究方向
	 */
	@TableField(value = "study_forward")
	@ApiModelProperty(value = "研究方向,")
	@Schema(description = "研究方向")
	private String studyForward;
	
	/**
	 * 推免生人数
	 */
	@TableField(value = "students_exempted")
	@ApiModelProperty(value = "推免生人数,")
	@Schema(description = "推免生人数")
	private Integer studentsExempted;
	
	/**
	 * 统考生人数
	 */
	@TableField(value = "students_enrolled_in_the_unified_examination")
	@ApiModelProperty(value = "统考生人数,")
	@Schema(description = "统考生人数")
	private Integer studentsEnrolledInTheUnifiedExamination;
	
	private static final long serialVersionUID = 1L;
	
	public static final String COL_ID = "id";
	
	public static final String COL_SUBJECT_NAME = "subject_name";
	
	public static final String COL_ACADEMY_CODE = "academy_code";
	
	public static final String COL_ACADEMY_NAME = "academy_name";
	
	public static final String COL_TRAINING_MODE = "training_mode";
	
	public static final String COL_DEGREE_TYPE = "degree_type";
	
	public static final String COL_STUDY_FORWARD = "study_forward";
	
	public static final String COL_STUDENTS_EXEMPTED = "students_exempted";
	
	public static final String COL_STUDENTS_ENROLLED_IN_THE_UNIFIED_EXAMINATION = "students_enrolled_in_the_unified_examination";
}
