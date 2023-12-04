
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemmagics.init;

import net.mcreator.gemmagics.procedures.RedGemPlayerFinishesUsingItemProcedure;
import net.mcreator.gemmagics.procedures.HasteGemPlayerFinishesUsingItemProcedure;
import net.mcreator.gemmagics.procedures.DolphinGemPlayerFinishesUsingItemProcedure;
import net.mcreator.gemmagics.procedures.AbsorbGemPlayerFinishesUsingItemProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class GemMagicsModProcedures {
	public static void load() {
		new HasteGemPlayerFinishesUsingItemProcedure();
		new RedGemPlayerFinishesUsingItemProcedure();
		new DolphinGemPlayerFinishesUsingItemProcedure();
		new AbsorbGemPlayerFinishesUsingItemProcedure();
	}
}
