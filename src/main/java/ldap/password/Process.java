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

		String dn = getDN(uid);
	}

	private String getDN(String uid) {
		return "";
	}

}
