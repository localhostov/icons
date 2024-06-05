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

public val Icons.Outline.SpeedometerKpi: ImageVector
    get() {
        if (_speedometerKpi != null) {
            return _speedometerKpi!!
        }
        _speedometerKpi = Builder(name = "SpeedometerKpi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.167f, 0.0f, 0.328f, 0.027f, 0.483f, 0.065f)
                lineToRelative(3.814f, -3.776f)
                lineToRelative(1.406f, 1.421f)
                lineToRelative(-3.786f, 3.749f)
                curveToRelative(0.049f, 0.173f, 0.083f, 0.352f, 0.083f, 0.541f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(15.997f, 18.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.1f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(14.397f, 18.5f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.496f, 0.0f, 0.9f, -0.404f, 0.9f, -0.9f)
                close()
                moveTo(17.0f, 24.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(10.5f, 16.0f)
                horizontalLineToRelative(-1.861f)
                lineToRelative(-1.685f, 2.867f)
                horizontalLineToRelative(-0.354f)
                verticalLineToRelative(-2.867f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.533f)
                horizontalLineToRelative(0.612f)
                lineToRelative(1.593f, 3.533f)
                horizontalLineToRelative(1.758f)
                lineToRelative(-1.997f, -4.565f)
                lineToRelative(1.934f, -3.435f)
                close()
                moveTo(12.0f, 7.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(1.765f, -1.766f)
                curveToRelative(-0.565f, -0.148f, -1.155f, -0.234f, -1.766f, -0.234f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(21.0f, 19.911f)
                curveToRelative(1.861f, -2.115f, 3.0f, -4.879f, 3.0f, -7.911f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.032f, 1.139f, 5.796f, 3.0f, 7.911f)
                verticalLineToRelative(-3.581f)
                curveToRelative(-0.634f, -1.312f, -1.0f, -2.777f, -1.0f, -4.33f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 1.552f, -0.366f, 3.017f, -1.0f, 4.33f)
                verticalLineToRelative(3.581f)
                close()
            }
        }
        .build()
        return _speedometerKpi!!
    }

private var _speedometerKpi: ImageVector? = null
