// Fixes xp disappearing when teleporting across dimensions (visual)

__config() -> {'stay_loaded' -> true, 'scope' -> 'global'};

__command() -> (run('xp add @s 0');return());

// Run on every dimension change
__on_player_changes_dimension(player, from_pos, from_dimension, to_pos, to_dimension) -> (run('xp add @s 0');return());