package io.github.bloepiloepi.pvp.food;

import net.minestom.server.item.Material;
import net.minestom.server.potion.Potion;
import net.minestom.server.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class FoodComponents {
	private static final List<FoodComponent> COMPONENTS = new ArrayList<>();
	
	public static final FoodComponent APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).build(Material.APPLE);
	public static final FoodComponent BAKED_POTATO = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.6F).build(Material.BAKED_POTATO);
	public static final FoodComponent BEEF = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).meat().build(Material.BEEF);
	public static final FoodComponent BEETROOT = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.6F).build(Material.BEETROOT);
	public static final FoodComponent BEETROOT_SOUP = createSoup(6, Material.BEETROOT_SOUP, false);
	public static final FoodComponent BREAD = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.6F).build(Material.BREAD);
	public static final FoodComponent CARROT = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.6F).build(Material.CARROT);
	public static final FoodComponent CHICKEN = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).statusEffect(new Potion(PotionEffect.HUNGER, (byte) 0, 600), 0.3F).meat().build(Material.CHICKEN);
	public static final FoodComponent CHORUS_FRUIT = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).alwaysEdible().build(Material.CHORUS_FRUIT);
	public static final FoodComponent COD = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.1F).build(Material.COD);
	public static final FoodComponent COOKED_BEEF = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.8F).meat().build(Material.COOKED_BEEF);
	public static final FoodComponent COOKED_CHICKEN = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.6F).meat().build(Material.COOKED_CHICKEN);
	public static final FoodComponent COOKED_COD = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.6F).build(Material.COOKED_COD);
	public static final FoodComponent COOKED_MUTTON = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.8F).meat().build(Material.COOKED_MUTTON);
	public static final FoodComponent COOKED_PORKCHOP = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.8F).meat().build(Material.COOKED_PORKCHOP);
	public static final FoodComponent COOKED_RABBIT = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.6F).meat().build(Material.COOKED_RABBIT);
	public static final FoodComponent COOKED_SALMON = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.8F).build(Material.COOKED_SALMON);
	public static final FoodComponent COOKIE = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.1F).build(Material.COOKIE);
	public static final FoodComponent DRIED_KELP = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.3F).snack().build(Material.DRIED_KELP);
	public static final FoodComponent ENCHANTED_GOLDEN_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new Potion(PotionEffect.REGENERATION, (byte) 1, 400), 1.0F).statusEffect(new Potion(PotionEffect.DAMAGE_RESISTANCE, (byte) 0, 6000), 1.0F).statusEffect(new Potion(PotionEffect.FIRE_RESISTANCE, (byte) 0, 6000), 1.0F).statusEffect(new Potion(PotionEffect.ABSORPTION, (byte) 3, 2400), 1.0F).alwaysEdible().build(Material.ENCHANTED_GOLDEN_APPLE);
	public static final FoodComponent GOLDEN_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new Potion(PotionEffect.REGENERATION, (byte) 1, 100), 1.0F).statusEffect(new Potion(PotionEffect.ABSORPTION, (byte) 0, 2400), 1.0F).alwaysEdible().build(Material.GOLDEN_APPLE);
	public static final FoodComponent GOLDEN_CARROT = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.2F).build(Material.GOLDEN_CARROT);
	public static final FoodComponent HONEY_BOTTLE = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.1F).build(Material.HONEY_BOTTLE);
	public static final FoodComponent MELON_SLICE = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).build(Material.MELON_SLICE);
	public static final FoodComponent MUSHROOM_STEW = createSoup(6, Material.MUSHROOM_STEW, false);
	public static final FoodComponent MUTTON = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).meat().build(Material.MUTTON);
	public static final FoodComponent POISONOUS_POTATO = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).statusEffect(new Potion(PotionEffect.POISON, (byte) 0, 100), 0.6F).build(Material.POISONOUS_POTATO);
	public static final FoodComponent PORKCHOP = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).meat().build(Material.PORKCHOP);
	public static final FoodComponent POTATO = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.3F).build(Material.POTATO);
	public static final FoodComponent PUFFERFISH = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).statusEffect(new Potion(PotionEffect.POISON, (byte) 3, 1200), 1.0F).statusEffect(new Potion(PotionEffect.HUNGER, (byte) 2, 300), 1.0F).statusEffect(new Potion(PotionEffect.CONFUSION, (byte) 0, 300), 1.0F).build(Material.PUFFERFISH);
	public static final FoodComponent PUMPKIN_PIE = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.3F).build(Material.PUMPKIN_PIE);
	public static final FoodComponent RABBIT = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).meat().build(Material.RABBIT);
	public static final FoodComponent RABBIT_STEW = createSoup(10, Material.RABBIT_STEW, false);
	public static final FoodComponent ROTTEN_FLESH = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.1F).statusEffect(new Potion(PotionEffect.HUNGER, (byte) 0, 600), 0.8F).meat().build(Material.ROTTEN_FLESH);
	public static final FoodComponent SALMON = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.1F).build(Material.SALMON);
	public static final FoodComponent SPIDER_EYE = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.8F).statusEffect(new Potion(PotionEffect.POISON, (byte) 0, 100), 1.0F).build(Material.SPIDER_EYE);
	public static final FoodComponent SUSPICIOUS_STEW = createSoup(6, Material.SUSPICIOUS_STEW, true);
	public static final FoodComponent SWEET_BERRIES = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.1F).build(Material.SWEET_BERRIES);
	public static final FoodComponent TROPICAL_FISH = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).build(Material.TROPICAL_FISH);
	
	private static FoodComponent createSoup(int hunger, Material material, boolean alwaysEdible) {
		FoodComponent.Builder builder = new FoodComponent.Builder().hunger(hunger).saturationModifier(0.6F);
		if (alwaysEdible) builder.alwaysEdible();
		return builder.build(material);
	}
	
	static void registerComponent(FoodComponent component) {
		COMPONENTS.add(component);
	}
	
	public static FoodComponent fromMaterial(Material material) {
		for (FoodComponent component : COMPONENTS) {
			if (component.getMaterial() == material) {
				return component;
			}
		}
		
		return null;
	}
}
