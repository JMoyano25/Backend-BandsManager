package bandsmanager.app;

public class NotificacionService implements AlgoritmoMatcheador {

    NotificacionDAO _notidao;
    private BusquedaService _busq ;
    private PostulacionService _pos ;

    public NotificacionService(){

        _notidao = new NotificacionDAO();
        _busq = new BusquedaService();
        _pos = new PostulacionService();

    }
    public void realizadorMatcheos(){

        for (int i = 0; i < _pos.getSize(); i++) {
            Postulacion postAct= _pos.darUnaPostulacion();
            for (int j = 0; j <_busq.getSize() ; j++) {
                Notificacion not = generarNotificacion(_busq.darUnaBusqueda(),postAct);
                if(not != null){
                    _notidao.guardarNotificacion(not);
                }
                _busq.aumentarCont();
            }
            _busq.reiniciarContador();
            _pos.aumentarCont();
        }
        _pos.reiniciarContador();
    }
    @Override
    public Notificacion generarNotificacion(Busqueda busq, Postulacion post) {
        Notificacion not = new Notificacion();
        if(busq.getInstrumento().equals( post.getInstrumento()) && busq.getGeneroMusical().equals(post.getGeneroMusical())){
            int dif = post.getAniosExperiencia()-busq.getAniosExperiencia();
            if(dif<1 && dif > -1){
                not.setMostrada(false);
                not.setDescripcion(String.valueOf(post.getId_musico())+"podria formar banda con "+String.valueOf(busq.getId_banda()));
                not.setId_banda(busq.getId_banda());
                not.setId_musico(post.getId_musico());
                return not;
            }
        }
        else{
            return null;
        }
        return null;
    }




}
