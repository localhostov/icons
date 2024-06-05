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

public val Icons.Bold.SpeedometerKpi: ImageVector
    get() {
        if (_speedometerKpi != null) {
            return _speedometerKpi!!
        }
        _speedometerKpi = Builder(name = "SpeedometerKpi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 19.911f)
                verticalLineToRelative(-7.911f)
                curveToRelative(0.0f, -4.962f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.038f, 3.0f, 12.0f)
                verticalLineToRelative(7.911f)
                curveToRelative(-1.861f, -2.115f, -3.0f, -4.879f, -3.0f, -7.911f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                curveToRelative(0.0f, 3.032f, -1.139f, 5.796f, -3.0f, 7.911f)
                close()
                moveTo(13.992f, 12.079f)
                lineToRelative(3.543f, -3.544f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-3.604f, 3.605f)
                curveToRelative(-1.014f, 0.097f, -1.81f, 0.941f, -1.81f, 1.981f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(1.077f, 0.0f, 1.95f, -0.854f, 1.992f, -1.921f)
                close()
                moveTo(16.1f, 18.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.1f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(14.578f, 18.5f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.555f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.555f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                close()
                moveTo(17.001f, 24.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(10.501f, 16.0f)
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
                moveTo(10.796f, 8.206f)
                lineToRelative(2.971f, -2.971f)
                curveToRelative(-0.565f, -0.148f, -1.155f, -0.234f, -1.766f, -0.234f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -1.783f, 1.18f, -3.279f, 2.795f, -3.794f)
                close()
            }
        }
        .build()
        return _speedometerKpi!!
    }

private var _speedometerKpi: ImageVector? = null
