package com.knoernschild.rubymod.utl;

import com.knoernschild.rubymod.RubyMod;
import com.knoernschild.rubymod.armour.ModArmourMaterial;
import com.knoernschild.rubymod.items.ItemBase;
import com.knoernschild.rubymod.tools.RubyItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RubyMod.MOD_ID);	
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	
	//Items
	public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
			new SwordItem(RubyItemTier.RUBY, 2, -1.0f, new Item.Properties().group(RubyMod.TAB)));
	
	//Armour
	public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmourMaterial.RUBY,
			EquipmentSlotType.HEAD, new Item.Properties().group(RubyMod.TAB)));
	
	public static final RegistryObject<ArmorItem> RUBY_BODY = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmourMaterial.RUBY,
			EquipmentSlotType.CHEST, new Item.Properties().group(RubyMod.TAB)));
	
	public static final RegistryObject<ArmorItem> RUBY_LEGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmourMaterial.RUBY,
			EquipmentSlotType.LEGS, new Item.Properties().group(RubyMod.TAB)));
	
	public static final RegistryObject<ArmorItem> RUBY_FEET = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmourMaterial.RUBY,
			EquipmentSlotType.FEET, new Item.Properties().group(RubyMod.TAB)));
}
