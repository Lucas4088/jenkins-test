package com.sg.core.service;

import com.sg.core.Npc;
import com.sg.core.repository.NpcRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

@Component
public class NpcService {
    private final NpcRepository npcRepository;

    public NpcService(NpcRepository npcRepository) {
        this.npcRepository = npcRepository;

        Npc npc1 = new Npc("Thomas", 1, 2);
        Npc npc2 = new Npc("Brad", 1, 3);
        Npc npc3 = new Npc("Derek", 1, 4);


        Hashtable<Integer, Npc> hashTable = new Hashtable<>();


        hashTable.put(1, npc1);
        hashTable.put(2, npc2);
        hashTable.put(3, npc3);

        npcRepository.deleteAll();

        hashTable.forEach(
                (integer, npc) -> npcRepository.insert(npc)
        );

        npcRepository.findAll().forEach(System.out::println);
    }
}
