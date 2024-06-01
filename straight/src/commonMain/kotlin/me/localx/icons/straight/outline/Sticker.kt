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

public val Icons.Outline.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(8.8174f, 0.0f, 5.7652f, 1.2643f, 3.5147f, 3.5147f)
                    curveTo(1.2643f, 5.7652f, 0.0f, 8.8174f, 0.0f, 12.0f)
                    curveTo(0.0f, 15.1826f, 1.2643f, 18.2348f, 3.5147f, 20.4853f)
                    curveTo(5.7652f, 22.7357f, 8.8174f, 24.0f, 12.0f, 24.0f)
                    horizontalLineTo(12.414f)
                    lineTo(24.0f, 12.414f)
                    verticalLineTo(12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(2.0f, 12.0f)
                    curveTo(1.9976f, 9.5208f, 2.9168f, 7.1292f, 4.5791f, 5.2898f)
                    curveTo(6.2413f, 3.4504f, 8.5278f, 2.2945f, 10.9946f, 2.0466f)
                    curveTo(13.4613f, 1.7987f, 15.9322f, 2.4764f, 17.9272f, 3.9483f)
                    curveTo(19.9222f, 5.4201f, 21.299f, 7.5809f, 21.79f, 10.011f)
                    curveTo(18.6837f, 10.0677f, 15.7205f, 11.3269f, 13.5237f, 13.5237f)
                    curveTo(11.3269f, 15.7205f, 10.0677f, 18.6837f, 10.011f, 21.79f)
                    curveTo(7.7526f, 21.3301f, 5.7222f, 20.1049f, 4.2626f, 18.3212f)
                    curveTo(2.8031f, 16.5375f, 2.0038f, 14.3047f, 2.0f, 12.0f)
                    close()
                    moveTo(12.022f, 21.564f)
                    curveTo(12.1338f, 19.0694f, 13.1749f, 16.707f, 14.9405f, 14.9412f)
                    curveTo(16.7061f, 13.1754f, 19.0685f, 12.1341f, 21.563f, 12.022f)
                    lineTo(12.022f, 21.564f)
                    close()
                }
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
