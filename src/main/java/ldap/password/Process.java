package ldap.password;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;

public class Process {

	public Process(Password password) {
		String uid = password.getUid();
		String oldPassword = password.getOldPassword();
		String newPassword = password.getNewPassword();
		String confirmPassword = password.getConfirmPassword();

		Boolean matching = checkMatchingPassword(newPassword, confirmPassword);
		Boolean strong = checkPasswordStrength(newPassword);
		Boolean authenticated = authentication(uid, newPassword);
		String dn = getDN(uid);
	}

	private Boolean authentication(String uid, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	private Boolean checkPasswordStrength(String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	private Boolean checkMatchingPassword(String newPassword, String confirmPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDN(String uid) {
		return "";
	}

}
