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

public val Icons.Filled.VolumeDown: ImageVector
    get() {
        if (_volumeDown != null) {
            return _volumeDown!!
        }
        _volumeDown = Builder(name = "VolumeDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.003f, 23.814f)
                curveToRelative(-0.06f, 0.0f, -0.121f, -0.005f, -0.181f, -0.017f)
                curveToRelative(-2.999f, -0.551f, -5.752f, -2.299f, -7.554f, -4.794f)
                horizontalLineToRelative(-1.271f)
                curveTo(2.241f, 19.003f, -0.002f, 16.76f, -0.002f, 14.003f)
                verticalLineToRelative(-4.005f)
                curveTo(-0.002f, 7.241f, 2.241f, 4.998f, 4.998f, 4.998f)
                horizontalLineToRelative(1.271f)
                curveTo(8.068f, 2.506f, 10.821f, 0.758f, 13.822f, 0.204f)
                curveToRelative(0.294f, -0.053f, 0.593f, 0.024f, 0.821f, 0.215f)
                curveToRelative(0.229f, 0.19f, 0.36f, 0.472f, 0.36f, 0.769f)
                verticalLineToRelative(21.627f)
                curveToRelative(0.0f, 0.297f, -0.132f, 0.579f, -0.36f, 0.769f)
                curveToRelative(-0.181f, 0.151f, -0.408f, 0.231f, -0.64f, 0.231f)
                close()
                moveTo(18.023f, 16.772f)
                curveToRelative(2.632f, -2.632f, 2.632f, -6.914f, 0.0f, -9.546f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(1.852f, 1.852f, 1.852f, 4.866f, 0.0f, 6.718f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                close()
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
