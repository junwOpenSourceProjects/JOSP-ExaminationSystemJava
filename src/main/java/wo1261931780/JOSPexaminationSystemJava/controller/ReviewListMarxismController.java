package wo1261931780.JOSPexaminationSystemJava.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.JOSPexaminationSystemJava.config.ShowResult;
import wo1261931780.JOSPexaminationSystemJava.entity.ReviewList;
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
@RequestMapping("/ReviewListMarxism")
public class ReviewListMarxismController {
	
	
	@Autowired
	private ReviewListService reviewListService;
	
	@GetMapping("/list")
	public ShowResult<Page<ReviewList>> showMeMaxismReviewListPage(@RequestParam Integer page
			, @RequestParam Integer limit
			, @RequestParam String sort
			, String studentName, String subjectCode, String isChecked) {
		Page<ReviewList> pageInfo = new Page<>();// 页码，每页条数
		pageInfo.setCurrent(page);// 当前页
		pageInfo.setSize(limit);// 每页条数
		LambdaQueryWrapper<ReviewList> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		lambdaQueryWrapper.like(studentName != null, ReviewList::getStudentName, studentName);
		if (!StrUtil.isBlankIfStr(subjectCode)) {
			lambdaQueryWrapper.like(ReviewList::getSubjectCode, subjectCode);
		} else {
			lambdaQueryWrapper.like(ReviewList::getSubjectName, "马克思主义理论");
			lambdaQueryWrapper.or().like(ReviewList::getSubjectName, "科学技术史");
			lambdaQueryWrapper.or().like(ReviewList::getSubjectName, "科学技术哲学");
		}
		//lambdaQueryWrapper.like(ReviewList::getSubjectName, "马克思主义理论");
		//.or().like(ReviewList::getSubjectName, "科学技术史")
		//.or().like(ReviewList::getSubjectName, "科学技术哲学");
		//lambdaQueryWrapper.eq(ReviewList::getSubjectCode, subjectCode);
		switch (sort) {
			case "0":// 总分降序
				lambdaQueryWrapper.orderByDesc(ReviewList::getScoreTotal);
				break;
			case "1":// 总分升序
				lambdaQueryWrapper.orderByAsc(ReviewList::getScoreTotal);
				break;
			case "2":// 公共分降序
				lambdaQueryWrapper.orderByDesc(ReviewList::getScoreTotalPublic);
				break;
			case "3":// 专业分降序
				lambdaQueryWrapper.orderByAsc(ReviewList::getScoreTotalProfessional);
				break;
			default:
				lambdaQueryWrapper.orderByDesc(ReviewList::getScoreTotal);
				break;
		}
		//if (sort.equals("0")) {// 总分降序
		//	lambdaQueryWrapper.orderByDesc(ReviewList::getScoreTotal);
		//} else {
		//	lambdaQueryWrapper.orderByAsc(ReviewList::getScoreTotal);
		//}
		Page<ReviewList> testPage = reviewListService.page(pageInfo, lambdaQueryWrapper);
		return ShowResult.sendSuccess(testPage);
	}
	
	@PostMapping("/insertOrUpdate")
	public ShowResult<ReviewList> insertOrUpdateMaxismReviewList(ReviewList reviewList) {
		int saveOrUpdate = reviewListService.insertOrUpdate(reviewList);
		if (saveOrUpdate != 0) {
			return ShowResult.sendSuccess(reviewList);
		} else {
			return ShowResult.sendError("保存失败");
		}
	}
}
