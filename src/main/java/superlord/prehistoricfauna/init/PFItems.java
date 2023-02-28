package superlord.prehistoricfauna.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import superlord.prehistoricfauna.PrehistoricFauna;
import superlord.prehistoricfauna.common.items.FossilItem;
import superlord.prehistoricfauna.common.items.PaleopediaItem;
import superlord.prehistoricfauna.common.items.SpawnSkeletonItem;

public class PFItems {
	
	public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricFauna.MOD_ID);
	
	//Blocks
	public static final RegistryObject<BlockItem> HORSETAIL = REGISTER.register("horsetail", () -> new BlockItem(PFBlocks.HORSETAIL.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> TALL_HORSETAIL = REGISTER.register("tall_horsetail", () -> new BlockItem(PFBlocks.TALL_HORSETAIL.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> OSMUNDA = REGISTER.register("osmunda", () -> new BlockItem(PFBlocks.OSMUNDA.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> TALL_OSMUNDA = REGISTER.register("tall_osmunda", () -> new BlockItem(PFBlocks.TALL_OSMUNDA.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> CLUBMOSS = REGISTER.register("clubmoss", () -> new BlockItem(PFBlocks.CLUBMOSS.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> MARCHANTIA = REGISTER.register("marchantia", () -> new BlockItem(PFBlocks.MARCHANTIA.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> MOSS_CARPET = REGISTER.register("moss_carpet", () -> new BlockItem(PFBlocks.MOSS_CARPET.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> CONIOPTERIS = REGISTER.register("coniopteris", () -> new BlockItem(PFBlocks.CONIOPTERIS.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> CLADOPHLEBIS = REGISTER.register("cladophlebis", () -> new BlockItem(PFBlocks.CLADOPHLEBIS.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> OSMUNDACAULIS = REGISTER.register("osmundacaulis", () -> new BlockItem(PFBlocks.OSMUNDACAULIS.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> TALL_OSMUNDACAULIS = REGISTER.register("tall_osmundacaulis", () -> new BlockItem(PFBlocks.TALL_OSMUNDACAULIS.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> SCYTOPHYLLUM = REGISTER.register("scytophyllum", () -> new BlockItem(PFBlocks.SCYTOPHYLLUM.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> MICHELILLOA = REGISTER.register("michelilloa", () -> new BlockItem(PFBlocks.MICHELILLOA.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> DEAD_OSMUNDACAULIS = REGISTER.register("dead_osmundacaulis", () -> new BlockItem(PFBlocks.DEAD_OSMUNDACAULIS.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> MOSSY_DIRT = REGISTER.register("mossy_dirt", () -> new BlockItem(PFBlocks.MOSSY_DIRT.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> LOAM = REGISTER.register("loam", () -> new BlockItem(PFBlocks.LOAM.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> PACKED_LOAM = REGISTER.register("packed_loam", () -> new BlockItem(PFBlocks.PACKED_LOAM.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SILT = REGISTER.register("silt", () -> new BlockItem(PFBlocks.SILT.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HARDENED_SILT = REGISTER.register("hardened_silt", () -> new BlockItem(PFBlocks.HARDENED_SILT.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> MOSS_BLOCK = REGISTER.register("moss_block", () -> new BlockItem(PFBlocks.MOSS_BLOCK.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> CRASSOSTREA_OYSTER = REGISTER.register("crassostrea_oyster", () -> new BlockItem(PFBlocks.CRASSOSTREA_OYSTER.get(), new Item.Properties().tab(PrehistoricFauna.PF_MISC)));
	public static final RegistryObject<BlockItem> ALGAE_CARPET = REGISTER.register("algae_carpet", () -> new BlockItem(PFBlocks.ALGAE_CARPET.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	
	public static final RegistryObject<BlockItem> METASEQUOIA_PLANKS = REGISTER.register("metasequoia_planks", () -> new BlockItem(PFBlocks.METASEQUOIA_PLANKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> METASEQUOIA_LOG = REGISTER.register("metasequoia_log", () -> new BlockItem(PFBlocks.METASEQUOIA_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_METASEQUOIA_LOG = REGISTER.register("stripped_metasequoia_log", () -> new BlockItem(PFBlocks.STRIPPED_METASEQUOIA_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> METASEQUOIA_WOOD = REGISTER.register("metasequoia_wood", () -> new BlockItem(PFBlocks.METASEQUOIA_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_METASEQUOIA_WOOD = REGISTER.register("stripped_metasequoia_wood", () -> new BlockItem(PFBlocks.STRIPPED_METASEQUOIA_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> METASEQUOIA_LEAVES = REGISTER.register("metasequoia_leaves", () -> new BlockItem(PFBlocks.METASEQUOIA_LEAVES.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> METASEQUOIA_SAPLING = REGISTER.register("metasequoia_sapling", () -> new BlockItem(PFBlocks.METASEQUOIA_SAPLING.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> METASEQUOIA_DOOR = REGISTER.register("metasequoia_door", () -> new BlockItem(PFBlocks.METASEQUOIA_DOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> METASEQUOIA_PRESSURE_PLATE = REGISTER.register("metasequoia_pressure_plate", () -> new BlockItem(PFBlocks.METASEQUOIA_PRESSURE_PLATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> METASEQUOIA_FENCE = REGISTER.register("metasequoia_fence", () -> new BlockItem(PFBlocks.METASEQUOIA_FENCE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> METASEQUOIA_TRAPDOOR = REGISTER.register("metasequoia_trapdoor", () -> new BlockItem(PFBlocks.METASEQUOIA_TRAPDOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> METASEQUOIA_FENCE_GATE = REGISTER.register("metasequoia_fence_gate", () -> new BlockItem(PFBlocks.METASEQUOIA_FENCE_GATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> METASEQUOIA_BUTTON = REGISTER.register("metasequoia_button", () -> new BlockItem(PFBlocks.METASEQUOIA_BUTTON.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> METASEQUOIA_SLAB = REGISTER.register("metasequoia_slab", () -> new BlockItem(PFBlocks.METASEQUOIA_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> METASEQUOIA_STAIRS = REGISTER.register("metasequoia_stairs", () -> new BlockItem(PFBlocks.METASEQUOIA_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<Item> METASEQUOIA_SIGN = REGISTER.register("metasequoia_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(PrehistoricFauna.PF_DECORATION), PFBlocks.METASEQUOIA_SIGN.get(), PFBlocks.METASEQUOIA_WALL_SIGN.get()));
	
	public static final RegistryObject<BlockItem> ARAUCARIA_PLANKS = REGISTER.register("araucaria_planks", () -> new BlockItem(PFBlocks.ARAUCARIA_PLANKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> ARAUCARIA_LOG = REGISTER.register("araucaria_log", () -> new BlockItem(PFBlocks.ARAUCARIA_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_ARAUCARIA_LOG = REGISTER.register("stripped_araucaria_log", () -> new BlockItem(PFBlocks.STRIPPED_ARAUCARIA_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> ARAUCARIA_WOOD = REGISTER.register("araucaria_wood", () -> new BlockItem(PFBlocks.ARAUCARIA_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_ARAUCARIA_WOOD = REGISTER.register("stripped_araucaria_wood", () -> new BlockItem(PFBlocks.STRIPPED_ARAUCARIA_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> ARAUCARIA_LEAVES = REGISTER.register("araucaria_leaves", () -> new BlockItem(PFBlocks.ARAUCARIA_LEAVES.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ARAUCARIA_SAPLING = REGISTER.register("araucaria_sapling", () -> new BlockItem(PFBlocks.ARAUCARIA_SAPLING.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ARAUCARIA_DOOR = REGISTER.register("araucaria_door", () -> new BlockItem(PFBlocks.ARAUCARIA_DOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ARAUCARIA_PRESSURE_PLATE = REGISTER.register("araucaria_pressure_plate", () -> new BlockItem(PFBlocks.ARAUCARIA_PRESSURE_PLATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ARAUCARIA_FENCE = REGISTER.register("araucaria_fence", () -> new BlockItem(PFBlocks.ARAUCARIA_FENCE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ARAUCARIA_TRAPDOOR = REGISTER.register("araucaria_trapdoor", () -> new BlockItem(PFBlocks.ARAUCARIA_TRAPDOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ARAUCARIA_FENCE_GATE = REGISTER.register("araucaria_fence_gate", () -> new BlockItem(PFBlocks.ARAUCARIA_FENCE_GATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ARAUCARIA_BUTTON = REGISTER.register("araucaria_button", () -> new BlockItem(PFBlocks.ARAUCARIA_BUTTON.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ARAUCARIA_SLAB = REGISTER.register("araucaria_slab", () -> new BlockItem(PFBlocks.ARAUCARIA_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> ARAUCARIA_STAIRS = REGISTER.register("araucaria_stairs", () -> new BlockItem(PFBlocks.ARAUCARIA_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<Item> ARAUCARIA_SIGN = REGISTER.register("araucaria_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(PrehistoricFauna.PF_DECORATION), PFBlocks.ARAUCARIA_SIGN.get(), PFBlocks.ARAUCARIA_WALL_SIGN.get()));

	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_PLANKS = REGISTER.register("protopiceoxylon_planks", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_PLANKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_LOG = REGISTER.register("protopiceoxylon_log", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_PROTOPICEOXYLON_LOG = REGISTER.register("stripped_protopiceoxylon_log", () -> new BlockItem(PFBlocks.STRIPPED_PROTOPICEOXYLON_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_WOOD = REGISTER.register("protopiceoxylon_wood", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_PROTOPICEOXYLON_WOOD = REGISTER.register("stripped_protopiceoxylon_wood", () -> new BlockItem(PFBlocks.STRIPPED_PROTOPICEOXYLON_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_LEAVES = REGISTER.register("protopiceoxylon_leaves", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_LEAVES.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_SAPLING = REGISTER.register("protopiceoxylon_sapling", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_SAPLING.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_DOOR = REGISTER.register("protopiceoxylon_door", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_DOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_PRESSURE_PLATE = REGISTER.register("protopiceoxylon_pressure_plate", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_PRESSURE_PLATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_FENCE = REGISTER.register("protopiceoxylon_fence", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_FENCE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_TRAPDOOR = REGISTER.register("protopiceoxylon_trapdoor", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_TRAPDOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_FENCE_GATE = REGISTER.register("protopiceoxylon_fence_gate", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_FENCE_GATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_BUTTON = REGISTER.register("protopiceoxylon_button", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_BUTTON.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_SLAB = REGISTER.register("protopiceoxylon_slab", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> PROTOPICEOXYLON_STAIRS = REGISTER.register("protopiceoxylon_stairs", () -> new BlockItem(PFBlocks.PROTOPICEOXYLON_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<Item> PROTOPICEOXYLON_SIGN = REGISTER.register("protopiceoxylon_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(PrehistoricFauna.PF_DECORATION), PFBlocks.PROTOPICEOXYLON_SIGN.get(), PFBlocks.PROTOPICEOXYLON_WALL_SIGN.get()));

	public static final RegistryObject<BlockItem> ZAMITES_PLANKS = REGISTER.register("zamites_planks", () -> new BlockItem(PFBlocks.ZAMITES_PLANKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> ZAMITES_LOG = REGISTER.register("zamites_log", () -> new BlockItem(PFBlocks.ZAMITES_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_ZAMITES_LOG = REGISTER.register("stripped_zamites_log", () -> new BlockItem(PFBlocks.STRIPPED_ZAMITES_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> ZAMITES_WOOD = REGISTER.register("zamites_wood", () -> new BlockItem(PFBlocks.ZAMITES_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_ZAMITES_WOOD = REGISTER.register("stripped_zamites_wood", () -> new BlockItem(PFBlocks.STRIPPED_ZAMITES_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> ZAMITES_LEAVES = REGISTER.register("zamites_leaves", () -> new BlockItem(PFBlocks.ZAMITES_LEAVES.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ZAMITES_SAPLING = REGISTER.register("zamites_sapling", () -> new BlockItem(PFBlocks.ZAMITES_SAPLING.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ZAMITES_DOOR = REGISTER.register("zamites_door", () -> new BlockItem(PFBlocks.ZAMITES_DOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ZAMITES_PRESSURE_PLATE = REGISTER.register("zamites_pressure_plate", () -> new BlockItem(PFBlocks.ZAMITES_PRESSURE_PLATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ZAMITES_FENCE = REGISTER.register("zamites_fence", () -> new BlockItem(PFBlocks.ZAMITES_FENCE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ZAMITES_TRAPDOOR = REGISTER.register("zamites_trapdoor", () -> new BlockItem(PFBlocks.ZAMITES_TRAPDOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ZAMITES_FENCE_GATE = REGISTER.register("zamites_fence_gate", () -> new BlockItem(PFBlocks.ZAMITES_FENCE_GATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ZAMITES_BUTTON = REGISTER.register("zamites_button", () -> new BlockItem(PFBlocks.ZAMITES_BUTTON.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> ZAMITES_SLAB = REGISTER.register("zamites_slab", () -> new BlockItem(PFBlocks.ZAMITES_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> ZAMITES_STAIRS = REGISTER.register("zamites_stairs", () -> new BlockItem(PFBlocks.ZAMITES_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<Item> ZAMITES_SIGN = REGISTER.register("zamites_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(PrehistoricFauna.PF_DECORATION), PFBlocks.ZAMITES_SIGN.get(), PFBlocks.ZAMITES_WALL_SIGN.get()));

	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_PLANKS = REGISTER.register("protojuniperoxylon_planks", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_PLANKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_LOG = REGISTER.register("protojuniperoxylon_log", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_PROTOJUNIPEROXYLON_LOG = REGISTER.register("stripped_protojuniperoxylon_log", () -> new BlockItem(PFBlocks.STRIPPED_PROTOJUNIPEROXYLON_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_WOOD = REGISTER.register("protojuniperoxylon_wood", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_PROTOJUNIPEROXYLON_WOOD = REGISTER.register("stripped_protojuniperoxylon_wood", () -> new BlockItem(PFBlocks.STRIPPED_PROTOJUNIPEROXYLON_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_LEAVES = REGISTER.register("protojuniperoxylon_leaves", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_LEAVES.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_SAPLING = REGISTER.register("protojuniperoxylon_sapling", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_SAPLING.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_DOOR = REGISTER.register("protojuniperoxylon_door", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_DOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_PRESSURE_PLATE = REGISTER.register("protojuniperoxylon_pressure_plate", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_PRESSURE_PLATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_FENCE = REGISTER.register("protojuniperoxylon_fence", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_FENCE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_TRAPDOOR = REGISTER.register("protojuniperoxylon_trapdoor", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_TRAPDOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_FENCE_GATE = REGISTER.register("protojuniperoxylon_fence_gate", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_FENCE_GATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_BUTTON = REGISTER.register("protojuniperoxylon_button", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_BUTTON.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_SLAB = REGISTER.register("protojuniperoxylon_slab", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));	
	public static final RegistryObject<BlockItem> PROTOJUNIPEROXYLON_STAIRS = REGISTER.register("protojuniperoxylon_stairs", () -> new BlockItem(PFBlocks.PROTOJUNIPEROXYLON_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<Item> PROTOJUNIPEROXYLON_SIGN = REGISTER.register("protojuniperoxylon_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(PrehistoricFauna.PF_DECORATION), PFBlocks.PROTOJUNIPEROXYLON_SIGN.get(), PFBlocks.PROTOJUNIPEROXYLON_WALL_SIGN.get()));

	public static final RegistryObject<BlockItem> AGATHOXYLON_PLANKS = REGISTER.register("agathoxylon_planks", () -> new BlockItem(PFBlocks.AGATHOXYLON_PLANKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_LOG = REGISTER.register("agathoxylon_log", () -> new BlockItem(PFBlocks.AGATHOXYLON_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_AGATHOXYLON_LOG = REGISTER.register("stripped_agathoxylon_log", () -> new BlockItem(PFBlocks.STRIPPED_AGATHOXYLON_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_WOOD = REGISTER.register("agathoxylon_wood", () -> new BlockItem(PFBlocks.AGATHOXYLON_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_AGATHOXYLON_WOOD = REGISTER.register("stripped_agathoxylon_wood", () -> new BlockItem(PFBlocks.STRIPPED_AGATHOXYLON_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_LEAVES = REGISTER.register("agathoxylon_leaves", () -> new BlockItem(PFBlocks.AGATHOXYLON_LEAVES.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_SAPLING = REGISTER.register("agathoxylon_sapling", () -> new BlockItem(PFBlocks.AGATHOXYLON_SAPLING.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_DOOR = REGISTER.register("agathoxylon_door", () -> new BlockItem(PFBlocks.AGATHOXYLON_DOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_PRESSURE_PLATE = REGISTER.register("agathoxylon_pressure_plate", () -> new BlockItem(PFBlocks.AGATHOXYLON_PRESSURE_PLATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_FENCE = REGISTER.register("agathoxylon_fence", () -> new BlockItem(PFBlocks.AGATHOXYLON_FENCE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_TRAPDOOR = REGISTER.register("agathoxylon_trapdoor", () -> new BlockItem(PFBlocks.AGATHOXYLON_TRAPDOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_FENCE_GATE = REGISTER.register("agathoxylon_fence_gate", () -> new BlockItem(PFBlocks.AGATHOXYLON_FENCE_GATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_BUTTON = REGISTER.register("agathoxylon_button", () -> new BlockItem(PFBlocks.AGATHOXYLON_BUTTON.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_SLAB = REGISTER.register("agathoxylon_slab", () -> new BlockItem(PFBlocks.AGATHOXYLON_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> AGATHOXYLON_STAIRS = REGISTER.register("agathoxylon_stairs", () -> new BlockItem(PFBlocks.AGATHOXYLON_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<Item> AGATHOXYLON_SIGN = REGISTER.register("agathoxylon_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(PrehistoricFauna.PF_DECORATION), PFBlocks.AGATHOXYLON_SIGN.get(), PFBlocks.AGATHOXYLON_WALL_SIGN.get()));

	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_PLANKS = REGISTER.register("heidiphyllum_planks", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_PLANKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_LOG = REGISTER.register("heidiphyllum_log", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_HEIDIPHYLLUM_LOG = REGISTER.register("stripped_heidiphyllum_log", () -> new BlockItem(PFBlocks.STRIPPED_HEIDIPHYLLUM_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_WOOD = REGISTER.register("heidiphyllum_wood", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_HEIDIPHYLLUM_WOOD = REGISTER.register("stripped_heidiphyllum_wood", () -> new BlockItem(PFBlocks.STRIPPED_HEIDIPHYLLUM_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_LEAVES = REGISTER.register("heidiphyllum_leaves", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_LEAVES.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_SAPLING = REGISTER.register("heidiphyllum_sapling", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_SAPLING.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_DOOR = REGISTER.register("heidiphyllum_door", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_DOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_PRESSURE_PLATE = REGISTER.register("heidiphyllum_pressure_plate", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_PRESSURE_PLATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_FENCE = REGISTER.register("heidiphyllum_fence", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_FENCE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_TRAPDOOR = REGISTER.register("heidiphyllum_trapdoor", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_TRAPDOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_FENCE_GATE = REGISTER.register("heidiphyllum_fence_gate", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_FENCE_GATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_BUTTON = REGISTER.register("heidiphyllum_button", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_BUTTON.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_SLAB = REGISTER.register("heidiphyllum_slab", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HEIDIPHYLLUM_STAIRS = REGISTER.register("heidiphyllum_stairs", () -> new BlockItem(PFBlocks.HEIDIPHYLLUM_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<Item> HEIDIPHYLLUM_SIGN = REGISTER.register("heidiphyllum_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(PrehistoricFauna.PF_DECORATION), PFBlocks.HEIDIPHYLLUM_SIGN.get(), PFBlocks.HEIDIPHYLLUM_WALL_SIGN.get()));

	public static final RegistryObject<BlockItem> LIRIODENDRITES_PLANKS = REGISTER.register("liriodendrites_planks", () -> new BlockItem(PFBlocks.LIRIODENDRITES_PLANKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_LOG = REGISTER.register("liriodendrites_log", () -> new BlockItem(PFBlocks.LIRIODENDRITES_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_LIRIODENDRITES_LOG = REGISTER.register("stripped_liriodendrites_log", () -> new BlockItem(PFBlocks.STRIPPED_LIRIODENDRITES_LOG.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_WOOD = REGISTER.register("liriodendrites_wood", () -> new BlockItem(PFBlocks.LIRIODENDRITES_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> STRIPPED_LIRIODENDRITES_WOOD = REGISTER.register("stripped_liriodendrites_wood", () -> new BlockItem(PFBlocks.STRIPPED_LIRIODENDRITES_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_LEAVES = REGISTER.register("liriodendrites_leaves", () -> new BlockItem(PFBlocks.LIRIODENDRITES_LEAVES.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_SAPLING = REGISTER.register("liriodendrites_sapling", () -> new BlockItem(PFBlocks.LIRIODENDRITES_SAPLING.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_DOOR = REGISTER.register("liriodendrites_door", () -> new BlockItem(PFBlocks.LIRIODENDRITES_DOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_PRESSURE_PLATE = REGISTER.register("liriodendrites_pressure_plate", () -> new BlockItem(PFBlocks.LIRIODENDRITES_PRESSURE_PLATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_FENCE = REGISTER.register("liriodendrites_fence", () -> new BlockItem(PFBlocks.LIRIODENDRITES_FENCE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_TRAPDOOR = REGISTER.register("liriodendrites_trapdoor", () -> new BlockItem(PFBlocks.LIRIODENDRITES_TRAPDOOR.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_FENCE_GATE = REGISTER.register("liriodendrites_fence_gate", () -> new BlockItem(PFBlocks.LIRIODENDRITES_FENCE_GATE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_BUTTON = REGISTER.register("liriodendrites_button", () -> new BlockItem(PFBlocks.LIRIODENDRITES_BUTTON.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_SLAB = REGISTER.register("liriodendrites_slab", () -> new BlockItem(PFBlocks.LIRIODENDRITES_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> LIRIODENDRITES_STAIRS = REGISTER.register("liriodendrites_stairs", () -> new BlockItem(PFBlocks.LIRIODENDRITES_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<Item> LIRIODENDRITES_SIGN = REGISTER.register("liriodendrites_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(PrehistoricFauna.PF_DECORATION), PFBlocks.LIRIODENDRITES_SIGN.get(), PFBlocks.LIRIODENDRITES_WALL_SIGN.get()));

	public static final RegistryObject<BlockItem> PTILOPHYLLUM_WOOD = REGISTER.register("ptilophyllum_wood", () -> new BlockItem(PFBlocks.PTILOPHYLLUM_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PTILOPHYLLUM_BASE = REGISTER.register("ptilophyllum_base", () -> new BlockItem(PFBlocks.PTILOPHYLLUM_BASE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> DICROIDIUM = REGISTER.register("dicroidium", () -> new BlockItem(PFBlocks.DICROIDIUM.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> JOHNSTONIA = REGISTER.register("johnstonia", () -> new BlockItem(PFBlocks.JOHNSTONIA.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));

	public static final RegistryObject<BlockItem> SANDSTONE = REGISTER.register("sandstone", () -> new BlockItem(PFBlocks.SANDSTONE.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SANDSTONE_FOSSIL = REGISTER.register("sandstone_fossil", () -> new BlockItem(PFBlocks.SANDSTONE_FOSSIL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SMOOTH_SANDSTONE = REGISTER.register("smooth_sandstone", () -> new BlockItem(PFBlocks.SMOOTH_SANDSTONE.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> POLISHED_SANDSTONE = REGISTER.register("polished_sandstone", () -> new BlockItem(PFBlocks.POLISHED_SANDSTONE.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SANDSTONE_BRICKS = REGISTER.register("sandstone_bricks", () -> new BlockItem(PFBlocks.SANDSTONE_BRICKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHISELED_SANDSTONE = REGISTER.register("chiseled_sandstone", () -> new BlockItem(PFBlocks.CHISELED_SANDSTONE.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SANDSTONE_WALL = REGISTER.register("sandstone_wall", () -> new BlockItem(PFBlocks.SANDSTONE_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SMOOTH_SANDSTONE_WALL = REGISTER.register("smooth_sandstone_wall", () -> new BlockItem(PFBlocks.SMOOTH_SANDSTONE_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SANDSTONE_BRICK_WALL = REGISTER.register("sandstone_brick_wall", () -> new BlockItem(PFBlocks.SANDSTONE_BRICK_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SANDSTONE_STAIRS = REGISTER.register("sandstone_stairs", () -> new BlockItem(PFBlocks.SANDSTONE_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SANDSTONE_SLAB = REGISTER.register("sandstone_slab", () -> new BlockItem(PFBlocks.SANDSTONE_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> POLISHED_SANDSTONE_SLAB = REGISTER.register("polished_sandstone_slab", () -> new BlockItem(PFBlocks.POLISHED_SANDSTONE_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> POLISHED_SANDSTONE_STAIRS = REGISTER.register("polished_sandstone_stairs", () -> new BlockItem(PFBlocks.POLISHED_SANDSTONE_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SANDSTONE_BRICK_STAIRS = REGISTER.register("sandstone_brick_stairs", () -> new BlockItem(PFBlocks.SANDSTONE_BRICK_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SANDSTONE_BRICK_SLAB = REGISTER.register("sandstone_brick_slab", () -> new BlockItem(PFBlocks.SANDSTONE_BRICK_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));

	public static final RegistryObject<BlockItem> SILTSTONE = REGISTER.register("siltstone", () -> new BlockItem(PFBlocks.SILTSTONE.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SILTSTONE_FOSSIL = REGISTER.register("siltstone_fossil", () -> new BlockItem(PFBlocks.SILTSTONE_FOSSIL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SMOOTH_SILTSTONE = REGISTER.register("smooth_siltstone", () -> new BlockItem(PFBlocks.SMOOTH_SILTSTONE.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> POLISHED_SILTSTONE = REGISTER.register("polished_siltstone", () -> new BlockItem(PFBlocks.POLISHED_SILTSTONE.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SILTSTONE_BRICKS = REGISTER.register("siltstone_bricks", () -> new BlockItem(PFBlocks.SILTSTONE_BRICKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHISELED_SILTSTONE = REGISTER.register("chiseled_siltstone", () -> new BlockItem(PFBlocks.CHISELED_SILTSTONE.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SILTSTONE_WALL = REGISTER.register("siltstone_wall", () -> new BlockItem(PFBlocks.SILTSTONE_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SMOOTH_SILTSTONE_WALL = REGISTER.register("smooth_siltstone_wall", () -> new BlockItem(PFBlocks.SMOOTH_SILTSTONE_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SILTSTONE_BRICK_WALL = REGISTER.register("siltstone_brick_wall", () -> new BlockItem(PFBlocks.SILTSTONE_BRICK_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SILTSTONE_STAIRS = REGISTER.register("siltstone_stairs", () -> new BlockItem(PFBlocks.SILTSTONE_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SILTSTONE_SLAB = REGISTER.register("siltstone_slab", () -> new BlockItem(PFBlocks.SILTSTONE_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> POLISHED_SILTSTONE_SLAB = REGISTER.register("polished_siltstone_slab", () -> new BlockItem(PFBlocks.POLISHED_SILTSTONE_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> POLISHED_SILTSTONE_STAIRS = REGISTER.register("polished_siltstone_stairs", () -> new BlockItem(PFBlocks.POLISHED_SILTSTONE_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SILTSTONE_BRICK_STAIRS = REGISTER.register("siltstone_brick_stairs", () -> new BlockItem(PFBlocks.SILTSTONE_BRICK_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SILTSTONE_BRICK_SLAB = REGISTER.register("siltstone_brick_slab", () -> new BlockItem(PFBlocks.SILTSTONE_BRICK_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));

	public static final RegistryObject<BlockItem> CHALK = REGISTER.register("chalk", () -> new BlockItem(PFBlocks.CHALK.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHALK_FOSSIL = REGISTER.register("chalk_fossil", () -> new BlockItem(PFBlocks.CHALK_FOSSIL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SMOOTH_CHALK = REGISTER.register("smooth_chalk", () -> new BlockItem(PFBlocks.SMOOTH_CHALK.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> POLISHED_CHALK = REGISTER.register("polished_chalk", () -> new BlockItem(PFBlocks.POLISHED_CHALK.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHALK_BRICKS = REGISTER.register("chalk_bricks", () -> new BlockItem(PFBlocks.CHALK_BRICKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHISELED_CHALK = REGISTER.register("chiseled_chalk", () -> new BlockItem(PFBlocks.CHISELED_CHALK.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHALK_WALL = REGISTER.register("chalk_wall", () -> new BlockItem(PFBlocks.CHALK_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> SMOOTH_CHALK_WALL = REGISTER.register("smooth_chalk_wall", () -> new BlockItem(PFBlocks.SMOOTH_CHALK_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHALK_BRICK_WALL = REGISTER.register("chalk_brick_wall", () -> new BlockItem(PFBlocks.CHALK_BRICK_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHALK_STAIRS = REGISTER.register("chalk_stairs", () -> new BlockItem(PFBlocks.CHALK_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHALK_SLAB = REGISTER.register("chalk_slab", () -> new BlockItem(PFBlocks.CHALK_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> POLISHED_CHALK_SLAB = REGISTER.register("polished_chalk_slab", () -> new BlockItem(PFBlocks.POLISHED_CHALK_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> POLISHED_CHALK_STAIRS = REGISTER.register("polished_chalk_stairs", () -> new BlockItem(PFBlocks.POLISHED_CHALK_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHALK_BRICK_STAIRS = REGISTER.register("chalk_brick_stairs", () -> new BlockItem(PFBlocks.CHALK_BRICK_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHALK_BRICK_SLAB = REGISTER.register("chalk_brick_slab", () -> new BlockItem(PFBlocks.CHALK_BRICK_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	
	public static final RegistryObject<BlockItem> HENOSTONE = REGISTER.register("henostone", () -> new BlockItem(PFBlocks.HENOSTONE.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CARVED_HENOSTONE = REGISTER.register("carved_henostone", () -> new BlockItem(PFBlocks.CARVED_HENOSTONE.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HENOSTONE_BRICKS = REGISTER.register("henostone_bricks", () -> new BlockItem(PFBlocks.HENOSTONE_BRICK_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> DARK_HENOSTONE_BRICKS = REGISTER.register("dark_henostone_bricks", () -> new BlockItem(PFBlocks.DARK_HENOSTONE_BRICKS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HENOSTONE_PILLAR = REGISTER.register("henostone_pillar", () -> new BlockItem(PFBlocks.HENOSTONE_PILLAR.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> CHISELED_HENoSTONE_PILLAR = REGISTER.register("chiseled_henostone_pillar", () -> new BlockItem(PFBlocks.CHISELED_HENOSTONE_PILLAR.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HENOSTONE_STAIRS = REGISTER.register("henostone_stairs", () -> new BlockItem(PFBlocks.HENOSTONE_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HENOSTONE_SLAB = REGISTER.register("henostone_slab", () -> new BlockItem(PFBlocks.HENOSTONE_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HENOSTONE_WALL = REGISTER.register("henostone_wall", () -> new BlockItem(PFBlocks.HENOSTONE_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HENOSTONE_BRICK_STAIRS = REGISTER.register("henostone_brick_stairs", () -> new BlockItem(PFBlocks.HENOSTONE_BRICK_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HENOSTONE_BRICK_SLAB = REGISTER.register("henostone_brick_slab", () -> new BlockItem(PFBlocks.HENOSTONE_BRICK_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HENOSTONE_BRICK_WALL = REGISTER.register("henostone_brick_wall", () -> new BlockItem(PFBlocks.HENOSTONE_BRICK_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> DARK_HENOSTONE_BRICK_STAIRS = REGISTER.register("dark_henostone_brick_stairs", () -> new BlockItem(PFBlocks.DARK_HENOSTONE_BRICK_STAIRS.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> DARK_HENOSTONE_BRICK_SLAB = REGISTER.register("dark_henostone_brick_slab", () -> new BlockItem(PFBlocks.DARK_HENOSTONE_BRICK_SLAB.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> DARK_HENOSTONE_BRICK_WALL = REGISTER.register("dark_henostone_brick_wall", () -> new BlockItem(PFBlocks.DARK_HENOSTONE_BRICK_WALL.get(), new Item.Properties().tab(PrehistoricFauna.PF_BUILDING)));
	public static final RegistryObject<BlockItem> HENOSTONE_TRAP = REGISTER.register("henostone_trap", () -> new BlockItem(PFBlocks.HENOSTONE_TRAP.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PALEOSCRIBE = REGISTER.register("paleoscribe", () -> new BlockItem(PFBlocks.PALEOSCRIBE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PALEONTOLOGY_TABLE = REGISTER.register("paleontology_table", () -> new BlockItem(PFBlocks.PALEONTOLOGY_TABLE.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));

	public static final RegistryObject<BlockItem> LARGE_AMMONITE_FOSSIL = REGISTER.register("large_ammonite_fossil", () -> new BlockItem(PFBlocks.LARGE_AMMONITE_FOSSIL.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> MEDIUM_AMMONITE_FOSSIL = REGISTER.register("medium_ammonite_fossil", () -> new BlockItem(PFBlocks.MEDIUM_AMMONITE_FOSSIL.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> SMALL_AMMONITE_FOSSIL = REGISTER.register("small_ammonite_fossil", () -> new BlockItem(PFBlocks.SMALL_AMMONITE_FOSSIL.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> GiANT_AMMONITE_FOSSIL_PIECE_BF = REGISTER.register("giant_ammonite_fossil_piece_bf", () -> new BlockItem(PFBlocks.GIANT_AMMONITE_FOSSIL_PIECE_BF.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> GiANT_AMMONITE_FOSSIL_PIECE_BB = REGISTER.register("giant_ammonite_fossil_piece_bb", () -> new BlockItem(PFBlocks.GIANT_AMMONITE_FOSSIL_PIECE_BB.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> GiANT_AMMONITE_FOSSIL_PIECE_TF = REGISTER.register("giant_ammonite_fossil_piece_tf", () -> new BlockItem(PFBlocks.GIANT_AMMONITE_FOSSIL_PIECE_TF.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> GiANT_AMMONITE_FOSSIL_PIECE_TB = REGISTER.register("giant_ammonite_fossil_piece_tb", () -> new BlockItem(PFBlocks.GIANT_AMMONITE_FOSSIL_PIECE_TB.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PLASTERED_AMMONITES = REGISTER.register("plastered_ammonites", () -> new BlockItem(PFBlocks.PLASTERED_AMMONITES.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> PETRIFIED_WOOD = REGISTER.register("petrified_wood", () -> new BlockItem(PFBlocks.PETRIFIED_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	public static final RegistryObject<BlockItem> POLISHED_PETRIFIED_WOOD = REGISTER.register("polished_petrified_wood", () -> new BlockItem(PFBlocks.POLISHED_PETRIFIED_WOOD.get(), new Item.Properties().tab(PrehistoricFauna.PF_DECORATION)));
	
	public static final RegistryObject<Item> TRIASSIC_FOSSIL = REGISTER.register("triassic_fossil", () -> new FossilItem(new Item.Properties().tab(PrehistoricFauna.PF_MISC)));
	public static final RegistryObject<Item> JURASSIC_FOSSIL = REGISTER.register("jurassic_fossil", () -> new FossilItem(new Item.Properties().tab(PrehistoricFauna.PF_MISC)));
	public static final RegistryObject<Item> CRETACEOUS_FOSSIL = REGISTER.register("cretaceous_fossil", () -> new FossilItem(new Item.Properties().tab(PrehistoricFauna.PF_MISC)));
	
	public static final RegistryObject<Item> FOSSILIZED_BONES = REGISTER.register("fossilized_bones", () -> new Item(new Item.Properties().tab(PrehistoricFauna.PF_MISC)));
	public static final RegistryObject<Item> GEOLOGY_HAMMER = REGISTER.register("geological_hammer", () -> new Item(new Item.Properties().tab(PrehistoricFauna.PF_MISC).durability(250).stacksTo(1)));
	
	public static final RegistryObject<Item> HERRERASAURUS_SKULL = REGISTER.register("herrerasaurus_skull", () -> new SpawnSkeletonItem(PFEntities.HERRERASAURUS_SKULL, new Item.Properties().tab(PrehistoricFauna.PF_MISC)));

	
	public static final RegistryObject<PaleopediaItem> PALEOPEDIA = REGISTER.register("ancient_journal", () -> new PaleopediaItem());
	public static final RegistryObject<Item> PALEOPAGE = REGISTER.register("paleopage", () -> new Item(new Item.Properties().tab(PrehistoricFauna.PF_MISC)));
	
}
