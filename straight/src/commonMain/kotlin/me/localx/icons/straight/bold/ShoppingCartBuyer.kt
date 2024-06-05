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
                moveToRelative(9.014f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(-6.581f)
                curveToRelative(-0.25f, 0.0f, -0.462f, -0.187f, -0.496f, -0.434f)
                lineToRelative(-0.875f, -6.566f)
                horizontalLineToRelative(13.995f)
                lineToRelative(-0.567f, 2.048f)
                curveToRelative(1.062f, 0.102f, 2.021f, 0.527f, 2.784f, 1.188f)
                lineToRelative(1.727f, -6.236f)
                lineTo(5.648f, 5.0f)
                lineToRelative(-0.262f, -1.962f)
                curveToRelative(-0.23f, -1.731f, -1.722f, -3.038f, -3.469f, -3.038f)
                lineTo(0.014f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.903f)
                curveToRelative(0.25f, 0.0f, 0.462f, 0.187f, 0.496f, 0.434f)
                lineToRelative(1.537f, 11.528f)
                curveToRelative(0.23f, 1.731f, 1.722f, 3.038f, 3.469f, 3.038f)
                horizontalLineToRelative(7.604f)
                curveToRelative(-0.633f, -0.838f, -1.023f, -1.869f, -1.023f, -3.0f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _shoppingCartBuyer!!
    }

private var _shoppingCartBuyer: ImageVector? = null
