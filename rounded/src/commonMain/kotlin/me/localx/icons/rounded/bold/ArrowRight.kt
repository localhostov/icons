package me.localx.icons.rounded.bold

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

public val Icons.Bold.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.1218f, 18.394f)
                    lineTo(23.0408f, 14.475f)
                    curveTo(23.6772f, 13.8082f, 24.0323f, 12.9218f, 24.0323f, 12.0f)
                    curveTo(24.0323f, 11.0782f, 23.6772f, 10.1919f, 23.0408f, 9.525f)
                    lineTo(19.1218f, 5.606f)
                    curveTo(18.8406f, 5.3246f, 18.4591f, 5.1665f, 18.0612f, 5.1664f)
                    curveTo(17.6633f, 5.1663f, 17.2817f, 5.3243f, 17.0003f, 5.6055f)
                    curveTo(16.719f, 5.8868f, 16.5608f, 6.2683f, 16.5607f, 6.6662f)
                    curveTo(16.5606f, 7.064f, 16.7186f, 7.4456f, 16.9998f, 7.727f)
                    lineTo(19.7798f, 10.508f)
                    lineTo(1.5299f, 10.531f)
                    curveTo(1.132f, 10.531f, 0.7505f, 10.689f, 0.4692f, 10.9704f)
                    curveTo(0.1879f, 11.2517f, 0.0298f, 11.6332f, 0.0298f, 12.031f)
                    curveTo(0.0298f, 12.4288f, 0.1879f, 12.8104f, 0.4692f, 13.0917f)
                    curveTo(0.7505f, 13.373f, 1.132f, 13.531f, 1.5299f, 13.531f)
                    lineTo(19.7608f, 13.508f)
                    lineTo(16.9998f, 16.273f)
                    curveTo(16.7266f, 16.5559f, 16.5754f, 16.9348f, 16.5788f, 17.3281f)
                    curveTo(16.5823f, 17.7214f, 16.74f, 18.0976f, 17.0181f, 18.3757f)
                    curveTo(17.2962f, 18.6539f, 17.6725f, 18.8116f, 18.0657f, 18.815f)
                    curveTo(18.459f, 18.8184f, 18.8379f, 18.6673f, 19.1208f, 18.394f)
                    horizontalLineTo(19.1218f)
                    close()
                }
            }
        }
        .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
