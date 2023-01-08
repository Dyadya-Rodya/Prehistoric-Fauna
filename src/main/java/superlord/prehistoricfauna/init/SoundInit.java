package superlord.prehistoricfauna.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import superlord.prehistoricfauna.PrehistoricFauna;

@Mod.EventBusSubscriber(modid = PrehistoricFauna.MOD_ID, bus = Bus.MOD)
public class SoundInit {
	
	//Hell Creek
	public static final SoundEvent TRICERATOPS_IDLE; 
	public static final SoundEvent TRICERATOPS_HURT; 
	public static final SoundEvent TRICERATOPS_WARN; 
	public static final SoundEvent TRICERATOPS_DEATH;
	public static final SoundEvent TRICERATOPS_SNORES;
	public static final SoundEvent TYRANNOSAURUS_IDLE; 
	public static final SoundEvent TYRANNOSAURUS_HURT; 
	public static final SoundEvent TYRANNOSAURUS_WARN; 
	public static final SoundEvent TYRANNOSAURUS_DEATH;
	public static final SoundEvent TYRANNOSAURUS_SNORES;
	public static final SoundEvent ANKYLOSAURUS_IDLE; 
	public static final SoundEvent ANKYLOSAURUS_HURT; 
	public static final SoundEvent ANKYLOSAURUS_WARN; 
	public static final SoundEvent ANKYLOSAURUS_DEATH;
	public static final SoundEvent ANKYLOSAURUS_SNORES;
	public static final SoundEvent DAKOTARAPTOR_IDLE; 
	public static final SoundEvent DAKOTARAPTOR_HURT; 
	public static final SoundEvent DAKOTARAPTOR_WARN; 
	public static final SoundEvent DAKOTARAPTOR_DEATH;
	public static final SoundEvent THESCELOSAURUS_IDLE;
	public static final SoundEvent THESCELOSAURUS_HURT;
	public static final SoundEvent THESCELOSAURUS_DEATH;
	public static final SoundEvent DIDELPHODON_IDLE;
	public static final SoundEvent DIDELPHODON_HURT;
	public static final SoundEvent DIDELPHODON_DEATH;
	public static final SoundEvent BASILEMYS_IDLE;
	public static final SoundEvent BASILEMYS_HURT;
	public static final SoundEvent BASILEMYS_DEATH;
	public static final SoundEvent MYLEDAPHUS_HURT;
	public static final SoundEvent MYLEDAPHUS_DEATH;
	public static final SoundEvent GAR_HURT;
	public static final SoundEvent GAR_DEATH;
	public static final SoundEvent CYCLURUS_HURT;
	public static final SoundEvent CYCLURUS_DEATH;
	//Djadochta
	public static final SoundEvent PROTOCERATOPS_IDLE;
	public static final SoundEvent PROTOCERATOPS_HURT;
	public static final SoundEvent PROTOCERATOPS_WARN;
	public static final SoundEvent PROTOCERATOPS_DEATH;
	public static final SoundEvent VELOCIRAPTOR_IDLE;
	public static final SoundEvent VELOCIRAPTOR_HURT;
	public static final SoundEvent VELOCIRAPTOR_DEATH;
	public static final SoundEvent VELOCIRAPTOR_WARN;
	public static final SoundEvent CITIPATI_IDLE;
	public static final SoundEvent CITIPATI_HURT;
	public static final SoundEvent CITIPATI_DEATH;
	public static final SoundEvent CITIPATI_WARN;
	public static final SoundEvent AEPYORNITHOMIMUS_IDLE;
	public static final SoundEvent AEPYORNITHOMIMUS_HURT;
	public static final SoundEvent AEPYORNITHOMIMUS_DEATH;
	public static final SoundEvent TELMASAURUS_IDLE;
	public static final SoundEvent TELMASAURUS_HURT;
	public static final SoundEvent TELMASAURUS_DEATH;
	public static final SoundEvent PINACOSAURUS_IDLE;
	public static final SoundEvent PINACOSAURUS_HURT;
	public static final SoundEvent PINACOSAURUS_DEATH;
	public static final SoundEvent PINACOSAURUS_WARNING;
	public static final SoundEvent PLESIOHADROS_IDLE;
	public static final SoundEvent PLESIOHADROS_HURT;
	public static final SoundEvent PLESIOHADROS_DEATH;
	public static final SoundEvent PLESIOHADROS_WARNING;
	//Morrison
	public static final SoundEvent ALLOSAURUS_IDLE;
	public static final SoundEvent ALLOSAURUS_HURT;
	public static final SoundEvent ALLOSAURUS_WARN;
	public static final SoundEvent ALLOSAURUS_DEATH;
	public static final SoundEvent ALLOSAURUS_SNORES;
	public static final SoundEvent STEGOSAURUS_IDLE; 
	public static final SoundEvent STEGOSAURUS_HURT; 
	public static final SoundEvent STEGOSAURUS_WARN;
	public static final SoundEvent STEGOSAURUS_DEATH;
	public static final SoundEvent STEGOSAURUS_SNORES;
	public static final SoundEvent CERATOSAURUS_IDLE; 
	public static final SoundEvent CERATOSAURUS_HURT; 
	public static final SoundEvent CERATOSAURUS_WARN;
	public static final SoundEvent CERATOSAURUS_DEATH;
	public static final SoundEvent DRYOSAURUS_IDLE; 
	public static final SoundEvent DRYOSAURUS_HURT; 
	public static final SoundEvent DRYOSAURUS_DEATH;
	public static final SoundEvent HESPERORNITHOIDES_IDLE;
	public static final SoundEvent HESPERORNITHOIDES_HURT;
	public static final SoundEvent HESPERORNITHOIDES_DEATH;
	public static final SoundEvent CAMARASAURUS_IDLE; 
	public static final SoundEvent CAMARASAURUS_HURT; 
	public static final SoundEvent CAMARASAURUS_WARN; 
	public static final SoundEvent CAMARASAURUS_DEATH;
	public static final SoundEvent CAMARASAURUS_SNORES;
	public static final SoundEvent EILENODON_HURT;
	public static final SoundEvent EILENODON_DEATH;
	public static final SoundEvent POTAMOCERATODUS_HURT;
	public static final SoundEvent POTAMOCERATODUS_DEATH;
	public static final SoundEvent CERATODUS_HURT;
	public static final SoundEvent CERATODUS_DEATH;
	//Kayenta
	public static final SoundEvent DILOPHOSAURUS_IDLE;
	public static final SoundEvent DILOPHOSAURUS_HURT;
	public static final SoundEvent DILOPHOSAURUS_DEATH;
	public static final SoundEvent DILOPHOSAURUS_WARN;
	public static final SoundEvent SARAHSAURUS_IDLE;
	public static final SoundEvent SARAHSAURUS_HURT;
	public static final SoundEvent SARAHSAURUS_DEATH;
	public static final SoundEvent SARAHSAURUS_WARN;
	public static final SoundEvent MEGAPNOSAURUS_IDLE;
	public static final SoundEvent MEGAPNOSAURUS_HURT;
	public static final SoundEvent MEGAPNOSAURUS_DEATH;
	public static final SoundEvent MEGAPNOSAURUS_WARN;
	public static final SoundEvent SCELIDOSAURUS_IDLE;
	public static final SoundEvent SCELIDOSAURUS_HURT;
	public static final SoundEvent SCELIDOSAURUS_DEATH;
	public static final SoundEvent SCELIDOSAURUS_WARN;
	public static final SoundEvent SCUTELLOSAURUS_IDLE;
	public static final SoundEvent SCUTELLOSAURUS_HURT;
	public static final SoundEvent SCUTELLOSAURUS_DEATH;
	public static final SoundEvent CALSOYASUCHUS_IDLE;
	public static final SoundEvent CALSOYASUCHUS_HURT;
	public static final SoundEvent CALSOYASUCHUS_DEATH;
	public static final SoundEvent CALSOYASUCHUS_WARN;
	public static final SoundEvent KAYENTATHERIUM_IDLE;
	public static final SoundEvent KAYENTATHERIUM_HURT;
	public static final SoundEvent KAYENTATHERIUM_DEATH;
	//Chinle
	public static final SoundEvent COELOPHYSIS_IDLE;
	public static final SoundEvent COELOPHYSIS_HURT;
	public static final SoundEvent COELOPHYSIS_DEATH;
	public static final SoundEvent COELOPHYSIS_WARN;
	public static final SoundEvent DESMATOSUCHUS_IDLE;
	public static final SoundEvent DESMATOSUCHUS_HURT;
	public static final SoundEvent DESMATOSUCHUS_WARN;
	public static final SoundEvent DESMATOSUCHUS_DEATH;
	public static final SoundEvent TYPOTHORAX_IDLE;
	public static final SoundEvent TYPOTHORAX_HURT;
	public static final SoundEvent TYPOTHORAX_DEATH;
	public static final SoundEvent PLACERIAS_IDLE;
	public static final SoundEvent PLACERIAS_HURT;
	public static final SoundEvent PLACERIAS_WARN;
	public static final SoundEvent PLACERIAS_DEATH;
	public static final SoundEvent POPOSAURUS_IDLE;
	public static final SoundEvent POPOSAURUS_HURT;
	public static final SoundEvent POPOSAURUS_DEATH;
	public static final SoundEvent POPOSAURUS_WARN;
	public static final SoundEvent POSTOSUCHUS_IDLE;
	public static final SoundEvent POSTOSUCHUS_HURT;
	public static final SoundEvent POSTOSUCHUS_WARN;
	public static final SoundEvent POSTOSUCHUS_DEATH;
	public static final SoundEvent TRILOPHOSAURUS_IDLE;
	public static final SoundEvent TRILOPHOSAURUS_HURT;
	public static final SoundEvent TRILOPHOSAURUS_DEATH;
	public static final SoundEvent SAURICHTHYS_HURT;
	public static final SoundEvent SAURICHTHYS_DEATH;
	public static final SoundEvent ARGANODUS_HURT;
	public static final SoundEvent ARGANODUS_DEATH;
	public static final SoundEvent CHINLEA_HURT;
	public static final SoundEvent CHINLEA_DEATH;
	public static final SoundEvent MOOREODONTUS_HURT;
	public static final SoundEvent MOOREODONTUS_DEATH;
	//Ischigualasto
	public static final SoundEvent EXAERETODON_IDLE;
	public static final SoundEvent EXAERETODON_HURT;
	public static final SoundEvent EXAERETODON_WARN;
	public static final SoundEvent EXAERETODON_DEATH;
	public static final SoundEvent CHROMOGISAURUS_IDLE;
	public static final SoundEvent CHROMOGISAURUS_HURT;
	public static final SoundEvent CHROMOGISAURUS_DEATH;
	public static final SoundEvent HERRERASAURUS_IDLE;
	public static final SoundEvent HERRERASAURUS_HURT;
	public static final SoundEvent HERRERASAURUS_WARN;
	public static final SoundEvent HERRERASAURUS_DEATH;
	public static final SoundEvent HYPERODAPEDON_IDLE;
	public static final SoundEvent HYPERODAPEDON_HURT;
	public static final SoundEvent HYPERODAPEDON_DEATH;
	public static final SoundEvent SILLOSUCHUS_IDLE;
	public static final SoundEvent SILLOSUCHUS_HURT;
	public static final SoundEvent SILLOSUCHUS_WARN;
	public static final SoundEvent SILLOSUCHUS_DEATH;
	public static final SoundEvent SILLOSUCHUS_SNORES;
	public static final SoundEvent SAUROSUCHUS_IDLE;
	public static final SoundEvent SAUROSUCHUS_HURT;
	public static final SoundEvent SAUROSUCHUS_WARN;
	public static final SoundEvent SAUROSUCHUS_DEATH;
	public static final SoundEvent ISCHIGUALASTIA_IDLE;
	public static final SoundEvent ISCHIGUALASTIA_HURT;
	public static final SoundEvent ISCHIGUALASTIA_WARN;
	public static final SoundEvent ISCHIGUALASTIA_DEATH;
	//Overworld
	public static final SoundEvent HENOS_IDLE;
	public static final SoundEvent HENOS_HURT;
	public static final SoundEvent HENOS_DEATH;
	public static final SoundEvent HENOS_LASER;
	public static final SoundEvent HENOS_LASER_LOOP;
	//Misc
	public static final SoundEvent FISH_FLOP;
	
