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
 * 开源分数查询系统-专业均分表
 */
@ApiModel(description = "开源分数查询系统-专业均分表")
@Schema(description = "开源分数查询系统-专业均分表")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "academy_score_info")
public class AcademyScoreInfo implements Serializable {
	/**
	 * 主键，专业代码
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(value = "主键，专业代码")
	@Schema(description = "主键，专业代码")
	private String id;
	
	/**
	 * 学院代码
	 */
	@TableField(value = "academy_code")
	@ApiModelProperty(value = "学院代码")
	@Schema(description = "学院代码")
	private String academyCode;
	
	/**
	 * 学院名称
	 */
	@TableField(value = "academy_name")
	@ApiModelProperty(value = "学院名称")
	@Schema(description = "学院名称")
	private String academyName;
	
	/**
	 * 政治均分
	 */
	@TableField(value = "average_polite")
	@ApiModelProperty(value = "政治均分")
	@Schema(description = "政治均分")
	private Integer averagePolite;
	
	/**
	 * 英语均分
	 */
	@TableField(value = "average_english")
	@ApiModelProperty(value = "英语均分")
	@Schema(description = "英语均分")
	private Integer averageEnglish;
	
	/**
	 * 专业课一均分
	 */
	@TableField(value = "average_professional_1")
	@ApiModelProperty(value = "专业课一均分")
	@Schema(description = "专业课一均分")
	private Integer averageProfessional1;
	
	/**
	 * 专业课二均分
	 */
	@TableField(value = "average_professional_2")
	@ApiModelProperty(value = "专业课二均分")
	@Schema(description = "专业课二均分")
	private Integer averageProfessional2;
	
	/**
	 * 初试均分
	 */
	@TableField(value = "average_total_first")
	@ApiModelProperty(value = "初试均分")
	@Schema(description = "初试均分")
	private Integer averageTotalFirst;
	
	/**
	 * 复试均分
	 */
	@TableField(value = "average_total_review")
	@ApiModelProperty(value = "复试均分")
	@Schema(description = "复试均分")
	private Integer averageTotalReview;
	
	/**
	 * 总分均分
	 */
	@TableField(value = "average_total")
	@ApiModelProperty(value = "总分均分")
	@Schema(description = "总分均分")
	private Integer averageTotal;
	
	/**
	 * 公共课均分
	 */
	@TableField(value = "average_total_public")
	@ApiModelProperty(value = "公共课均分")
	@Schema(description = "公共课均分")
	private Integer averageTotalPublic;
	
	/**
	 * 专业课均分
	 */
	@TableField(value = "average_total_professional")
	@ApiModelProperty(value = "专业课均分")
	@Schema(description = "专业课均分")
	private Integer averageTotalProfessional;
	
	private static final long serialVersionUID = 1L;
	
	public static final String COL_ID = "id";
	
	public static final String COL_ACADEMY_CODE = "academy_code";
	
	public static final String COL_ACADEMY_NAME = "academy_name";
	
	public static final String COL_AVERAGE_POLITE = "average_polite";
	
	public static final String COL_AVERAGE_ENGLISH = "average_english";
	
	public static final String COL_AVERAGE_PROFESSIONAL_1 = "average_professional_1";
	
	public static final String COL_AVERAGE_PROFESSIONAL_2 = "average_professional_2";
	
	public static final String COL_AVERAGE_TOTAL_FIRST = "average_total_first";
	
	public static final String COL_AVERAGE_TOTAL_REVIEW = "average_total_review";
	
	public static final String COL_AVERAGE_TOTAL = "average_total";
	
	public static final String COL_AVERAGE_TOTAL_PUBLIC = "average_total_public";
	
	public static final String COL_AVERAGE_TOTAL_PROFESSIONAL = "average_total_professional";
}
