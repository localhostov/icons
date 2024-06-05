package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.GroceryBasket: ImageVector
    get() {
        if (_groceryBasket != null) {
            return _groceryBasket!!
        }
        _groceryBasket = Builder(name = "GroceryBasket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.577f, 9.0f)
                curveToRelative(1.298f, -2.987f, 1.75f, -5.736f, 1.161f, -7.332f)
                curveToRelative(-0.326f, -0.887f, -0.897f, -1.291f, -1.319f, -1.474f)
                curveToRelative(-2.594f, -1.127f, -6.009f, 2.665f, -8.079f, 6.667f)
                curveToRelative(0.0f, 0.0f, -0.389f, 0.75f, -0.599f, 1.167f)
                curveToRelative(-0.108f, -0.422f, -0.242f, -0.839f, -0.42f, -1.242f)
                lineToRelative(-0.896f, -2.033f)
                curveToRelative(-0.282f, -0.64f, -0.425f, -1.318f, -0.425f, -2.017f)
                verticalLineToRelative(-0.736f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.736f)
                curveToRelative(0.0f, 0.698f, -0.143f, 1.377f, -0.425f, 2.017f)
                lineToRelative(-0.896f, 2.033f)
                curveToRelative(-0.314f, 0.71f, -0.512f, 1.452f, -0.609f, 2.214f)
                lineTo(-0.033f, 9.0f)
                lineToRelative(1.917f, 12.455f)
                curveToRelative(0.226f, 1.475f, 1.473f, 2.545f, 2.965f, 2.545f)
                horizontalLineToRelative(14.303f)
                curveToRelative(1.492f, 0.0f, 2.739f, -1.07f, 2.965f, -2.544f)
                lineToRelative(1.917f, -12.456f)
                horizontalLineToRelative(-2.456f)
                close()
                moveTo(16.03f, 6.184f)
                lineToRelative(1.955f, 1.173f)
                lineToRelative(1.029f, -1.715f)
                lineToRelative(-1.825f, -1.095f)
                curveToRelative(1.556f, -1.94f, 2.956f, -2.721f, 3.433f, -2.519f)
                curveToRelative(0.094f, 0.041f, 0.174f, 0.152f, 0.24f, 0.331f)
                curveToRelative(0.361f, 0.98f, 0.049f, 3.455f, -1.482f, 6.641f)
                horizontalLineToRelative(-4.891f)
                curveToRelative(0.221f, -0.441f, 0.419f, -0.821f, 0.547f, -1.067f)
                curveToRelative(0.0f, 0.0f, 0.686f, -1.261f, 0.993f, -1.748f)
                close()
                moveTo(4.51f, 7.593f)
                lineToRelative(0.896f, -2.033f)
                curveToRelative(0.395f, -0.896f, 0.595f, -1.846f, 0.595f, -2.823f)
                verticalLineToRelative(-0.736f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.736f)
                curveToRelative(0.0f, 0.978f, 0.2f, 1.927f, 0.595f, 2.823f)
                lineToRelative(0.896f, 2.033f)
                curveToRelative(0.2f, 0.453f, 0.334f, 0.925f, 0.417f, 1.407f)
                horizontalLineToRelative(-6.814f)
                curveToRelative(0.082f, -0.482f, 0.217f, -0.954f, 0.417f, -1.407f)
                close()
                moveTo(20.14f, 21.153f)
                curveToRelative(-0.075f, 0.491f, -0.491f, 0.848f, -0.988f, 0.848f)
                lineTo(4.849f, 22.001f)
                curveToRelative(-0.497f, 0.0f, -0.913f, -0.356f, -0.988f, -0.849f)
                lineToRelative(-1.562f, -10.151f)
                horizontalLineToRelative(19.402f)
                lineToRelative(-1.562f, 10.152f)
                close()
                moveTo(13.0f, 20.001f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(18.0f, 20.001f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(8.0f, 20.001f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _groceryBasket!!
    }

private var _groceryBasket: ImageVector? = null