	@SubscribeEvent
	public static void registerSounds(final RegistryEvent.Register<SoundEvent> evt) {
		//Hell Creek
		evt.getRegistry().register(TRICERATOPS_HURT);
		evt.getRegistry().register(TRICERATOPS_IDLE);
		evt.getRegistry().register(TRICERATOPS_WARN);
		evt.getRegistry().register(TRICERATOPS_DEATH);
		evt.getRegistry().register(TRICERATOPS_SNORES);
		evt.getRegistry().register(TYRANNOSAURUS_HURT);
		evt.getRegistry().register(TYRANNOSAURUS_IDLE);
		evt.getRegistry().register(TYRANNOSAURUS_WARN);
		evt.getRegistry().register(TYRANNOSAURUS_DEATH);
		evt.getRegistry().register(TYRANNOSAURUS_SNORES);
		evt.getRegistry().register(ANKYLOSAURUS_IDLE);
		evt.getRegistry().register(ANKYLOSAURUS_HURT);
		evt.getRegistry().register(ANKYLOSAURUS_WARN);
		evt.getRegistry().register(ANKYLOSAURUS_DEATH);
		evt.getRegistry().register(ANKYLOSAURUS_SNORES);
		evt.getRegistry().register(DAKOTARAPTOR_IDLE);
		evt.getRegistry().register(DAKOTARAPTOR_HURT);
		evt.getRegistry().register(DAKOTARAPTOR_WARN);
		evt.getRegistry().register(DAKOTARAPTOR_DEATH);
		evt.getRegistry().register(THESCELOSAURUS_IDLE);
		evt.getRegistry().register(THESCELOSAURUS_HURT);
		evt.getRegistry().register(THESCELOSAURUS_DEATH);
		evt.getRegistry().register(DIDELPHODON_IDLE);
		evt.getRegistry().register(DIDELPHODON_HURT);
		evt.getRegistry().register(DIDELPHODON_DEATH);
		evt.getRegistry().register(BASILEMYS_IDLE);
		evt.getRegistry().register(BASILEMYS_HURT);
		evt.getRegistry().register(BASILEMYS_DEATH);
		evt.getRegistry().register(MYLEDAPHUS_HURT);
		evt.getRegistry().register(MYLEDAPHUS_DEATH);
		evt.getRegistry().register(GAR_HURT);
		evt.getRegistry().register(GAR_DEATH);
		evt.getRegistry().register(CYCLURUS_HURT);
		evt.getRegistry().register(CYCLURUS_DEATH);
		//Djadochta
		evt.getRegistry().register(PROTOCERATOPS_IDLE);
		evt.getRegistry().register(PROTOCERATOPS_WARN);
		evt.getRegistry().register(PROTOCERATOPS_HURT);
		evt.getRegistry().register(PROTOCERATOPS_DEATH);
		evt.getRegistry().register(VELOCIRAPTOR_IDLE);
		evt.getRegistry().register(VELOCIRAPTOR_HURT);
		evt.getRegistry().register(VELOCIRAPTOR_DEATH);
		evt.getRegistry().register(VELOCIRAPTOR_WARN);
		evt.getRegistry().register(CITIPATI_IDLE);
		evt.getRegistry().register(CITIPATI_HURT);
		evt.getRegistry().register(CITIPATI_DEATH);
		evt.getRegistry().register(CITIPATI_WARN);
		evt.getRegistry().register(AEPYORNITHOMIMUS_IDLE);
		evt.getRegistry().register(AEPYORNITHOMIMUS_HURT);
		evt.getRegistry().register(AEPYORNITHOMIMUS_DEATH);
		evt.getRegistry().register(TELMASAURUS_DEATH);
		evt.getRegistry().register(TELMASAURUS_IDLE);
		evt.getRegistry().register(TELMASAURUS_HURT);
		evt.getRegistry().register(PINACOSAURUS_DEATH);
		evt.getRegistry().register(PINACOSAURUS_HURT);
		evt.getRegistry().register(PINACOSAURUS_WARNING);
		evt.getRegistry().register(PINACOSAURUS_IDLE);
		evt.getRegistry().register(PLESIOHADROS_DEATH);
		evt.getRegistry().register(PLESIOHADROS_HURT);
		evt.getRegistry().register(PLESIOHADROS_IDLE);
		evt.getRegistry().register(PLESIOHADROS_WARNING);
		//Morrison
		evt.getRegistry().register(ALLOSAURUS_IDLE);
		evt.getRegistry().register(ALLOSAURUS_HURT);
		evt.getRegistry().register(ALLOSAURUS_WARN);
		evt.getRegistry().register(ALLOSAURUS_DEATH);
		evt.getRegistry().register(ALLOSAURUS_SNORES);
		evt.getRegistry().register(STEGOSAURUS_IDLE);
		evt.getRegistry().register(STEGOSAURUS_HURT);
		evt.getRegistry().register(STEGOSAURUS_WARN);
		evt.getRegistry().register(STEGOSAURUS_DEATH);
		evt.getRegistry().register(STEGOSAURUS_SNORES);
		evt.getRegistry().register(CERATOSAURUS_IDLE);
		evt.getRegistry().register(CERATOSAURUS_HURT);
		evt.getRegistry().register(CERATOSAURUS_WARN);
		evt.getRegistry().register(CERATOSAURUS_DEATH);
		evt.getRegistry().register(DRYOSAURUS_IDLE);
		evt.getRegistry().register(DRYOSAURUS_HURT);
		evt.getRegistry().register(DRYOSAURUS_DEATH);
		evt.getRegistry().register(HESPERORNITHOIDES_IDLE);
		evt.getRegistry().register(HESPERORNITHOIDES_HURT);
		evt.getRegistry().register(HESPERORNITHOIDES_DEATH);
		evt.getRegistry().register(CAMARASAURUS_IDLE);
		evt.getRegistry().register(CAMARASAURUS_HURT);
		evt.getRegistry().register(CAMARASAURUS_DEATH);
		evt.getRegistry().register(CAMARASAURUS_WARN);
		evt.getRegistry().register(CAMARASAURUS_SNORES);
		evt.getRegistry().register(EILENODON_HURT);
		evt.getRegistry().register(EILENODON_DEATH);
		evt.getRegistry().register(POTAMOCERATODUS_HURT);
		evt.getRegistry().register(POTAMOCERATODUS_DEATH);
		evt.getRegistry().register(CERATODUS_HURT);
		evt.getRegistry().register(CERATODUS_DEATH);
		//Kayenta
		evt.getRegistry().register(DILOPHOSAURUS_IDLE);
		evt.getRegistry().register(DILOPHOSAURUS_HURT);
		evt.getRegistry().register(DILOPHOSAURUS_DEATH);
		evt.getRegistry().register(DILOPHOSAURUS_WARN);
		evt.getRegistry().register(MEGAPNOSAURUS_IDLE);
		evt.getRegistry().register(MEGAPNOSAURUS_HURT);
		evt.getRegistry().register(MEGAPNOSAURUS_DEATH);
		evt.getRegistry().register(MEGAPNOSAURUS_WARN);
		evt.getRegistry().register(SARAHSAURUS_IDLE);
		evt.getRegistry().register(SARAHSAURUS_HURT);
		evt.getRegistry().register(SARAHSAURUS_DEATH);
		evt.getRegistry().register(SARAHSAURUS_WARN);
		evt.getRegistry().register(CALSOYASUCHUS_IDLE);
		evt.getRegistry().register(CALSOYASUCHUS_HURT);
		evt.getRegistry().register(CALSOYASUCHUS_DEATH);
		evt.getRegistry().register(CALSOYASUCHUS_WARN);
		evt.getRegistry().register(SCUTELLOSAURUS_IDLE);
		evt.getRegistry().register(SCUTELLOSAURUS_HURT);
		evt.getRegistry().register(SCUTELLOSAURUS_DEATH);
		evt.getRegistry().register(SCELIDOSAURUS_IDLE);
		evt.getRegistry().register(SCELIDOSAURUS_HURT);
		evt.getRegistry().register(SCELIDOSAURUS_DEATH);
		evt.getRegistry().register(SCELIDOSAURUS_WARN);
		evt.getRegistry().register(KAYENTATHERIUM_IDLE);
		evt.getRegistry().register(KAYENTATHERIUM_HURT);
		evt.getRegistry().register(KAYENTATHERIUM_DEATH);
		//Chinle
		evt.getRegistry().register(COELOPHYSIS_IDLE);
		evt.getRegistry().register(COELOPHYSIS_HURT);
		evt.getRegistry().register(COELOPHYSIS_DEATH);
		evt.getRegistry().register(COELOPHYSIS_WARN);
		evt.getRegistry().register(DESMATOSUCHUS_IDLE);
		evt.getRegistry().register(DESMATOSUCHUS_HURT);
		evt.getRegistry().register(DESMATOSUCHUS_DEATH);
		evt.getRegistry().register(DESMATOSUCHUS_WARN);
		evt.getRegistry().register(PLACERIAS_IDLE);
		evt.getRegistry().register(PLACERIAS_HURT);
		evt.getRegistry().register(PLACERIAS_DEATH);
		evt.getRegistry().register(PLACERIAS_WARN);
		evt.getRegistry().register(POPOSAURUS_IDLE);
		evt.getRegistry().register(POPOSAURUS_HURT);
		evt.getRegistry().register(POPOSAURUS_DEATH);
		evt.getRegistry().register(POPOSAURUS_WARN);
		evt.getRegistry().register(POSTOSUCHUS_IDLE);
		evt.getRegistry().register(POSTOSUCHUS_HURT);
		evt.getRegistry().register(POSTOSUCHUS_DEATH);
		evt.getRegistry().register(POSTOSUCHUS_WARN);
		evt.getRegistry().register(TRILOPHOSAURUS_IDLE);
		evt.getRegistry().register(TRILOPHOSAURUS_HURT);
		evt.getRegistry().register(TRILOPHOSAURUS_DEATH);
		evt.getRegistry().register(SAURICHTHYS_HURT);
		evt.getRegistry().register(SAURICHTHYS_DEATH);
		evt.getRegistry().register(CHINLEA_HURT);
		evt.getRegistry().register(CHINLEA_DEATH);
		evt.getRegistry().register(ARGANODUS_HURT);
		evt.getRegistry().register(ARGANODUS_DEATH);
		evt.getRegistry().register(MOOREODONTUS_HURT);
		evt.getRegistry().register(MOOREODONTUS_DEATH);
		evt.getRegistry().register(TYPOTHORAX_IDLE);
		evt.getRegistry().register(TYPOTHORAX_HURT);
		evt.getRegistry().register(TYPOTHORAX_DEATH);
		//Ischigualasto
		evt.getRegistry().register(EXAERETODON_IDLE);
		evt.getRegistry().register(EXAERETODON_HURT);
		evt.getRegistry().register(EXAERETODON_WARN);
		evt.getRegistry().register(EXAERETODON_DEATH);
		evt.getRegistry().register(CHROMOGISAURUS_IDLE);
		evt.getRegistry().register(CHROMOGISAURUS_HURT);
		evt.getRegistry().register(CHROMOGISAURUS_DEATH);
		evt.getRegistry().register(HERRERASAURUS_IDLE);
		evt.getRegistry().register(HERRERASAURUS_HURT);
		evt.getRegistry().register(HERRERASAURUS_WARN);
		evt.getRegistry().register(HERRERASAURUS_DEATH);
		evt.getRegistry().register(HYPERODAPEDON_IDLE);
		evt.getRegistry().register(HYPERODAPEDON_HURT);
		evt.getRegistry().register(HYPERODAPEDON_DEATH);
		evt.getRegistry().register(SILLOSUCHUS_IDLE);
		evt.getRegistry().register(SILLOSUCHUS_HURT);
		evt.getRegistry().register(SILLOSUCHUS_DEATH);
		evt.getRegistry().register(SILLOSUCHUS_WARN);
		evt.getRegistry().register(SILLOSUCHUS_SNORES);
		evt.getRegistry().register(SAUROSUCHUS_IDLE);
		evt.getRegistry().register(SAUROSUCHUS_HURT);
		evt.getRegistry().register(SAUROSUCHUS_WARN);
		evt.getRegistry().register(SAUROSUCHUS_DEATH);
		evt.getRegistry().register(ISCHIGUALASTIA_IDLE);
		evt.getRegistry().register(ISCHIGUALASTIA_HURT);
		evt.getRegistry().register(ISCHIGUALASTIA_WARN);
		evt.getRegistry().register(ISCHIGUALASTIA_DEATH);
		//Overworld
		evt.getRegistry().register(HENOS_IDLE);
		evt.getRegistry().register(HENOS_HURT);
		evt.getRegistry().register(HENOS_DEATH);
		evt.getRegistry().register(HENOS_LASER);
		evt.getRegistry().register(HENOS_LASER_LOOP);
		//Misc
		evt.getRegistry().register(FISH_FLOP);
	}
	
