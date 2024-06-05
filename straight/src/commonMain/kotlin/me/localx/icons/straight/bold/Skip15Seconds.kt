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

public val Icons.Bold.Skip15Seconds: ImageVector
    get() {
        if (_skip15Seconds != null) {
            return _skip15Seconds!!
        }
        _skip15Seconds = Builder(name = "Skip15Seconds", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 6.911f)
                lineTo(1.0f, 1.0f)
                lineTo(3.521f, 3.521f)
                curveTo(5.743f, 1.288f, 8.754f, 0.0f, 12.0f, 0.0f)
                curveToRelative(5.579f, 0.0f, 10.26f, 3.834f, 11.596f, 9.0f)
                horizontalLineToRelative(-3.122f)
                curveToRelative(-1.24f, -3.49f, -4.565f, -6.0f, -8.474f, -6.0f)
                curveToRelative(-2.434f, 0.0f, -4.693f, 0.966f, -6.359f, 2.641f)
                lineToRelative(2.359f, 2.359f)
                lineTo(2.091f, 8.0f)
                curveToRelative(-0.602f, 0.0f, -1.09f, -0.487f, -1.091f, -1.089f)
                close()
                moveTo(13.018f, 11.131f)
                curveToRelative(-0.635f, -0.263f, -1.352f, -0.127f, -1.852f, 0.373f)
                lineToRelative(-4.081f, 4.272f)
                lineToRelative(2.17f, 2.072f)
                lineToRelative(1.767f, -1.85f)
                lineToRelative(-0.039f, 7.994f)
                lineToRelative(3.0f, 0.015f)
                lineToRelative(0.055f, -11.372f)
                curveToRelative(0.0f, -0.657f, -0.4f, -1.248f, -1.021f, -1.505f)
                close()
                moveTo(3.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, 5.579f, 3.833f, 10.268f, 9.0f, 11.605f)
                verticalLineToRelative(-3.13f)
                curveToRelative(-3.49f, -1.239f, -6.0f, -4.565f, -6.0f, -8.475f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _skip15Seconds!!
    }

private var _skip15Seconds: ImageVector? = null
