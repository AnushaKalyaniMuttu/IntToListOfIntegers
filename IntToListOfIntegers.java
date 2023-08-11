int num = 12345;
List<Integer> digitsList = new ArrayList<>();
String numStr = String.valueOf(num);
Stream.of(numStr.split("")).mapToInt(Integer::parseInt).forEach(digitsList::add);

int num = 12345;
List<Integer> digitsList = new ArrayList<>();
String numStr = String.valueOf(num);
for (char c : numStr.toCharArray()) {
    digitsList.add(Character.getNumericValue(c));
}

int num = 12345;
List<Integer> digitsList = new ArrayList<>();
String numStr = String.valueOf(num);
Arrays.stream(numStr.split("")).mapToInt(Integer::parseInt).forEach(digitsList::add);



int num = 12345;
List<Integer> digitsList = new ArrayList<>();
String numStr = String.valueOf(num);
IntStream.range(0, numStr.length()).mapToObj(i -> Integer.parseInt(String.valueOf(numStr.charAt(i)))).forEach(digitsList::add);


