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

public val Icons.Bold.Sticker: ImageVector
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
                    horizontalLineTo(12.621f)
                    lineTo(24.0f, 12.621f)
                    verticalLineTo(12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(3.0f, 12.0f)
                    curveTo(3.0095f, 9.7941f, 3.8288f, 7.6684f, 5.3023f, 6.0268f)
                    curveTo(6.7758f, 4.3851f, 8.801f, 3.3419f, 10.9931f, 3.0951f)
                    curveTo(13.1852f, 2.8483f, 15.3916f, 3.4152f, 17.1933f, 4.6881f)
                    curveTo(18.9949f, 5.9611f, 20.2663f, 7.8514f, 20.766f, 10.0f)
                    horizontalLineTo(20.5f)
                    curveTo(17.7152f, 10.0f, 15.0445f, 11.1062f, 13.0754f, 13.0754f)
                    curveTo(11.1062f, 15.0445f, 10.0f, 17.7152f, 10.0f, 20.5f)
                    verticalLineTo(20.767f)
                    curveTo(8.0139f, 20.3123f, 6.2405f, 19.1979f, 4.9693f, 17.6057f)
                    curveTo(3.698f, 16.0135f, 3.0038f, 14.0375f, 3.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
