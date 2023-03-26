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
import wo1261931780.JOSPexaminationSystemJava.entity.NationalLine;
import wo1261931780.JOSPexaminationSystemJava.entity.ReviewList;
import wo1261931780.JOSPexaminationSystemJava.service.NationalLineService;
import wo1261931780.JOSPexaminationSystemJava.service.ReviewListService;

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
@RequestMapping("/NationLine")
public class NationLineController {
	@Autowired
	private NationalLineService nationalLineService;
	
	@GetMapping("/list")
	public ShowResult<Page<NationalLine>> showMeAllNationalLinePage(@RequestParam Integer page
			, @RequestParam Integer limit
			, @RequestParam String sort
			, String studentName, String studentClass, String degreeType) {
		Page<NationalLine> pageInfo = new Page<>();// 页码，每页条数
		pageInfo.setCurrent(page);// 当前页
		pageInfo.setSize(limit);// 每页条数
		LambdaQueryWrapper<NationalLine> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		lambdaQueryWrapper.like(studentName != null, NationalLine::getSubjectClass, studentName);
		lambdaQueryWrapper.like(NationalLine::getStudentClass, studentClass);
		lambdaQueryWrapper.like(NationalLine::getDegreeType, degreeType);
		if (sort.equals("0")) {
			lambdaQueryWrapper.orderByAsc(NationalLine::getDegreeType).orderByDesc(NationalLine::getScoreTotal);
		} else {
			lambdaQueryWrapper.orderByAsc(NationalLine::getDegreeType).orderByAsc(NationalLine::getScoreTotal);
		}
		
		Page<NationalLine> testPage = nationalLineService.page(pageInfo, lambdaQueryWrapper);
		return ShowResult.sendSuccess(testPage);
	}
	
	@PostMapping("/insertOrUpdate")
	public ShowResult<NationalLine> insertOrUpdateAllNationalLine(NationalLine nationalLine) {
		int saveOrUpdate = nationalLineService.insertOrUpdate(nationalLine);
		if (saveOrUpdate != 0) {
			return ShowResult.sendSuccess(nationalLine);
		} else {
			return ShowResult.sendError("保存失败");
		}
	}
}
