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

public val Icons.Filled.TachometerSlow: ImageVector
    get() {
        if (_tachometerSlow != null) {
            return _tachometerSlow!!
        }
        _tachometerSlow = Builder(name = "TachometerSlow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.0f)
                arcToRelative(12.019f, 12.019f, 0.0f, false, false, 5.112f, 9.818f)
                lineToRelative(0.639f, 0.449f)
                lineTo(8.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(2.249f, 3.267f)
                lineToRelative(0.639f, -0.449f)
                curveTo(28.417f, 16.166f, 23.622f, 0.98f, 12.0f, 1.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 13.0f)
                close()
                moveTo(10.586f, 14.414f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, true, -0.511f, -1.925f)
                lineTo(4.929f, 7.343f)
                lineTo(6.343f, 5.929f)
                lineToRelative(5.146f, 5.146f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.9f, 3.339f)
                close()
            }
        }
        .build()
        return _tachometerSlow!!
    }

private var _tachometerSlow: ImageVector? = null
