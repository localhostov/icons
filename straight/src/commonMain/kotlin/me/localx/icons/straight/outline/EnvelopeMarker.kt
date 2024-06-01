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

public val Icons.Outline.EnvelopeMarker: ImageVector
    get() {
        if (_envelopeMarker != null) {
            return _envelopeMarker!!
        }
        _envelopeMarker = Builder(name = "EnvelopeMarker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 0.0f)
                    verticalLineTo(8.948f)
                    curveTo(15.0005f, 9.334f, 15.1099f, 9.712f, 15.3156f, 10.0386f)
                    curveTo(15.5213f, 10.3652f, 15.815f, 10.6271f, 16.163f, 10.7942f)
                    curveTo(16.5109f, 10.9613f, 16.8989f, 11.0269f, 17.2824f, 10.9833f)
                    curveTo(17.666f, 10.9398f, 18.0294f, 10.7889f, 18.331f, 10.548f)
                    lineTo(19.5f, 9.613f)
                    lineTo(20.669f, 10.549f)
                    curveTo(20.9707f, 10.7899f, 21.3342f, 10.9408f, 21.7178f, 10.9844f)
                    curveTo(22.1014f, 11.0279f, 22.4895f, 10.9622f, 22.8375f, 10.795f)
                    curveTo(23.1855f, 10.6278f, 23.4792f, 10.3657f, 23.6848f, 10.039f)
                    curveTo(23.8905f, 9.7122f, 23.9997f, 9.3341f, 24.0f, 8.948f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(15.0f)
                    close()
                    moveTo(21.919f, 8.987f)
                    lineTo(19.5f, 7.052f)
                    lineTo(17.0f, 8.948f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(21.99f)
                    lineTo(21.919f, 8.987f)
                    close()
                    moveTo(22.0f, 13.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.0f)
                    curveTo(0.0f, 5.2043f, 0.3161f, 4.4413f, 0.8787f, 3.8787f)
                    curveTo(1.4413f, 3.3161f, 2.2043f, 3.0f, 3.0f, 3.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 5.0f, 2.4804f, 5.1054f, 2.2929f, 5.2929f)
                    curveTo(2.1054f, 5.4804f, 2.0f, 5.7348f, 2.0f, 6.0f)
                    verticalLineTo(6.242f)
                    lineTo(9.878f, 14.122f)
                    curveTo(10.4497f, 14.6672f, 11.2095f, 14.9714f, 11.9995f, 14.9714f)
                    curveTo(12.7895f, 14.9714f, 13.5493f, 14.6672f, 14.121f, 14.122f)
                    lineTo(15.243f, 13.0f)
                    horizontalLineTo(18.071f)
                    lineTo(15.535f, 15.536f)
                    curveTo(14.5973f, 16.4737f, 13.3256f, 17.0004f, 11.9995f, 17.0004f)
                    curveTo(10.6734f, 17.0004f, 9.4017f, 16.4737f, 8.464f, 15.536f)
                    lineTo(2.0f, 9.071f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(13.0f)
                    close()
                }
            }
        }
        .build()
        return _envelopeMarker!!
    }

private var _envelopeMarker: ImageVector? = null
