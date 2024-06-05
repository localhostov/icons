package me.localx.icons.straight.bold

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

public val Icons.Bold.Tachometer: ImageVector
    get() {
        if (_tachometer != null) {
            return _tachometer!!
        }
        _tachometer = Builder(name = "Tachometer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.536f, 9.535f)
                lineTo(14.0f, 13.073f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.177f, -2.065f)
                lineToRelative(3.594f, -3.594f)
                close()
                moveTo(24.0f, 13.0f)
                arcToRelative(12.037f, 12.037f, 0.0f, false, true, -4.967f, 9.714f)
                lineTo(18.64f, 23.0f)
                lineTo(5.36f, 23.0f)
                lineToRelative(-0.393f, -0.286f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 13.0f)
                close()
                moveTo(21.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, true, false, 6.354f, 20.0f)
                lineTo(17.646f, 20.0f)
                arcTo(9.032f, 9.032f, 0.0f, false, false, 21.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometer!!
    }

private var _tachometer: ImageVector? = null
