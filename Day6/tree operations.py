class Node:
	def __init__(self,value):
		self.left=None
		self.right=None
		self.data=value


def preorder(temp):
	#Function to print in preorder
	if temp:
		print(temp.data,",",end="")
		preorder(temp.left)
		preorder(temp.right)

definorder(temp):
	#Function to print in inorder
	if temp:
		inorder(temp.left)
		print(temp.data,",",end="")
		inorder(temp.right)
defpostorder(temp):
	#Function to print in postorder
	if temp:
		postorder(temp.left)
		postorder(temp.right)
		print(temp.data,",",end="")
def insert(temp,value):
	#Function to insert a Node in the Binary Search Tree
	if temp==None:
		newNode=Node(value)
		returnnewNode
	else:
		#If the value is <= temp's data insert into left sub-tree
		if value<=temp.data:
			temp.left=insert(temp.left,value)
		#If the value is > temp's data insert into right sub-tree
		else:
			temp.right=insert(temp.right,value)
		return temp
def create():
	#Function to print in create the Binary Tree
	root=None
	n=int(input("Enter the number of elements you want to enter \t"))
	
	for i in range(0,n):
		print("Enter the ",i,"th element\t")
		value=int(input())
		root=insert(root,value)
	return root
def search(root,value):
	#Function to search a node in a binary search tree.
	temp=root
	while(temp):
		#If temp's data is equal to the value, then the node exist.
		if(temp.data==value):
			print("The value ",value," exists in the binary tree.")
			return
		#If value < temp's data then search in the left sub-tree. 
		elif value<temp.data:
			temp=temp.left
		#If value > temp's data then search in the right sub-tree.
		else:
			temp=temp.right
	print("The value ",value," does not exits in the binary tree.")

def inorderSuccessor(temp):

	t=temp
	#Loop down to find the leftmost leaf node.
	while(t and t.left):
		t=t.left
	return t

defdeleteNode(temp,value):
	#Function to delete a node from binary search tree.
	if(temp==None):
		print("The value ",value," does not exits in the binary tree.")
		return temp
		#If the value to be deleted is smaller than the temp's key, then it lies in left sub-tree 
	if value<temp.data:
		temp.left=deleteNode(temp.left,value)
    #If the value to be deleted is greater than the temp's key, then it lies in right sub-tree
	elif(value>temp.data):
		temp.right=deleteNode(temp.right,value)
	else:
		#node with only one child or no child
		iftemp.left==None:
			t=temp.right
			return t
		eliftemp.right==None:
			t=temp.left
			return t
		#For node with two children find the inorder successor tsubtree
		t=inorderSuccessor(temp.right)
		#Copy the inorder successor's content to this node
		temp.data=t.data
		temp.right=deleteNode(temp.right,t.data)
	return temp


print("Binary Search Tree")
root=create()
print("\nThe preorder traversal of tree is: ")
preorder(root)
print("\nTheinorder traversal of tree is: ")
inorder(root)
print("\nThepostorder traversal of tree is: ")
postorder(root)
value=int(input("\nEnter the element you want to search\t"))
search(root,value)
value=int(input("Enter the element you want to delete\t"))
root=deleteNode(root,value)
print("\nThe preorder traversal of tree -after deletion- is: \n")
preorder(root)
print("\nTheinorder traversal of -tree after deletion- is: \n")
inorder(root)
print("\nThepostorder traversal of -tree after deletion- is: \n")
postorder(root)
