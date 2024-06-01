package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.LifeRing: ImageVector
    get() {
        if (_lifeRing != null) {
            return _lifeRing!!
        }
        _lifeRing = Builder(name = "LifeRing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.9999f, 12.0003f)
                    curveTo(7.0001f, 11.0206f, 7.2899f, 10.0628f, 7.8329f, 9.2473f)
                    lineTo(2.8449f, 4.2593f)
                    curveTo(1.0084f, 6.4204f, 0.0f, 9.1642f, 0.0f, 12.0003f)
                    curveTo(0.0f, 14.8364f, 1.0084f, 17.5801f, 2.8449f, 19.7413f)
                    lineTo(7.8329f, 14.7533f)
                    curveTo(7.2899f, 13.9378f, 7.0001f, 12.98f, 6.9999f, 12.0003f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.155f, 4.2593f)
                    lineTo(16.167f, 9.2473f)
                    curveTo(16.7101f, 10.0627f, 16.9999f, 11.0205f, 16.9999f, 12.0003f)
                    curveTo(16.9999f, 12.98f, 16.7101f, 13.9379f, 16.167f, 14.7533f)
                    lineTo(21.155f, 19.7413f)
                    curveTo(22.9916f, 17.5801f, 23.9999f, 14.8364f, 23.9999f, 12.0003f)
                    curveTo(23.9999f, 9.1642f, 22.9916f, 6.4204f, 21.155f, 4.2593f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 16.9995f)
                    curveTo(11.0203f, 16.9993f, 10.0625f, 16.7095f, 9.247f, 16.1665f)
                    lineTo(4.259f, 21.1545f)
                    curveTo(6.4202f, 22.9911f, 9.1639f, 23.9994f, 12.0f, 23.9994f)
                    curveTo(14.8362f, 23.9994f, 17.5799f, 22.9911f, 19.741f, 21.1545f)
                    lineTo(14.753f, 16.1665f)
                    curveTo(13.9376f, 16.7095f, 12.9798f, 16.9993f, 12.0f, 16.9995f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 7.0003f)
                    curveTo(12.9798f, 7.0005f, 13.9376f, 7.2903f, 14.753f, 7.8333f)
                    lineTo(19.741f, 2.8453f)
                    curveTo(17.5799f, 1.0087f, 14.8362f, 4.0E-4f, 12.0f, 4.0E-4f)
                    curveTo(9.1639f, 4.0E-4f, 6.4202f, 1.0087f, 4.259f, 2.8453f)
                    lineTo(9.247f, 7.8333f)
                    curveTo(10.0625f, 7.2903f, 11.0203f, 7.0005f, 12.0f, 7.0003f)
                    close()
                }
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
