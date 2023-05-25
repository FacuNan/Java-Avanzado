package com.OpenBootcamp.OpneBootcamp.service;

import com.OpenBootcamp.OpneBootcamp.models.Bootcamper;
import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Service
@Component
public class BootcamperService {
    private final List<Bootcamper> bootcampers = new ArrayList();

    public List<Bootcamper> getAll() {
        return bootcampers;
    }

    public void add(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }

    public Bootcamper get(String nombre) {
        for (Bootcamper bootcamper : bootcampers) {
            if (bootcamper.getNombre().equalsIgnoreCase(nombre)) {
                return bootcamper;
            }
        }

        return null;
    }
}
