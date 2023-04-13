package wo1261931780.JOSPexaminationSystemJava.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.JOSPexaminationSystemJava.DTO.AcademySubjectListDTO;
import wo1261931780.JOSPexaminationSystemJava.DTO.StudentListDTO;
import wo1261931780.JOSPexaminationSystemJava.config.ShowResult;
import wo1261931780.JOSPexaminationSystemJava.entity.ScoreInfo;
import wo1261931780.JOSPexaminationSystemJava.entity.StudentInfo;
import wo1261931780.JOSPexaminationSystemJava.service.AcademyLineInfoService;
import wo1261931780.JOSPexaminationSystemJava.service.ScoreBakcupService;
import wo1261931780.JOSPexaminationSystemJava.service.ScoreInfoService;
import wo1261931780.JOSPexaminationSystemJava.service.StudentInfoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by Intellij IDEA.
 * Project:JOSP-ExaminationSystemJava
 * Package:wo1261931780.JOSPexaminationSystemJava.controller
 *
 * @author liujiajun_junw
 * @Date 2023-04-12-48  星期四
 * @description
 */
@RestController
@RequestMapping("/AcademySubject")
@Slf4j
public class AcademySubjectListController {
	
	@Autowired
	private AcademyLineInfoService academyLineInfoService;
	
	@Autowired
	private StudentInfoService studentInfoService;
	@Autowired
	private ScoreInfoService scoreInfoService;
	@Autowired
	private ScoreBakcupService scoreBakcupService;
	
	@GetMapping("/list")
	public ShowResult<Page<AcademySubjectListDTO>> showMeSubjectListPage(@RequestParam Integer page
			, @RequestParam Integer limit
			, @RequestParam String sort
			, String studentName, String subjectCode, String isChecked) {
		Page<AcademySubjectListDTO> academySubjectListDTOPage = new Page<>();
		academySubjectListDTOPage.setCurrent(page);
		academySubjectListDTOPage.setSize(limit);
		AcademySubjectListDTO academySubjectListDTO = new AcademySubjectListDTO();
		// 首先查询学生表，
		LambdaQueryWrapper<StudentInfo> studentInfoLambdaQueryWrapper = new LambdaQueryWrapper<>();
		studentInfoLambdaQueryWrapper.eq(StudentInfo::getSubjectCode, "030500");// 先用马克思学院的测试
		studentInfoLambdaQueryWrapper.like(StudentInfo::getRemark, "拟录取");// 只看录取
		// 获取专业对应的所有学生编号
		List<StudentInfo> studentInfoList = studentInfoService.list(studentInfoLambdaQueryWrapper);
		ArrayList<ScoreInfo> scoreInfos = new ArrayList<>();
		// 根据编号查询所有成绩
		for (StudentInfo studentInfo : studentInfoList) {
			ScoreInfo scoreInfo = scoreInfoService.getById(studentInfo.getId());
			scoreInfos.add(scoreInfo);
		}
		// 成绩统计为list,计算各科均分,最高最低分
		int[] checkedAverageScore = new int[scoreInfos.size()];
		int[] reviewListAverageScore = new int[scoreInfos.size()];
		
		scoreInfos.forEach(scoreInfo -> {
			checkedAverageScore[0] = scoreInfo.getScoreTotalFirst();
			// TODO: 2023/4/13 下午继续完成
		});
		OptionalDouble average = Arrays.stream(checkedAverageScore).average();
		academySubjectListDTO.setCheckedAverageScore(average);
		// 如果没有复试成绩,补充查询backup表
		
		
		return ShowResult.sendSuccess(academySubjectListDTOPage);
	}
	
}
