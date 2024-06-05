package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.TextCheck: ImageVector
    get() {
        if (_textCheck != null) {
            return _textCheck!!
        }
        _textCheck = Builder(name = "TextCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.107f, 14.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.789f, -0.894f)
                lineToRelative(-5.5f, -11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.789f, 0.0f)
                lineToRelative(-5.5f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.789f, 0.894f)
                lineTo(3.619f, 11.0f)
                horizontalLineTo(9.383f)
                close()
                moveTo(4.619f, 9.0f)
                lineTo(6.5f, 5.236f)
                lineTo(8.383f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 11.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(13.0f, 20.586f)
                lineTo(8.707f, 16.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, 1.414f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(10.0f, -10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.707f, 11.293f)
                close()
            }
        }
        .build()
        return _textCheck!!
    }

private var _textCheck: ImageVector? = null
