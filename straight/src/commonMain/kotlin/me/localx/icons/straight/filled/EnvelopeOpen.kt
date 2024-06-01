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

public val Icons.Filled.EnvelopeOpen: ImageVector
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
                    moveTo(1.2f, 8.437f)
                    lineTo(8.48f, 1.449f)
                    curveTo(9.419f, 0.5182f, 10.6884f, -0.0028f, 12.0106f, 0.0f)
                    curveTo(13.3327f, 0.0028f, 14.6f, 0.5292f, 15.535f, 1.464f)
                    lineTo(22.805f, 8.437f)
                    lineTo(14.121f, 17.122f)
                    curveTo(13.5493f, 17.6669f, 12.7898f, 17.9709f, 12.0f, 17.9709f)
                    curveTo(11.2102f, 17.9709f, 10.4507f, 17.6669f, 9.879f, 17.122f)
                    lineTo(1.2f, 8.437f)
                    close()
                    moveTo(15.54f, 18.537f)
                    curveTo(14.6024f, 19.4743f, 13.3308f, 20.0009f, 12.005f, 20.0009f)
                    curveTo(10.6792f, 20.0009f, 9.4076f, 19.4743f, 8.47f, 18.537f)
                    lineTo(0.16f, 10.23f)
                    curveTo(0.0598f, 10.5712f, 0.006f, 10.9244f, 0.0f, 11.28f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(11.28f)
                    curveTo(23.994f, 10.9244f, 23.9402f, 10.5712f, 23.84f, 10.23f)
                    lineTo(15.54f, 18.537f)
                    close()
                }
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
