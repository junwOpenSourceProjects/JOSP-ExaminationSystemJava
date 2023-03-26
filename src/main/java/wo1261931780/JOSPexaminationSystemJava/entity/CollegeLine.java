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
    * 2023年上海交通大学校线
    */
@ApiModel(description="2023年上海交通大学校线")
@Schema(description="2023年上海交通大学校线")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "college_line")
public class CollegeLine implements Serializable {
    /**
     * 院线主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="院线主键")
    @Schema(description="院线主键")
    private String id;

    /**
     * 学科类型
     */
    @TableField(value = "subject_class")
    @ApiModelProperty(value="学科类型")
    @Schema(description="学科类型")
    private String subjectClass;

    /**
     * 学硕专硕
     */
    @TableField(value = "degree_type")
    @ApiModelProperty(value="学硕专硕")
    @Schema(description="学硕专硕")
    private String degreeType;

    /**
     * 政治校线
     */
    @TableField(value = "score_polite")
    @ApiModelProperty(value="政治校线")
    @Schema(description="政治校线")
    private Integer scorePolite;

    /**
     * 英语校线
     */
    @TableField(value = "score_english")
    @ApiModelProperty(value="英语校线")
    @Schema(description="英语校线")
    private Integer scoreEnglish;

    /**
     * 专业课一校线
     */
    @TableField(value = "score_professional_1")
    @ApiModelProperty(value="专业课一校线")
    @Schema(description="专业课一校线")
    private Integer scoreProfessional1;

    /**
     * 专业课二校线
     */
    @TableField(value = "score_professional_2")
    @ApiModelProperty(value="专业课二校线")
    @Schema(description="专业课二校线")
    private Integer scoreProfessional2;

    /**
     * 总分校线
     */
    @TableField(value = "score_total")
    @ApiModelProperty(value="总分校线")
    @Schema(description="总分校线")
    private Integer scoreTotal;

    /**
     * 公共课总分校线
     */
    @TableField(value = "score_total_public")
    @ApiModelProperty(value="公共课总分校线")
    @Schema(description="公共课总分校线")
    private Integer scoreTotalPublic;

    /**
     * 专业课总分校线
     */
    @TableField(value = "score_total_professional")
    @ApiModelProperty(value="专业课总分校线")
    @Schema(description="专业课总分校线")
    private Integer scoreTotalProfessional;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SUBJECT_CLASS = "subject_class";

    public static final String COL_DEGREE_TYPE = "degree_type";

    public static final String COL_SCORE_POLITE = "score_polite";

    public static final String COL_SCORE_ENGLISH = "score_english";

    public static final String COL_SCORE_PROFESSIONAL_1 = "score_professional_1";

    public static final String COL_SCORE_PROFESSIONAL_2 = "score_professional_2";

    public static final String COL_SCORE_TOTAL = "score_total";

    public static final String COL_SCORE_TOTAL_PUBLIC = "score_total_public";

    public static final String COL_SCORE_TOTAL_PROFESSIONAL = "score_total_professional";
}