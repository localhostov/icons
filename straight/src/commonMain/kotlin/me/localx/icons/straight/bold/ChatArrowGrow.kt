package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.ChatArrowGrow: ImageVector
    get() {
        if (_chatArrowGrow != null) {
            return _chatArrowGrow!!
        }
        _chatArrowGrow = Builder(name = "ChatArrowGrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 20.5f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.5f, 24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 20.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 5.0f)
                horizontalLineTo(17.0f)
                lineToRelative(2.439f, 2.439f)
                lineTo(16.0f, 10.879f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-7.061f, 7.06f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(4.939f, -4.94f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(5.561f, -5.56f)
                lineTo(24.0f, 12.0f)
                verticalLineTo(6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 5.0f)
                close()
            }
        }
        .build()
        return _chatArrowGrow!!
    }

private var _chatArrowGrow: ImageVector? = null
