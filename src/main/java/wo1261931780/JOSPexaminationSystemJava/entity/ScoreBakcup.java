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
*@Date 2023-04-12-21  星期四
*@description
*/
/**
    * 录取表，待合并

    */
@ApiModel(description="录取表，待合并")
@Schema(description="录取表，待合并")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "score_bakcup")
public class ScoreBakcup implements Serializable {
    /**
     * 主键，学生编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键，学生编号")
    @Schema(description="主键，学生编号")
    private String id;

    /**
     * 初试总分
     */
    @TableField(value = "score_total_first")
    @ApiModelProperty(value="初试总分")
    @Schema(description="初试总分")
    private Integer scoreTotalFirst;

    /**
     * 复试总分
     */
    @TableField(value = "score_total_review")
    @ApiModelProperty(value="复试总分")
    @Schema(description="复试总分")
    private Integer scoreTotalReview;

    /**
     * 最终成绩
     */
    @TableField(value = "score_total")
    @ApiModelProperty(value="最终成绩")
    @Schema(description="最终成绩")
    private Integer scoreTotal;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SCORE_TOTAL_FIRST = "score_total_first";

    public static final String COL_SCORE_TOTAL_REVIEW = "score_total_review";

    public static final String COL_SCORE_TOTAL = "score_total";
}
