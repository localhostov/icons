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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.TextCheck: ImageVector
    get() {
        if (_textCheck != null) {
            return _textCheck!!
        }
        _textCheck = Builder(name = "TextCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.9998f, 24.1211f)
                    lineTo(6.9388f, 18.0611f)
                    lineTo(9.0608f, 15.9391f)
                    lineTo(12.9998f, 19.8791f)
                    lineTo(21.9388f, 10.9391f)
                    lineTo(24.0608f, 13.0611f)
                    lineTo(12.9998f, 24.1211f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.1461f, 15.0f)
                    horizontalLineTo(15.5001f)
                    lineTo(8.0001f, 0.0f)
                    lineTo(0.5001f, 15.0f)
                    horizontalLineTo(3.8541f)
                    lineTo(4.8541f, 13.0f)
                    horizontalLineTo(11.1461f)
                    lineTo(12.1461f, 15.0f)
                    close()
                    moveTo(6.3541f, 10.0f)
                    lineTo(8.0001f, 6.708f)
                    lineTo(9.6461f, 10.0f)
                    horizontalLineTo(6.3541f)
                    close()
                }
            }
        }
        .build()
        return _textCheck!!
    }

private var _textCheck: ImageVector? = null
