package patterns.structural.facade.problem;

public class VideoUploadProblem {
    public String upload(String fileName) {
        VideoReader reader = new VideoReader();
        Compressor compressor = new Compressor();
        ThumbnailGenerator thumbnails = new ThumbnailGenerator();
        Storage storage = new Storage();
        String raw = reader.read(fileName);
        String compressed = compressor.compress(raw);
        String thumbnail = thumbnails.generate(compressed);
        return storage.save(compressed, thumbnail);
    }

    static class VideoReader {
        String read(String fileName) {
            return "raw(" + fileName + ")";
        }
    }

    static class Compressor {
        String compress(String raw) {
            return "compressed(" + raw + ")";
        }
    }

    static class ThumbnailGenerator {
        String generate(String video) {
            return "thumbnail(" + video + ")";
        }
    }

    static class Storage {
        String save(String video, String thumbnail) {
            return "saved " + video + " with " + thumbnail;
        }
    }
}
