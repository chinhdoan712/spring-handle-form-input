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

//		String dn = getDN(uid);
	}

	private String getDN(String uid) {
		Hashtable env = new Hashtable();
		String sp = "com.sun.jndi.ldap.LdapCtxFactory";
		env.put(Context.INITIAL_CONTEXT_FACTORY, sp);
		String ldapUrl = "ldap://10.30.152.12:389/dc=viettel, dc=vn";
		env.put(Context.PROVIDER_URL, ldapUrl);
		DirContext dctx = new InitialDirContext(env);

		String base = "ou=People";

		SearchControls sc = new SearchControls();
		String[] attributeFilter = { "cn", "mail" };
		sc.setReturningAttributes(attributeFilter);
		sc.setSearchScope(SearchControls.SUBTREE_SCOPE);

		String filter = "(&(sn=W*)(l=Criteria*))";

		NamingEnumeration results = dctx.search(base, filter, sc);
		while (results.hasMore()) {
			SearchResult sr = (SearchResult) results.next();
			Attributes attrs = sr.getAttributes();

			Attribute attr = attrs.get("cn");
			System.out.print(attr.get() + ": ");
			attr = attrs.get("mail");
			System.out.println(attr.get());
		}
		dctx.close();
	}

}
