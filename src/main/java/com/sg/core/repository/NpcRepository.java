package com.sg.core.repository;

import com.sg.core.Npc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NpcRepository extends MongoRepository<Npc, Integer> {
}
