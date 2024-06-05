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

public val Icons.Bold.ProgressUpload: ImageVector
    get() {
        if (_progressUpload != null) {
            return _progressUpload!!
        }
        _progressUpload = Builder(name = "ProgressUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.061f, 10.293f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.162f, -1.135f, 0.485f, -2.239f, 0.962f, -3.281f)
                lineToRelative(2.729f, 1.248f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.001f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.357f, 0.78f, -0.599f, 1.606f, -0.72f, 2.455f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineTo(0.061f, 10.294f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(7.074f, 4.427f)
                lineToRelative(-1.624f, -2.522f)
                curveToRelative(-0.962f, 0.62f, -1.83f, 1.372f, -2.58f, 2.238f)
                lineToRelative(2.267f, 1.965f)
                curveToRelative(0.563f, -0.65f, 1.215f, -1.215f, 1.938f, -1.68f)
                close()
                moveTo(3.75f, 15.738f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.357f, -0.78f, -0.599f, -1.606f, -0.72f, -2.455f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineTo(0.061f, 13.706f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.162f, 1.135f, 0.485f, 2.239f, 0.962f, 3.281f)
                lineToRelative(2.729f, -1.248f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, -0.001f)
                close()
                moveTo(5.137f, 17.892f)
                lineToRelative(-2.267f, 1.965f)
                curveToRelative(0.75f, 0.866f, 1.618f, 1.618f, 2.58f, 2.238f)
                lineToRelative(1.624f, -2.522f)
                curveToRelative(-0.722f, -0.465f, -1.374f, -1.03f, -1.938f, -1.68f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-1.164f, 0.0f, -2.317f, 0.167f, -3.427f, 0.497f)
                lineToRelative(0.854f, 2.875f)
                curveToRelative(0.833f, -0.247f, 1.699f, -0.372f, 2.573f, -0.372f)
                curveToRelative(4.962f, 0.0f, 9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                curveToRelative(-0.875f, 0.0f, -1.74f, -0.125f, -2.573f, -0.372f)
                lineToRelative(-0.854f, 2.875f)
                curveToRelative(1.11f, 0.33f, 2.263f, 0.497f, 3.427f, 0.497f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.5f, 18.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-4.636f, -4.531f)
                curveToRelative(-0.477f, -0.477f, -1.251f, -0.477f, -1.728f, 0.0f)
                lineToRelative(-4.636f, 4.531f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _progressUpload!!
    }

private var _progressUpload: ImageVector? = null
