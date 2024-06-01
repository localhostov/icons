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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.TextCheck: ImageVector
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
                    moveTo(14.236f, 14.236f)
                    lineTo(7.118f, 0.0f)
                    lineTo(0.0f, 14.236f)
                    horizontalLineTo(2.236f)
                    lineTo(4.236f, 10.236f)
                    horizontalLineTo(10.0f)
                    lineTo(12.0f, 14.236f)
                    horizontalLineTo(14.236f)
                    close()
                    moveTo(5.236f, 8.236f)
                    lineTo(7.118f, 4.472f)
                    lineTo(9.0f, 8.236f)
                    horizontalLineTo(5.236f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.997f, 24.0005f)
                    lineTo(7.29f, 18.2935f)
                    lineTo(8.704f, 16.8795f)
                    lineTo(12.997f, 21.1725f)
                    lineTo(22.586f, 11.5835f)
                    lineTo(24.0f, 12.9975f)
                    lineTo(12.997f, 24.0005f)
                    close()
                }
            }
        }
        .build()
        return _textCheck!!
    }

private var _textCheck: ImageVector? = null
