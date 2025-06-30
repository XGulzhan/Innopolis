#include <gtest/gtest.h>
#include "queue.h"  // Предполагается, что интерфейс класса Queue находится здесь

class QueueTest : public ::testing::Test {
protected:
    void SetUp() override {
        queue_.push(1);
    }
   
    Queue<int> queue_; 

};
// Тест функции push
TEST_F(QueueTest, PushAddsElement) {
   queue_.push(42);
    EXPECT_EQ(queue_.size(), 2);
}

// Тест функции pop
TEST_F(QueueTest, PopRemovesElement) {
    queue_.pop();
    EXPECT_TRUE(queue_.empty());
    EXPECT_EQ(queue_.size(), 0);
}