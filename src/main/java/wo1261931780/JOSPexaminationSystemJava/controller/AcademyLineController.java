package wo1261931780.JOSPexaminationSystemJava.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.JOSPexaminationSystemJava.config.ShowResult;
import wo1261931780.JOSPexaminationSystemJava.entity.AcademyLine;
import wo1261931780.JOSPexaminationSystemJava.entity.NationalLine;
import wo1261931780.JOSPexaminationSystemJava.service.AcademyLineService;
import wo1261931780.JOSPexaminationSystemJava.service.NationalLineService;

/**
 * Created by Intellij IDEA.
 * Project:JOSP-examinationSystemJava
 * Package:wo1261931780.JOSPexaminationSystemJava.controller
 *
 * @author liujiajun_junw
 * @Date 2023-03-04-40  星期六
 * @description
 */
@RestController
@RequestMapping("/AcademyLine")
public class AcademyLineController {
	@Autowired
	private AcademyLineService academyLineService;
	
	@GetMapping("/list")
	public ShowResult<Page<AcademyLine>> showMeAcademyLinePage(@RequestParam Integer page
			, @RequestParam Integer limit
			, @RequestParam String sort
			, String studentName, String subjectCode, String type) {
		Page<AcademyLine> pageInfo = new Page<>();// 页码，每页条数
		pageInfo.setCurrent(page);// 当前页
		pageInfo.setSize(limit);// 每页条数
		LambdaQueryWrapper<AcademyLine> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		
		Page<AcademyLine> testPage = academyLineService.page(pageInfo, lambdaQueryWrapper);
		return ShowResult.sendSuccess(testPage);
	}
	@PostMapping("/insertOrUpdate")
	public ShowResult<AcademyLine> insertOrUpdateAcademyLine(AcademyLine academyLine) {
		int saveOrUpdate = academyLineService.insertOrUpdate(academyLine);
		if (saveOrUpdate!=0) {
			return ShowResult.sendSuccess(academyLine);
		} else {
			return ShowResult.sendError("保存失败");
		}
	}
}
