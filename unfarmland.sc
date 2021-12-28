// Turns farmland back to dirt when right-clicked with a hoe

__config() -> {'stay_loaded' -> true, 'scope' -> 'global'};

__on_player_right_clicks_block(player, item_tuple, hand, block, face, hitvec) -> (
    if(player~'gamemode_id' != 0 || block != 'farmland', return());

    [x, y, z] = pos(block);
    if(get(item_tuple, 0) ~ '_hoe$' && block(x,y+1,z) == 'air',
        schedule(0,_(pos)->set(pos,'dirt'),pos(block));
    )
)
