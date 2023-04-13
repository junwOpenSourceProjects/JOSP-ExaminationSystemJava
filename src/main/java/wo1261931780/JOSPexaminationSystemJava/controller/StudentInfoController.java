package wo1261931780.JOSPexaminationSystemJava.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.JOSPexaminationSystemJava.DAO.ScoreInfoMapper;
import wo1261931780.JOSPexaminationSystemJava.DTO.StudentListDTO;
import wo1261931780.JOSPexaminationSystemJava.config.ShowResult;
import wo1261931780.JOSPexaminationSystemJava.entity.AcademyLineInfo;
import wo1261931780.JOSPexaminationSystemJava.entity.College;
import wo1261931780.JOSPexaminationSystemJava.entity.RankInfo;
import wo1261931780.JOSPexaminationSystemJava.entity.ReviewList;
import wo1261931780.JOSPexaminationSystemJava.entity.ScoreBakcup;
import wo1261931780.JOSPexaminationSystemJava.entity.ScoreInfo;
import wo1261931780.JOSPexaminationSystemJava.entity.StudentInfo;
import wo1261931780.JOSPexaminationSystemJava.service.AcademyLineInfoService;
import wo1261931780.JOSPexaminationSystemJava.service.CollegeService;
import wo1261931780.JOSPexaminationSystemJava.service.RankInfoService;
import wo1261931780.JOSPexaminationSystemJava.service.ScoreBakcupService;
import wo1261931780.JOSPexaminationSystemJava.service.ScoreInfoService;
import wo1261931780.JOSPexaminationSystemJava.service.StudentInfoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Intellij IDEA.
 * Project:JOSP-ExaminationSystemJava
 * Package:wo1261931780.JOSPexaminationSystemJava.controller
 *
 * @author liujiajun_junw
 * @Date 2023-04-02-11  星期四
 * @description
 */
@RestController
@RequestMapping("/StudentInfo")
public class StudentInfoController {
	// todo 封装echarts数据结构
	// echarts数据视图统一返回到response中
	
	
	@Autowired
	private StudentInfoService studentInfoService;
	
	@Autowired
	private ScoreInfoService scoreInfoService;
	
	@Resource
	private ScoreInfoMapper scoreInfoMapper;
	
	@Autowired
	private RankInfoService rankInfoService;
	
	@Autowired
	private CollegeService collegeService;
	
	@Autowired
	private AcademyLineInfoService academyLineInfoService;
	
	@Autowired
	private ScoreBakcupService scoreBakcupService;
	
	
	@GetMapping("/list")
	public ShowResult<Page<StudentListDTO>> showMeMarxismReviewListPage(@RequestParam Integer page
			, @RequestParam Integer limit
			, @RequestParam String sort
			, String studentName, String subjectCode, String isChecked) {
		Page<StudentListDTO> studentListDTOPage = new Page<>();
		studentListDTOPage.setCurrent(page);
		studentListDTOPage.setSize(limit);
		
		
		// Page<RankInfo> rankInfoPage = new Page<>();
		// Page<AcademyLineInfo> academyLineInfoPage = new Page<>();
		
		// 首先查询学生表，获取所有的学生姓名和code
		Page<StudentInfo> studentInfoPage = new Page<>();
		studentInfoPage.setCurrent(page);
		studentInfoPage.setSize(limit);
		
		LambdaQueryWrapper<StudentInfo> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		// if (studentName != null && !studentName.equals("")) {
		// 	lambdaQueryWrapper.like(StudentInfo::getStudentName, studentName);
		// }
		// 设置查询条件，查询所有马理论的研究生
		lambdaQueryWrapper.eq(StudentInfo::getSubjectCode, "030500");
		// todo 其实这里可以用in查询，添加一个mapper就可以了
		
		// 获取结果
		List<StudentInfo> studentInfoList = studentInfoService.list(lambdaQueryWrapper);
		// 这是核心操作列
		ArrayList<StudentListDTO> studentListDTOS = new ArrayList<>();
		for (StudentInfo studentInfo : studentInfoList) {
			StudentListDTO studentListDTO = new StudentListDTO();
			BeanUtils.copyProperties(studentInfo, studentListDTO);// 拷贝属性到新增的内部
			studentListDTO.setStudentCode(studentInfo.getId());// 手动新增id进去
			// 学生编号获取成功
			String studentCode = studentListDTO.getStudentCode();
			// id关联查询成绩表
			// 成绩表排名表返回各种数据
			ScoreInfo scoreInfo = scoreInfoService.getById(studentCode);
			BeanUtils.copyProperties(scoreInfo, studentListDTO);// 获取成绩数据，然后set进去
			if (studentListDTO.getScoreTotal() == 0 || studentListDTO.getScoreTotal().equals("")) {// 使用hutu tool完成改造
				ScoreBakcup scoreBakcup = scoreBakcupService.getById(studentCode);
				BeanUtils.copyProperties(scoreBakcup, studentListDTO);// 拷贝不存在的复试成绩
			}
			
			// 获取排名数据
			// RankInfo rankInfo = rankInfoService.getById(studentCode);
			// BeanUtils.copyProperties(rankInfo, studentListDTO);
			
			// 获取学院表,根据学院代码去获取学院名称
			LambdaQueryWrapper<College> collegeLambdaQueryWrapper = new LambdaQueryWrapper<>();
			collegeLambdaQueryWrapper.eq(College::getAcademyCode, studentInfo.getAcademyCode());
			String academyName = collegeService.getOne(collegeLambdaQueryWrapper).getAcademyName();
			studentListDTO.setAcademyName(academyName);
			
			// 获取院线表
			// 返回学院名，专业代码和专业名
			// todo 院线表为空，暂时没有数据
			// AcademyLineInfo academyLineInfo = academyLineInfoService.getById(studentListDTO.getSubjectCode());
			// BeanUtils.copyProperties(academyLineInfo, studentListDTO);
			studentListDTOS.add(studentListDTO);// 新增进去
		}
		
		// 合并为复试结果dto返回前端
		studentListDTOPage.setRecords(studentListDTOS);
		return ShowResult.sendSuccess(studentListDTOPage);
	}
}
