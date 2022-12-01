package superlord.prehistoricfauna.world.biome.cretaceous;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import superlord.prehistoricfauna.common.world.PFConfiguredFeatures;
import superlord.prehistoricfauna.common.world.PFSurfaceBuilders;
import superlord.prehistoricfauna.common.world.WorldGenRegistrationHelper;
import superlord.prehistoricfauna.config.PrehistoricFaunaConfig;
import superlord.prehistoricfauna.init.PFBlocks;
import superlord.prehistoricfauna.init.PFEntities;
import superlord.prehistoricfauna.world.biome.PFBiome;

public class HellCreekHillsBiome extends PFBiome {

	static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = WorldGenRegistrationHelper.createConfiguredSurfaceBuilder("hell_creek_hills_sb", new ConfiguredSurfaceBuilder<>(PFSurfaceBuilders.HELL_CREEK, new SurfaceBuilderConfig(PFBlocks.MOSSY_DIRT.getDefaultState(), Blocks.COARSE_DIRT.getDefaultState(), Blocks.COARSE_DIRT.getDefaultState())));
	static final Biome.RainType PRECIPATATION = Biome.RainType.RAIN;
	static final Biome.Category CATEGORY = Category.NONE;
	static final float TEMPERATURE = 0.7F;
	static final float DOWNFALL = 0.8F;
	static final int WATER_COLOR = 0x7C5D48;
	static final int WATER_FOG_COLOR = 0x6B4E3B;
	static final int SKY_COLOR = 0x7ebf9f;
	static final int FOLIAGE_COLOR = 0x53711f;
	static final int GRASS_COLOR = 0x53711f;
	static final int FOG_COLOR = 12638463;
	static final float SCALE = 0.3F;
	static final float DEPTH = 0.7F;

	static final Biome.Climate WEATHER = new Biome.Climate(PRECIPATATION, TEMPERATURE, Biome.TemperatureModifier.NONE, DOWNFALL);
	static final MobSpawnInfo.Builder SPAWN_SETTINGS = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
	static final BiomeGenerationSettings.Builder GENERATION_SETTINGS = (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(SURFACE_BUILDER);

	public HellCreekHillsBiome() {
		super(WEATHER, CATEGORY, DEPTH, SCALE, (new BiomeAmbience.Builder()).setWaterColor(WATER_COLOR).setWaterFogColor(WATER_FOG_COLOR).withSkyColor(SKY_COLOR).setFogColor(FOG_COLOR).withFoliageColor(FOLIAGE_COLOR).withGrassColor(GRASS_COLOR).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.copy());
	}

	@Override
	public Biome getRiver() {
		return new HellCreekRiverBiome().getBiome();
	}

	@Override
	public int getWeight() {
		return 5;
	}

	@Override
	public BiomeDictionary.Type[] getBiomeDictionary() {
		return new BiomeDictionary.Type[]{BiomeDictionary.Type.DENSE, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.LUSH};
	}

	@Override
	public BiomeManager.BiomeType getBiomeType() {
		return BiomeManager.BiomeType.COOL;
	}

	static {
		PFConfiguredFeatures.withHellCreekVegetation(GENERATION_SETTINGS);
		if (PrehistoricFaunaConfig.didelphodonHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(PFEntities.DIDELPHODON_ENTITY, PrehistoricFaunaConfig.didelphodonHellCreekHillsSpawnWeight, 1, 3));
		if (PrehistoricFaunaConfig.dakotaraptorHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(PFEntities.DAKOTARAPTOR_ENTITY, PrehistoricFaunaConfig.dakotaraptorHellCreekHillsSpawnWeight, 1, 3));
		if (PrehistoricFaunaConfig.tyrannosaurusHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(PFEntities.TYRANNOSAURUS_ENTITY, PrehistoricFaunaConfig.tyrannosaurusHellCreekHillsSpawnWeight, 1, 1));
		PFConfiguredFeatures.addLiriodendritesForestVegetation(GENERATION_SETTINGS);
		GENERATION_SETTINGS.withFeature(Decoration.UNDERGROUND_ORES, PFConfiguredFeatures.CRETACEOUS_FOSSILIZED_SANDSTONE);
		GENERATION_SETTINGS.withFeature(Decoration.UNDERGROUND_ORES, PFConfiguredFeatures.CRETACEOUS_FOSSILIZED_SILTSTONE);
		GENERATION_SETTINGS.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, PFConfiguredFeatures.MOSS);
		if (PrehistoricFaunaConfig.thescelosaurusHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(PFEntities.THESCELOSAURUS_ENTITY, PrehistoricFaunaConfig.thescelosaurusHellCreekHillsSpawnWeight, 2, 4));
		if (PrehistoricFaunaConfig.triceratopsHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(PFEntities.TRICERATOPS_ENTITY, PrehistoricFaunaConfig.triceratopsHellCreekHillsSpawnWeight, 2, 3));
		if (PrehistoricFaunaConfig.ankylosaurusHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(PFEntities.ANKYLOSAURUS_ENTITY, PrehistoricFaunaConfig.ankylosaurusHellCreekHillsSpawnWeight, 1, 2));
		if (PrehistoricFaunaConfig.basilemysHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(PFEntities.BASILEMYS_ENTITY, PrehistoricFaunaConfig.basilemysHellCreekHillsSpawnWeight, 1, 2));
		if (PrehistoricFaunaConfig.caveSentinelHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(PFEntities.TRILOBITE_SENTINEL_ENTITY, PrehistoricFaunaConfig.caveSentinelHellCreekHillsSpawnWeight, 1, 1));
		if (PrehistoricFaunaConfig.landSentinelHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(PFEntities.LAND_SENTINEL_ENTITY, PrehistoricFaunaConfig.landSentinelHellCreekHillsSpawnWeight, 1, 1));
		if (PrehistoricFaunaConfig.garHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(PFEntities.GAR, PrehistoricFaunaConfig.garHellCreekHillsSpawnWeight, 1, 2));
		if (PrehistoricFaunaConfig.cyclurusHellCreekHillsSpawnWeight != 0)  SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(PFEntities.CYCLURUS, PrehistoricFaunaConfig.cyclurusHellCreekHillsSpawnWeight, 1, 3));
        if (PrehistoricFaunaConfig.myledaphusHellCreekHillsSpawnWeight != 0) SPAWN_SETTINGS.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(PFEntities.MYLEDAPHUS, PrehistoricFaunaConfig.myledaphusHellCreekHillsSpawnWeight, 1, 7));
        DefaultBiomeFeatures.withCavesAndCanyons(GENERATION_SETTINGS);
	}


}
