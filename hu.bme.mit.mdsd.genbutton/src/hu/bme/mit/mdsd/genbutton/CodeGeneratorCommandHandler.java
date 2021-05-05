package hu.bme.mit.mdsd.genbutton;

import inf.mit.bme.hu.research.cps.tosca.codegen.*;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import org.open.oasis.docs.tosca.tosca.*;

public class CodeGeneratorCommandHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Getting the active window
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			//Checking the selection
			ISelection selection = window.getSelectionService().getSelection();
			if (window.getSelectionService().getSelection() instanceof IStructuredSelection) {
				// Getting the selection
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				// Getting the single selected element
				if (structuredSelection.size() == 1) {
					Object firstElement = structuredSelection.getFirstElement();
					
					// Check if it is the right element
					if (firstElement instanceof DocumentRoot) {
						// We have the dataModel
						DocumentRoot model = (DocumentRoot) firstElement;
						
						// Let's generate the java classes from the entities
						CpsGenerator generator = new CpsGenerator(model);
						generator.generateCps();
//						if(generator.checkConstraints()) {
//							generator.generateEntities();
//						}
					}
					else showErrorMessage("The selected element isn't the instance of " + DocumentRoot.class.getCanonicalName()+
						"\n(Got: " + firstElement.getClass().getCanonicalName()+")");
				}
				else showErrorMessage("Select exactly one element!");
			}
		}
		else showErrorMessage("There isn't any active window!");
		
		return null;
	}
	
	/**
	 * Static method that shows an error message to the user
	 * @param errorMessage
	 */
	public static void showErrorMessage(String errorMessage) {
		MessageDialog messageDialog = new MessageDialog(
			null,
			"Error during code generation",
			null,
			errorMessage,
			MessageDialog.ERROR,
			new String[]{"Ok"}, 0);
		messageDialog.open();
	}

}
