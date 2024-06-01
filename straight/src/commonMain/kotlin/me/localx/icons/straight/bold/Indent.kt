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

public val Icons.Bold.Indent: ImageVector
    get() {
        if (_indent != null) {
            return _indent!!
        }
        _indent = Builder(name = "Indent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 3.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9999f, 7.9996f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(10.9996f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(7.9996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 18.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(18.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9999f, 13.0004f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(16.0004f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(13.0004f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 7.0002f)
                    verticalLineTo(17.0002f)
                    lineTo(5.078f, 12.7682f)
                    curveTo(5.1905f, 12.6744f, 5.2811f, 12.557f, 5.3432f, 12.4242f)
                    curveTo(5.4053f, 12.2915f, 5.4376f, 12.1468f, 5.4376f, 12.0002f)
                    curveTo(5.4376f, 11.8537f, 5.4053f, 11.709f, 5.3432f, 11.5762f)
                    curveTo(5.2811f, 11.4435f, 5.1905f, 11.3261f, 5.078f, 11.2322f)
                    lineTo(0.0f, 7.0002f)
                    close()
                }
            }
        }
        .build()
        return _indent!!
    }

private var _indent: ImageVector? = null
