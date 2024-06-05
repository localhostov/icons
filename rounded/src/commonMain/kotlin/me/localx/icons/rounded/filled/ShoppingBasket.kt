package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(23.297f, 9.034f)
                curveToRelative(-0.57f, -0.657f, -1.396f, -1.034f, -2.267f, -1.034f)
                horizontalLineToRelative(-0.086f)
                curveTo(20.445f, 3.506f, 16.625f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.555f, 3.506f, 3.056f, 8.0f)
                horizontalLineToRelative(-0.056f)
                curveToRelative(-0.87f, 0.0f, -1.695f, 0.377f, -2.266f, 1.034f)
                reflectiveCurveTo(-0.093f, 10.562f, 0.03f, 11.425f)
                lineToRelative(1.061f, 7.424f)
                curveToRelative(0.42f, 2.937f, 2.974f, 5.151f, 5.94f, 5.151f)
                horizontalLineToRelative(9.969f)
                curveToRelative(2.966f, 0.0f, 5.52f, -2.215f, 5.94f, -5.151f)
                lineToRelative(1.061f, -7.424f)
                curveToRelative(0.123f, -0.862f, -0.134f, -1.733f, -0.704f, -2.391f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.52f, 0.0f, 6.441f, 2.613f, 6.928f, 6.0f)
                lineTo(5.072f, 8.0f)
                curveToRelative(0.487f, -3.387f, 3.408f, -6.0f, 6.928f, -6.0f)
                close()
                moveTo(8.0f, 19.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(13.0f, 19.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(18.0f, 19.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _shoppingBasket!!
    }

private var _shoppingBasket: ImageVector? = null
