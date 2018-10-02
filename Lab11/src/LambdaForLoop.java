import java.util.*;

//everett yang 111756324
//again like the previous one this is not supposed to actually do things
public class LambdaForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Album> sortedFavs = albums.stream()
				.filter(a -> a.tracks.anyMatch(t -> (t.rating >= 4)))
				.sorted(Comparator.comparing(a -> a.name))
				.collect(Collectors.toList());
	}

}
