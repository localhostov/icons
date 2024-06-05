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

public val Icons.Filled.W: ImageVector
    get() {
        if (_w != null) {
            return _w!!
        }
        _w = Builder(name = "W", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.964f, 0.0f)
                lineToRelative(-4.164f, 21.593f)
                curveToRelative(-0.06f, 0.312f, -0.309f, 0.384f, -0.413f, 0.4f)
                curveToRelative(-0.104f, 0.018f, -0.363f, 0.026f, -0.478f, -0.175f)
                lineToRelative(-4.909f, -11.207f)
                lineToRelative(-4.871f, 11.128f)
                curveToRelative(-0.152f, 0.279f, -0.412f, 0.272f, -0.516f, 0.254f)
                curveToRelative(-0.104f, -0.017f, -0.354f, -0.088f, -0.414f, -0.4f)
                lineTo(2.036f, 0.0f)
                horizontalLineTo(0.0f)
                lineTo(4.235f, 21.968f)
                curveToRelative(0.2f, 1.05f, 1.012f, 1.835f, 2.067f, 2.001f)
                curveToRelative(1.054f, 0.168f, 2.068f, -0.332f, 2.62f, -1.348f)
                lineToRelative(3.078f, -7.026f)
                lineToRelative(3.116f, 7.105f)
                curveToRelative(0.447f, 0.817f, 1.275f, 1.301f, 2.18f, 1.301f)
                curveToRelative(0.133f, 0.0f, 0.267f, -0.011f, 0.401f, -0.032f)
                curveToRelative(1.056f, -0.166f, 1.867f, -0.951f, 2.067f, -2.001f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-2.036f)
                close()
            }
        }
        .build()
        return _w!!
    }

private var _w: ImageVector? = null
