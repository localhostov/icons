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

public val Icons.Outline.Reflect: ImageVector
    get() {
        if (_reflect != null) {
            return _reflect!!
        }
        _reflect = Builder(name = "Reflect", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(8.886f, 0.427f)
                lineToRelative(-0.1f, -0.068f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.0f, 2.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.916f)
                close()
                moveTo(7.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.718f, -0.45f)
                lineTo(14.084f, 7.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(8.787f, 23.641f)
                lineTo(19.916f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(6.5f)
                arcToRelative(2.494f, 2.494f, 0.0f, false, false, 3.787f, 2.143f)
                close()
                moveTo(14.084f, 17.0f)
                lineTo(7.718f, 21.948f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 21.5f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _reflect!!
    }

private var _reflect: ImageVector? = null
