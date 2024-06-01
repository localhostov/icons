package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.6592f, 17.788f)
                    lineTo(13.0262f, 21.42f)
                    lineTo(13.0002f, 0.0f)
                    horizontalLineTo(11.0002f)
                    lineTo(11.0262f, 21.407f)
                    lineTo(7.4062f, 17.787f)
                    lineTo(5.9922f, 19.2f)
                    lineTo(9.9112f, 23.119f)
                    curveTo(10.1898f, 23.3976f, 10.5205f, 23.6187f, 10.8846f, 23.7694f)
                    curveTo(11.2486f, 23.9202f, 11.6387f, 23.9979f, 12.0327f, 23.9979f)
                    curveTo(12.4267f, 23.9979f, 12.8169f, 23.9202f, 13.1809f, 23.7694f)
                    curveTo(13.5449f, 23.6187f, 13.8756f, 23.3976f, 14.1542f, 23.119f)
                    lineTo(18.0732f, 19.2f)
                    lineTo(16.6592f, 17.788f)
                    close()
                }
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
