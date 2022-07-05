package mod.br.profileManager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import mod.br.profileManager.Group_Galaxy.Difficulty;
import mod.br.profileManager.Group_Galaxy.GalaxyShape;
import mod.br.profileManager.Group_Galaxy.GalaxySize;
import mod.br.profileManager.Group_Galaxy.NbOpponent;
import mod.br.profileManager.Group_Galaxy.OpponentAI;

class Group_GalaxyTest {
	private ClientClassesTest cct = new ClientClassesTest();

	private String NL = System.lineSeparator();
	
	private String galaxyShapePrt = 
			"\r\n"
			+ "¦==== Parameter : GALAXY SHAPE\r\n"
			+ "; Options       : [Rectangle, Ellipse, Spiral]\r\n"
			+ "¦ History       : Current: Rectangle ¦ Last:  ¦ Initial: Rectangle\r\n"
			+ "¦ History       : Default: Rectangle ¦ Game: \r\n"
			+ "¦ LOCAL ENABLE  : All         ; [No, All, Save, Load, Hide, ·]\r\n"
			+ "\r\n"
			+ "Profile 1       :\r\n"
			+ "Random          :\r\n"
			+ "\r\n"
			+ "";

	private String galaxySizePrt = 
			"\r\n"
			+ "¦==== Parameter : GALAXY SIZE\r\n"
			+ "; Options       : [Tiny, Small, Small2, Average, Average2, Large, Large2, Huge,\r\n"
			+ ";   \" \"         : Huge2, Massive, Massive2, Massive3, Massive4, Massive5,\r\n"
			+ ";   \" \"         : Insane, Ludicrous, Maximum]\r\n"
			+ "¦ History       : Current: Small ¦ Last:  ¦ Initial: Small ¦ Default: Small\r\n"
			+ "¦ History       : Game: \r\n"
			+ "¦ LOCAL ENABLE  : All         ; [No, All, Save, Load, Hide, ·]\r\n"
			+ "\r\n"
			+ "Profile 1       :\r\n"
			+ "Random          :\r\n"
			+ "\r\n"
			+ "";

	private String difficultyPrt = 
			"\r\n"
			+ "¦==== Parameter : DIFFICULTY\r\n"
			+ "; Options       : [Easiest, Easier, Easy, Normal, Hard, Harder, Hardest]\r\n"
			+ "¦ History       : Current: Normal ¦ Last:  ¦ Initial: Normal ¦ Default: Easy\r\n"
			+ "¦ History       : Game: \r\n"
			+ "¦ LOCAL ENABLE  : All         ; [No, All, Save, Load, Hide, ·]\r\n"
			+ "\r\n"
			+ "Profile 1       :\r\n"
			+ "Random          :\r\n"
			+ "\r\n"
			+ "";

	private String opponentAIPrt = 
			"\r\n"
			+ "¦==== Parameter : OPPONENT AI\r\n"
			+ "; Options       : [Base, Xilmi, Select]\r\n"
			+ "¦ History       : Current: Base ¦ Last:  ¦ Initial: Base ¦ Default: Base\r\n"
			+ "¦ History       : Game: \r\n"
			+ "¦ LOCAL ENABLE  : All         ; [No, All, Save, Load, Hide, ·]\r\n"
			+ "\r\n"
			+ "Profile 1       :\r\n"
			+ "Random          :\r\n"
			+ "\r\n"
			+ "";

	private String nbOpponentPrt = 
			"\r\n"
			+ "¦==== Parameter : NB OPPONENTS\r\n"
			+ "; Options       : [Min=0, Max=15, Rnd Low=1, Rnd Up=15]\r\n"
			+ "¦ History       : Current: 4 ¦ Last:  ¦ Initial: 4 ¦ Default: 3 ¦ Game: \r\n"
			+ "¦ LOCAL ENABLE  : All         ; [No, All, Save, Load, Hide, ·]\r\n"
			+ "\r\n"
			+ "Profile 1       :\r\n"
			+ "Random          :\r\n"
			+ "\r\n"
			+ "";
	
	private String guiOpponentRaceListPrt = 
			"\r\n"
			+ "¦==== Parameter : GUI RACE FILTER\r\n"
			+ "; Options       : [Human, Alkari, Silicoid, Mrrshan, Klackon, Meklar, Psilon,\r\n"
			+ ";   \" \"         : Darlok, Sakkra, Bulrathi]\r\n"
			+ "¦ History       : Current : Human/Alkari/Silicoid/Mrrshan/Klackon/Meklar/Psilon/Darlok/Sakkra/Bulrathi\r\n"
			+ "¦ History       : Last : \r\n"
			+ "¦ History       : Initial : Human/Alkari/Silicoid/Mrrshan/Klackon/Meklar/Psilon/Darlok/Sakkra/Bulrathi\r\n"
			+ "¦ History       : Default : Human/Alkari/Silicoid/Mrrshan/Klackon/Meklar/Psilon/Darlok/Sakkra/Bulrathi\r\n"
			+ "¦ History       : Game : \r\n"
			+ "¦ LOCAL ENABLE  : All         ; [No, All, Save, Load, Hide, ·]\r\n"
			+ "\r\n"
			+ "Profile 1       : \r\n"
			+ "Random          : \r\n"
			+ "\r\n";
	
	@Test void GalaxyShape_ClientClasses() {
		GalaxyShape param;
		param = new GalaxyShape(cct);
		String out = param.toString(List.of("Profile 1", "Random"));
		String shouldBe = galaxyShapePrt;
		assertEquals(shouldBe, out, "should have been equals");
	}

	@Test void GalaxySize_ClientClasses() {
		GalaxySize param;
		param = new GalaxySize(cct);
		String out = param.toString(List.of("Profile 1", "Random"));
		String shouldBe = galaxySizePrt;
		assertEquals(shouldBe, out, "should have been equals");
	}

	@Test void Difficulty_ClientClasses() {
		Difficulty param;
		param = new Difficulty(cct);
		String out = param.toString(List.of("Profile 1", "Random"));
		String shouldBe = difficultyPrt;
		assertEquals(shouldBe, out, "should have been equals");
	}

	@Test void OpponentAI_ClientClasses() {
		OpponentAI param;
		param = new OpponentAI(cct);
		String out = param.toString(List.of("Profile 1", "Random"));
		String shouldBe = opponentAIPrt;
		assertEquals(shouldBe, out, "should have been equals");
	}

	@Test void NbOpponent_ClientClasses() {
		NbOpponent param;
		param = new NbOpponent(cct);
		String out = param.toString(List.of("Profile 1", "Random"));
		String shouldBe = nbOpponentPrt;
		assertEquals(shouldBe, out, "should have been equals");
	}

	@Test void getParameter_String() {
		String param;
		Group_Galaxy group;
		group = new Group_Galaxy(cct);
		param = "GALAXY SHAPE";
		assertEquals(param,
				group.getParameter(param).getParameterName(),
				"should have retrieved the parameter name");
		param = "GALAXY SIZE";
		assertEquals(param,
				group.getParameter(param).getParameterName(),
				"should have retrieved the parameter name");
		param = "DIFFICULTY";
		assertEquals(param,
				group.getParameter(param).getParameterName(),
				"should have retrieved the parameter name");
		param = "OPPONENT AI";
		assertEquals(param,
				group.getParameter(param).getParameterName(),
				"should have retrieved the parameter name");
		param = "NB OPPONENTS";
		assertEquals(param,
				group.getParameter(param).getParameterName(),
				"should have retrieved the parameter name");
	}

}
