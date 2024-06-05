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

public val Icons.Outline.PointerLoading: ImageVector
    get() {
        if (_pointerLoading != null) {
            return _pointerLoading!!
        }
        _pointerLoading = Builder(name = "PointerLoading", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.171f, 21.999f)
                curveToRelative(-0.646f, 0.0f, -1.285f, -0.205f, -1.821f, -0.599f)
                curveToRelative(-1.186f, -0.868f, -1.554f, -2.559f, -0.858f, -3.933f)
                lineToRelative(1.314f, -2.93f)
                lineToRelative(-3.943f, -0.548f)
                curveToRelative(-0.376f, -0.052f, -0.69f, -0.312f, -0.811f, -0.673f)
                curveToRelative(-0.121f, -0.36f, -0.026f, -0.758f, 0.243f, -1.026f)
                lineTo(18.822f, 2.806f)
                curveToRelative(0.981f, -0.851f, 2.253f, -1.03f, 3.368f, -0.521f)
                curveToRelative(1.116f, 0.512f, 1.81f, 1.591f, 1.81f, 2.818f)
                verticalLineToRelative(13.896f)
                curveToRelative(0.0f, 0.393f, -0.229f, 0.748f, -0.587f, 0.91f)
                curveToRelative(-0.355f, 0.164f, -0.776f, 0.101f, -1.071f, -0.157f)
                lineToRelative(-2.99f, -2.616f)
                lineToRelative(-1.447f, 3.164f)
                curveToRelative(-0.429f, 0.837f, -1.163f, 1.411f, -2.034f, 1.617f)
                curveToRelative(-0.231f, 0.055f, -0.466f, 0.081f, -0.699f, 0.081f)
                close()
                moveTo(12.133f, 12.287f)
                lineToRelative(3.268f, 0.454f)
                curveToRelative(0.312f, 0.043f, 0.585f, 0.23f, 0.737f, 0.506f)
                reflectiveCurveToRelative(0.166f, 0.606f, 0.037f, 0.894f)
                lineToRelative(-1.88f, 4.188f)
                curveToRelative(-0.274f, 0.545f, -0.162f, 1.167f, 0.235f, 1.458f)
                curveToRelative(0.262f, 0.191f, 0.574f, 0.255f, 0.879f, 0.185f)
                curveToRelative(0.301f, -0.071f, 0.555f, -0.27f, 0.695f, -0.544f)
                lineToRelative(1.985f, -4.344f)
                curveToRelative(0.131f, -0.287f, 0.391f, -0.495f, 0.699f, -0.562f)
                curveToRelative(0.308f, -0.065f, 0.631f, 0.016f, 0.868f, 0.225f)
                lineToRelative(2.342f, 2.049f)
                lineTo(21.998f, 5.103f)
                curveToRelative(0.0f, -0.654f, -0.491f, -0.931f, -0.643f, -0.999f)
                curveToRelative(-0.151f, -0.07f, -0.682f, -0.26f, -1.177f, 0.167f)
                lineTo(12.133f, 12.287f)
                close()
                moveTo(0.0f, 20.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(4.0f, 20.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(8.0f, 20.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pointerLoading!!
    }

private var _pointerLoading: ImageVector? = null
