package org.wecancodeit.librarydemo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface GenreRepository extends CrudRepository<Genre,Long> {

     Genre findById(long id);

     Optional<Genre> findByGenre(String genre);







}



























//public class ThreadId {
//    // Atomic integer containing the next thread ID to be assigned
//    private static final AtomicInteger nextId = new AtomicInteger(0);
//
//    // Thread local variable containing each thread's ID
//    private static final ThreadLocal<Integer> threadId =
//            new ThreadLocal<Integer>() {
//                @Override protected Integer initialValue() {
//                    return nextId.getAndIncrement();
//                }
//            };
//
//    // Returns the current thread's unique ID, assigning it if necessary
//    public static int get() {
//        return threadId.get();
//    }
//}