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

public val Icons.Bold.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.305f, 7.065f)
                    lineTo(13.525f, 4.285f)
                    lineTo(13.5f, 24.0f)
                    horizontalLineTo(10.5f)
                    lineTo(10.525f, 4.3f)
                    lineTo(7.761f, 7.065f)
                    lineTo(5.6399f, 4.944f)
                    lineTo(9.558f, 1.025f)
                    curveTo(10.2143f, 0.3688f, 11.1044f, 2.0E-4f, 12.0325f, 2.0E-4f)
                    curveTo(12.9605f, 2.0E-4f, 13.8506f, 0.3688f, 14.507f, 1.025f)
                    lineTo(18.425f, 4.944f)
                    lineTo(16.305f, 7.065f)
                    close()
                }
            }
        }
        .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
