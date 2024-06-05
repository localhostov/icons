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

public val Icons.Filled.Tachometer: ImageVector
    get() {
        if (_tachometer != null) {
            return _tachometer!!
        }
        _tachometer = Builder(name = "Tachometer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(0.373f, 0.981f, -4.414f, 16.17f, 5.112f, 22.818f)
                lineTo(5.371f, 23.0f)
                lineTo(18.629f, 23.0f)
                lineToRelative(0.259f, -0.182f)
                curveTo(28.418f, 16.167f, 23.621f, 0.98f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(1.994f, 1.994f, 0.0f, true, true, 0.512f, -3.926f)
                lineToRelative(4.781f, -4.781f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-4.781f, 4.781f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _tachometer!!
    }

private var _tachometer: ImageVector? = null
