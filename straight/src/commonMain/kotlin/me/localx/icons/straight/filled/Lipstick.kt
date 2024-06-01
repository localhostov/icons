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

public val Icons.Filled.Lipstick: ImageVector
    get() {
        if (_lipstick != null) {
            return _lipstick!!
        }
        _lipstick = Builder(name = "Lipstick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0001f, 7.0004f)
                    verticalLineTo(3.6194f)
                    curveTo(9.0002f, 3.2479f, 9.1037f, 2.8838f, 9.299f, 2.5678f)
                    curveTo(9.4943f, 2.2518f, 9.7738f, 1.9965f, 10.1062f, 1.8304f)
                    lineTo(13.5532f, 0.1074f)
                    curveTo(13.7055f, 0.0313f, 13.8748f, -0.0047f, 14.0449f, 0.003f)
                    curveTo(14.215f, 0.0106f, 14.3804f, 0.0615f, 14.5253f, 0.151f)
                    curveTo(14.6703f, 0.2404f, 14.7899f, 0.3654f, 14.873f, 0.514f)
                    curveTo(14.9561f, 0.6627f, 14.9999f, 0.8301f, 15.0002f, 1.0004f)
                    verticalLineTo(7.0004f)
                    horizontalLineTo(9.0001f)
                    close()
                    moveTo(19.0002f, 14.0004f)
                    horizontalLineTo(5.0002f)
                    verticalLineTo(24.0004f)
                    horizontalLineTo(19.0002f)
                    verticalLineTo(14.0004f)
                    close()
                    moveTo(17.0002f, 9.0004f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(12.0004f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(9.0004f)
                    close()
                }
            }
        }
        .build()
        return _lipstick!!
    }

private var _lipstick: ImageVector? = null
