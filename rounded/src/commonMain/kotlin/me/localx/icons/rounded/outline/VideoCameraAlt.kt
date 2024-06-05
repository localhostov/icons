package me.localx.icons.rounded.outline

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

public val Icons.Outline.VideoCameraAlt: ImageVector
    get() {
        if (_videoCameraAlt != null) {
            return _videoCameraAlt!!
        }
        _videoCameraAlt = Builder(name = "VideoCameraAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.903f, 6.538f)
                curveToRelative(-0.676f, -0.338f, -1.473f, -0.267f, -2.077f, 0.188f)
                curveToRelative(-0.039f, 0.029f, -0.076f, 0.062f, -0.11f, 0.096f)
                lineToRelative(-1.757f, 1.773f)
                curveToRelative(-0.211f, -2.565f, -2.341f, -4.594f, -4.959f, -4.594f)
                lineTo(5.0f, 4.001f)
                curveTo(2.243f, 4.0f, 0.0f, 6.243f, 0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                lineTo(14.0f, 20.0f)
                curveToRelative(2.629f, 0.0f, 4.768f, -2.047f, 4.962f, -4.627f)
                lineToRelative(1.756f, 1.754f)
                curveToRelative(0.034f, 0.033f, 0.069f, 0.063f, 0.107f, 0.092f)
                curveToRelative(0.352f, 0.264f, 0.768f, 0.398f, 1.188f, 0.398f)
                curveToRelative(0.303f, 0.0f, 0.606f, -0.069f, 0.89f, -0.211f)
                curveToRelative(0.677f, -0.338f, 1.097f, -1.019f, 1.097f, -1.774f)
                verticalLineToRelative(-7.318f)
                curveToRelative(0.0f, -0.757f, -0.42f, -1.437f, -1.097f, -1.775f)
                close()
                moveTo(14.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(14.0f, 6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(19.0f, 12.583f)
                verticalLineToRelative(-1.189f)
                lineToRelative(3.0f, -3.028f)
                lineToRelative(0.025f, 7.238f)
                lineToRelative(-3.025f, -3.022f)
                close()
            }
        }
        .build()
        return _videoCameraAlt!!
    }

private var _videoCameraAlt: ImageVector? = null
