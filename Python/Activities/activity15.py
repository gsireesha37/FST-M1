from re import X


try:
    print=(X)
except NameError:
    print("x hasn't been defined yet.")