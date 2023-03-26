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
@RequestMapping("/ReviewListAll")
public class ReviewListAllController {
	@Autowired
	private ReviewListService reviewListService;
	
	@GetMapping("/list")
	public ShowResult<Page<ReviewList>> showMeAllReviewListPage(@RequestParam Integer page
			, @RequestParam Integer limit
			, @RequestParam String sort
			, String studentName, String subjectCode, String type) {
		Page<ReviewList> pageInfo = new Page<>();// 页码，每页条数
		pageInfo.setCurrent(page);// 当前页
		pageInfo.setSize(limit);// 每页条数
		LambdaQueryWrapper<ReviewList> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		lambdaQueryWrapper.like(studentName != null, ReviewList::getStudentName, studentName);
		lambdaQueryWrapper.like(ReviewList::getSubjectCode, subjectCode);// 没有设置专业的时候查询所有
		if (sort.equals("0")) {
			lambdaQueryWrapper.orderByDesc(ReviewList::getScoreTotal);
		} else {
			lambdaQueryWrapper.orderByAsc(ReviewList::getScoreTotal);
		}
		
		Page<ReviewList> testPage = reviewListService.page(pageInfo, lambdaQueryWrapper);
		return ShowResult.sendSuccess(testPage);
	}
	@PostMapping("/insertOrUpdate")
	public ShowResult<ReviewList> insertOrUpdateAllReviewList(ReviewList reviewList) {
		int saveOrUpdate = reviewListService.insertOrUpdate(reviewList);
		if (saveOrUpdate!=0) {
			return ShowResult.sendSuccess(reviewList);
		} else {
			return ShowResult.sendError("保存失败");
		}
	}
}
