package bandsmanager.app;


import java.util.ArrayList;

public class PostulacionService {
    private ArrayList<Postulacion> _listaPostu;
    private PostulacionDAO _postudao;
    private Integer _cont;

    public PostulacionService(){
        _cont = 0;
        _postudao = new PostulacionDAO();
        _listaPostu = (ArrayList) _postudao.traerPostulaciones();

    }

    public Postulacion darUnaPostulacion(){
        if(!_listaPostu.isEmpty()){
            if(_listaPostu.size()<_cont){
                return _listaPostu.get(_cont);
            }
        }
        return null;
    }

    public void setCont(int num){
        _cont=num;
    }
}
