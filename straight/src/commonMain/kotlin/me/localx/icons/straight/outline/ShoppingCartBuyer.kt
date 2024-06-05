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

public val Icons.Outline.ShoppingCartBuyer: ImageVector
    get() {
        if (_shoppingCartBuyer != null) {
            return _shoppingCartBuyer!!
        }
        _shoppingCartBuyer = Builder(name = "ShoppingCartBuyer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(14.776f, 17.0f)
                horizontalLineToRelative(-6.998f)
                curveToRelative(-0.507f, 0.0f, -0.934f, -0.38f, -0.993f, -0.883f)
                lineToRelative(-0.131f, -1.117f)
                horizontalLineToRelative(7.897f)
                curveToRelative(0.082f, -0.732f, 0.32f, -1.417f, 0.711f, -2.0f)
                lineTo(6.419f, 13.0f)
                lineToRelative(-0.941f, -8.0f)
                horizontalLineToRelative(16.113f)
                lineToRelative(-1.272f, 6.22f)
                curveToRelative(0.69f, 0.213f, 1.314f, 0.572f, 1.819f, 1.064f)
                lineToRelative(1.857f, -9.284f)
                lineTo(5.242f, 3.0f)
                lineToRelative(-0.041f, -0.351f)
                curveToRelative(-0.178f, -1.51f, -1.459f, -2.649f, -2.979f, -2.649f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.222f)
                curveToRelative(0.507f, 0.0f, 0.934f, 0.38f, 0.993f, 0.883f)
                lineToRelative(1.584f, 13.468f)
                curveToRelative(0.178f, 1.51f, 1.459f, 2.649f, 2.979f, 2.649f)
                horizontalLineToRelative(5.247f)
                curveToRelative(0.507f, -0.67f, 1.169f, -1.213f, 1.944f, -1.56f)
                curveToRelative(-0.07f, -0.144f, -0.139f, -0.288f, -0.193f, -0.44f)
                close()
                moveTo(16.5f, 15.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _shoppingCartBuyer!!
    }

private var _shoppingCartBuyer: ImageVector? = null
