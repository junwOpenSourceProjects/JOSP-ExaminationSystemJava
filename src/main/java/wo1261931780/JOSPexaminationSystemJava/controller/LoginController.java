package wo1261931780.JOSPexaminationSystemJava.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.JOSPexaminationSystemJava.config.ShowResult;
import wo1261931780.JOSPexaminationSystemJava.entity.AccountRole;
import wo1261931780.JOSPexaminationSystemJava.entity.LoginUser;
import wo1261931780.JOSPexaminationSystemJava.service.LoginUserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:JOSP-javaFirst
 * Package:wo1261931780.javaFirst.controller
 *
 * @author liujiajun_junw
 * @Date 2023-03-20-08  星期四
 * @description
 */
@RestController
public class LoginController {
	@Autowired
	private LoginUserService loginUserService;
	@PostMapping("/login")
	public ShowResult<LoginUser> userLogin(@RequestBody LoginUser loginUser) {
		if (loginUser == null || StrUtil.isBlank(loginUser.getUsername()) || StrUtil.isBlank(loginUser.getPassword())) {
			return ShowResult.sendError("用户名或密码不能为空");
		}
		LambdaQueryWrapper<LoginUser> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		String passwordMd5DigestAsHex = DigestUtils.md5DigestAsHex(loginUser.getPassword().getBytes());
		lambdaQueryWrapper.eq(LoginUser::getUsername, loginUser.getUsername())
				.eq(LoginUser::getPassword, passwordMd5DigestAsHex);
		LoginUser userServiceOne = loginUserService.getOne(lambdaQueryWrapper);
		if (userServiceOne == null) {
			return ShowResult.sendError("账号或密码错误");
		}
		userServiceOne.setPassword(null);
		return ShowResult.sendSuccess(userServiceOne);
	}

	/**
	 * 获取用户信息，暂时写死
	 * @return 用户信息
	 */
	@GetMapping("/info")
	public ShowResult<AccountRole> userInfo() {
		AccountRole accountRole = new AccountRole();
		List<String> strings = new ArrayList<>();
		strings.add("admin");
		accountRole.setRoles(strings);
		accountRole.setIntroduction("I am a super administrator");
		accountRole.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
		accountRole.setName("Super Admin");
		return ShowResult.sendSuccess(accountRole);
	}
}
