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

public val Icons.Outline.HeartRate: ImageVector
    get() {
        if (_heartRate != null) {
            return _heartRate!!
        }
        _heartRate = Builder(name = "HeartRate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.466f)
                curveToRelative(-0.452f, 0.0f, -0.849f, 0.305f, -0.966f, 0.74f)
                lineToRelative(-1.677f, 6.242f)
                curveToRelative(-0.191f, 0.625f, -0.725f, 1.018f, -1.341f, 1.018f)
                horizontalLineToRelative(-0.017f)
                curveToRelative(-0.623f, -0.007f, -1.155f, -0.415f, -1.324f, -1.014f)
                lineToRelative(-3.274f, -13.226f)
                lineToRelative(-3.178f, 11.239f)
                curveToRelative(-0.191f, 0.597f, -0.69f, 0.976f, -1.28f, 0.999f)
                curveToRelative(-0.612f, 0.033f, -1.119f, -0.315f, -1.345f, -0.862f)
                lineToRelative(-1.6f, -4.474f)
                curveToRelative(-0.143f, -0.396f, -0.521f, -0.663f, -0.942f, -0.663f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.591f)
                curveToRelative(1.264f, 0.0f, 2.398f, 0.799f, 2.825f, 1.989f)
                lineToRelative(0.938f, 2.626f)
                lineToRelative(3.284f, -11.615f)
                curveToRelative(0.201f, -0.625f, 0.727f, -1.027f, 1.361f, -1.0f)
                curveToRelative(0.618f, 0.011f, 1.146f, 0.418f, 1.315f, 1.012f)
                lineToRelative(3.259f, 13.166f)
                lineToRelative(1.062f, -3.956f)
                curveToRelative(0.351f, -1.308f, 1.542f, -2.222f, 2.897f, -2.222f)
                horizontalLineToRelative(2.466f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _heartRate!!
    }

private var _heartRate: ImageVector? = null
