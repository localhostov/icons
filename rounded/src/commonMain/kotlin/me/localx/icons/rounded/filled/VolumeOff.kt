package me.localx.icons.rounded.filled

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

public val Icons.Filled.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) {
            return _volumeOff!!
        }
        _volumeOff = Builder(name = "VolumeOff", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.004f, 23.814f)
                curveToRelative(-0.061f, 0.0f, -0.121f, -0.005f, -0.181f, -0.017f)
                curveToRelative(-2.999f, -0.551f, -5.752f, -2.299f, -7.554f, -4.794f)
                horizontalLineToRelative(-1.271f)
                curveTo(2.241f, 19.003f, -0.002f, 16.76f, -0.002f, 14.003f)
                verticalLineToRelative(-4.005f)
                curveTo(-0.002f, 7.241f, 2.241f, 4.998f, 4.998f, 4.998f)
                horizontalLineToRelative(1.271f)
                curveTo(8.068f, 2.505f, 10.821f, 0.758f, 13.822f, 0.204f)
                curveToRelative(0.294f, -0.052f, 0.594f, 0.025f, 0.821f, 0.215f)
                curveToRelative(0.229f, 0.19f, 0.36f, 0.472f, 0.36f, 0.769f)
                verticalLineToRelative(21.627f)
                curveToRelative(0.0f, 0.297f, -0.132f, 0.579f, -0.36f, 0.769f)
                curveToRelative(-0.181f, 0.151f, -0.407f, 0.231f, -0.64f, 0.231f)
                close()
            }
        }
        .build()
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
