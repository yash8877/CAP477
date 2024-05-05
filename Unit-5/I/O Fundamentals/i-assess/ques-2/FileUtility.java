import java.util.*;

class FileUtility {
    public Client[] readFileData(BufferedReader reader) throws IOException {
        List<Client> clientsList = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            Integer clientId = Integer.parseInt(parts[0]);
            String name = parts[1];
            String email = parts[2];
            String phonenumber = parts[3];
            String country = parts[4];
            clientsList.add(new Client(clientId, name, email, phonenumber, country));
        }
        reader.close();
    
        clientsList.sort(Comparator.comparingInt(Client::getClientId));
        
        Client[] clientsArray = new Client[clientsList.size()];
        return clientsList.toArray(clientsArray);
    }

    public void writeDataToFile(Client[] clientArray) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv"));
        for (Client client : clientArray) {
            writer.write(client.toString());
            writer.newLine();
        }
        writer.close();
    }
}