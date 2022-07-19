
/*
 * Copyright 2015-2020 Ray Fowler
 * 
 * Licensed under the GNU General Public License, Version 3 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *	 https://www.gnu.org/licenses/gpl-3.0.html
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mod.br.profileManager;

import static br.profileManager.src.main.java.Validation.History.Default;

import java.util.List;

import br.profileManager.src.main.java.AbstractGroup;
import br.profileManager.src.main.java.AbstractParameter;
import br.profileManager.src.main.java.AbstractT;
import br.profileManager.src.main.java.T_Boolean;
import br.profileManager.src.main.java.Validation;
import rotp.model.empires.Empire;
import rotp.ui.UserPreferences;

/**
 * @author BrokenRegistry
 * For Parameters in Modnar GUI
 */
class Group_Modnar extends  AbstractGroup <ClientClasses> {

	Group_Modnar(ClientClasses go) {
		super(go, getHeadComments());
	}
	
	private static String getHeadComments() {
		return  " " + NL
				+ "------------- Modnar's Options -------------" + NL
				+ "";
	}

	@Override protected void initSettingList(ClientClasses go) {
		addParameter(new AlwaysIrradiated(go));
		addParameter(new AlwaysStarGates(go));
		addParameter(new AlwaysThorium(go));
	}

	// ==============================================================
	// ALWAYS IRRIDIATED
	//
	static class AlwaysIrradiated extends 
			AbstractParameter <Boolean, Validation<Boolean>, ClientClasses> {

		private String IrradiatedId = "ControlEnvironment:6";
		private int IrradiatedCategory = 3;

		AlwaysIrradiated(ClientClasses go) {
			super( "ALWAYS IRRIDIATED",
					new Validation<Boolean>(
							new T_Boolean(UserPreferences.alwaysIrradiated())));

			setHistoryCodeView(Default, false);
		}
		
		@Override public AbstractT<Boolean> getFromGame (ClientClasses go) {
			for (Empire empire : go.session().galaxy().empires()) {
				List<String> techList = empire.tech()
						.category(IrradiatedCategory).possibleTechs();			
				if (!techList.contains(IrradiatedId)) {
					return new T_Boolean(false);
				}
			}
			return new T_Boolean(true);
		}

		@Override public void putToGame(ClientClasses go, AbstractT<Boolean> value) {
			if (value.getCodeView()) {
				for (Empire empire : go.session().galaxy().empires()) {
				empire.tech().category(IrradiatedCategory).insertPossibleTech(IrradiatedId);
				}
			}
		}
		
		@Override public AbstractT<Boolean> getFromUI (ClientClasses go) {
			return new T_Boolean(UserPreferences.alwaysStarGates());
		}
		
		@Override public void putToGUI(ClientClasses go, AbstractT<Boolean> value) {
			UserPreferences.setAlwaysStarGates(value.getCodeView());
		}
		
		@Override public void initComments() {
			setBottomComments(availableForChange());
		}
	}
	// ==============================================================
	// ALWAYS STAR GATES
	//
	static class AlwaysStarGates extends 
			AbstractParameter <Boolean, Validation<Boolean>, ClientClasses> {

		private String StarGateId = "Stargate:0";
		private int StarGateCategory = 4;

		AlwaysStarGates(ClientClasses go) {
			super( "ALWAYS STAR GATES",
					new Validation<Boolean>(
							new T_Boolean(UserPreferences.alwaysStarGates())));

			setHistoryCodeView(Default, false); // MODNAR DEFAULT
		}
		
		@Override public AbstractT<Boolean> getFromGame (ClientClasses go) {
			for (Empire empire : go.session().galaxy().empires()) {
				List<String> techList = empire.tech()
						.category(StarGateCategory).possibleTechs();			
				if (!techList.contains(StarGateId)) {
					return new T_Boolean(false);
				}
			}
			return new T_Boolean(true);
		}

		@Override public void putToGame(ClientClasses go, AbstractT<Boolean> value) {
			if (value.getCodeView()) {
				for (Empire empire : go.session().galaxy().empires()) {
				empire.tech().category(StarGateCategory).insertPossibleTech(StarGateId);
				}
			}
		}
		
		@Override public AbstractT<Boolean> getFromUI (ClientClasses go) {
			return new T_Boolean(UserPreferences.alwaysStarGates());
		}
		
		@Override public void putToGUI(ClientClasses go, AbstractT<Boolean> value) {
			UserPreferences.setAlwaysStarGates(value.getCodeView());
		}
		
		@Override public void initComments() {
			setBottomComments(availableForChange());
		}
	}
	// ==============================================================
	// ALWAYS THORIUM
	//
	static class AlwaysThorium extends 
			AbstractParameter <Boolean, Validation<Boolean>, ClientClasses> {

		private String ThoriumCellId = "FuelRange:8";
		private int ThoriumCellCategory = 4;

		AlwaysThorium(ClientClasses go) { 
			super("ALWAYS THORIUM",
					new Validation<Boolean>(
							new T_Boolean(UserPreferences.alwaysThorium())));

			setHistoryCodeView(Default, false); // MODNAR DEFAULT
		}
		
		@Override public AbstractT<Boolean> getFromGame (ClientClasses go) {
			for (Empire empire : go.session().galaxy().empires()) {
				List<String> techList = empire.tech()
						.category(ThoriumCellCategory).possibleTechs();
				if (!techList.contains(ThoriumCellId)) {
					return new T_Boolean(false);
				}
			}
			return new T_Boolean(true);
		}
		
		@Override public void putToGame(ClientClasses go, AbstractT<Boolean> value) {
			if (value.getCodeView()) {
				for (Empire empire : go.session().galaxy().empires()) {
					empire.tech().category(ThoriumCellCategory).insertPossibleTech(ThoriumCellId);
				}
			}
		}
		
		@Override public AbstractT<Boolean> getFromUI (ClientClasses go) {
			return new T_Boolean(UserPreferences.alwaysThorium());
		}
		
		@Override public void putToGUI(ClientClasses go, AbstractT<Boolean> value) {
			UserPreferences.setAlwaysThorium(value.getCodeView());
		}
		
		@Override public void initComments() {
			setBottomComments(availableForChange());
		}
	}
	
}
