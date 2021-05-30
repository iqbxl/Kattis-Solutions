n, m = list(map(int, input().split()))
plain = input()[::-1]
ciphertext = list(input()[::-1]) # creates a list of char of the reversed ciphertext letters
key = []
ct_index = 0
while (ct_index < n):
    key.append((ord(ciphertext[ct_index]) - ord(plain[ct_index])) % 26 + 97)
    ciphertext[ct_index] = plain[ct_index]
    ct_index += 1
while (ct_index < m):
    key.append((ord(ciphertext[ct_index]) - key[ct_index - n]) % 26 + 97)
    ciphertext[ct_index] = chr(key[ct_index - n])
    ct_index += 1
print(''.join(ciphertext[::-1])) # join all items into a string