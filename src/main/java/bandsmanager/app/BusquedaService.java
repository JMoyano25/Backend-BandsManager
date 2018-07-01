package bandsmanager.app;

import java.util.ArrayList;

public class BusquedaService {
    private ArrayList<Busqueda> _listaBusq;
    private BusquedaDAO _busqdao;
    private Integer _cont;

    public BusquedaService(){
        _cont = 0;
        _busqdao = new BusquedaDAO();
        _listaBusq= (ArrayList)_busqdao.traerBusquedas();

    }

    public Busqueda darUnaBusqueda(){
        if(!_listaBusq.isEmpty()){
            if(_listaBusq.size()<_cont){
                return _listaBusq.get(_cont);
            }
        }
        return null;
    }

    public void reiniciarContador(){
        _cont=0;
    }


}
