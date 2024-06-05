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

public val Icons.Bold.FirstMedal: ImageVector
    get() {
        if (_firstMedal != null) {
            return _firstMedal!!
        }
        _firstMedal = Builder(name = "FirstMedal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.02f, 0.0f)
                horizontalLineToRelative(-9.282f)
                lineToRelative(-2.742f, 5.542f)
                lineTo(9.261f, 0.0f)
                lineTo(-0.02f, 0.0f)
                lineToRelative(4.767f, 9.663f)
                curveToRelative(-1.104f, 1.494f, -1.758f, 3.341f, -1.758f, 5.337f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -1.994f, -0.652f, -3.838f, -1.753f, -5.331f)
                lineTo(24.02f, 0.0f)
                close()
                moveTo(19.189f, 3.0f)
                lineToRelative(-2.228f, 4.502f)
                curveToRelative(-0.641f, -0.427f, -1.34f, -0.774f, -2.081f, -1.026f)
                lineToRelative(1.72f, -3.476f)
                horizontalLineToRelative(2.589f)
                close()
                moveTo(7.397f, 3.0f)
                lineToRelative(1.713f, 3.472f)
                curveToRelative(-0.743f, 0.252f, -1.443f, 0.598f, -2.085f, 1.025f)
                lineToRelative(-2.219f, -4.497f)
                horizontalLineToRelative(2.591f)
                close()
                moveTo(11.99f, 21.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(12.914f, 11.0f)
                lineToRelative(0.087f, 1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.62f)
                lineToRelative(-0.573f, 0.591f)
                lineToRelative(-1.437f, -1.391f)
                lineToRelative(2.499f, -2.58f)
                horizontalLineToRelative(1.423f)
                close()
            }
        }
        .build()
        return _firstMedal!!
    }

private var _firstMedal: ImageVector? = null
