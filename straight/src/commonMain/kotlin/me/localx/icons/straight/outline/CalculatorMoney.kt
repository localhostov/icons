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

public val Icons.Outline.CalculatorMoney: ImageVector
    get() {
        if (_calculatorMoney != null) {
            return _calculatorMoney!!
        }
        _calculatorMoney = Builder(name = "CalculatorMoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 17.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(3.159f)
                curveToRelative(0.716f, 0.113f, 1.387f, 0.284f, 2.0f, 0.511f)
                verticalLineToRelative(-1.67f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.233f)
                curveToRelative(1.045f, 0.508f, 1.878f, 1.189f, 2.437f, 2.0f)
                horizontalLineToRelative(6.796f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(21.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(4.159f)
                curveToRelative(0.634f, -0.1f, 1.3f, -0.159f, 2.0f, -0.159f)
                lineTo(6.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-8.275f)
                curveToRelative(-0.278f, 0.752f, -0.76f, 1.428f, -1.417f, 2.0f)
                horizontalLineToRelative(11.692f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 12.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.995f, -2.579f, 3.5f, -6.0f, 3.5f)
                reflectiveCurveToRelative(-6.0f, -1.505f, -6.0f, -3.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.995f, 2.579f, -3.5f, 6.0f, -3.5f)
                reflectiveCurveToRelative(6.0f, 1.505f, 6.0f, 3.5f)
                close()
                moveTo(10.0f, 20.5f)
                verticalLineToRelative(-1.348f)
                curveToRelative(-1.046f, 0.533f, -2.435f, 0.848f, -4.0f, 0.848f)
                reflectiveCurveToRelative(-2.954f, -0.315f, -4.0f, -0.848f)
                verticalLineToRelative(1.348f)
                curveToRelative(0.0f, 0.529f, 1.519f, 1.5f, 4.0f, 1.5f)
                reflectiveCurveToRelative(4.0f, -0.971f, 4.0f, -1.5f)
                close()
                moveTo(10.0f, 16.5f)
                verticalLineToRelative(-1.348f)
                curveToRelative(-1.046f, 0.533f, -2.435f, 0.848f, -4.0f, 0.848f)
                reflectiveCurveToRelative(-2.954f, -0.315f, -4.0f, -0.848f)
                verticalLineToRelative(1.348f)
                curveToRelative(0.0f, 0.529f, 1.519f, 1.5f, 4.0f, 1.5f)
                reflectiveCurveToRelative(4.0f, -0.971f, 4.0f, -1.5f)
                close()
                moveTo(10.0f, 12.5f)
                curveToRelative(0.0f, -0.529f, -1.519f, -1.5f, -4.0f, -1.5f)
                reflectiveCurveToRelative(-4.0f, 0.971f, -4.0f, 1.5f)
                reflectiveCurveToRelative(1.519f, 1.5f, 4.0f, 1.5f)
                reflectiveCurveToRelative(4.0f, -0.971f, 4.0f, -1.5f)
                close()
            }
        }
        .build()
        return _calculatorMoney!!
    }

private var _calculatorMoney: ImageVector? = null
