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

public val Icons.Outline.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.767f, 8.392f)
                    lineTo(15.535f, 1.464f)
                    curveTo(14.6f, 0.5292f, 13.3327f, 0.0028f, 12.0106f, 0.0f)
                    curveTo(10.6884f, -0.0028f, 9.419f, 0.5182f, 8.48f, 1.449f)
                    lineTo(1.233f, 8.392f)
                    curveTo(0.8441f, 8.7659f, 0.5344f, 9.2143f, 0.3226f, 9.7105f)
                    curveTo(0.1108f, 10.2067f, 0.001f, 10.7405f, 0.0f, 11.28f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(11.28f)
                    curveTo(23.999f, 10.7405f, 23.8892f, 10.2067f, 23.6774f, 9.7105f)
                    curveTo(23.4656f, 9.2143f, 23.1559f, 8.7659f, 22.767f, 8.392f)
                    close()
                    moveTo(9.879f, 2.878f)
                    curveTo(10.4522f, 2.3279f, 11.2168f, 2.0221f, 12.0112f, 2.0251f)
                    curveTo(12.8057f, 2.0281f, 13.5679f, 2.3396f, 14.137f, 2.894f)
                    lineTo(20.885f, 9.358f)
                    lineTo(14.121f, 16.122f)
                    curveTo(13.5493f, 16.6669f, 12.7898f, 16.9709f, 12.0f, 16.9709f)
                    curveTo(11.2102f, 16.9709f, 10.4507f, 16.6669f, 9.879f, 16.122f)
                    lineTo(3.115f, 9.358f)
                    lineTo(9.879f, 2.878f)
                    close()
                    moveTo(22.0f, 22.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(11.28f)
                    curveTo(2.0f, 11.216f, 2.013f, 11.154f, 2.019f, 11.09f)
                    lineTo(8.465f, 17.536f)
                    curveTo(9.4026f, 18.4733f, 10.6742f, 18.9999f, 12.0f, 18.9999f)
                    curveTo(13.3258f, 18.9999f, 14.5974f, 18.4733f, 15.535f, 17.536f)
                    lineTo(21.981f, 11.09f)
                    curveTo(21.987f, 11.154f, 22.0f, 11.216f, 22.0f, 11.28f)
                    verticalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
