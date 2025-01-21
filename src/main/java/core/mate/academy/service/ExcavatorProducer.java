package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavator = new ArrayList<>();
        excavator.add(new Excavator("atlas", "black", 10, 10, "crawler"));
        excavator.add(new Excavator("hydrema", "white", 15, 15, "compact"));
        excavator.add(new Excavator("hitachi", "yellow", 20, 20, "long"));
        return excavator;
    }
}
