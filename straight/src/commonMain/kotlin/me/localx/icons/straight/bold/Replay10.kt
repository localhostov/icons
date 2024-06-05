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

public val Icons.Bold.Replay10: ImageVector
    get() {
        if (_replay10 != null) {
            return _replay10!!
        }
        _replay10 = Builder(name = "Replay10", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 6.911f)
                lineTo(1.0f, 1.0f)
                lineTo(3.521f, 3.521f)
                curveTo(5.743f, 1.288f, 8.754f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.086f, 0.0f, 11.116f, 4.558f, 11.886f, 10.437f)
                curveToRelative(-0.933f, -0.795f, -2.11f, -1.309f, -3.402f, -1.413f)
                curveToRelative(-1.232f, -3.503f, -4.565f, -6.024f, -8.484f, -6.024f)
                curveToRelative(-2.434f, 0.0f, -4.693f, 0.966f, -6.359f, 2.641f)
                lineToRelative(2.359f, 2.359f)
                lineTo(2.091f, 8.0f)
                curveToRelative(-0.602f, 0.0f, -1.09f, -0.487f, -1.091f, -1.089f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(21.0f, 15.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(13.016f, 11.13f)
                curveToRelative(-0.637f, -0.262f, -1.354f, -0.124f, -1.849f, 0.374f)
                lineToRelative(-4.081f, 4.272f)
                lineToRelative(2.17f, 2.072f)
                lineToRelative(1.766f, -1.85f)
                lineToRelative(-0.038f, 7.994f)
                lineToRelative(3.0f, 0.015f)
                lineToRelative(0.055f, -11.372f)
                curveToRelative(0.0f, -0.658f, -0.401f, -1.25f, -1.022f, -1.506f)
                close()
                moveTo(3.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, 5.579f, 3.833f, 10.268f, 9.0f, 11.605f)
                verticalLineToRelative(-3.13f)
                curveToRelative(-3.49f, -1.239f, -6.0f, -4.565f, -6.0f, -8.475f)
                close()
            }
        }
        .build()
        return _replay10!!
    }

private var _replay10: ImageVector? = null
