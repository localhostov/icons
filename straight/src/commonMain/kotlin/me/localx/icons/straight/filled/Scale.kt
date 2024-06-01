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

public val Icons.Filled.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0f, 5.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(12.087f)
                    lineTo(13.887f, 3.453f)
                    lineTo(12.103f, 2.547f)
                    lineTo(9.842f, 7.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(5.0f)
                    curveTo(7.0f, 3.6739f, 7.5268f, 2.4021f, 8.4645f, 1.4645f)
                    curveTo(9.4022f, 0.5268f, 10.6739f, 0.0f, 12.0f, 0.0f)
                    curveTo(13.3261f, 0.0f, 14.5979f, 0.5268f, 15.5355f, 1.4645f)
                    curveTo(16.4732f, 2.4021f, 17.0f, 3.6739f, 17.0f, 5.0f)
                    close()
                    moveTo(21.0f, 2.0f)
                    horizontalLineTo(18.315f)
                    curveTo(18.7645f, 2.9363f, 18.9985f, 3.9614f, 19.0f, 5.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(5.0f)
                    curveTo(5.0015f, 3.9614f, 5.2355f, 2.9363f, 5.685f, 2.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 2.0f, 1.4413f, 2.3161f, 0.8787f, 2.8787f)
                    curveTo(0.3161f, 3.4413f, 0.0f, 4.2043f, 0.0f, 5.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.0f)
                    curveTo(24.0f, 4.2043f, 23.6839f, 3.4413f, 23.1213f, 2.8787f)
                    curveTo(22.5587f, 2.3161f, 21.7956f, 2.0f, 21.0f, 2.0f)
                    close()
                }
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
