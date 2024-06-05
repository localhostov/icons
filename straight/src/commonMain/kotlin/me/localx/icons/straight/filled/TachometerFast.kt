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

public val Icons.Filled.TachometerFast: ImageVector
    get() {
        if (_tachometerFast != null) {
            return _tachometerFast!!
        }
        _tachometerFast = Builder(name = "TachometerFast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(0.374f, 0.982f, -4.414f, 16.17f, 5.112f, 22.818f)
                lineToRelative(0.639f, 0.449f)
                lineTo(8.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(2.249f, 3.267f)
                lineToRelative(0.639f, -0.449f)
                curveTo(28.418f, 16.166f, 23.621f, 0.98f, 12.0f, 1.0f)
                close()
                moveTo(10.586f, 14.414f)
                arcToRelative(2.005f, 2.005f, 0.0f, false, true, 1.925f, -3.339f)
                lineToRelative(5.146f, -5.146f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.146f, 5.146f)
                arcTo(2.005f, 2.005f, 0.0f, false, true, 10.586f, 14.414f)
                close()
            }
        }
        .build()
        return _tachometerFast!!
    }

private var _tachometerFast: ImageVector? = null
