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

public val Icons.Bold.VolumeDown: ImageVector
    get() {
        if (_volumeDown != null) {
            return _volumeDown!!
        }
        _volumeDown = Builder(name = "VolumeDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 12.0f)
                curveToRelative(0.0f, -1.909f, -1.267f, -3.505f, -3.0f, -4.042f)
                lineTo(16.0f, 1.5f)
                curveToRelative(0.0f, -0.448f, -0.2f, -0.872f, -0.545f, -1.157f)
                curveToRelative(-0.346f, -0.285f, -0.803f, -0.404f, -1.239f, -0.316f)
                curveToRelative(-3.097f, 0.598f, -6.126f, 2.512f, -7.944f, 4.973f)
                horizontalLineToRelative(-0.771f)
                curveTo(2.467f, 5.0f, 0.0f, 7.467f, 0.0f, 10.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.143f)
                curveToRelative(1.809f, 2.196f, 4.696f, 3.917f, 7.573f, 4.473f)
                curveToRelative(0.094f, 0.019f, 0.189f, 0.027f, 0.284f, 0.027f)
                curveToRelative(0.346f, 0.0f, 0.684f, -0.12f, 0.955f, -0.343f)
                curveToRelative(0.345f, -0.285f, 0.545f, -0.709f, 0.545f, -1.157f)
                verticalLineToRelative(-6.458f)
                curveToRelative(1.733f, -0.536f, 3.0f, -2.132f, 3.0f, -4.042f)
                close()
                moveTo(13.0f, 20.489f)
                curveToRelative(-1.768f, -0.721f, -3.408f, -1.95f, -4.386f, -3.348f)
                curveToRelative(-0.28f, -0.402f, -0.74f, -0.641f, -1.229f, -0.641f)
                horizontalLineToRelative(-1.885f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.565f)
                curveToRelative(0.52f, 0.0f, 1.003f, -0.27f, 1.276f, -0.712f)
                curveToRelative(0.987f, -1.599f, 2.739f, -2.991f, 4.658f, -3.777f)
                verticalLineToRelative(16.978f)
                close()
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
