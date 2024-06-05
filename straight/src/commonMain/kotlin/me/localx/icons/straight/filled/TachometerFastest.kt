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

public val Icons.Filled.TachometerFastest: ImageVector
    get() {
        if (_tachometerFastest != null) {
            return _tachometerFastest!!
        }
        _tachometerFastest = Builder(name = "TachometerFastest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.169f, 12.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.81f, 0.581f)
                lineTo(20.643f, 15.7f)
                lineToRelative(-0.8f, 1.831f)
                lineToRelative(-6.664f, -2.924f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.169f, 12.2f)
                close()
            }
        }
        .build()
        return _tachometerFastest!!
    }

private var _tachometerFastest: ImageVector? = null
