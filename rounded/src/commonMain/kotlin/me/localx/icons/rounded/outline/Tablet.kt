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

public val Icons.Outline.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = Builder(name = "Tablet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0001f, 0.0f)
                    horizontalLineTo(7.0001f)
                    curveTo(5.6745f, 0.0016f, 4.4037f, 0.5289f, 3.4663f, 1.4662f)
                    curveTo(2.529f, 2.4036f, 2.0017f, 3.6744f, 2.0001f, 5.0f)
                    verticalLineTo(19.0f)
                    curveTo(2.0017f, 20.3256f, 2.529f, 21.5964f, 3.4663f, 22.5338f)
                    curveTo(4.4037f, 23.4711f, 5.6745f, 23.9984f, 7.0001f, 24.0f)
                    horizontalLineTo(17.0001f)
                    curveTo(18.3257f, 23.9984f, 19.5966f, 23.4711f, 20.5339f, 22.5338f)
                    curveTo(21.4712f, 21.5964f, 21.9985f, 20.3256f, 22.0001f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(21.9985f, 3.6744f, 21.4712f, 2.4036f, 20.5339f, 1.4662f)
                    curveTo(19.5966f, 0.5289f, 18.3257f, 0.0016f, 17.0001f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(7.0001f, 2.0f)
                    horizontalLineTo(17.0001f)
                    curveTo(17.7958f, 2.0f, 18.5588f, 2.3161f, 19.1214f, 2.8787f)
                    curveTo(19.6841f, 3.4413f, 20.0001f, 4.2043f, 20.0001f, 5.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(4.0001f)
                    verticalLineTo(5.0f)
                    curveTo(4.0001f, 4.2043f, 4.3162f, 3.4413f, 4.8788f, 2.8787f)
                    curveTo(5.4414f, 2.3161f, 6.2045f, 2.0f, 7.0001f, 2.0f)
                    close()
                    moveTo(17.0001f, 22.0f)
                    horizontalLineTo(7.0001f)
                    curveTo(6.2045f, 22.0f, 5.4414f, 21.6839f, 4.8788f, 21.1213f)
                    curveTo(4.3162f, 20.5587f, 4.0001f, 19.7956f, 4.0001f, 19.0f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(20.0f)
                    curveTo(11.0001f, 20.2652f, 11.1055f, 20.5196f, 11.293f, 20.7071f)
                    curveTo(11.4806f, 20.8946f, 11.7349f, 21.0f, 12.0001f, 21.0f)
                    curveTo(12.2653f, 21.0f, 12.5197f, 20.8946f, 12.7072f, 20.7071f)
                    curveTo(12.8948f, 20.5196f, 13.0001f, 20.2652f, 13.0001f, 20.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(20.0001f)
                    curveTo(20.0001f, 19.7956f, 19.6841f, 20.5587f, 19.1214f, 21.1213f)
                    curveTo(18.5588f, 21.6839f, 17.7958f, 22.0f, 17.0001f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null
