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
*Created by Intellij IDEA.
*Project:JOSP-ExaminationSystemJava
*Package:wo1261931780.JOSPexaminationSystemJava.entity
*@author liujiajun_junw
*@Date 2023-03-11-17  星期日
*@description
*/
/**
    * 2023年上海交大各学院院线
    */
@ApiModel(description="2023年上海交大各学院院线")
@Schema(description="2023年上海交大各学院院线")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "academy_line")
public class AcademyLine implements Serializable {
    /**
     * 院线主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="院线主键")
    @Schema(description="院线主键")
    private String id;

    /**
     * 专业代码
     */
    @TableField(value = "profession_code")
    @ApiModelProperty(value="专业代码")
    @Schema(description="专业代码")
    private String professionCode;

    /**
     * 专业名称
     */
    @TableField(value = "profession_name")
    @ApiModelProperty(value="专业名称")
    @Schema(description="专业名称")
    private String professionName;

    /**
     * 考试方式
     */
    @TableField(value = "test_way")
    @ApiModelProperty(value="考试方式")
    @Schema(description="考试方式")
    private String testWay;

    /**
     * 政治成绩
     */
    @TableField(value = "score_polite")
    @ApiModelProperty(value="政治成绩")
    @Schema(description="政治成绩")
    private Integer scorePolite;

    /**
     * 英语成绩
     */
    @TableField(value = "score_english")
    @ApiModelProperty(value="英语成绩")
    @Schema(description="英语成绩")
    private Integer scoreEnglish;

    /**
     * 专业课一
     */
    @TableField(value = "score_professional_1")
    @ApiModelProperty(value="专业课一")
    @Schema(description="专业课一")
    private Integer scoreProfessional1;

    /**
     * 专业课二
     */
    @TableField(value = "score_professional_2")
    @ApiModelProperty(value="专业课二")
    @Schema(description="专业课二")
    private Integer scoreProfessional2;

    /**
     * 复试线总分
     */
    @TableField(value = "score_total")
    @ApiModelProperty(value="复试线总分")
    @Schema(description="复试线总分")
    private Integer scoreTotal;

    /**
     * 公共课总分院线
     */
    @TableField(value = "score_total_public")
    @ApiModelProperty(value="公共课总分院线")
    @Schema(description="公共课总分院线")
    private Integer scoreTotalPublic;

    /**
     * 专业课总分院线
     */
    @TableField(value = "score_total_professional")
    @ApiModelProperty(value="专业课总分院线")
    @Schema(description="专业课总分院线")
    private Integer scoreTotalProfessional;

    /**
     * 培养方式
     */
    @TableField(value = "training_mode")
    @ApiModelProperty(value="培养方式")
    @Schema(description="培养方式")
    private String trainingMode;

    /**
     * 学位类型
     */
    @TableField(value = "degree_type")
    @ApiModelProperty(value="学位类型")
    @Schema(description="学位类型")
    private String degreeType;

    /**
     * 研究方向
     */
    @TableField(value = "research_direction")
    @ApiModelProperty(value="研究方向")
    @Schema(description="研究方向")
    private String researchDirection;

    /**
     * 推免生人数
     */
    @TableField(value = "number_of_students_exempted")
    @ApiModelProperty(value="推免生人数")
    @Schema(description="推免生人数")
    private Integer numberOfStudentsExempted;

    /**
     * 统考生人数
     */
    @TableField(value = "number_of_students_enrolled_in_the_unified_examination")
    @ApiModelProperty(value="统考生人数")
    @Schema(description="统考生人数")
    private Integer numberOfStudentsEnrolledInTheUnifiedExamination;

    /**
     * 学院名称
     */
    @TableField(value = "academy_name")
    @ApiModelProperty(value="学院名称")
    @Schema(description="学院名称")
    private String academyName;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_PROFESSION_CODE = "profession_code";

    public static final String COL_PROFESSION_NAME = "profession_name";

    public static final String COL_TEST_WAY = "test_way";

    public static final String COL_SCORE_POLITE = "score_polite";

    public static final String COL_SCORE_ENGLISH = "score_english";

    public static final String COL_SCORE_PROFESSIONAL_1 = "score_professional_1";

    public static final String COL_SCORE_PROFESSIONAL_2 = "score_professional_2";

    public static final String COL_SCORE_TOTAL = "score_total";

    public static final String COL_SCORE_TOTAL_PUBLIC = "score_total_public";

    public static final String COL_SCORE_TOTAL_PROFESSIONAL = "score_total_professional";

    public static final String COL_TRAINING_MODE = "training_mode";

    public static final String COL_DEGREE_TYPE = "degree_type";

    public static final String COL_RESEARCH_DIRECTION = "research_direction";

    public static final String COL_NUMBER_OF_STUDENTS_EXEMPTED = "number_of_students_exempted";

    public static final String COL_NUMBER_OF_STUDENTS_ENROLLED_IN_THE_UNIFIED_EXAMINATION = "number_of_students_enrolled_in_the_unified_examination";

    public static final String COL_ACADEMY_NAME = "academy_name";
}
