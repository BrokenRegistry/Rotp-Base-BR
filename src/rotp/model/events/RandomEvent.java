/*
 * Copyright 2015-2020 Ray Fowler
 * 
 * Licensed under the GNU General Public License, Version 3 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     https://www.gnu.org/licenses/gpl-3.0.html
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rotp.model.events;

import rotp.model.empires.Empire;

public interface RandomEvent {
    boolean goodEvent();
    boolean repeatable();
    String notificationText();
    void trigger(Empire e);
    default void nextTurn()   { }
    default int minimumTurn()  { return RandomEvents.START_TURN; }
    default String systemKey() { return ""; }
    default String statusMessage() { return ""; }
    default boolean monsterEvent() { return false; }
}
