package mx.com.vd_store.service;

import mx.com.vd_store.entity.Console;

import java.util.List;

public interface ConsoleService {

    public List<Console> listAllConsoles();
    public Console createConsole(Console console);
    public List<Console> getByIdConsole(Integer idConsole);
    public List<Console> getByBrandConsole(String brandConsole);
    public List<Console> getByOrigin(String originConsole);
    public Console modifyConsole(Console console, Integer idConsole);
    public String deleteConsole(Integer idConsole);

}
