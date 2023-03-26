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
    * 2023年上海交大各学院名称
    */
@ApiModel(description="2023年上海交大各学院名称")
@Schema(description="2023年上海交大各学院名称")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "college")
public class College implements Serializable {
    /**
     * 学院id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="学院id")
    @Schema(description="学院id")
    private String id;

    /**
     * 学院代码
     */
    @TableField(value = "academy_code")
    @ApiModelProperty(value="学院代码")
    @Schema(description="学院代码")
    private String academyCode;

    /**
     * 学院名称
     */
    @TableField(value = "academy_name")
    @ApiModelProperty(value="学院名称")
    @Schema(description="学院名称")
    private String academyName;

    /**
     * 复试状态
     */
    @TableField(value = "review_status")
    @ApiModelProperty(value="复试状态")
    @Schema(description="复试状态")
    private Integer reviewStatus;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_ACADEMY_CODE = "academy_code";

    public static final String COL_ACADEMY_NAME = "academy_name";

    public static final String COL_REVIEW_STATUS = "review_status";
}
