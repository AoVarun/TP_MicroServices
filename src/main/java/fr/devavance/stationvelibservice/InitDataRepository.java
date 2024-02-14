package fr.devavance.stationvelibservice;
import fr.devavance.stationvelibservice.beans.StationVelib;
import fr.devavance.stationvelibservice.repository.StationVelibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.stream.Stream;

@Component
class InitDataRepository implements CommandLineRunner {
    @Autowired
    private StationVelibRepository stationVelibRepository;

    @Override
    public void run(String... strings) throws Exception {
        stationVelibRepository.findAll().forEach(stationVelib -> System.out.println(stationVelib));
        stationVelibRepository.save(new StationVelib("00901 - PORT SOLFÉRINO (STATION MOBILE)","QUAI ANATOLE FRANCE - PONT SOLFERINO - 75007 PARIS","QUAI ANATOLE FRANCE - PONT SOLFERINO -",48.8371336894515,2.37434055460561,1,0,901));
        stationVelibRepository.save(new StationVelib("00903 - QUAI MAURIAC  / PONT DE BERCY","FETE DE L'OH (BERCY) - QUAI MAURIAC ANG PONT DE BERCY - 75013 PARIS","FETE DE L'OH (BERCY) - QUAI MAURIAC ANG PONT DE BERCY -",48.8371336894515,2.37434055460561,1,0,903));
        stationVelibRepository.save(new StationVelib("00904 - PLACE JOFFRE / ECOLE MILITAIRE","ECOLE MILITAIRE-AVENUE DE LA MOTTE PICQUET - 75007 PARIS","ECOLE MILITAIRE-AVENUE DE LA MOTTE PICQUET -",48.85213620522547,2.301961227213259,1,0,904));
        stationVelibRepository.save(new StationVelib("00905 - CONCORDE/BERGES DE SEINE (STATION MOBILE)","QUAI D'ORSAY - CONCORDE - 75007 PARIS","QUAI D'ORSAY - CONCORDE -",48.86314,2.31669,1,0,905));


    }
}

