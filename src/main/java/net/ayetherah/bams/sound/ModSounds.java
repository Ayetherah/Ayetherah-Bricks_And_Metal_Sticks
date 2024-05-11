package net.ayetherah.bams.sound;

import net.ayetherah.bams.BricksAndMetalSticks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent BAMS_FULL_GRATE_BREAK = registerSoundEvent("bams_full_grate_break");
    public static final SoundEvent BAMS_FULL_GRATE_STEP = registerSoundEvent("bams_full_grate_step");
    public static final SoundEvent BAMS_FULL_GRATE_PLACE = registerSoundEvent("bams_full_grate_place");
    public static final SoundEvent BAMS_FULL_GRATE_HIT = registerSoundEvent("bams_full_grate_hit");
    public static final SoundEvent BAMS_FULL_GRATE_FALL = registerSoundEvent("bams_full_grate_fall");

    public static final BlockSoundGroup GRATE_SOUNDS = new BlockSoundGroup(1f , 1f,
            ModSounds.BAMS_FULL_GRATE_BREAK, ModSounds.BAMS_FULL_GRATE_STEP, ModSounds.BAMS_FULL_GRATE_PLACE,
            ModSounds.BAMS_FULL_GRATE_HIT, ModSounds.BAMS_FULL_GRATE_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(BricksAndMetalSticks.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        BricksAndMetalSticks.LOGGER.info("Registering Sounds for " + BricksAndMetalSticks.MOD_ID);
    }
}
