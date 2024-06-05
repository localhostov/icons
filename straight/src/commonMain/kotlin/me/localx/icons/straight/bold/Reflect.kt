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

public val Icons.Bold.Reflect: ImageVector
    get() {
        if (_reflect != null) {
            return _reflect!!
        }
        _reflect = Builder(name = "Reflect", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.5f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(9.671f, 0.516f)
                lineTo(9.544f, 0.43f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.008f)
                close()
                moveTo(8.0f, 3.012f)
                lineTo(11.992f, 6.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(9.544f, 23.57f)
                lineTo(21.008f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(3.012f, 3.012f, 0.0f, false, false, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.544f, 23.57f)
                close()
                moveTo(11.992f, 18.0f)
                lineTo(8.0f, 20.988f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _reflect!!
    }

private var _reflect: ImageVector? = null
