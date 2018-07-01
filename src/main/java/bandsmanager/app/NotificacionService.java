package bandsmanager.app;

public class NotificacionService {
    NotificacionDAO _notidao;

    public NotificacionService(){
        _notidao = new NotificacionDAO();
    }

    public void guardarNotificacion(Notificacion not){
        _notidao.guardarNotificacion(not);
    }


}
