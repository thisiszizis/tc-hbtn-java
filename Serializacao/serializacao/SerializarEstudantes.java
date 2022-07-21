import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

@SuppressWarnings("unchecked")
public class SerializarEstudantes<Estudante> {
    private final String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {

        try {
            FileOutputStream fout = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(estudantes);
        } catch (Exception e) {
            System.out.println("Nao foi possivel serializar");
        }
    }


    public List<Estudante> desserializar() {
        List<Estudante> estudantes = null;
        try {
            FileInputStream fin = new FileInputStream(nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fin);
            estudantes = (List<Estudante>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return estudantes;
    }
}