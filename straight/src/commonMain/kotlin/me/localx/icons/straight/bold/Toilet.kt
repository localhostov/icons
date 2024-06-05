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

public val Icons.Bold.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.036f)
                curveToRelative(-0.243f, -1.694f, -1.704f, -3.0f, -3.464f, -3.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.284f)
                curveToRelative(-1.308f, 0.87f, -2.0f, 2.166f, -2.0f, 3.216f)
                curveToRelative(0.0f, 0.5f, 0.12f, 1.05f, 0.298f, 1.43f)
                curveToRelative(0.748f, 1.951f, 2.93f, 4.348f, 6.844f, 4.935f)
                curveToRelative(-0.788f, 2.064f, -3.334f, 2.099f, -3.334f, 4.635f)
                horizontalLineToRelative(10.385f)
                curveToRelative(0.0f, -2.536f, -2.546f, -2.571f, -3.334f, -4.635f)
                curveToRelative(3.914f, -0.587f, 6.096f, -2.984f, 6.844f, -4.935f)
                curveToRelative(0.178f, -0.38f, 0.298f, -0.93f, 0.298f, -1.43f)
                curveToRelative(0.0f, -1.05f, -0.692f, -2.345f, -2.0f, -3.216f)
                verticalLineToRelative(-3.784f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 3.5f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-5.096f, 0.0f, -5.994f, -0.497f, -6.0f, -0.995f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.005f)
                curveToRelative(0.062f, -0.202f, 0.442f, -0.716f, 1.232f, -1.0f)
                horizontalLineToRelative(9.535f)
                curveToRelative(0.786f, 0.281f, 1.164f, 0.822f, 1.229f, 1.027f)
                curveToRelative(0.0f, 0.473f, -0.525f, 0.973f, -5.997f, 0.973f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
