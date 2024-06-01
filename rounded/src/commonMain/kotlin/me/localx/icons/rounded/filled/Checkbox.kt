package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Checkbox: ImageVector
    get() {
        if (_checkbox != null) {
            return _checkbox!!
        }
        _checkbox = Builder(name = "Checkbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 0.0f)
                    horizontalLineTo(5.0f)
                    curveTo(2.24f, 0.0033f, 0.0033f, 2.24f, 0.0f, 5.0f)
                    verticalLineTo(19.0f)
                    curveTo(0.0033f, 21.76f, 2.24f, 23.9967f, 5.0f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(21.76f, 23.9967f, 23.9967f, 21.76f, 24.0f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(23.9967f, 2.24f, 21.76f, 0.0033f, 19.0f, 0.0f)
                    close()
                    moveTo(20.0f, 8.079f)
                    lineTo(10.746f, 17.333f)
                    curveTo(9.9651f, 18.1142f, 8.6988f, 18.1145f, 7.9176f, 17.3336f)
                    curveTo(7.9174f, 17.3334f, 7.9172f, 17.3332f, 7.917f, 17.333f)
                    lineTo(4.0f, 13.417f)
                    curveTo(3.6087f, 13.0257f, 3.6087f, 12.3913f, 4.0f, 12.0f)
                    curveTo(4.3913f, 11.6088f, 5.0257f, 11.6087f, 5.417f, 12.0f)
                    lineTo(9.3329f, 15.916f)
                    lineTo(18.588f, 6.662f)
                    curveTo(18.9793f, 6.2721f, 19.6125f, 6.2732f, 20.0025f, 6.6645f)
                    curveTo(20.3924f, 7.0558f, 20.3913f, 7.6891f, 20.0f, 8.079f)
                    close()
                }
            }
        }
        .build()
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
