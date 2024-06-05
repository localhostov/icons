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

public val Icons.Filled.CalculatorMoney: ImageVector
    get() {
        if (_calculatorMoney != null) {
            return _calculatorMoney!!
        }
        _calculatorMoney = Builder(name = "CalculatorMoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(5.139f)
                curveToRelative(0.633f, -0.091f, 1.302f, -0.139f, 2.0f, -0.139f)
                reflectiveCurveToRelative(1.367f, 0.048f, 2.0f, 0.139f)
                verticalLineToRelative(-4.139f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-7.469f)
                curveToRelative(0.935f, 0.819f, 1.469f, 1.846f, 1.469f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.365f, -0.617f, 2.569f, -1.687f, 3.5f)
                horizontalLineToRelative(11.687f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(0.0f, 1.657f, -2.686f, 3.0f, -6.0f, 3.0f)
                reflectiveCurveTo(0.0f, 14.657f, 0.0f, 13.0f)
                reflectiveCurveToRelative(2.686f, -3.0f, 6.0f, -3.0f)
                reflectiveCurveToRelative(6.0f, 1.343f, 6.0f, 3.0f)
                close()
                moveTo(12.0f, 18.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.995f, -2.579f, 3.5f, -6.0f, 3.5f)
                reflectiveCurveToRelative(-6.0f, -1.505f, -6.0f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.971f, 2.5f, 3.5f, 6.0f, 3.5f)
                reflectiveCurveToRelative(6.0f, -1.529f, 6.0f, -3.5f)
                close()
                moveTo(12.0f, 14.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.995f, -2.579f, 3.5f, -6.0f, 3.5f)
                reflectiveCurveToRelative(-6.0f, -1.505f, -6.0f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.971f, 2.5f, 3.5f, 6.0f, 3.5f)
                reflectiveCurveToRelative(6.0f, -1.529f, 6.0f, -3.5f)
                close()
            }
        }
        .build()
        return _calculatorMoney!!
    }

private var _calculatorMoney: ImageVector? = null
