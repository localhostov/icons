package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.1218f, 13.293f)
                    lineTo(18.7078f, 14.707f)
                    lineTo(20.9998f, 17.0f)
                    horizontalLineTo(20.6178f)
                    curveTo(17.2338f, 17.0f, 15.0818f, 15.468f, 13.1718f, 13.4921f)
                    lineTo(12.8718f, 13.8401f)
                    curveTo(12.5438f, 14.2201f, 12.2058f, 14.6111f, 11.8538f, 15.0041f)
                    curveTo(14.0539f, 17.5515f, 17.2559f, 19.0123f, 20.6218f, 19.004f)
                    horizontalLineTo(20.9998f)
                    lineTo(18.7068f, 21.297f)
                    lineTo(20.1208f, 22.711f)
                    lineTo(23.4138f, 19.418f)
                    curveTo(24.1946f, 18.637f, 24.1946f, 17.371f, 23.4138f, 16.59f)
                    lineTo(20.1218f, 13.293f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.619f, 6.9999f)
                    horizontalLineTo(21.0f)
                    lineTo(18.708f, 9.2929f)
                    lineTo(20.122f, 10.7069f)
                    lineTo(23.415f, 7.4139f)
                    curveTo(24.1958f, 6.6329f, 24.1958f, 5.3669f, 23.415f, 4.5859f)
                    lineTo(20.122f, 1.2929f)
                    lineTo(18.708f, 2.7068f)
                    lineTo(21.0f, 5.0f)
                    horizontalLineTo(20.618f)
                    curveTo(15.661f, 5.0f, 12.951f, 7.67f, 10.492f, 10.478f)
                    curveTo(8.063f, 7.7349f, 5.143f, 5.0f, -0.04f, 5.0f)
                    verticalLineTo(7.0f)
                    curveTo(4.424f, 7.0f, 6.833f, 9.336f, 9.169f, 12.0f)
                    curveTo(6.833f, 14.6639f, 4.424f, 17.0f, -0.04f, 17.0f)
                    verticalLineTo(19.0f)
                    curveTo(5.768f, 19.0f, 8.736f, 15.564f, 11.36f, 12.534f)
                    curveTo(13.814f, 9.6879f, 16.137f, 6.9999f, 20.619f, 6.9999f)
                    close()
                }
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
