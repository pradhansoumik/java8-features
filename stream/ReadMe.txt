1. Stream does not store elements.
2. It simply carries elements from a source (such as a data structure, an array, or an I/O channel)
   through a pipeline of computational operations.
3. Operations performed on a stream does not modify its source.
    For example, filtering a Stream obtained from a collection produces a new Stream
    without the filtered elements, rather than removing elements from the source collection.
4. Stream is lazy and evaluates code only when required.