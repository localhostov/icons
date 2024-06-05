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

public val Icons.Bold.CirclePhoneHangup: ImageVector
    get() {
        if (_circlePhoneHangup != null) {
            return _circlePhoneHangup!!
        }
        _circlePhoneHangup = Builder(name = "CirclePhoneHangup", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                reflectiveCurveTo(16.962f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(9.0f, 14.0f)
                verticalLineToRelative(-2.593f)
                curveToRelative(1.022f, -0.458f, 1.997f, -0.692f, 3.0f, -0.686f)
                curveToRelative(0.953f, 0.006f, 1.932f, 0.23f, 3.0f, 0.686f)
                verticalLineToRelative(2.593f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.023f)
                curveToRelative(0.0f, -0.768f, -0.323f, -1.456f, -0.827f, -1.96f)
                curveToRelative(-1.38f, -1.38f, -3.783f, -2.028f, -6.173f, -2.017f)
                curveToRelative(-2.44f, 0.011f, -4.865f, 0.709f, -6.173f, 2.017f)
                curveToRelative(-0.504f, 0.504f, -0.828f, 1.192f, -0.827f, 1.96f)
                verticalLineToRelative(2.023f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _circlePhoneHangup!!
    }

private var _circlePhoneHangup: ImageVector? = null
