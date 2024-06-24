package dsAlgoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsAlgoTreePage {
	
	public WebDriver driver;
	
	public DsAlgoTreePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h4[text()='Tree']") 
	public WebElement TreeHeader;
	
	@FindBy(linkText="Overview of Trees") 
	public WebElement OverviewOfTrees;
	
	@FindBy(xpath="//p[text()='Overview of Trees']") 
	public WebElement OverviewOfTreesHeader;
	
	@FindBy(linkText="Terminologies") 
	public WebElement Terminologies;
	
	@FindBy(xpath="//p[text()='Terminologies']") 
	public WebElement TerminologiesHeader;
	
	@FindBy(linkText="Types of Trees") 
	public WebElement TypesOfTrees;
	
	@FindBy(xpath="//p[text()='Types of Trees']") 
	public WebElement TypesOfTreesHeader;
	
	@FindBy(linkText="Tree Traversals") 
	public WebElement TreeTraversals;
	
	@FindBy(xpath="//p[text()='Tree Traversals']") 
	public WebElement TreeTraversalsHeader;
	
	@FindBy(linkText="Traversals-Illustration") 
	public WebElement TraversalsIllustration;
	
	@FindBy(xpath="//p[text()='Traversals-Illustration']") 
	public WebElement TraversalsIllustrationHeader;
	
	@FindBy(linkText="Binary Trees") 
	public WebElement BinaryTrees;
	
	@FindBy(xpath="//p[text()='Binary Trees']") 
	public WebElement BinaryTreesHeader;
	
	@FindBy(linkText="Types of Binary Trees") 
	public WebElement TypesOfBinaryTrees;
	
	@FindBy(xpath="//p[text()='Types of Binary Trees']") 
	public WebElement TypesOfBinaryTreesHeader;
	
	@FindBy(linkText="Binary Tree Traversals") 
	public WebElement BinaryTreeTraversals;
	
	@FindBy(xpath="//p[text()='Binary Tree Traversals']") 
	public WebElement BinaryTreeTraversalsHeader;
	
	@FindBy(linkText="Binary Search Trees") 
	public WebElement BinarySearchTrees;
	
	@FindBy(xpath="//p[text()='Binary Search Trees']") 
	public WebElement BinarySearchTreesHeader;
	
	@FindBy(linkText="Implementation Of BST") 
	public WebElement ImplementationOfBST;
	
	@FindBy(xpath="//p[text()='Implementation Of BST']") 
	public WebElement ImplementationOfBSTHeader;

}
