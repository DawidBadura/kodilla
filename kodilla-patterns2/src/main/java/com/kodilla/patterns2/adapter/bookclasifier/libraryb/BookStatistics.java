package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int avargePublicationYear(Map<BookSignature, Book> books);
    int medianPublicationYaar(Map<BookSignature, Book> books);
}
