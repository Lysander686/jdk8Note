public i nt erface Comparable<T> {
i nt compareTo(T 七hat);
default boolean lessThan(T that) {
return ca叩釭eTo(that) < 0;
defa吐t boolean lessOrEquals(T that) (
return caapareTo(that) <= 0;
defa吐t boolean greaterThan(T that) {
return ca叩areTo(tbat) > 0;