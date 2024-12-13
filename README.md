# AlertDialog in Android

An **AlertDialog** is a dialog box that provides the user with a message, options to confirm/cancel, or even custom layouts for user input. It is part of the Android framework and is widely used for user interactions.

---

## Key Features

- **Informative**: Display messages, warnings, or errors to the user.
- **Interactive**: Provide options like "OK" and "Cancel".
- **Customizable**: Supports custom views and layouts for advanced use cases.

---

## Basic Usage

### Step 1: Create an `AlertDialog`

Here’s how you can create a simple `AlertDialog` in Android:

```java
AlertDialog.Builder builder = new AlertDialog.Builder(context);
builder.setTitle("Alert Title");
builder.setMessage("This is an alert dialog example.");
builder.setPositiveButton("OK", (dialog, which) -> {
    // Handle OK button action
    dialog.dismiss();
});
builder.setNegativeButton("Cancel", (dialog, which) -> {
    // Handle Cancel button action
    dialog.dismiss();
});
AlertDialog alertDialog = builder.create();
alertDialog.show();
```

---

## Example Use Case

### Displaying a Confirmation Dialog

```java
AlertDialog.Builder builder = new AlertDialog.Builder(context);
builder.setTitle("Delete Item");
builder.setMessage("Are you sure you want to delete this item?");
builder.setPositiveButton("Yes", (dialog, which) -> {
    // Perform delete action
});
builder.setNegativeButton("No", (dialog, which) -> {
    // Cancel delete action
    dialog.dismiss();
});
builder.show();
```

---

## Adding a Custom Layout

You can use a custom XML layout for more advanced dialogs:

### XML Layout (`custom_dialog.xml`):

```xml
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="16dp"
    android:orientation="vertical">

    <EditText
        android:id="@+id/editTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter your name" />
</LinearLayout>
```

### Code to Show the Dialog:

```java
LayoutInflater inflater = LayoutInflater.from(context);
View customView = inflater.inflate(R.layout.custom_dialog, null);

AlertDialog.Builder builder = new AlertDialog.Builder(context);
builder.setTitle("Custom Dialog");
builder.setView(customView);
builder.setPositiveButton("Submit", (dialog, which) -> {
    EditText editText = customView.findViewById(R.id.editTextInput);
    String input = editText.getText().toString();
    // Handle the input
});
builder.setNegativeButton("Cancel", (dialog, which) -> {
    dialog.dismiss();
});

builder.show();
```

---

## Best Practices

1. **Use Context Carefully**:
   - Ensure that the context used to create the dialog is still valid when the dialog is displayed.

2. **Avoid Overusing**:
   - Too many dialogs can disrupt the user experience.

3. **Dismiss Dialogs**:
   - Always dismiss dialogs after handling user actions to prevent memory leaks.

---

## Resources

- [AlertDialog Documentation](https://developer.android.com/reference/android/app/AlertDialog)
- [Material Design Guidelines](https://material.io/components/dialogs)