	private static SoundEvent createEvent(final String soundName) {
		final ResourceLocation soundID = new ResourceLocation(PrehistoricFauna.MOD_ID, soundName);
		return new SoundEvent(soundID).setRegistryName(soundID);
	}
	
	static {
		//Hell Creek
		TRICERATOPS_IDLE = createEvent("triceratops_idle");
		TRICERATOPS_HURT = createEvent("triceratops_hurt");
		TRICERATOPS_WARN = createEvent("triceratops_warn");
		TRICERATOPS_DEATH = createEvent("triceratops_death");
		TRICERATOPS_SNORES = createEvent("triceratops_snores");
		TYRANNOSAURUS_IDLE = createEvent("tyrannosaurus_idle");
		TYRANNOSAURUS_HURT = createEvent("tyrannosaurus_hurt");
		TYRANNOSAURUS_WARN = createEvent("tyrannosaurus_warn");
		TYRANNOSAURUS_DEATH = createEvent("tyrannosaurus_death");
		TYRANNOSAURUS_SNORES = createEvent("tyrannosaurus_snores");
		ANKYLOSAURUS_IDLE = createEvent("anklyosaurus_idle");
		ANKYLOSAURUS_HURT = createEvent("ankylosaurus_hurt");
		ANKYLOSAURUS_WARN = createEvent("ankylosaurus_warn");
		ANKYLOSAURUS_DEATH = createEvent("ankylosaurus_death");
		ANKYLOSAURUS_SNORES = createEvent("ankylosaurus_snores");
		DAKOTARAPTOR_IDLE = createEvent("dakotaraptor_idle");
		DAKOTARAPTOR_HURT = createEvent("dakotaraptor_hurt");
		DAKOTARAPTOR_WARN = createEvent("dakotaraptor_warn");
		DAKOTARAPTOR_DEATH = createEvent("dakotaraptor_death");
		THESCELOSAURUS_IDLE = createEvent("thescelosaurus_idle");
		THESCELOSAURUS_HURT = createEvent("thescelosaurus_hurt");
		THESCELOSAURUS_DEATH = createEvent("thescelosaurus_death");
		DIDELPHODON_IDLE = createEvent("didelphodon_idle");
		DIDELPHODON_HURT = createEvent("didelphodon_hurt");
		DIDELPHODON_DEATH = createEvent("didelphodon_death");
		BASILEMYS_IDLE = createEvent("basilemys_idle");
		BASILEMYS_HURT = createEvent("basilemys_hurt");
		BASILEMYS_DEATH = createEvent("basilemys_death");
		MYLEDAPHUS_HURT = createEvent("myledaphus_hurt");
		MYLEDAPHUS_DEATH = createEvent("myledaphus_death");
		GAR_HURT = createEvent("gar_hurt");
		GAR_DEATH = createEvent("gar_death");
		CYCLURUS_HURT = createEvent("cyclurus_hurt");
		CYCLURUS_DEATH = createEvent("cyclurus_death");
		//Djadochta
		PROTOCERATOPS_IDLE = createEvent("protoceratops_idle");
		PROTOCERATOPS_HURT = createEvent("protoceratops_hurt");
		PROTOCERATOPS_WARN = createEvent("protoceratops_warn");
		PROTOCERATOPS_DEATH = createEvent("protoceratops_death");
		VELOCIRAPTOR_IDLE = createEvent("velociraptor_idle");
		VELOCIRAPTOR_HURT = createEvent("velociraptor_hurt");
		VELOCIRAPTOR_DEATH = createEvent("velociraptor_death");
		VELOCIRAPTOR_WARN = createEvent("velociraptor_warn");
		CITIPATI_IDLE = createEvent("citipati_idle");
		CITIPATI_HURT = createEvent("citipati_hurt");
		CITIPATI_DEATH = createEvent("citipati_death");
		CITIPATI_WARN = createEvent("citipati_warn");
		AEPYORNITHOMIMUS_IDLE = createEvent("aepyornithomimus_idle");
		AEPYORNITHOMIMUS_HURT = createEvent("aepyornithomimus_hurt");
		AEPYORNITHOMIMUS_DEATH = createEvent("aepyornithomimus_death");
		TELMASAURUS_IDLE = createEvent("telmasaurus_idle");
		TELMASAURUS_HURT = createEvent("telmasaurus_hurt");
		TELMASAURUS_DEATH = createEvent("telmasaurus_death");
		PINACOSAURUS_IDLE = createEvent("pinacosaurus_idle");
		PINACOSAURUS_HURT = createEvent("pinacosaurus_hurt");
		PINACOSAURUS_DEATH = createEvent("pinacosaurus_death");
		PINACOSAURUS_WARNING = createEvent("pinacosaurus_warning");
		PLESIOHADROS_IDLE = createEvent("plesiohadros_idle");
		PLESIOHADROS_HURT = createEvent("plesiohadros_hurt");
		PLESIOHADROS_DEATH = createEvent("plesiohadros_death");
		PLESIOHADROS_WARNING = createEvent("plesiohadros_warning");
		//Morrison
		ALLOSAURUS_IDLE = createEvent("allosaurus_idle");
		ALLOSAURUS_HURT = createEvent("allosaurus_hurt");
		ALLOSAURUS_WARN = createEvent("allosaurus_warn");
		ALLOSAURUS_DEATH = createEvent("allosaurus_death");
		ALLOSAURUS_SNORES = createEvent("allosaurus_snores");
		STEGOSAURUS_IDLE = createEvent("stegosaurus_idle");
		STEGOSAURUS_HURT = createEvent("stegosaurus_hurt");
		STEGOSAURUS_WARN = createEvent("stegosaurus_warn");
		STEGOSAURUS_DEATH = createEvent("stegosaurus_death");
		STEGOSAURUS_SNORES = createEvent("stegosaurus_snores");
		CERATOSAURUS_IDLE = createEvent("ceratosaurus_idle");
		CERATOSAURUS_HURT = createEvent("ceratosaurus_hurt");
		CERATOSAURUS_WARN = createEvent("ceratosaurus_warn");
		CERATOSAURUS_DEATH = createEvent("ceratosaurus_death");
		DRYOSAURUS_IDLE = createEvent("dryosaurus_idle");
		DRYOSAURUS_HURT = createEvent("dryosaurus_hurt");
		DRYOSAURUS_DEATH = createEvent("dryosaurus_death");
		HESPERORNITHOIDES_IDLE = createEvent("hesperornithoides_idle");
		HESPERORNITHOIDES_HURT = createEvent("hesperornithoides_hurt");
		HESPERORNITHOIDES_DEATH = createEvent("hesperornithoides_death");
		CAMARASAURUS_IDLE = createEvent("camarasaurus_idle");
		CAMARASAURUS_HURT = createEvent("camarasaurus_hurt");
		CAMARASAURUS_WARN = createEvent("camarasaurus_warn");
		CAMARASAURUS_DEATH = createEvent("camarasaurus_death");
		CAMARASAURUS_SNORES = createEvent("camarasaurus_snores");
		EILENODON_HURT = createEvent("eilenodon_hurt");
		EILENODON_DEATH = createEvent("eilenodon_death");
		POTAMOCERATODUS_HURT = createEvent("potamoceratodus_hurt");
		POTAMOCERATODUS_DEATH = createEvent("potamoceratodus_death");
		CERATODUS_HURT = createEvent("ceratodus_hurt");
		CERATODUS_DEATH = createEvent("ceratodus_death");
		//Kayenta
		DILOPHOSAURUS_IDLE = createEvent("dilophosaurus_idle");
		DILOPHOSAURUS_HURT = createEvent("dilophosaurus_hurt");
		DILOPHOSAURUS_DEATH = createEvent("dilophosaurus_death");
		DILOPHOSAURUS_WARN = createEvent("dilophosaurus_warn");
		MEGAPNOSAURUS_IDLE = createEvent("megapnosaurus_idle");
		MEGAPNOSAURUS_HURT = createEvent("megapnosaurus_hurt");
		MEGAPNOSAURUS_DEATH = createEvent("megapnosaurus_death");
		MEGAPNOSAURUS_WARN = createEvent("megapnosaurus_warn");
		SARAHSAURUS_IDLE = createEvent("sarahsaurus_idle");
		SARAHSAURUS_HURT = createEvent("sarahsaurus_hurt");
		SARAHSAURUS_DEATH = createEvent("sarahsaurus_death");
		SARAHSAURUS_WARN = createEvent("sarahsaurus_warn");
		SCELIDOSAURUS_IDLE = createEvent("scelidosaurus_idle");
		SCELIDOSAURUS_HURT = createEvent("scelidosaurus_hurt");
		SCELIDOSAURUS_DEATH = createEvent("scelidosaurus_death");
		SCELIDOSAURUS_WARN = createEvent("scelidosaurus_warn");
		SCUTELLOSAURUS_IDLE = createEvent("scutellosaurus_idle");
		SCUTELLOSAURUS_HURT = createEvent("scutellosaurus_hurt");
		SCUTELLOSAURUS_DEATH = createEvent("scutellosaurus_death");
		CALSOYASUCHUS_IDLE = createEvent("calsoyasuchus_idle");
		CALSOYASUCHUS_HURT = createEvent("calsoyasuchus_hurt");
		CALSOYASUCHUS_DEATH = createEvent("calsoyasuchus_death");
		CALSOYASUCHUS_WARN = createEvent("calsoyasuchus_warn");
		KAYENTATHERIUM_IDLE = createEvent("kayentatherium_idle");
		KAYENTATHERIUM_HURT = createEvent("kayentatherium_hurt");
		KAYENTATHERIUM_DEATH = createEvent("kayentatherium_death");
		//Chinle
		COELOPHYSIS_IDLE = createEvent("coelophysis_idle");
		COELOPHYSIS_HURT = createEvent("coelophysis_hurt");
		COELOPHYSIS_DEATH = createEvent("coelophysis_death");
		COELOPHYSIS_WARN = createEvent("coelophysis_warn");
		DESMATOSUCHUS_IDLE = createEvent("desmatosuchus_idle");
		DESMATOSUCHUS_HURT = createEvent("desmatosuchus_hurt");
		DESMATOSUCHUS_DEATH = createEvent("desmatosuchus_death");
		DESMATOSUCHUS_WARN = createEvent("desmatosuchus_warn");
		PLACERIAS_IDLE = createEvent("placerias_idle");
		PLACERIAS_HURT = createEvent("placerias_hurt");
		PLACERIAS_DEATH = createEvent("placerias_death");
		PLACERIAS_WARN = createEvent("placerias_warn");
		POPOSAURUS_IDLE = createEvent("poposaurus_idle");
		POPOSAURUS_HURT = createEvent("poposaurus_hurt");
		POPOSAURUS_DEATH = createEvent("poposaurus_death");
		POPOSAURUS_WARN = createEvent("poposaurus_warn");
		POSTOSUCHUS_IDLE = createEvent("postosuchus_idle");
		POSTOSUCHUS_HURT = createEvent("postosuchus_hurt");
		POSTOSUCHUS_DEATH = createEvent("postosuchus_death");
		POSTOSUCHUS_WARN = createEvent("postosuchus_warn");
		TRILOPHOSAURUS_IDLE = createEvent("trilophosaurus_idle");
		TRILOPHOSAURUS_HURT = createEvent("trilophosaurus_hurt");
		TRILOPHOSAURUS_DEATH = createEvent("trilophosaurus_death");
		SAURICHTHYS_HURT = createEvent("saurichthys_hurt");
		SAURICHTHYS_DEATH = createEvent("saurichthys_death");
		ARGANODUS_HURT = createEvent("arganodus_hurt");
		ARGANODUS_DEATH = createEvent("arganodus_death");
		CHINLEA_HURT = createEvent("chinlea_hurt");
		CHINLEA_DEATH = createEvent("chinlea_death");
		MOOREODONTUS_HURT = createEvent("mooreodontus_hurt");
		MOOREODONTUS_DEATH = createEvent("mooreodontus_death");
		TYPOTHORAX_IDLE = createEvent("typothorax_idle");
		TYPOTHORAX_HURT = createEvent("typothorax_hurt");
		TYPOTHORAX_DEATH = createEvent("typothorax_death");
		//Ischigualasto
		EXAERETODON_IDLE = createEvent("exaeretodon_idle");
		EXAERETODON_HURT = createEvent("exaeretodon_hurt");
		EXAERETODON_WARN = createEvent("exaeretodon_warn");
		EXAERETODON_DEATH = createEvent("exaeretodon_death");
		CHROMOGISAURUS_IDLE = createEvent("chromogisaurus_idle");
		CHROMOGISAURUS_HURT = createEvent("chromogisaurus_hurt");
		CHROMOGISAURUS_DEATH = createEvent("chromogisaurus_death");
		HERRERASAURUS_IDLE = createEvent("herrerasaurus_idle");
		HERRERASAURUS_HURT = createEvent("herrerasaurus_hurt");
		HERRERASAURUS_WARN = createEvent("herrerasaurus_warn");
		HERRERASAURUS_DEATH = createEvent("herrerasaurus_death");
		HYPERODAPEDON_IDLE = createEvent("hyperodapedon_idle");
		HYPERODAPEDON_HURT = createEvent("hyperodapedon_hurt");
		HYPERODAPEDON_DEATH = createEvent("hyperodapedon_death");
		SILLOSUCHUS_IDLE = createEvent("sillosuchus_idle");
		SILLOSUCHUS_HURT = createEvent("sillosuchus_hurt");
		SILLOSUCHUS_WARN = createEvent("sillosuchus_warn");
		SILLOSUCHUS_DEATH = createEvent("sillosuchus_death");
		SILLOSUCHUS_SNORES = createEvent("sillosuchus_snores");
		SAUROSUCHUS_IDLE = createEvent("saurosuchus_idle");
		SAUROSUCHUS_HURT = createEvent("saurosuchus_hurt");
		SAUROSUCHUS_WARN = createEvent("saurosuchus_warn");
		SAUROSUCHUS_DEATH = createEvent("saurosuchus_death");
		ISCHIGUALASTIA_IDLE = createEvent("ischigualastia_idle");
		ISCHIGUALASTIA_HURT = createEvent("ischigualastia_hurt");
		ISCHIGUALASTIA_WARN = createEvent("ischigualastia_warn");
		ISCHIGUALASTIA_DEATH = createEvent("ischigualastia_death");
		//Overworld
		HENOS_IDLE = createEvent("henos_idle");
		HENOS_HURT = createEvent("henos_hurt");
		HENOS_DEATH = createEvent("henos_death");
		HENOS_LASER = createEvent("henos_laser");
		HENOS_LASER_LOOP = createEvent("henos_laser_loop");
		//Misc
		FISH_FLOP = createEvent("fish_flop");
	}

}
