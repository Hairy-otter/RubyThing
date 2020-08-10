package com.knoernschild.rubymod.tools;

import java.util.function.Supplier;

import com.knoernschild.rubymod.utl.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum RubyItemTier implements IItemTier{
	RUBY(3, 875, 7.0f, 3.0f, 12, () -> {return Ingredient.fromItems(RegistryHandler.RUBY_SWORD.get());
			});
			
			private final int HARVEST_LEVEL;
			private final int MAX_USES;
			private final float EFFICIENCY;
			private final float ATTACK_DAMAGE;
			private final int ENCHANTABILITY;
			private Supplier<Ingredient> repairMaterial;

			RubyItemTier(int havestLevel, int maxUses, float efficiency, float attackDamage,
					int enchantability, Supplier<Ingredient> repairMaterial){
				this.HARVEST_LEVEL = havestLevel;
				this.MAX_USES = maxUses;
				this.EFFICIENCY = efficiency;
				this.ATTACK_DAMAGE = attackDamage;
				this.ENCHANTABILITY = enchantability;
				this.repairMaterial = repairMaterial;
			}
			
	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return this.ATTACK_DAMAGE;
	}

	@Override
	public float getEfficiency() {
		// TODO Auto-generated method stub
		return this.EFFICIENCY;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.ENCHANTABILITY;
	}

	@Override
	public int getHarvestLevel() {
		// TODO Auto-generated method stub
		return this.HARVEST_LEVEL;
	}

	@Override
	public int getMaxUses() {
		// TODO Auto-generated method stub
		return this.MAX_USES;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return this.repairMaterial.get();
	}

}
