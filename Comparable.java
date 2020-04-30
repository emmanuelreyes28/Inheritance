
public interface Comparable
{
	/*
	 * An interface is a mechanism for defining a "purely abstract class"
	 * 	-It's used when you want to specify a behavior that a class (and
	 * 	 subclasses) need to support without specifying any implementation details.
	 */
	
	//compares two objects: x.compareTo(y) such that
	//if x == y, return 0
	//if x < y, return -1
	//if x > y, return 1
	
	int compareTo(Object obj);

}
