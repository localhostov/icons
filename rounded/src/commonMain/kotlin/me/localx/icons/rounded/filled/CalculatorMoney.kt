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
                moveToRelative(12.0f, 13.0f)
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
                moveTo(18.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 0.0f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(3.139f)
                curveToRelative(0.633f, -0.091f, 1.302f, -0.139f, 2.0f, -0.139f)
                reflectiveCurveToRelative(1.367f, 0.048f, 2.0f, 0.139f)
                verticalLineToRelative(-2.139f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-5.469f)
                curveToRelative(0.655f, 0.574f, 1.112f, 1.25f, 1.328f, 2.0f)
                horizontalLineToRelative(1.14f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.365f, -0.617f, 2.569f, -1.687f, 3.5f)
                horizontalLineToRelative(6.687f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(23.999f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _calculatorMoney!!
    }

private var _calculatorMoney: ImageVector? = null
