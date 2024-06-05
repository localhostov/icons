package me.localx.icons.straight.outline

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

public val Icons.Outline.TachometerFast: ImageVector
    get() {
        if (_tachometerFast != null) {
            return _tachometerFast!!
        }
        _tachometerFast = Builder(name = "TachometerFast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.932f, 12.482f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -1.414f, -1.414f)
                lineToRelative(4.275f, -4.275f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(0.374f, 0.982f, -4.414f, 16.17f, 5.112f, 22.818f)
                lineToRelative(0.639f, 0.449f)
                lineToRelative(2.9f, -2.51f)
                lineTo(7.346f, 19.243f)
                lineToRelative(-1.7f, 1.47f)
                curveTo(-1.55f, 14.848f, 2.7f, 2.965f, 12.0f, 3.0f)
                curveToRelative(9.3f, -0.035f, 13.551f, 11.849f, 6.353f, 17.713f)
                lineToRelative(-1.7f, -1.47f)
                lineToRelative(-1.308f, 1.514f)
                lineToRelative(2.9f, 2.51f)
                lineToRelative(0.639f, -0.449f)
                curveTo(28.418f, 16.167f, 23.621f, 0.98f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _tachometerFast!!
    }

private var _tachometerFast: ImageVector? = null
