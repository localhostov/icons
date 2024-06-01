package me.localx.icons.straight.bold

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

public val Icons.Bold.ArrowDown: ImageVector
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
                    moveTo(16.3052f, 16.935f)
                    lineTo(13.5252f, 19.715f)
                    lineTo(13.5002f, 0.0f)
                    horizontalLineTo(10.5002f)
                    lineTo(10.5252f, 19.7f)
                    lineTo(7.7612f, 16.935f)
                    lineTo(5.6402f, 19.056f)
                    lineTo(9.5582f, 22.975f)
                    curveTo(10.2145f, 23.6311f, 11.1046f, 23.9998f, 12.0327f, 23.9998f)
                    curveTo(12.9607f, 23.9998f, 13.8508f, 23.6311f, 14.5072f, 22.975f)
                    lineTo(18.4252f, 19.056f)
                    lineTo(16.3052f, 16.935f)
                    close()
                }
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
