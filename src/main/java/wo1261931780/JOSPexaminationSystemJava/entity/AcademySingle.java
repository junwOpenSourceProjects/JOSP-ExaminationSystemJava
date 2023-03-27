package wo1261931780.JOSPexaminationSystemJava.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
public class AcademySingle implements Serializable {

    /**
     * 学院代码
     */
    @TableField(value = "academy_code")
    @ApiModelProperty(value="学院代码")
    @Schema(description="学院代码")
    private String key;

    /**
     * 学院名称
     */
    @TableField(value = "academy_name")
    @ApiModelProperty(value="学院名称")
    @Schema(description="学院名称")
    private String label;
}
