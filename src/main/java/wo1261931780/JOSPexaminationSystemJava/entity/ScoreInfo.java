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
*@Date 2023-04-21-40  星期三
*@description
*/
/**
    * 开源分数查询系统-成绩表
    */
@ApiModel(description="开源分数查询系统-成绩表")
@Schema(description="开源分数查询系统-成绩表")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "score_info")
public class ScoreInfo implements Serializable {
    /**
     * 主键，学生编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键，学生编号")
    @Schema(description="主键，学生编号")
    private String id;

    /**
     * 政治

     */
    @TableField(value = "score_polite")
    @ApiModelProperty(value="政治,")
    @Schema(description="政治")
    private Integer scorePolite;

    /**
     * 英语

     */
    @TableField(value = "score_english")
    @ApiModelProperty(value="英语,")
    @Schema(description="英语")
    private Integer scoreEnglish;

    /**
     * 专业课一

     */
    @TableField(value = "score_professional_1")
    @ApiModelProperty(value="专业课一,")
    @Schema(description="专业课一")
    private Integer scoreProfessional1;

    /**
     * 专业课二

     */
    @TableField(value = "score_professional_2")
    @ApiModelProperty(value="专业课二,")
    @Schema(description="专业课二")
    private Integer scoreProfessional2;

    /**
     * 初试总分

     */
    @TableField(value = "score_total_first")
    @ApiModelProperty(value="初试总分,")
    @Schema(description="初试总分")
    private Integer scoreTotalFirst;

    /**
     * 复试总分

     */
    @TableField(value = "score_total_review")
    @ApiModelProperty(value="复试总分,")
    @Schema(description="复试总分")
    private Integer scoreTotalReview;

    /**
     * 最终成绩

     */
    @TableField(value = "score_total")
    @ApiModelProperty(value="最终成绩,")
    @Schema(description="最终成绩")
    private Integer scoreTotal;

    /**
     * 公共课总分

     */
    @TableField(value = "score_total_public")
    @ApiModelProperty(value="公共课总分,")
    @Schema(description="公共课总分")
    private Integer scoreTotalPublic;

    /**
     * 专业课总分

     */
    @TableField(value = "score_total_professional")
    @ApiModelProperty(value="专业课总分,")
    @Schema(description="专业课总分")
    private Integer scoreTotalProfessional;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SCORE_POLITE = "score_polite";

    public static final String COL_SCORE_ENGLISH = "score_english";

    public static final String COL_SCORE_PROFESSIONAL_1 = "score_professional_1";

    public static final String COL_SCORE_PROFESSIONAL_2 = "score_professional_2";

    public static final String COL_SCORE_TOTAL_FIRST = "score_total_first";

    public static final String COL_SCORE_TOTAL_REVIEW = "score_total_review";

    public static final String COL_SCORE_TOTAL = "score_total";

    public static final String COL_SCORE_TOTAL_PUBLIC = "score_total_public";

    public static final String COL_SCORE_TOTAL_PROFESSIONAL = "score_total_professional";
}
