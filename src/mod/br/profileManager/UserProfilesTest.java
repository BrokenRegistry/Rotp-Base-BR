package mod.br.profileManager;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.KeyEvent;

import org.junit.jupiter.api.Test;

class UserProfilesTest {

	private ClientClasses clientObject = new ClientClassesTest();
	private UserProfiles userProfiles;
//	private AbstractParameter<?, ?, ClientClasses> param;
	
	private void init() {
		userProfiles = new UserProfiles("", "");
		userProfiles.initAndLoadProfiles(clientObject);		
	}



}
