package org.eforum.service;

import javax.servlet.http.HttpServletResponse;

import org.eforum.entity.User;
import org.eforum.vo.UserVo;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {
	User saveUser(User user);

	User createUser(User user);

	User findUserById(Long id);

	User findUserByName(String username);

	User findUserByEmail(String email);

	User findLoginUser(String username, String password);

	/**
	 * 修改密码
	 * 
	 * @param user
	 * @param newPassword
	 */
	void changePassword(UserVo userVo);

	/**
	 * 上传用户头像
	 * 
	 * @param user
	 * @param base64Str
	 */
	void uploadHeadPortrait(User user, String base64Str);

	/**
	 * 下载头像
	 * 
	 * @param user
	 * @param response
	 */
	void downloadheadPortrait(User user, HttpServletResponse response);
}