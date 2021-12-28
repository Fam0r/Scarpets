// Fixes xp disappearing when teleporting across dimensions (visual)

__config() -> {'stay_loaded' -> true, 'scope' -> 'global'};

__command() -> (run('xp add @s 0');return());