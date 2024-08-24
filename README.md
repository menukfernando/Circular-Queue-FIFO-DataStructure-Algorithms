## Circular Queue

<img src="https://media.geeksforgeeks.org/wp-content/uploads/Circular-queue.png" />

A **Circular Queue** is a linear data structure that follows the **First In First Out (FIFO)** principle but differs from a standard queue in its underlying implementation. In a Circular Queue, the last position is connected back to the first position to make a circle. It is also known as a **Ring Buffer**.

## Key Concepts

### 1. **Circular Nature**
   - Unlike a linear queue, a Circular Queue does not end after the last position. Instead, it connects back to the first position, making it ideal for situations where memory space is a constraint and you need to reuse it efficiently.

### 2. **Fixed Size**
   - The size of the Circular Queue is fixed, meaning that once it is full, no more elements can be inserted until some are removed.

### 3. **Efficient Use of Space**
   - Circular Queues prevent the wastage of space that occurs in a standard queue when elements are dequeued and the `front` pointer moves forward. In a Circular Queue, the `front` pointer wraps around to the beginning of the array when it reaches the end.

### 4. **Pointers**
   - **Front Pointer (`front`)**: Points to the first element in the queue.
   - **Rear Pointer (`rear`)**: Points to the last element in the queue.

### 5. **Key Operations**
   - **Enqueue (Insert)**: Adds an element to the rear of the queue.
   - **Dequeue (Remove)**: Removes an element from the front of the queue.
   - **Peek**: Retrieves the front element without removing it.
   - **Is Full**: Checks if the queue is full.
   - **Is Empty**: Checks if the queue is empty.

### 6. **Circular Queue Use Cases**
   - **Buffer Management**: Used in scenarios like buffering data streams, where old data needs to be replaced by new data.
   - **Task Scheduling**: Helps in managing tasks in a round-robin fashion.
   - **Memory Management**: Used in memory management systems where fixed-sized buffers are employed.
