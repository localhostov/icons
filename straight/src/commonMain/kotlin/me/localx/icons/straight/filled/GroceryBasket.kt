package me.localx.icons.straight.filled

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

public val Icons.Filled.GroceryBasket: ImageVector
    get() {
        if (_groceryBasket != null) {
            return _groceryBasket!!
        }
        _groceryBasket = Builder(name = "GroceryBasket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 2.736f)
                verticalLineToRelative(-0.736f)
                horizontalLineToRelative(-1.0f)
                lineTo(3.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.736f)
                curveToRelative(0.0f, 0.698f, 0.143f, 1.377f, 0.425f, 2.017f)
                lineToRelative(0.896f, 2.033f)
                curveToRelative(0.174f, 0.395f, 0.305f, 0.802f, 0.413f, 1.214f)
                lineTo(2.267f, 8.0f)
                curveToRelative(0.108f, -0.412f, 0.238f, -0.819f, 0.413f, -1.214f)
                lineToRelative(0.896f, -2.033f)
                curveToRelative(0.282f, -0.64f, 0.425f, -1.318f, 0.425f, -2.017f)
                close()
                moveTo(23.879f, 10.0f)
                lineToRelative(-1.763f, 11.456f)
                curveToRelative(-0.226f, 1.474f, -1.473f, 2.544f, -2.965f, 2.544f)
                lineTo(4.849f, 24.0f)
                curveToRelative(-1.492f, 0.0f, -2.739f, -1.07f, -2.965f, -2.545f)
                lineTo(0.121f, 10.0f)
                horizontalLineToRelative(23.759f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(18.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(21.981f, 8.0f)
                curveToRelative(0.978f, -2.591f, 1.28f, -4.916f, 0.758f, -6.332f)
                curveToRelative(-0.326f, -0.887f, -0.897f, -1.291f, -1.319f, -1.474f)
                curveToRelative(-1.635f, -0.71f, -3.595f, 0.535f, -5.34f, 2.553f)
                lineToRelative(2.921f, 1.753f)
                lineToRelative(-1.029f, 1.715f)
                lineToRelative(-3.117f, -1.871f)
                curveToRelative(-0.552f, 0.799f, -1.065f, 1.651f, -1.513f, 2.517f)
                lineToRelative(-0.077f, 0.148f)
                curveToRelative(-0.12f, 0.232f, -0.304f, 0.586f, -0.508f, 0.99f)
                horizontalLineToRelative(9.226f)
                close()
            }
        }
        .build()
        return _groceryBasket!!
    }

private var _groceryBasket: ImageVector? = null
