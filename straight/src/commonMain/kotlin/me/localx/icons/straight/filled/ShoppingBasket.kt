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

public val Icons.Filled.ShoppingBasket: ImageVector
    get() {
        if (_shoppingBasket != null) {
            return _shoppingBasket!!
        }
        _shoppingBasket = Builder(name = "ShoppingBasket", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.941f, 8.0f)
                curveTo(20.442f, 3.507f, 16.625f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.558f, 3.507f, 3.059f, 8.0f)
                lineTo(-0.021f, 8.0f)
                lineToRelative(1.918f, 13.425f)
                curveToRelative(0.21f, 1.468f, 1.486f, 2.575f, 2.97f, 2.575f)
                horizontalLineToRelative(14.266f)
                curveToRelative(1.483f, 0.0f, 2.76f, -1.107f, 2.97f, -2.575f)
                lineToRelative(1.918f, -13.425f)
                horizontalLineToRelative(-3.079f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.519f, 0.0f, 6.432f, 2.614f, 6.92f, 6.0f)
                lineTo(5.08f, 8.0f)
                curveToRelative(0.488f, -3.386f, 3.401f, -6.0f, 6.92f, -6.0f)
                close()
                moveTo(8.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _shoppingBasket!!
    }

private var _shoppingBasket: ImageVector? = null
