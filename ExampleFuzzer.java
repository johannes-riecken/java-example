public class ExampleFuzzer {
  public static void fuzzerTestOneInput(byte[] data) {
    if (data.length >= 3 && data[0] == 'f' && data[1] == 'o' && data[2] == 'o') {
      throw new IllegalStateException("Not reached");
    }
  }
}
