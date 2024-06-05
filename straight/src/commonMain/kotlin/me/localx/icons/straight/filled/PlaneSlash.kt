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

public val Icons.Filled.PlaneSlash: ImageVector
    get() {
        if (_planeSlash != null) {
            return _planeSlash!!
        }
        _planeSlash = Builder(name = "PlaneSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.15f, 15.736f)
                lineToRelative(6.807f, 6.807f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(8.957f, 8.957f)
                horizontalLineToRelative(0.597f)
                lineTo(7.973f, 0.0f)
                horizontalLineToRelative(2.812f)
                curveToRelative(1.099f, 0.0f, 2.107f, 0.599f, 2.634f, 1.563f)
                lineToRelative(4.142f, 7.437f)
                horizontalLineToRelative(3.305f)
                curveToRelative(1.516f, 0.0f, 2.835f, 1.076f, 3.067f, 2.503f)
                curveToRelative(0.143f, 0.878f, -0.103f, 1.768f, -0.674f, 2.439f)
                curveToRelative(-0.571f, 0.672f, -1.404f, 1.058f, -2.286f, 1.058f)
                horizontalLineToRelative(-3.412f)
                lineToRelative(-0.41f, 0.736f)
                close()
                moveTo(7.972f, 24.0f)
                horizontalLineToRelative(2.812f)
                curveToRelative(1.099f, 0.0f, 2.107f, -0.599f, 2.63f, -1.556f)
                lineToRelative(1.722f, -3.093f)
                lineToRelative(-4.183f, -4.183f)
                lineToRelative(-2.982f, 8.832f)
                close()
                moveTo(1.787f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineToRelative(2.213f, 6.001f)
                lineTo(0.016f, 18.0f)
                horizontalLineToRelative(2.369f)
                curveToRelative(1.009f, 0.0f, 1.944f, -0.502f, 2.503f, -1.347f)
                lineToRelative(1.085f, -1.653f)
                horizontalLineToRelative(4.814f)
                lineTo(1.787f, 6.0f)
                close()
            }
        }
        .build()
        return _planeSlash!!
    }

private var _planeSlash: ImageVector? = null
