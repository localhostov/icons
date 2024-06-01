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

public val Icons.Outline.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 0.9999f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 1.0015f, 2.4036f, 1.5288f, 1.4662f, 2.4661f)
                    curveTo(0.5289f, 3.4034f, 0.0016f, 4.6743f, 0.0f, 5.9999f)
                    lineTo(0.0f, 17.9999f)
                    curveTo(0.0016f, 19.3255f, 0.5289f, 20.5963f, 1.4662f, 21.5337f)
                    curveTo(2.4036f, 22.471f, 3.6744f, 22.9983f, 5.0f, 22.9999f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 22.9983f, 21.5964f, 22.471f, 22.5338f, 21.5337f)
                    curveTo(23.4711f, 20.5963f, 23.9984f, 19.3255f, 24.0f, 17.9999f)
                    verticalLineTo(5.9999f)
                    curveTo(23.9984f, 4.6743f, 23.4711f, 3.4034f, 22.5338f, 2.4661f)
                    curveTo(21.5964f, 1.5288f, 20.3256f, 1.0015f, 19.0f, 0.9999f)
                    close()
                    moveTo(5.0f, 2.9999f)
                    horizontalLineTo(19.0f)
                    curveTo(19.5988f, 3.0011f, 20.1835f, 3.1814f, 20.679f, 3.5177f)
                    curveTo(21.1744f, 3.854f, 21.5579f, 4.3308f, 21.78f, 4.8869f)
                    lineTo(14.122f, 12.5459f)
                    curveTo(13.5584f, 13.1072f, 12.7954f, 13.4223f, 12.0f, 13.4223f)
                    curveTo(11.2046f, 13.4223f, 10.4416f, 13.1072f, 9.878f, 12.5459f)
                    lineTo(2.22f, 4.8869f)
                    curveTo(2.4422f, 4.3308f, 2.8256f, 3.854f, 3.321f, 3.5177f)
                    curveTo(3.8165f, 3.1814f, 4.4012f, 3.0011f, 5.0f, 2.9999f)
                    close()
                    moveTo(19.0f, 20.9999f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 20.9999f, 3.4413f, 20.6838f, 2.8787f, 20.1212f)
                    curveTo(2.3161f, 19.5586f, 2.0f, 18.7955f, 2.0f, 17.9999f)
                    verticalLineTo(7.4999f)
                    lineTo(8.464f, 13.9599f)
                    curveTo(9.4026f, 14.8961f, 10.6743f, 15.4219f, 12.0f, 15.4219f)
                    curveTo(13.3257f, 15.4219f, 14.5974f, 14.8961f, 15.536f, 13.9599f)
                    lineTo(22.0f, 7.4999f)
                    verticalLineTo(17.9999f)
                    curveTo(22.0f, 18.7955f, 21.6839f, 19.5586f, 21.1213f, 20.1212f)
                    curveTo(20.5587f, 20.6838f, 19.7956f, 20.9999f, 19.0f, 20.9999f)
                    close()
                }
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
