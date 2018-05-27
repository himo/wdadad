package com.himo.himoMod;

import com.himo.himoMod.AllSettings.ShowHPSet;

import net.minecraft.client.Minecraft;

public class ShowHP {
	public static int ShowHPOF;
	public static int HPbigsmall;
	public static int HPleftright;
	public static int HPspesu;
	public static String HPColour;
	public static String supesu;
	public static String[] supesuhairetu = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    ", "                     ", "                      ", "                       ", "                        ", "                         ", "                              ", "                                   ", "                                        ", "                                             ", "                                                  ", "                                                       ", "                                                            ", "                                                                 ", "                                                                      ", "                                                                           ", "                                                                                ", "                                                                                     ", "                                                                                          ", "                                                                                               ", "                                                                                               ", "                                                                                                    "};

	public static void playShowHP(float health, String healths) {
		if (ShowHPOF == ShowHPSet.OFF) {
		} else if (ShowHPOF == ShowHPSet.ON) {
			switch(HPbigsmall) {
			case ShowHPSet.HPbig:
				switch(HPleftright) {
				case ShowHPSet.HPleft:
					playShowHPbigleft(health, healths);
				break;
				case ShowHPSet.HPright:
					playShowHPbigright(health, healths);
				break;
				}
			break;
			case ShowHPSet.HPsmall:
				switch(HPleftright) {
				case ShowHPSet.HPleft:
					playShowHPsmallleft(health, healths);
				break;
				case ShowHPSet.HPright:
					playShowHPsmallright(health, healths);
				break;
				}
			break;
		}

		}
	}

	public static void playShowHPGUI(float health, String healths) {
			switch(HPbigsmall) {
			case ShowHPSet.HPbig:
				switch(HPleftright) {
				case ShowHPSet.HPleft:
					playShowHPbigleft(health, healths);
				break;
				case ShowHPSet.HPright:
					playShowHPbigright(health, healths);
				break;
				}
			break;
			case ShowHPSet.HPsmall:
				switch(HPleftright) {
				case ShowHPSet.HPleft:
					playShowHPsmallleft(health, healths);
				break;
				case ShowHPSet.HPright:
					playShowHPsmallright(health, healths);
				break;
				}
			break;
		}
	}

	public static void HPColourSet(float health) {
		if (health <= 15) {
			HPColour = "§r§c";
		} else if (health <= 25){
			HPColour = "§r§e";
		} else {
			HPColour = "§r§a";
		}
		supesu = supesuhairetu[HPspesu];
	}

	public static void playShowHPbigleft(float health, String healths) {
		HPColourSet(health);
		Minecraft.getMinecraft().ingameGUI.displayTitle(HPColour + healths + supesu, null, 0, 20, 5);
		Minecraft.getMinecraft().ingameGUI.displayTitle(null, "", 0, 0, 0);
		Minecraft.getMinecraft().ingameGUI.displayTitle(null, null, 0, 20, 5);
	}

	public static void playShowHPbigright(float health, String healths) {
		HPColourSet(health);
		Minecraft.getMinecraft().ingameGUI.displayTitle(supesu + HPColour + healths, null, 0, 20, 5);
		Minecraft.getMinecraft().ingameGUI.displayTitle(null, "", 0, 0, 0);
		Minecraft.getMinecraft().ingameGUI.displayTitle(null, null, 0, 20, 5);
	}

	public static void playShowHPsmallleft(float health, String healths) {
		HPColourSet(health);
		Minecraft.getMinecraft().ingameGUI.displayTitle("", null, 0, 20, 5);
		Minecraft.getMinecraft().ingameGUI.displayTitle(null, HPColour + healths + supesu, 0, 0, 0);
		Minecraft.getMinecraft().ingameGUI.displayTitle(null, null, 0, 20, 5);
	}

	public static void playShowHPsmallright(float health, String healths) {
		HPColourSet(health);
		Minecraft.getMinecraft().ingameGUI.displayTitle("", null, 0, 20, 5);
		Minecraft.getMinecraft().ingameGUI.displayTitle(null,supesu + HPColour + healths, 0, 0, 0);
		Minecraft.getMinecraft().ingameGUI.displayTitle(null, null, 0, 20, 5);
	}
}
