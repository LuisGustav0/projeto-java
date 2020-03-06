package com.arpia.tecnologia.gof.criacao.singleton;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

class Janela extends JFrame {

    private static Janela janela;

    static {
        janela = null;
    }

    private Janela() {
        setPreferredSize(new Dimension(640, 480));
    }

    static Janela getIstance() {
        return Optional.ofNullable(janela)
                       .orElse(new Janela());
    }
}
