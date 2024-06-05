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

public val Icons.Bold.VolumeSlash: ImageVector
    get() {
        if (_volumeSlash != null) {
            return _volumeSlash!!
        }
        _volumeSlash = Builder(name = "VolumeSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 21.439f)
                lineToRelative(-2.25f, -2.25f)
                curveToRelative(3.738f, -4.316f, 3.568f, -10.868f, -0.532f, -14.967f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(2.93f, 2.93f, 3.107f, 7.585f, 0.532f, 10.725f)
                lineToRelative(-1.922f, -1.922f)
                curveToRelative(0.863f, -0.778f, 1.415f, -1.893f, 1.415f, -3.146f)
                curveToRelative(0.0f, -1.792f, -1.113f, -3.318f, -2.682f, -3.943f)
                lineTo(16.001f, 1.5f)
                curveToRelative(0.0f, -0.448f, -0.2f, -0.872f, -0.545f, -1.157f)
                curveToRelative(-0.347f, -0.285f, -0.801f, -0.404f, -1.239f, -0.316f)
                curveToRelative(-2.895f, 0.559f, -5.721f, 2.272f, -7.564f, 4.503f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                curveTo(-0.146f, 1.025f, -0.146f, 1.975f, 0.439f, 2.561f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                close()
                moveTo(13.0f, 3.511f)
                verticalLineToRelative(7.368f)
                lineToRelative(-4.22f, -4.22f)
                curveToRelative(1.023f, -1.331f, 2.558f, -2.467f, 4.22f, -3.148f)
                close()
                moveTo(15.973f, 22.784f)
                curveToRelative(-0.139f, 0.718f, -0.767f, 1.216f, -1.471f, 1.216f)
                curveToRelative(-0.095f, 0.0f, -0.19f, -0.009f, -0.286f, -0.028f)
                curveToRelative(-2.877f, -0.555f, -5.765f, -2.276f, -7.573f, -4.473f)
                horizontalLineToRelative(-1.143f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.464f, 0.059f, -0.926f, 0.173f, -1.373f)
                curveToRelative(0.206f, -0.802f, 1.021f, -1.286f, 1.826f, -1.08f)
                curveToRelative(0.803f, 0.206f, 1.286f, 1.023f, 1.08f, 1.826f)
                curveToRelative(-0.053f, 0.204f, -0.079f, 0.415f, -0.079f, 0.627f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.885f)
                curveToRelative(0.49f, 0.0f, 0.949f, 0.239f, 1.229f, 0.641f)
                curveToRelative(1.302f, 1.863f, 3.781f, 3.425f, 6.17f, 3.886f)
                curveToRelative(0.813f, 0.157f, 1.346f, 0.944f, 1.188f, 1.757f)
                close()
            }
        }
        .build()
        return _volumeSlash!!
    }

private var _volumeSlash: ImageVector? = null
