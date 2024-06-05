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

public val Icons.Filled.ThoughtBubble: ImageVector
    get() {
        if (_thoughtBubble != null) {
            return _thoughtBubble!!
        }
        _thoughtBubble = Builder(name = "ThoughtBubble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(6.0f, 17.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(15.845f, 15.58f)
                curveToRelative(0.699f, 0.279f, 1.422f, 0.42f, 2.155f, 0.42f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -2.733f, -1.823f, -5.069f, -4.416f, -5.772f)
                curveToRelative(-0.938f, -2.518f, -3.356f, -4.228f, -6.084f, -4.228f)
                curveToRelative(-1.879f, 0.0f, -3.652f, 0.819f, -4.88f, 2.223f)
                curveToRelative(-0.524f, -0.147f, -1.067f, -0.223f, -1.62f, -0.223f)
                curveTo(3.691f, 2.0f, 1.0f, 4.691f, 1.0f, 8.0f)
                curveToRelative(0.0f, 3.242f, 2.585f, 5.892f, 5.802f, 5.997f)
                curveToRelative(1.062f, 1.845f, 3.032f, 3.003f, 5.198f, 3.003f)
                curveToRelative(1.426f, 0.0f, 2.767f, -0.499f, 3.845f, -1.42f)
                close()
            }
        }
        .build()
        return _thoughtBubble!!
    }

private var _thoughtBubble: ImageVector? = null
