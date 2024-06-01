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

public val Icons.Outline.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.0f)
                    curveTo(0.0f, 2.2043f, 0.3161f, 1.4413f, 0.8787f, 0.8787f)
                    curveTo(1.4413f, 0.3161f, 2.2043f, 0.0f, 3.0f, 0.0f)
                    lineTo(17.0f, 0.0f)
                    curveTo(17.7956f, 0.0f, 18.5587f, 0.3161f, 19.1213f, 0.8787f)
                    curveTo(19.6839f, 1.4413f, 20.0f, 2.2043f, 20.0f, 3.0f)
                    verticalLineTo(20.0f)
                    close()
                    moveTo(2.0f, 18.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(3.0f)
                    curveTo(18.0f, 2.7348f, 17.8946f, 2.4804f, 17.7071f, 2.2929f)
                    curveTo(17.5196f, 2.1054f, 17.2652f, 2.0f, 17.0f, 2.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 2.0f, 2.4804f, 2.1054f, 2.2929f, 2.2929f)
                    curveTo(2.1054f, 2.4804f, 2.0f, 2.7348f, 2.0f, 3.0f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(22.0f, 4.184f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.0f)
                    curveTo(23.9974f, 6.3817f, 23.8039f, 5.7794f, 23.4459f, 5.2753f)
                    curveTo(23.0879f, 4.7712f, 22.5829f, 4.3901f, 22.0f, 4.184f)
                    close()
                }
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
