package me.localx.icons.straight.bold

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

public val Icons.Bold.ShoppingBasket: ImageVector
    get() {
        if (_shoppingBasket != null) {
            return _shoppingBasket!!
        }
        _shoppingBasket = Builder(name = "ShoppingBasket", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.944f, 8.0f)
                curveTo(20.445f, 3.506f, 16.625f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.555f, 3.506f, 3.056f, 8.0f)
                lineTo(0.084f, 8.0f)
                lineToRelative(1.91f, 13.01f)
                curveToRelative(0.251f, 1.705f, 1.74f, 2.99f, 3.463f, 2.99f)
                horizontalLineToRelative(13.111f)
                curveToRelative(1.725f, 0.0f, 3.213f, -1.286f, 3.463f, -2.991f)
                lineToRelative(1.91f, -13.009f)
                horizontalLineToRelative(-2.997f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(2.968f, 0.0f, 5.439f, 2.166f, 5.916f, 5.0f)
                lineTo(6.084f, 8.0f)
                curveToRelative(0.477f, -2.834f, 2.948f, -5.0f, 5.916f, -5.0f)
                close()
                moveTo(19.062f, 20.574f)
                curveToRelative(-0.035f, 0.242f, -0.248f, 0.426f, -0.494f, 0.426f)
                lineTo(5.457f, 21.0f)
                curveToRelative(-0.246f, 0.0f, -0.459f, -0.184f, -0.494f, -0.427f)
                lineToRelative(-1.406f, -9.573f)
                lineTo(20.469f, 11.0f)
                lineToRelative(-1.406f, 9.574f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _shoppingBasket!!
    }

private var _shoppingBasket: ImageVector? = null
