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

public val Icons.Filled.ShoppingCartBuyer: ImageVector
    get() {
        if (_shoppingCartBuyer != null) {
            return _shoppingCartBuyer!!
        }
        _shoppingCartBuyer = Builder(name = "ShoppingCartBuyer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 18.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(23.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.311f, 0.0f, -0.604f, -0.145f, -0.793f, -0.392f)
                curveToRelative(-0.189f, -0.247f, -0.253f, -0.567f, -0.172f, -0.868f)
                curveToRelative(0.591f, -2.203f, 2.633f, -3.741f, 4.966f, -3.741f)
                reflectiveCurveToRelative(4.375f, 1.538f, 4.966f, 3.741f)
                curveToRelative(0.081f, 0.3f, 0.017f, 0.621f, -0.172f, 0.868f)
                curveToRelative(-0.189f, 0.247f, -0.482f, 0.392f, -0.793f, 0.392f)
                close()
                moveTo(23.319f, 4.098f)
                curveToRelative(-0.572f, -0.698f, -1.417f, -1.098f, -2.32f, -1.098f)
                lineTo(5.242f, 3.0f)
                lineToRelative(-0.041f, -0.351f)
                curveToRelative(-0.178f, -1.51f, -1.459f, -2.649f, -2.979f, -2.649f)
                horizontalLineToRelative(-1.222f)
                curveTo(0.448f, 0.0f, 0.0f, 0.448f, 0.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.222f)
                curveToRelative(0.507f, 0.0f, 0.934f, 0.38f, 0.993f, 0.883f)
                lineToRelative(1.376f, 11.701f)
                curveToRelative(0.296f, 2.518f, 2.431f, 4.416f, 4.966f, 4.416f)
                horizontalLineToRelative(4.443f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.443f)
                curveToRelative(-1.292f, 0.0f, -2.404f, -0.826f, -2.82f, -2.0f)
                horizontalLineToRelative(7.814f)
                curveToRelative(0.252f, -2.244f, 2.139f, -4.0f, 4.449f, -4.0f)
                curveToRelative(1.461f, 0.0f, 2.748f, 0.71f, 3.57f, 1.792f)
                lineToRelative(1.371f, -6.203f)
                curveToRelative(0.177f, -0.885f, -0.049f, -1.792f, -0.622f, -2.49f)
                close()
                moveTo(7.0f, 20.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _shoppingCartBuyer!!
    }

private var _shoppingCartBuyer: ImageVector? = null
