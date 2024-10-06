package cn.foggyhillside.dumplings_delight.registry;

import cn.foggyhillside.dumplings_delight.DumplingsDelight;
import cn.foggyhillside.dumplings_delight.loot.modifier.AddCalamariModifier;
import cn.foggyhillside.dumplings_delight.loot.modifier.DumplingsDelightAddTableLootModifier;
import com.mojang.serialization.Codec;
import io.github.fabricators_of_create.porting_lib.loot.IGlobalLootModifier;
import io.github.fabricators_of_create.porting_lib.loot.PortingLibLoot;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;

import java.util.function.Supplier;

public class DumplingsDelightLootModifiers {
    public static final LazyRegistrar<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS =
            LazyRegistrar.create(PortingLibLoot.GLOBAL_LOOT_MODIFIER_SERIALIZERS_KEY, DumplingsDelight.MOD_ID);

    public static final Supplier<Codec<AddCalamariModifier>> ADD_CALAMARI = LOOT_MODIFIERS.register("add_calamari", AddCalamariModifier.CODEC);
    public static final Supplier<Codec<DumplingsDelightAddTableLootModifier>> ADD_LOOT_TABLE = LOOT_MODIFIERS.register("add_loot_table", DumplingsDelightAddTableLootModifier.CODEC);
}
