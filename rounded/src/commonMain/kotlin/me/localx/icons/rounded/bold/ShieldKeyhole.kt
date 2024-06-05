package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ShieldKeyhole: ImageVector
    get() {
        if (_shieldKeyhole != null) {
            return _shieldKeyhole!!
        }
        _shieldKeyhole = Builder(name = "ShieldKeyhole", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 9.5f)
                curveToRelative(0.0f, 0.818f, -0.393f, 1.544f, -1.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-0.607f, -0.456f, -1.0f, -1.182f, -1.0f, -2.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(22.0f, 7.046f)
                verticalLineToRelative(5.105f)
                curveToRelative(0.0f, 7.371f, -6.922f, 10.728f, -9.044f, 11.581f)
                curveToRelative(0.0f, 0.0f, -0.577f, 0.268f, -0.954f, 0.268f)
                reflectiveCurveToRelative(-1.052f, -0.35f, -1.052f, -0.35f)
                curveToRelative(-2.099f, -1.049f, -8.95f, -4.979f, -8.95f, -11.499f)
                verticalLineToRelative(-5.105f)
                curveToRelative(0.0f, -2.279f, 1.453f, -4.292f, 3.616f, -5.01f)
                lineTo(11.528f, 0.076f)
                curveToRelative(0.307f, -0.102f, 0.637f, -0.102f, 0.943f, 0.0f)
                lineToRelative(5.911f, 1.96f)
                curveToRelative(2.164f, 0.718f, 3.617f, 2.73f, 3.617f, 5.01f)
                close()
                moveTo(19.0f, 7.046f)
                curveToRelative(0.0f, -0.983f, -0.627f, -1.853f, -1.562f, -2.162f)
                lineToRelative(-5.438f, -1.804f)
                lineToRelative(-5.439f, 1.804f)
                curveToRelative(-0.934f, 0.31f, -1.561f, 1.179f, -1.561f, 2.162f)
                verticalLineToRelative(5.105f)
                curveToRelative(0.0f, 4.606f, 5.142f, 7.704f, 7.068f, 8.702f)
                curveToRelative(1.902f, -0.808f, 6.932f, -3.443f, 6.932f, -8.702f)
                verticalLineToRelative(-5.105f)
                close()
            }
        }
        .build()
        return _shieldKeyhole!!
    }

private var _shieldKeyhole: ImageVector? = null
