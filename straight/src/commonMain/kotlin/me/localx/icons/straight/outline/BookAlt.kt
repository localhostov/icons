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

public val Icons.Outline.BookAlt: ImageVector
    get() {
        if (_bookAlt != null) {
            return _bookAlt!!
        }
        _bookAlt = Builder(name = "BookAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.922f, 1.7f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, false, -2.458f, -0.648f)
                lineToRelative(-6.18f, 1.123f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 12.0f, 3.461f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 9.716f, 2.172f)
                lineTo(3.536f, 1.049f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.0f)
                lineTo(0.0f, 20.834f)
                lineToRelative(12.0f, 2.183f)
                lineToRelative(12.0f, -2.183f)
                lineTo(24.0f, 4.0f)
                arcTo(2.992f, 2.992f, 0.0f, false, false, 22.922f, 1.7f)
                close()
                moveTo(11.0f, 20.8f)
                lineTo(2.0f, 19.166f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.179f, -0.983f)
                lineTo(9.358f, 4.14f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 6.108f)
                close()
                moveTo(22.0f, 19.164f)
                lineTo(13.0f, 20.8f)
                lineTo(13.0f, 6.108f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.642f, 4.14f)
                lineToRelative(6.179f, -1.123f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bookAlt!!
    }

private var _bookAlt: ImageVector? = null
