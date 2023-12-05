
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemmagics.init;

import net.mcreator.gemmagics.procedures.WitherGemPlayerFinishesUsingItemProcedure;
import net.mcreator.gemmagics.procedures.HasteGemPlayerFinishesUsingItemProcedure;
import net.mcreator.gemmagics.procedures.FireResistanceGemPlayerFinishesUsingItemProcedure;
import net.mcreator.gemmagics.procedures.DolphinGemPlayerFinishesUsingItemProcedure;
import net.mcreator.gemmagics.procedures.AbsorptionGemPlayerFinishesUsingItemProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class GemMagicsModProcedures {
	public static void load() {
		new HasteGemPlayerFinishesUsingItemProcedure();
		new DolphinGemPlayerFinishesUsingItemProcedure();
		new WitherGemPlayerFinishesUsingItemProcedure();
		new AbsorptionGemPlayerFinishesUsingItemProcedure();
		new FireResistanceGemPlayerFinishesUsingItemProcedure();
	}
}
