package com.opentravelsoft.entity;

// Generated 2012-5-9 8:27:00 by Hibernate Tools 3.4.0.CR1

import com.opentravelsoft.hmodel.TblTeamMemberships;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "tbl_employee", catalog = "tourismwork_db")
public class Employee implements java.io.Serializable {

	private Integer userId;
	private Group group;
	private String userCd;
	private String passwd;
	private String ctiNo;
	private String userNm;
	private String givenName;
	private String familyName;
	private Boolean isAdmin;
	private String tel;
	private String fax;
	private String mobile;
	private Character sex;
	private String cardId;
	private Integer age;
	private Integer discont;
	private String webKey;
	private String workFlg;
	private Character workKey;
	private Boolean isActive;
	private String msn;
	private String skype;
	private String opIp;
	private Set<Plan> plans = new HashSet<Plan>(0);
	private Set<TblTeamMemberships> tblTeamMembershipses = new HashSet<TblTeamMemberships>(
			0);
	private Set<Role> roles = new HashSet<Role>(0);

	public Employee() {
	}

	public Employee(Group group, String userCd, String passwd) {
		this.group = group;
		this.userCd = userCd;
		this.passwd = passwd;
	}

	public Employee(Group group, String userCd, String passwd, String ctiNo,
			String userNm, String givenName, String familyName,
			Boolean isAdmin, String tel, String fax, String mobile,
			Character sex, String cardId, Integer age, Integer discont,
			String webKey, String workFlg, Character workKey, Boolean isActive,
			String msn, String skype, String opIp, Set<Plan> plans,
			Set<TblTeamMemberships> tblTeamMembershipses, Set<Role> roles) {
		this.group = group;
		this.userCd = userCd;
		this.passwd = passwd;
		this.ctiNo = ctiNo;
		this.userNm = userNm;
		this.givenName = givenName;
		this.familyName = familyName;
		this.isAdmin = isAdmin;
		this.tel = tel;
		this.fax = fax;
		this.mobile = mobile;
		this.sex = sex;
		this.cardId = cardId;
		this.age = age;
		this.discont = discont;
		this.webKey = webKey;
		this.workFlg = workFlg;
		this.workKey = workKey;
		this.isActive = isActive;
		this.msn = msn;
		this.skype = skype;
		this.opIp = opIp;
		this.plans = plans;
		this.tblTeamMembershipses = tblTeamMembershipses;
		this.roles = roles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "USER_ID", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GROUP_ID", nullable = false)
	public Group getGroup() {
		return this.group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Column(name = "USER_CD", nullable = false, length = 20)
	public String getUserCd() {
		return this.userCd;
	}

	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

	@Column(name = "PASSWD", nullable = false, length = 32)
	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Column(name = "CTI_NO", length = 5)
	public String getCtiNo() {
		return this.ctiNo;
	}

	public void setCtiNo(String ctiNo) {
		this.ctiNo = ctiNo;
	}

	@Column(name = "USER_NM", length = 20)
	public String getUserNm() {
		return this.userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	@Column(name = "GIVEN_NAME", length = 20)
	public String getGivenName() {
		return this.givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	@Column(name = "FAMILY_NAME", length = 20)
	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	@Column(name = "IS_ADMIN")
	public Boolean getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Column(name = "TEL", length = 30)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "FAX", length = 30)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "MOBILE", length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "SEX", length = 1)
	public Character getSex() {
		return this.sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	@Column(name = "CARD_ID", length = 20)
	public String getCardId() {
		return this.cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	@Column(name = "AGE")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "DISCONT")
	public Integer getDiscont() {
		return this.discont;
	}

	public void setDiscont(Integer discont) {
		this.discont = discont;
	}

	@Column(name = "WEB_KEY", length = 10)
	public String getWebKey() {
		return this.webKey;
	}

	public void setWebKey(String webKey) {
		this.webKey = webKey;
	}

	@Column(name = "WORK_FLG", length = 2)
	public String getWorkFlg() {
		return this.workFlg;
	}

	public void setWorkFlg(String workFlg) {
		this.workFlg = workFlg;
	}

	@Column(name = "WORK_KEY", length = 1)
	public Character getWorkKey() {
		return this.workKey;
	}

	public void setWorkKey(Character workKey) {
		this.workKey = workKey;
	}

	@Column(name = "IS_ACTIVE")
	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "MSN", length = 50)
	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	@Column(name = "SKYPE", length = 50)
	public String getSkype() {
		return this.skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	@Column(name = "OP_IP", length = 8)
	public String getOpIp() {
		return this.opIp;
	}

	public void setOpIp(String opIp) {
		this.opIp = opIp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<Plan> getPlans() {
		return this.plans;
	}

	public void setPlans(Set<Plan> plans) {
		this.plans = plans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<TblTeamMemberships> getTblTeamMembershipses() {
		return this.tblTeamMembershipses;
	}

	public void setTblTeamMembershipses(
			Set<TblTeamMemberships> tblTeamMembershipses) {
		this.tblTeamMembershipses = tblTeamMembershipses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "tbl_membership", catalog = "tourismwork_db", joinColumns = { @JoinColumn(name = "USER_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID", nullable = false, updatable = false) })
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}