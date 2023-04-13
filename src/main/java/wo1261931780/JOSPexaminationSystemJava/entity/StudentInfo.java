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
 * 开源分数查询系统-学生信息表
 */
@ApiModel(description = "开源分数查询系统-学生信息表")
@Schema(description = "开源分数查询系统-学生信息表")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "student_info")
public class StudentInfo implements Serializable {
	/**
	 * 主键，学生编号
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "主键，学生编号")
	@Schema(description = "主键，学生编号")
	private String id;
	
	/**
	 * 学生姓名
	 */
	@TableField(value = "student_name")
	@ApiModelProperty(value = "学生姓名")
	@Schema(description = "学生姓名")
	private String studentName;
	
	/**
	 * 学科代码
	 */
	@TableField(value = "subject_code")
	@ApiModelProperty(value = "学科代码")
	@Schema(description = "学科代码")
	private String subjectCode;
	
	/**
	 * 学院代码
	 */
	@TableField(value = "academy_code")
	@ApiModelProperty(value = "学院代码")
	@Schema(description = "学院代码")
	private String academyCode;
	
	/**
	 * 录取状态
	 */
	@TableField(value = "remark")
	@ApiModelProperty(value = "录取状态")
	@Schema(description = "录取状态")
	private String remark;
	
	/**
	 * 专项计划
	 */
	@TableField(value = "projects")
	@ApiModelProperty(value = "专项计划")
	@Schema(description = "专项计划")
	private String projects;
	
	/**
	 * 其它信息
	 */
	@TableField(value = "other_remark")
	@ApiModelProperty(value = "其它信息")
	@Schema(description = "其它信息")
	private String otherRemark;
	
	/**
	 * 研究方向
	 */
	@TableField(value = "study_forward")
	@ApiModelProperty(value = "研究方向")
	@Schema(description = "研究方向")
	private String studyForward;
	
	private static final long serialVersionUID = 1L;
	
	public static final String COL_ID = "id";
	
	public static final String COL_STUDENT_NAME = "student_name";
	
	public static final String COL_SUBJECT_CODE = "subject_code";
	
	public static final String COL_ACADEMY_CODE = "academy_code";
	
	public static final String COL_REMARK = "remark";
	
	public static final String COL_PROJECTS = "projects";
	
	public static final String COL_OTHER_REMARK = "other_remark";
	
	public static final String COL_STUDY_FORWARD = "study_forward";
}
