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
    * 开源分数查询系统-排名信息表
    */
@ApiModel(description="开源分数查询系统-排名信息表")
@Schema(description="开源分数查询系统-排名信息表")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "rank_info")
public class RankInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    @Schema(description="主键")
    private String id;

    /**
     * 政治
     */
    @TableField(value = "rank_polite")
    @ApiModelProperty(value="政治,")
    @Schema(description="政治")
    private String rankPolite;

    /**
     * 英语
     */
    @TableField(value = "rank_english")
    @ApiModelProperty(value="英语,")
    @Schema(description="英语")
    private String rankEnglish;

    /**
     * 专业课一
     */
    @TableField(value = "rank_professional_1")
    @ApiModelProperty(value="专业课一,")
    @Schema(description="专业课一")
    private String rankProfessional1;

    /**
     * 专业课二
     */
    @TableField(value = "rank_professional_2")
    @ApiModelProperty(value="专业课二,")
    @Schema(description="专业课二")
    private String rankProfessional2;

    /**
     * 初试总分

     */
    @TableField(value = "rank_total_first")
    @ApiModelProperty(value="初试总分,")
    @Schema(description="初试总分")
    private String rankTotalFirst;

    /**
     * 复试总分

     */
    @TableField(value = "rank_total_review")
    @ApiModelProperty(value="复试总分,")
    @Schema(description="复试总分")
    private String rankTotalReview;

    /**
     * 最终成绩

     */
    @TableField(value = "rank_total")
    @ApiModelProperty(value="最终成绩,")
    @Schema(description="最终成绩")
    private String rankTotal;

    /**
     * 公共课总分

     */
    @TableField(value = "rank_total_public")
    @ApiModelProperty(value="公共课总分,")
    @Schema(description="公共课总分")
    private String rankTotalPublic;

    /**
     * 专业课总分

     */
    @TableField(value = "rank_total_professional")
    @ApiModelProperty(value="专业课总分,")
    @Schema(description="专业课总分")
    private String rankTotalProfessional;

    /**
     * 排名类型

     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排名类型,")
    @Schema(description="排名类型")
    private String sort;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_RANK_POLITE = "rank_polite";

    public static final String COL_RANK_ENGLISH = "rank_english";

    public static final String COL_RANK_PROFESSIONAL_1 = "rank_professional_1";

    public static final String COL_RANK_PROFESSIONAL_2 = "rank_professional_2";

    public static final String COL_RANK_TOTAL_FIRST = "rank_total_first";

    public static final String COL_RANK_TOTAL_REVIEW = "rank_total_review";

    public static final String COL_RANK_TOTAL = "rank_total";

    public static final String COL_RANK_TOTAL_PUBLIC = "rank_total_public";

    public static final String COL_RANK_TOTAL_PROFESSIONAL = "rank_total_professional";

    public static final String COL_SORT = "sort";
}
