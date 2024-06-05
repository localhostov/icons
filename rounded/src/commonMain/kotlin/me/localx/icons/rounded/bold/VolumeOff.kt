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

public val Icons.Bold.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) {
            return _volumeOff!!
        }
        _volumeOff = Builder(name = "VolumeOff", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 24.0f)
                curveToRelative(-0.095f, 0.0f, -0.189f, -0.009f, -0.284f, -0.027f)
                curveToRelative(-2.877f, -0.555f, -5.765f, -2.276f, -7.573f, -4.473f)
                horizontalLineToRelative(-1.143f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -3.033f, 2.468f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(0.771f)
                curveTo(8.09f, 2.539f, 11.118f, 0.625f, 14.216f, 0.027f)
                curveToRelative(0.44f, -0.088f, 0.894f, 0.031f, 1.239f, 0.316f)
                curveToRelative(0.345f, 0.285f, 0.545f, 0.709f, 0.545f, 1.157f)
                verticalLineToRelative(21.0f)
                curveToRelative(0.0f, 0.448f, -0.2f, 0.872f, -0.545f, 1.157f)
                curveToRelative(-0.271f, 0.224f, -0.609f, 0.343f, -0.955f, 0.343f)
                close()
                moveTo(5.5f, 8.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.885f)
                curveToRelative(0.49f, 0.0f, 0.949f, 0.239f, 1.229f, 0.641f)
                curveToRelative(0.978f, 1.398f, 2.618f, 2.627f, 4.386f, 3.348f)
                verticalLineTo(3.511f)
                curveToRelative(-1.919f, 0.786f, -3.671f, 2.178f, -4.658f, 3.777f)
                curveToRelative(-0.273f, 0.442f, -0.757f, 0.712f, -1.276f, 0.712f)
                horizontalLineToRelative(-1.565f)
                close()
            }
        }
        .build()
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
