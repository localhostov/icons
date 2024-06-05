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

public val Icons.Filled.Reflect: ImageVector
    get() {
        if (_reflect != null) {
            return _reflect!!
        }
        _reflect = Builder(name = "Reflect", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(8.886f, 0.427f)
                lineTo(8.786f, 0.359f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.786f, 2.141f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(14.916f)
                close()
                moveTo(8.786f, 23.641f)
                lineTo(19.916f, 15.0f)
                horizontalLineToRelative(-14.916f)
                verticalLineToRelative(6.5f)
                arcToRelative(2.494f, 2.494f, 0.0f, false, false, 3.787f, 2.143f)
                close()
            }
        }
        .build()
        return _reflect!!
    }

private var _reflect: ImageVector? = null
