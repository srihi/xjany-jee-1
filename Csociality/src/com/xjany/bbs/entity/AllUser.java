package com.xjany.bbs.entity;

import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.xjany.bbs.entity.base.AbstractAllUser;

/**
 * AllUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "all_user", catalog = "cs_xjany")
public class AllUser extends AbstractAllUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AllUser() {
	}

	/** minimal constructor */
	public AllUser(String userName, String userPsw, Integer userSex,
			String userEmail, Timestamp userRegTime, String userIp,
			Integer userLoad, Timestamp userLastTime, Integer userState) {
		super(userName, userPsw, userSex, userEmail, userRegTime, userIp,
				userLoad, userLastTime, userState);
	}

	/** full constructor */
	public AllUser(AllUserGroup allUserGroup, BbsUserProfile bbsUserProfile,
			Integer cmsUserId, String userName, String userPsw,
			Integer userSex, String userEmail, Timestamp userRegTime,
			String userIp, Integer userLoad, Timestamp userLastTime,
			Integer userState, Integer cmsDel,
			Set<BbsUserProfile> bbsUserProfiles) {
		super(allUserGroup, bbsUserProfile, cmsUserId, userName, userPsw,
				userSex, userEmail, userRegTime, userIp, userLoad,
				userLastTime, userState, cmsDel, bbsUserProfiles);
	}

}
