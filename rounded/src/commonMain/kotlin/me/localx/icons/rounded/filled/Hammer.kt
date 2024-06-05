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

public val Icons.Filled.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.507f, 13.785f)
                lineTo(5.127f, 23.117f)
                curveToRelative(-0.628f, 0.636f, -1.477f, 0.93f, -2.31f, 0.88f)
                curveToRelative(-0.7f, -0.042f, -1.388f, -0.327f, -1.926f, -0.858f)
                curveToRelative(-1.177f, -1.164f, -1.189f, -3.067f, -0.026f, -4.243f)
                lineTo(10.274f, 9.533f)
                lineToRelative(4.232f, 4.252f)
                close()
                moveTo(20.976f, 7.597f)
                lineToRelative(-4.96f, -5.009f)
                curveTo(12.849f, -0.535f, 9.631f, -0.166f, 7.994f, 0.331f)
                curveToRelative(-0.69f, 0.211f, -1.202f, 0.752f, -1.371f, 1.449f)
                curveToRelative(-0.168f, 0.689f, 0.035f, 1.396f, 0.541f, 1.894f)
                lineToRelative(8.871f, 8.912f)
                lineToRelative(4.941f, -4.989f)
                close()
                moveTo(23.146f, 9.788f)
                lineToRelative(-0.762f, -0.77f)
                lineToRelative(-4.937f, 4.986f)
                lineToRelative(0.719f, 0.722f)
                curveToRelative(0.524f, 0.528f, 1.118f, 0.831f, 2.133f, 0.886f)
                curveToRelative(0.806f, 0.044f, 1.563f, -0.318f, 2.131f, -0.893f)
                lineToRelative(0.712f, -0.722f)
                curveToRelative(1.143f, -1.157f, 1.147f, -3.044f, 0.005f, -4.21f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
