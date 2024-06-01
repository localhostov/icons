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

public val Icons.Filled.ArrowUp: ImageVector
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
                    moveTo(18.0732f, 4.7691f)
                    lineTo(14.1542f, 0.8501f)
                    curveTo(13.5827f, 0.3047f, 12.8231f, 4.0E-4f, 12.0332f, 4.0E-4f)
                    curveTo(11.2432f, 4.0E-4f, 10.4836f, 0.3047f, 9.9122f, 0.8501f)
                    lineTo(5.9922f, 4.7691f)
                    lineTo(7.4062f, 6.1831f)
                    lineTo(11.0392f, 2.5511f)
                    lineTo(11.0652f, 24.0001f)
                    horizontalLineTo(13.0652f)
                    lineTo(13.0392f, 2.5621f)
                    lineTo(16.6592f, 6.1831f)
                    lineTo(18.0732f, 4.7691f)
                    close()
                }
            }
        }
        .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
