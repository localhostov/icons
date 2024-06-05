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

public val Icons.Filled.HourglassStart: ImageVector
    get() {
        if (_hourglassStart != null) {
            return _hourglassStart!!
        }
        _hourglassStart = Builder(name = "HourglassStart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.957f, 4.577f)
                curveToRelative(0.169f, -1.132f, -0.166f, -2.282f, -0.918f, -3.155f)
                curveToRelative(-0.765f, -0.888f, -1.874f, -1.396f, -3.044f, -1.396f)
                lineTo(7.005f, 0.026f)
                curveToRelative(-1.17f, 0.0f, -2.279f, 0.51f, -3.043f, 1.398f)
                curveToRelative(-0.753f, 0.874f, -1.087f, 2.024f, -0.917f, 3.157f)
                curveToRelative(0.406f, 2.699f, 1.885f, 5.198f, 4.401f, 7.444f)
                curveToRelative(-2.517f, 2.246f, -3.996f, 4.745f, -4.401f, 7.444f)
                curveToRelative(-0.17f, 1.133f, 0.165f, 2.283f, 0.917f, 3.157f)
                curveToRelative(0.764f, 0.889f, 1.874f, 1.397f, 3.043f, 1.397f)
                horizontalLineToRelative(9.99f)
                curveToRelative(1.17f, 0.0f, 2.279f, -0.508f, 3.044f, -1.396f)
                curveToRelative(0.752f, -0.873f, 1.087f, -2.023f, 0.918f, -3.154f)
                curveToRelative(-0.403f, -2.69f, -1.884f, -5.191f, -4.406f, -7.449f)
                curveToRelative(2.522f, -2.258f, 4.003f, -4.759f, 4.406f, -7.448f)
                close()
                moveTo(17.926f, 4.4f)
                curveToRelative(-0.984f, 2.432f, -3.051f, 4.422f, -4.609f, 5.662f)
                lineToRelative(-0.69f, 0.551f)
                curveToRelative(-0.365f, 0.29f, -0.88f, 0.29f, -1.245f, 0.002f)
                lineToRelative(-0.704f, -0.559f)
                curveToRelative(-1.557f, -1.231f, -3.619f, -3.212f, -4.605f, -5.656f)
                curveToRelative(-0.125f, -0.309f, -0.087f, -0.658f, 0.098f, -0.934f)
                curveToRelative(0.186f, -0.275f, 0.497f, -0.44f, 0.829f, -0.44f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.333f, 0.0f, 0.644f, 0.164f, 0.829f, 0.44f)
                curveToRelative(0.186f, 0.275f, 0.223f, 0.626f, 0.098f, 0.934f)
                close()
                moveTo(12.071f, 8.498f)
                lineToRelative(-0.07f, 0.056f)
                lineToRelative(-0.082f, -0.065f)
                curveToRelative(-1.047f, -0.828f, -2.35f, -2.029f, -3.271f, -3.462f)
                horizontalLineToRelative(6.702f)
                curveToRelative(-0.924f, 1.429f, -2.229f, 2.636f, -3.278f, 3.472f)
                close()
            }
        }
        .build()
        return _hourglassStart!!
    }

private var _hourglassStart: ImageVector? = null
