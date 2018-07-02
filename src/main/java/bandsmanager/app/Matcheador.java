package bandsmanager.app;




public class Matcheador implements AlgoritmoMatcheador {

    private BusquedaService _busq ;
    private NotificacionService _not ;
    private PostulacionService _pos ;

    public Matcheador(){
        _busq = new BusquedaService();
        _not = new NotificacionService();
        _pos = new PostulacionService();
    }
    public void realizadorMatcheos(){

        for (int i = 0; i < _pos.getSize(); i++) {
            Postulacion postAct= _pos.darUnaPostulacion();
            for (int j = 0; j <_busq.getSize() ; j++) {
                Notificacion not = generarNotificacion(_busq.darUnaBusqueda(),postAct);
                if(not != null){
                    _not.guardarNotificacion(not);

                }
            }
            _busq.reiniciarContador();
        }
        _pos.reiniciarContador();
    }
    @Override
    public Notificacion generarNotificacion(Busqueda busq, Postulacion post) {
        Notificacion not = new Notificacion();
        if(busq.getInstrumento().equals( post.getInstrumento())){
            int dif = post.getAniosExperiencia()-busq.getAniosExperiencia();
            if(dif<1 && dif > -1){
                not.setMostrada(false);
                not.setDescripcion(String.valueOf(post.getId())+"tiene coincidencias con "+String.valueOf(busq.getId()));
                return not;
            }
        }
        else{
            return null;
        }
        return null;
    }
}
