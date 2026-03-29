package wo1261931780.JOSPexaminationSystemJava.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
    * 2023年上海交大各学院复试名单
    */
@Schema(description = "2023年上海交大各学院复试名单")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "review_list")
public class ReviewList implements Serializable {
    /**
     * 复试线主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @Schema(description = "复试线主键")
    private String id;

    /**
     * 初试排名
     */
    @TableField(value = "`rank`")
    @Schema(description = "初试排名")
    private Integer rank;

    /**
     * 学生姓名
     */
    @TableField(value = "student_name")
    @Schema(description = "学生姓名")
    private String studentName;

    /**
     * 学生编号
     */
    @TableField(value = "student_code")
    @Schema(description = "学生编号")
    private String studentCode;

    /**
     * 学科代码
     */
    @TableField(value = "subject_code")
    @Schema(description = "学科代码")
    private String subjectCode;

    /**
     * 学科名称
     */
    @TableField(value = "subject_name")
    @Schema(description = "学科名称")
    private String subjectName;

    /**
     * 政治
     */
    @TableField(value = "score_polite")
    @Schema(description = "政治")
    private Integer scorePolite;

    /**
     * 英语
     */
    @TableField(value = "score_english")
    @Schema(description = "英语")
    private Integer scoreEnglish;

    /**
     * 专业课一
     */
    @TableField(value = "score_professional_1")
    @Schema(description = "专业课一")
    private Integer scoreProfessional1;

    /**
     * 专业课二
     */
    @TableField(value = "score_professional_2")
    @Schema(description = "专业课二")
    private Integer scoreProfessional2;

    /**
     * 初试总分
     */
    @TableField(value = "score_total")
    @Schema(description = "初试总分")
    private Integer scoreTotal;

    /**
     * 初试公共课总分
     */
    @TableField(value = "score_total_public")
    @Schema(description = "初试公共课总分")
    private Integer scoreTotalPublic;

    /**
     * 初试专业课总分
     */
    @TableField(value = "score_total_professional")
    @Schema(description = "初试专业课总分")
    private Integer scoreTotalProfessional;

    /**
     * 备注
     */
    @TableField(value = "remark")
    @Schema(description = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_RANK = "rank";

    public static final String COL_STUDENT_NAME = "student_name";

    public static final String COL_STUDENT_CODE = "student_code";

    public static final String COL_SUBJECT_CODE = "subject_code";

    public static final String COL_SUBJECT_NAME = "subject_name";

    public static final String COL_SCORE_POLITE = "score_polite";

    public static final String COL_SCORE_ENGLISH = "score_english";

    public static final String COL_SCORE_PROFESSIONAL_1 = "score_professional_1";

    public static final String COL_SCORE_PROFESSIONAL_2 = "score_professional_2";

    public static final String COL_SCORE_TOTAL = "score_total";

    public static final String COL_SCORE_TOTAL_PUBLIC = "score_total_public";

    public static final String COL_SCORE_TOTAL_PROFESSIONAL = "score_total_professional";

    public static final String COL_REMARK = "remark";
}
