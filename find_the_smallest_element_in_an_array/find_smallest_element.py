def find_smallest_element(arr):
    if len(arr) == 0:
        return None  # Handle the case of an empty array

    smallest = min(arr)
    return smallest

# Example usage:
my_array = [5, 2, 9, 1, 5, 6]
smallest = find_smallest_element(my_array)
print("The smallest element is:", smallest)
