package me.localx.icons.straight.outline

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

public val Icons.Outline.TextCheck: ImageVector
    get() {
        if (_textCheck != null) {
            return _textCheck!!
        }
        _textCheck = Builder(name = "TextCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.236f, 14.236f)
                lineTo(7.118f, 0.0f)
                lineTo(0.0f, 14.236f)
                lineTo(2.236f, 14.236f)
                lineToRelative(2.0f, -4.0f)
                lineTo(10.0f, 10.236f)
                lineToRelative(2.0f, 4.0f)
                close()
                moveTo(5.236f, 8.236f)
                lineTo(7.118f, 4.472f)
                lineTo(9.0f, 8.236f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.997f, 24.0f)
                lineToRelative(-5.707f, -5.707f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(4.293f, 4.293f)
                lineToRelative(9.589f, -9.589f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-11.003f, 11.003f)
                close()
            }
        }
        .build()
        return _textCheck!!
    }

private var _textCheck: ImageVector? = null
