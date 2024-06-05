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

public val Icons.Bold.CalculatorMoney: ImageVector
    get() {
        if (_calculatorMoney != null) {
            return _calculatorMoney!!
        }
        _calculatorMoney = Builder(name = "CalculatorMoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 10.0f)
                verticalLineToRelative(10.25f)
                curveToRelative(0.0f, 2.173f, -2.523f, 3.75f, -6.0f, 3.75f)
                reflectiveCurveToRelative(-6.0f, -1.577f, -6.0f, -3.75f)
                verticalLineToRelative(-10.25f)
                curveToRelative(0.0f, -2.28f, 2.579f, -4.0f, 6.0f, -4.0f)
                reflectiveCurveToRelative(6.0f, 1.72f, 6.0f, 4.0f)
                close()
                moveTo(3.0f, 10.014f)
                verticalLineToRelative(0.006f)
                curveToRelative(0.085f, 0.248f, 1.127f, 0.98f, 3.0f, 0.98f)
                curveToRelative(1.843f, 0.0f, 2.881f, -0.708f, 2.996f, -1.0f)
                curveToRelative(-0.115f, -0.292f, -1.153f, -1.0f, -2.996f, -1.0f)
                curveToRelative(-1.873f, 0.0f, -2.915f, 0.732f, -3.0f, 1.014f)
                close()
                moveTo(3.0f, 15.0f)
                curveToRelative(0.077f, 0.263f, 1.121f, 1.0f, 3.0f, 1.0f)
                reflectiveCurveToRelative(2.915f, -0.732f, 3.0f, -1.014f)
                verticalLineToRelative(-1.491f)
                curveToRelative(-0.873f, 0.322f, -1.891f, 0.505f, -3.0f, 0.505f)
                reflectiveCurveToRelative(-2.127f, -0.183f, -3.0f, -0.505f)
                verticalLineToRelative(1.505f)
                close()
                moveTo(9.0f, 20.162f)
                verticalLineToRelative(-1.667f)
                curveToRelative(-0.873f, 0.322f, -1.891f, 0.505f, -3.0f, 0.505f)
                reflectiveCurveToRelative(-2.127f, -0.183f, -3.0f, -0.505f)
                verticalLineToRelative(1.667f)
                curveToRelative(0.217f, 0.275f, 1.275f, 0.838f, 3.0f, 0.838f)
                reflectiveCurveToRelative(2.783f, -0.563f, 3.0f, -0.838f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-8.458f)
                curveToRelative(1.777f, 0.887f, 2.998f, 2.305f, 3.348f, 4.0f)
                horizontalLineToRelative(5.111f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(20.5f, 0.0f)
                lineTo(7.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(0.681f)
                curveToRelative(0.636f, -0.114f, 1.303f, -0.181f, 2.0f, -0.181f)
                curveToRelative(0.341f, 0.0f, 0.673f, 0.019f, 1.0f, 0.047f)
                verticalLineToRelative(-0.547f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(-7.065f)
                curveToRelative(-0.184f, 1.161f, -0.79f, 2.186f, -1.726f, 3.0f)
                horizontalLineToRelative(11.791f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _calculatorMoney!!
    }

private var _calculatorMoney: ImageVector? = null
