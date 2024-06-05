package me.localx.icons.rounded.bold

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
                moveTo(23.201f, 9.181f)
                curveToRelative(-0.549f, -0.636f, -1.313f, -1.042f, -2.142f, -1.151f)
                curveTo(20.511f, 3.512f, 16.658f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.486f, 3.514f, 2.941f, 8.034f)
                curveToRelative(-0.818f, 0.115f, -1.569f, 0.519f, -2.113f, 1.147f)
                curveTo(0.193f, 9.915f, -0.09f, 10.883f, 0.05f, 11.838f)
                lineToRelative(1.011f, 6.894f)
                curveToRelative(0.441f, 3.004f, 3.108f, 5.269f, 6.203f, 5.269f)
                horizontalLineToRelative(9.502f)
                curveToRelative(3.095f, 0.0f, 5.762f, -2.265f, 6.203f, -5.269f)
                lineToRelative(1.011f, -6.894f)
                curveToRelative(0.14f, -0.955f, -0.144f, -1.924f, -0.778f, -2.657f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(2.99f, 0.0f, 5.487f, 2.157f, 6.02f, 5.0f)
                lineTo(5.98f, 8.0f)
                curveToRelative(0.534f, -2.843f, 3.03f, -5.0f, 6.02f, -5.0f)
                close()
                moveTo(21.011f, 11.402f)
                lineToRelative(-1.011f, 6.894f)
                curveToRelative(-0.227f, 1.541f, -1.617f, 2.704f, -3.234f, 2.704f)
                lineTo(7.264f, 21.0f)
                curveToRelative(-1.617f, 0.0f, -3.008f, -1.163f, -3.234f, -2.704f)
                lineToRelative(-1.011f, -6.894f)
                curveToRelative(-0.015f, -0.096f, 0.013f, -0.183f, 0.079f, -0.26f)
                curveToRelative(0.046f, -0.054f, 0.149f, -0.143f, 0.324f, -0.143f)
                lineTo(20.608f, 10.999f)
                curveToRelative(0.175f, 0.0f, 0.277f, 0.089f, 0.323f, 0.142f)
                curveToRelative(0.046f, 0.054f, 0.097f, 0.142f, 0.079f, 0.261f)
                close()
                moveTo(16.0f, 14.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(11.0f, 14.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _shoppingBasket!!
    }

private var _shoppingBasket: ImageVector? = null
