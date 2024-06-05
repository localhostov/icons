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

public val Icons.Bold.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) {
            return _webcamSlash!!
        }
        _webcamSlash = Builder(name = "WebcamSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.13f, 17.009f)
                curveToRelative(1.819f, -1.856f, 2.87f, -4.378f, 2.87f, -7.009f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-2.632f, 0.0f, -5.153f, 1.051f, -7.009f, 2.87f)
                lineTo(2.161f, 0.04f)
                lineTo(0.04f, 2.161f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-4.83f, -4.83f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.833f, -0.729f, 3.59f, -1.991f, 4.888f)
                lineToRelative(-1.415f, -1.415f)
                curveToRelative(0.884f, -0.919f, 1.406f, -2.161f, 1.406f, -3.472f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-1.311f, 0.0f, -2.554f, 0.523f, -3.472f, 1.406f)
                lineToRelative(-1.415f, -1.415f)
                curveToRelative(1.298f, -1.262f, 3.054f, -1.991f, 4.888f, -1.991f)
                close()
                moveTo(10.648f, 8.527f)
                curveToRelative(0.364f, -0.332f, 0.845f, -0.527f, 1.352f, -0.527f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.507f, -0.195f, 0.988f, -0.527f, 1.352f)
                lineToRelative(-2.824f, -2.824f)
                close()
                moveTo(18.999f, 23.949f)
                curveToRelative(0.0f, 0.017f, 0.0f, 0.034f, 0.0f, 0.051f)
                lineTo(5.0f, 24.0f)
                curveToRelative(0.0f, -2.053f, 0.884f, -3.9f, 2.292f, -5.18f)
                curveToRelative(-3.147f, -1.686f, -5.292f, -5.007f, -5.292f, -8.82f)
                curveToRelative(0.0f, -0.919f, 0.123f, -1.821f, 0.364f, -2.686f)
                lineToRelative(2.637f, 2.637f)
                curveToRelative(0.0f, 0.017f, 0.0f, 0.033f, 0.0f, 0.05f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                curveToRelative(0.017f, 0.0f, 0.033f, 0.0f, 0.05f, 0.0f)
                lineToRelative(6.95f, 6.95f)
                close()
            }
        }
        .build()
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
