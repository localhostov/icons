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

public val Icons.Bold.TextCheck: ImageVector
    get() {
        if (_textCheck != null) {
            return _textCheck!!
        }
        _textCheck = Builder(name = "TextCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.121f)
                lineToRelative(-6.061f, -6.06f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(3.939f, 3.94f)
                lineToRelative(8.939f, -8.94f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(-11.061f, 11.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.146f, 15.0f)
                horizontalLineTo(15.5f)
                lineTo(8.0f, 0.0f)
                lineTo(0.5f, 15.0f)
                horizontalLineTo(3.854f)
                lineToRelative(1.0f, -2.0f)
                horizontalLineToRelative(6.292f)
                close()
                moveTo(6.354f, 10.0f)
                lineTo(8.0f, 6.708f)
                lineTo(9.646f, 10.0f)
                close()
            }
        }
        .build()
        return _textCheck!!
    }

private var _textCheck: ImageVector? = null
