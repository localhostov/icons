package me.localx.icons.rounded.outline

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

public val Icons.Outline.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 4.0f)
                    horizontalLineTo(17.9f)
                    curveTo(17.6679f, 2.8714f, 17.0538f, 1.8573f, 16.1613f, 1.1287f)
                    curveTo(15.2687f, 0.4001f, 14.1522f, 0.0015f, 13.0f, 0.0f)
                    lineTo(11.0f, 0.0f)
                    curveTo(9.8478f, 0.0015f, 8.7313f, 0.4001f, 7.8387f, 1.1287f)
                    curveTo(6.9462f, 1.8573f, 6.3321f, 2.8714f, 6.1f, 4.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 4.0016f, 2.4036f, 4.5289f, 1.4662f, 5.4662f)
                    curveTo(0.5289f, 6.4036f, 0.0016f, 7.6744f, 0.0f, 9.0f)
                    lineTo(0.0f, 19.0f)
                    curveTo(0.0016f, 20.3256f, 0.5289f, 21.5964f, 1.4662f, 22.5338f)
                    curveTo(2.4036f, 23.4711f, 3.6744f, 23.9984f, 5.0f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9984f, 21.5964f, 23.4711f, 22.5338f, 22.5338f)
                    curveTo(23.4711f, 21.5964f, 23.9984f, 20.3256f, 24.0f, 19.0f)
                    verticalLineTo(9.0f)
                    curveTo(23.9984f, 7.6744f, 23.4711f, 6.4036f, 22.5338f, 5.4662f)
                    curveTo(21.5964f, 4.5289f, 20.3256f, 4.0016f, 19.0f, 4.0f)
                    close()
                    moveTo(11.0f, 2.0f)
                    horizontalLineTo(13.0f)
                    curveTo(13.6183f, 2.0026f, 14.2206f, 2.1961f, 14.7247f, 2.5541f)
                    curveTo(15.2288f, 2.9121f, 15.6099f, 3.4171f, 15.816f, 4.0f)
                    horizontalLineTo(8.184f)
                    curveTo(8.3901f, 3.4171f, 8.7712f, 2.9121f, 9.2753f, 2.5541f)
                    curveTo(9.7794f, 2.1961f, 10.3817f, 2.0026f, 11.0f, 2.0f)
                    close()
                    moveTo(5.0f, 6.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 6.0f, 20.5587f, 6.3161f, 21.1213f, 6.8787f)
                    curveTo(21.6839f, 7.4413f, 22.0f, 8.2044f, 22.0f, 9.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(9.0f)
                    curveTo(2.0f, 8.2044f, 2.3161f, 7.4413f, 2.8787f, 6.8787f)
                    curveTo(3.4413f, 6.3161f, 4.2043f, 6.0f, 5.0f, 6.0f)
                    close()
                    moveTo(19.0f, 22.0f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 22.0f, 3.4413f, 21.6839f, 2.8787f, 21.1213f)
                    curveTo(2.3161f, 20.5587f, 2.0f, 19.7956f, 2.0f, 19.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(15.0f)
                    curveTo(11.0f, 15.2652f, 11.1054f, 15.5196f, 11.2929f, 15.7071f)
                    curveTo(11.4804f, 15.8946f, 11.7348f, 16.0f, 12.0f, 16.0f)
                    curveTo(12.2652f, 16.0f, 12.5196f, 15.8946f, 12.7071f, 15.7071f)
                    curveTo(12.8946f, 15.5196f, 13.0f, 15.2652f, 13.0f, 15.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(19.0f)
                    curveTo(22.0f, 19.7956f, 21.6839f, 20.5587f, 21.1213f, 21.1213f)
                    curveTo(20.5587f, 21.6839f, 19.7956f, 22.0f, 19.0f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
