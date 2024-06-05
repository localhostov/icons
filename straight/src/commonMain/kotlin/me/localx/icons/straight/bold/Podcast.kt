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

public val Icons.Bold.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(name = "Podcast", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 12.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(13.94f, 16.413f)
                curveToRelative(-0.666f, -0.218f, -1.41f, -0.413f, -1.94f, -0.413f)
                curveToRelative(-0.526f, 0.0f, -1.264f, 0.192f, -1.927f, 0.408f)
                curveToRelative(-0.911f, 0.297f, -1.454f, 1.229f, -1.277f, 2.171f)
                lineToRelative(1.204f, 5.421f)
                horizontalLineToRelative(4.072f)
                lineToRelative(1.148f, -5.433f)
                curveToRelative(0.167f, -0.937f, -0.375f, -1.859f, -1.28f, -2.154f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 5.13f, 3.241f, 9.505f, 7.778f, 11.218f)
                lineToRelative(-0.841f, -3.783f)
                curveToRelative(-2.374f, -1.622f, -3.937f, -4.349f, -3.937f, -7.435f)
                curveTo(3.0f, 7.037f, 7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                curveToRelative(0.0f, 3.077f, -1.554f, 5.796f, -3.917f, 7.42f)
                lineToRelative(-0.797f, 3.775f)
                curveToRelative(4.504f, -1.73f, 7.714f, -6.089f, 7.714f, -11.195f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, -3.859f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.141f, -7.0f, 7.0f)
                curveToRelative(0.0f, 1.906f, 0.768f, 3.635f, 2.008f, 4.898f)
                curveToRelative(0.35f, -0.977f, 1.079f, -1.777f, 2.044f, -2.218f)
                curveToRelative(-0.647f, -0.711f, -1.052f, -1.646f, -1.052f, -2.68f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.034f, -0.405f, 1.969f, -1.051f, 2.679f)
                curveToRelative(0.967f, 0.439f, 1.7f, 1.239f, 2.056f, 2.205f)
                curveToRelative(1.232f, -1.262f, 1.995f, -2.985f, 1.995f, -4.884f)
                close()
            }
        }
        .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
