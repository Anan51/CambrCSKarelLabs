N = input("")
array = []
for i in N*15:
  if i % 3 == 0 or i % 5 == 0:
    array.append("Moo")
  else:
    array.append(i)
for i in array:
  if i == "Moo":
    array.pop(i)
return array[N]
