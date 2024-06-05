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

public val Icons.Bold.ShoppingCartBuyer: ImageVector
    get() {
        if (_shoppingCartBuyer != null) {
            return _shoppingCartBuyer!!
        }
        _shoppingCartBuyer = Builder(name = "ShoppingCartBuyer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 16.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.249f)
                curveToRelative(-1.747f, 0.0f, -3.239f, -1.306f, -3.469f, -3.038f)
                lineTo(2.245f, 3.434f)
                curveToRelative(-0.033f, -0.248f, -0.246f, -0.434f, -0.496f, -0.434f)
                horizontalLineToRelative(-0.249f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveTo(0.671f, 0.0f, 1.5f, 0.0f)
                horizontalLineToRelative(0.249f)
                curveToRelative(1.747f, 0.0f, 3.239f, 1.306f, 3.469f, 3.038f)
                lineToRelative(0.262f, 1.962f)
                horizontalLineToRelative(15.082f)
                curveToRelative(1.085f, 0.0f, 2.091f, 0.491f, 2.759f, 1.346f)
                curveToRelative(0.668f, 0.855f, 0.9f, 1.95f, 0.637f, 3.003f)
                lineToRelative(-0.129f, 0.516f)
                curveToRelative(-0.17f, 0.681f, -0.782f, 1.136f, -1.454f, 1.136f)
                curveToRelative(-0.121f, 0.0f, -0.243f, -0.015f, -0.365f, -0.045f)
                curveToRelative(-0.804f, -0.201f, -1.292f, -1.016f, -1.091f, -1.819f)
                lineToRelative(0.129f, -0.515f)
                curveToRelative(0.051f, -0.206f, -0.035f, -0.356f, -0.091f, -0.428f)
                curveToRelative(-0.056f, -0.072f, -0.182f, -0.192f, -0.394f, -0.192f)
                lineTo(5.88f, 8.002f)
                lineToRelative(0.875f, 6.566f)
                curveToRelative(0.033f, 0.248f, 0.246f, 0.434f, 0.496f, 0.434f)
                horizontalLineToRelative(5.249f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(7.0f, 20.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 19.0f)
                curveToRelative(-2.28f, 0.0f, -4.218f, 1.403f, -4.927f, 3.358f)
                curveToRelative(-0.29f, 0.801f, 0.316f, 1.642f, 1.2f, 1.642f)
                horizontalLineToRelative(7.453f)
                curveToRelative(0.884f, 0.0f, 1.49f, -0.841f, 1.2f, -1.642f)
                curveToRelative(-0.708f, -1.955f, -2.647f, -3.358f, -4.927f, -3.358f)
                close()
            }
        }
        .build()
        return _shoppingCartBuyer!!
    }

private var _shoppingCartBuyer: ImageVector? = null
