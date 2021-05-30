import sys

for line in sys.stdin:
    if 'q' == line.rstrip():
        break
    pigLatin = ''
    sentence = line.split()
    for word in sentence:
        if word[0] == 'a' or word[0] == 'e' or word[0] == 'i' or word[0] == 'o' or word[0] == 'u' or word[0] == 'y':
            pigLatin += word + 'yay '
        else:
            for i, letter in enumerate(word):
                if letter == 'a' or letter == 'e' or letter == 'i' or letter == 'o' or letter == 'u' or letter == 'y':
                    pigLatin += word[i:] + word[:i] + 'ay '
                    break
    print(pigLatin + '\n')