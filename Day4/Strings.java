/*
String: 
Strings are immutable(cannot be changed)
Strings are not thread safe


StringBuilder:
Mutable (can be modified), 
StringBuilder are not thread safe

StringBuffer:
Used in multi threading, 
Used to avoid overlapping operations
StringBuffer are thread safe

StringBuffer and StringBuilder are used to create mutable strings.
StringBuffer is synchronized, which means it is thread safe, but it is slower than StringBuilder because of synchronization. 
StringBuilder is faster than StringBuffer because it is not synchronized, but it is not thread safe.
