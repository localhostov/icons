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

public val Icons.Filled.Picking: ImageVector
    get() {
        if (_picking != null) {
            return _picking!!
        }
        _picking = Builder(name = "Picking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.5f, 1.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.938f)
                lineTo(1.0f, 7.086f)
                curveToRelative(-0.781f, 0.277f, -1.19f, 1.134f, -0.913f, 1.915f)
                curveToRelative(0.277f, 0.781f, 1.134f, 1.19f, 1.915f, 0.913f)
                lineToRelative(8.999f, -2.914f)
                lineToRelative(-4.815f, 2.704f)
                curveToRelative(-0.875f, 0.491f, -1.582f, 1.235f, -2.028f, 2.133f)
                lineToRelative(-1.987f, 3.995f)
                curveToRelative(-0.369f, 0.741f, -0.067f, 1.642f, 0.675f, 2.011f)
                curveToRelative(0.215f, 0.107f, 0.442f, 0.157f, 0.667f, 0.157f)
                curveToRelative(0.551f, 0.0f, 1.082f, -0.305f, 1.344f, -0.832f)
                lineToRelative(2.156f, -4.333f)
                curveToRelative(0.095f, -0.19f, 0.247f, -0.345f, 0.436f, -0.443f)
                lineToRelative(0.862f, -0.445f)
                curveToRelative(-0.815f, 0.96f, -1.309f, 2.199f, -1.309f, 3.553f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-6.853f)
                curveToRelative(0.0f, -1.308f, 0.939f, -2.501f, 2.239f, -2.634f)
                curveToRelative(1.495f, -0.152f, 2.761f, 1.022f, 2.761f, 2.487f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.642f, -1.149f, 1.738f, -1.993f, 2.263f)
                reflectiveCurveToRelative(-1.241f, 1.622f, -0.841f, 2.534f)
                curveToRelative(0.338f, 0.77f, 1.077f, 1.203f, 1.836f, 1.203f)
                curveToRelative(0.349f, 0.0f, 0.702f, -0.091f, 1.023f, -0.283f)
                curveToRelative(0.213f, -0.127f, 1.293f, -0.802f, 2.274f, -1.881f)
                lineToRelative(5.129f, -5.535f)
                curveToRelative(1.011f, -1.106f, 1.571f, -2.55f, 1.571f, -4.048f)
                verticalLineToRelative(-4.253f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                horizontalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _picking!!
    }

private var _picking: ImageVector? = null
