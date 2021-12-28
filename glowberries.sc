// Eating glowberries makes you glow for 10 seconds

__config() -> {'stay_loaded' -> true, 'scope' -> 'global'};

__on_player_finishes_using_item(player, item_tuple, hand)-> (
    if(get(item_tuple, 0) != 'glow_berries', return());

    modify(player, 'effect', 'glowing', 200)
)