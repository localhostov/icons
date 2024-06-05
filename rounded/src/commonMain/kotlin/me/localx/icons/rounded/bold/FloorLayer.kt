package me.localx.icons.rounded.bold

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

public val Icons.Bold.FloorLayer: ImageVector
    get() {
        if (_floorLayer != null) {
            return _floorLayer!!
        }
        _floorLayer = Builder(name = "FloorLayer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.749f, 10.759f)
                lineToRelative(7.876f, 3.711f)
                curveToRelative(0.754f, 0.355f, 1.562f, 0.532f, 2.369f, 0.532f)
                curveToRelative(0.812f, 0.0f, 1.626f, -0.18f, 2.382f, -0.539f)
                lineToRelative(7.883f, -3.74f)
                curveToRelative(1.058f, -0.501f, 1.741f, -1.576f, 1.741f, -2.738f)
                reflectiveCurveToRelative(-0.687f, -2.242f, -1.748f, -2.742f)
                lineToRelative(-7.884f, -3.714f)
                curveToRelative(-1.504f, -0.709f, -3.231f, -0.709f, -4.737f, 0.0f)
                lineTo(1.748f, 5.244f)
                curveToRelative(-1.062f, 0.5f, -1.748f, 1.577f, -1.748f, 2.773f)
                curveToRelative(0.0f, 1.166f, 0.687f, 2.242f, 1.749f, 2.742f)
                close()
                moveTo(10.909f, 4.243f)
                curveToRelative(0.347f, -0.163f, 0.719f, -0.245f, 1.091f, -0.245f)
                reflectiveCurveToRelative(0.744f, 0.082f, 1.09f, 0.245f)
                lineToRelative(5.847f, 2.796f)
                lineToRelative(-6.937f, 3.269f)
                lineToRelative(-6.981f, -3.289f)
                lineToRelative(5.89f, -2.776f)
                close()
                moveTo(24.006f, 16.251f)
                curveToRelative(0.0f, 0.858f, -0.502f, 1.651f, -1.279f, 2.021f)
                lineToRelative(-8.391f, 3.711f)
                curveToRelative(-0.731f, 0.347f, -1.526f, 0.522f, -2.326f, 0.522f)
                curveToRelative(-0.81f, 0.0f, -1.624f, -0.179f, -2.383f, -0.539f)
                lineToRelative(-8.305f, -3.677f)
                curveTo(0.508f, 17.902f, 0.006f, 17.109f, 0.006f, 16.251f)
                curveToRelative(0.0f, -0.771f, 0.39f, -1.478f, 1.044f, -1.891f)
                curveToRelative(0.656f, -0.417f, 1.468f, -0.463f, 2.169f, -0.13f)
                lineToRelative(8.781f, 3.919f)
                lineToRelative(8.824f, -3.935f)
                curveToRelative(0.671f, -0.318f, 1.481f, -0.27f, 2.139f, 0.146f)
                curveToRelative(0.653f, 0.413f, 1.043f, 1.12f, 1.043f, 1.89f)
                close()
            }
        }
        .build()
        return _floorLayer!!
    }

private var _floorLayer: ImageVector? = null
