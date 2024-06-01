package me.localx.icons.straight.outline

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

public val Icons.Outline.SquareRoot: ImageVector
    get() {
        if (_squareRoot != null) {
            return _squareRoot!!
        }
        _squareRoot = Builder(name = "SquareRoot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.76f, 22.0006f)
                    horizontalLineTo(6.3f)
                    lineTo(2.539f, 11.6586f)
                    curveTo(2.4688f, 11.4659f, 2.3411f, 11.2994f, 2.1732f, 11.1817f)
                    curveTo(2.0052f, 11.064f, 1.8051f, 11.0008f, 1.6f, 11.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.0006f)
                    horizontalLineTo(1.6f)
                    curveTo(2.2155f, 9.0017f, 2.8159f, 9.1917f, 3.32f, 9.5449f)
                    curveTo(3.8242f, 9.8981f, 4.2077f, 10.3975f, 4.419f, 10.9756f)
                    lineTo(7.44f, 19.2826f)
                    lineTo(11.63f, 4.2006f)
                    curveTo(11.8063f, 3.569f, 12.1842f, 3.0122f, 12.706f, 2.6151f)
                    curveTo(13.2279f, 2.218f, 13.8652f, 2.0022f, 14.521f, 2.0006f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(4.0006f)
                    horizontalLineTo(14.521f)
                    curveTo(14.3024f, 4.0005f, 14.0898f, 4.072f, 13.9157f, 4.2042f)
                    curveTo(13.7416f, 4.3364f, 13.6156f, 4.522f, 13.557f, 4.7326f)
                    lineTo(8.76f, 22.0006f)
                    close()
                    moveTo(20.693f, 17.0006f)
                    lineTo(24.0f, 12.0006f)
                    horizontalLineTo(21.615f)
                    lineTo(19.5f, 15.2006f)
                    lineTo(17.385f, 12.0006f)
                    horizontalLineTo(15.0f)
                    lineTo(18.307f, 17.0006f)
                    lineTo(15.0f, 22.0006f)
                    horizontalLineTo(17.385f)
                    lineTo(19.5f, 18.8006f)
                    lineTo(21.615f, 22.0006f)
                    horizontalLineTo(24.0f)
                    lineTo(20.693f, 17.0006f)
                    close()
                }
            }
        }
        .build()
        return _squareRoot!!
    }

private var _squareRoot: ImageVector? = null
