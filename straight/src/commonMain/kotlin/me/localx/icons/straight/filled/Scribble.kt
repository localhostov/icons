package me.localx.icons.straight.filled

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

public val Icons.Filled.Scribble: ImageVector
    get() {
        if (_scribble != null) {
            return _scribble!!
        }
        _scribble = Builder(name = "Scribble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.071f, 23.973f)
                curveToRelative(-1.298f, 0.0f, -2.5f, -0.487f, -3.385f, -1.372f)
                curveToRelative(-0.885f, -0.886f, -1.373f, -2.062f, -1.373f, -3.314f)
                reflectiveCurveToRelative(0.488f, -2.43f, 1.373f, -3.314f)
                lineToRelative(7.893f, -7.894f)
                curveToRelative(0.283f, -0.283f, 0.439f, -0.659f, 0.439f, -1.061f)
                reflectiveCurveToRelative(-0.156f, -0.777f, -0.439f, -1.061f)
                curveToRelative(-0.566f, -0.565f, -1.555f, -0.567f, -2.121f, 0.0f)
                lineToRelative(-13.5f, 13.5f)
                curveToRelative(-1.321f, 1.322f, -3.627f, 1.322f, -4.95f, 0.0f)
                curveTo(0.346f, 18.796f, -0.018f, 17.917f, -0.018f, 16.982f)
                reflectiveCurveToRelative(0.364f, -1.814f, 1.025f, -2.475f)
                lineTo(11.064f, 4.557f)
                curveToRelative(0.581f, -0.581f, 0.581f, -1.532f, -0.004f, -2.117f)
                curveToRelative(-0.566f, -0.566f, -1.555f, -0.566f, -2.121f, 0.0f)
                lineTo(1.529f, 9.743f)
                lineTo(0.125f, 8.319f)
                lineTo(7.53f, 1.021f)
                curveToRelative(1.312f, -1.312f, 3.623f, -1.317f, 4.945f, 0.005f)
                curveToRelative(1.364f, 1.364f, 1.364f, 3.585f, 0.0f, 4.949f)
                lineTo(2.417f, 15.926f)
                curveToRelative(-0.279f, 0.279f, -0.435f, 0.655f, -0.435f, 1.057f)
                reflectiveCurveToRelative(0.156f, 0.777f, 0.439f, 1.061f)
                curveToRelative(0.566f, 0.565f, 1.555f, 0.567f, 2.121f, 0.0f)
                lineToRelative(13.5f, -13.5f)
                curveToRelative(1.321f, -1.322f, 3.627f, -1.322f, 4.95f, 0.0f)
                curveToRelative(0.661f, 0.661f, 1.025f, 1.54f, 1.025f, 2.475f)
                reflectiveCurveToRelative(-0.364f, 1.814f, -1.025f, 2.475f)
                lineToRelative(-7.893f, 7.894f)
                curveToRelative(-0.507f, 0.508f, -0.787f, 1.183f, -0.787f, 1.9f)
                reflectiveCurveToRelative(0.28f, 1.393f, 0.787f, 1.9f)
                curveToRelative(0.507f, 0.507f, 1.208f, 0.786f, 1.971f, 0.786f)
                curveToRelative(2.043f, 0.0f, 4.797f, -1.748f, 5.686f, -2.421f)
                lineToRelative(1.208f, 1.594f)
                curveToRelative(-0.152f, 0.115f, -3.767f, 2.827f, -6.894f, 2.827f)
                close()
            }
        }
        .build()
        return _scribble!!
    }

private var _scribble: ImageVector? = null
