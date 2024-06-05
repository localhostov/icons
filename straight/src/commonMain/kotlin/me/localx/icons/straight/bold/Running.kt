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

public val Icons.Bold.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(name = "Running", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 14.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 2.5f)
                close()
                moveTo(18.681f, 10.0f)
                lineTo(16.227f, 7.2f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 13.592f, 6.0f)
                horizontalLineTo(5.168f)
                lineToRelative(-2.94f, 4.705f)
                lineTo(4.772f, 12.3f)
                lineTo(6.832f, 9.0f)
                horizontalLineTo(9.5f)
                lineTo(8.239f, 12.084f)
                arcToRelative(3.511f, 3.511f, 0.0f, false, false, 1.427f, 4.322f)
                lineTo(14.0f, 18.872f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(17.128f)
                lineTo(12.561f, 14.6f)
                lineToRelative(1.992f, -4.765f)
                lineTo(17.319f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(7.392f, 17.028f)
                lineToRelative(-0.4f, 0.972f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(9.0f)
                lineToRelative(0.892f, -2.164f)
                lineToRelative(-1.215f, -0.692f)
                arcTo(5.879f, 5.879f, 0.0f, false, true, 7.392f, 17.028f)
                close()
            }
        }
        .build()
        return _running!!
    }

private var _running: ImageVector? = null
