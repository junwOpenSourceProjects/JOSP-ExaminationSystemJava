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
import wo1261931780.JOSPexaminationSystemJava.entity.CollegeLine;
import wo1261931780.JOSPexaminationSystemJava.entity.NationalLine;
import wo1261931780.JOSPexaminationSystemJava.entity.ReviewList;
import wo1261931780.JOSPexaminationSystemJava.service.CollegeLineService;
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
@RequestMapping("/CollegeLine")
public class CollegeLineController {
	@Autowired
	private CollegeLineService collegeLineService;
	
	@GetMapping("/list")
	public ShowResult<Page<CollegeLine>> showMeAllNationalLinePage(@RequestParam Integer page
			, @RequestParam Integer limit
			, @RequestParam String sort
			, String subjectClass, String degreeType) {
		Page<CollegeLine> pageInfo = new Page<>();// 页码，每页条数
		pageInfo.setCurrent(page);// 当前页
		pageInfo.setSize(limit);// 每页条数
		LambdaQueryWrapper<CollegeLine> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		lambdaQueryWrapper.like(CollegeLine::getSubjectClass, subjectClass);
		lambdaQueryWrapper.like(CollegeLine::getDegreeType, degreeType);
		if (sort.equals("0")) {
			lambdaQueryWrapper.orderByAsc(CollegeLine::getDegreeType).orderByDesc(CollegeLine::getScoreTotal);
		} else {
			lambdaQueryWrapper.orderByAsc(CollegeLine::getDegreeType).orderByAsc(CollegeLine::getScoreTotal);
		}
		
		Page<CollegeLine> testPage = collegeLineService.page(pageInfo, lambdaQueryWrapper);
		return ShowResult.sendSuccess(testPage);
	}
	
	@PostMapping("/insertOrUpdate")
	public ShowResult<CollegeLine> insertOrUpdateCollegeLineService(CollegeLine collegeLine) {
		int saveOrUpdate = collegeLineService.insertOrUpdate(collegeLine);
		if (saveOrUpdate != 0) {
			return ShowResult.sendSuccess(collegeLine);
		} else {
			return ShowResult.sendError("保存失败");
		}
	}
}
