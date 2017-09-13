## Object Pool

With it it is possible to create an amount that you can limit and that are objects that will have a term already stipulated, what to avoid dispersion of resource. Suitable for heavy objects or a large number of objects.

You have to keep in mind the weight issue, if it's worth it, one of the indicators is that the frequency of creation of the target class is also high and the concurrent instances of the target class is relatively small.


> problems:
The way the object is redefined
Can spend a lot of memory depending on how it is implemented
Objects can be dropped but kept in the pool
