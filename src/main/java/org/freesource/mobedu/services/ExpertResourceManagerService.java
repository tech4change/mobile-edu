package org.freesource.mobedu.services;
import org.freesource.mobedu.dao.model.object.Expert;
public interface ExpertResourceManagerService {
public Expert checkExpert(String expertid,String password);
	
	public void getExpertByMail(String email);
	
	public void getExpertLogin(String loginId);

	public String  getname(int expertID);
}
