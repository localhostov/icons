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

public val Icons.Filled.Cream: ImageVector
    get() {
        if (_cream != null) {
            return _cream!!
        }
        _cream = Builder(name = "Cream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(17.0f)
                    curveTo(0.0f, 16.2044f, 0.3161f, 15.4413f, 0.8787f, 14.8787f)
                    curveTo(1.4413f, 14.3161f, 2.2043f, 14.0f, 3.0f, 14.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 14.0f, 22.5587f, 14.3161f, 23.1213f, 14.8787f)
                    curveTo(23.6839f, 15.4413f, 24.0f, 16.2044f, 24.0f, 17.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(22.0f, 9.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(19.965f, 7.0f)
                    curveTo(19.633f, 2.28f, 17.02f, 0.285f, 16.9f, 0.2f)
                    lineTo(16.637f, 0.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(1.0f)
                    curveTo(15.0172f, 1.2671f, 14.9772f, 1.5348f, 14.8828f, 1.7852f)
                    curveTo(14.7884f, 2.0357f, 14.6416f, 2.2631f, 14.4524f, 2.4524f)
                    curveTo(14.2631f, 2.6416f, 14.0357f, 2.7884f, 13.7852f, 2.8828f)
                    curveTo(13.5348f, 2.9772f, 13.2671f, 3.0172f, 13.0f, 3.0f)
                    horizontalLineTo(10.0f)
                    curveTo(8.7409f, 2.9215f, 7.4928f, 3.2752f, 6.4621f, 4.0025f)
                    curveTo(5.4314f, 4.7299f, 4.6799f, 5.7874f, 4.332f, 7.0f)
                    horizontalLineTo(19.965f)
                    close()
                }
            }
        }
        .build()
        return _cream!!
    }

private var _cream: ImageVector? = null
