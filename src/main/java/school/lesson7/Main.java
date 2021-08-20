package school.lesson7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;


class Main  {
    private static final String FILE_NAME = "C:\\Users\\Acer\\IdeaProjects\\myProject\\src\\main\\java\\school\\lesson7\\test.csv";

    public static void main(String[] args) throws IOException {
        String[] headers = new String[]{"Header1, Header2, Header3"};

        int[][] data = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6}
        };

        AppData appData = new AppData(headers, data);


        save(FILE_NAME, appData);
        AppData read = read(FILE_NAME);
        System.out.println(read);
    }
    private static void save(String fileName, AppData appData) throws IOException {
        Files.delete(Path.of(fileName));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            for (String header : appData.getHeaders()) {
                writer.append(header);
                writer.append(";");
            }
            writer.newLine();

            for (int line = 0; line < appData.getData().length; line++) {
                for (int dataItem : appData.getData()[line]) {
                    writer.append(String.valueOf(dataItem));
                    writer.append(";");
                }
                writer.newLine();
            }
        }
    }

    private static AppData read(String fileName) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(fileName));

        String[] headers = lines.get(0).split(";");
        int[][] data = new int[lines.size() - 1][];

        for (int line = 1; line < lines.size(); line++) {
            String[] stringDataLine = lines.get(line).split(";");
            int[] dataLine = Arrays.stream(stringDataLine)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            data[line - 1] = dataLine;
        }

        return new AppData(headers, data);
    }
}

