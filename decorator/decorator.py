def friedChickenPrice():
	return 49.0

def dishOne(func):
	def wrapper():
		return func() + 30
	return wrapper

@dishOne
def dishOneFriedChickenPrice():
	return friedChickenPrice()

print(dishOneFriedChickenPrice())

