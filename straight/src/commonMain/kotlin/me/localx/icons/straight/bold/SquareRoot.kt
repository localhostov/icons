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

public val Icons.Bold.SquareRoot: ImageVector
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
                    moveTo(9.123f, 22.0006f)
                    horizontalLineTo(5.984f)
                    lineTo(2.11f, 12.3146f)
                    curveTo(2.0728f, 12.2219f, 2.0088f, 12.1425f, 1.9261f, 12.0865f)
                    curveTo(1.8434f, 12.0306f, 1.7458f, 12.0006f, 1.646f, 12.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.0006f)
                    horizontalLineTo(1.646f)
                    curveTo(2.3467f, 8.9977f, 3.032f, 9.206f, 3.6125f, 9.5985f)
                    curveTo(4.1929f, 9.991f, 4.6416f, 10.5493f, 4.9f, 11.2006f)
                    lineTo(7.36f, 17.3616f)
                    lineTo(11.139f, 4.5126f)
                    curveTo(11.3552f, 3.7885f, 11.7988f, 3.1533f, 12.4041f, 2.7009f)
                    curveTo(13.0095f, 2.2485f, 13.7443f, 2.0029f, 14.5f, 2.0006f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.0006f)
                    horizontalLineTo(14.5f)
                    curveTo(14.3921f, 5.0008f, 14.2872f, 5.0358f, 14.2008f, 5.1005f)
                    curveTo(14.1145f, 5.1652f, 14.0514f, 5.2561f, 14.021f, 5.3596f)
                    lineTo(9.123f, 22.0006f)
                    close()
                    moveTo(20.761f, 17.0006f)
                    lineTo(24.0f, 12.0006f)
                    horizontalLineTo(20.478f)
                    lineTo(19.0f, 14.2816f)
                    lineTo(17.522f, 12.0006f)
                    horizontalLineTo(14.0f)
                    lineTo(17.239f, 17.0006f)
                    lineTo(14.0f, 22.0006f)
                    horizontalLineTo(17.522f)
                    lineTo(19.0f, 19.7196f)
                    lineTo(20.478f, 22.0006f)
                    horizontalLineTo(24.0f)
                    lineTo(20.761f, 17.0006f)
                    close()
                }
            }
        }
        .build()
        return _squareRoot!!
    }

private var _squareRoot: ImageVector? = null
