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

public val Icons.Filled.TimeAdd: ImageVector
    get() {
        if (_timeAdd != null) {
            return _timeAdd!!
        }
        _timeAdd = Builder(name = "TimeAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0001f, 19.9994f)
                    curveTo(24.0001f, 20.5514f, 23.5521f, 20.9994f, 23.0001f, 20.9994f)
                    horizontalLineTo(21.0001f)
                    verticalLineTo(22.9994f)
                    curveTo(21.0001f, 23.5514f, 20.5521f, 23.9994f, 20.0001f, 23.9994f)
                    curveTo(19.4481f, 23.9994f, 19.0001f, 23.5514f, 19.0001f, 22.9994f)
                    verticalLineTo(20.9994f)
                    horizontalLineTo(17.0001f)
                    curveTo(16.4481f, 20.9994f, 16.0001f, 20.5514f, 16.0001f, 19.9994f)
                    curveTo(16.0001f, 19.4474f, 16.4481f, 18.9994f, 17.0001f, 18.9994f)
                    horizontalLineTo(19.0001f)
                    verticalLineTo(16.9994f)
                    curveTo(19.0001f, 16.4474f, 19.4481f, 15.9994f, 20.0001f, 15.9994f)
                    curveTo(20.5521f, 15.9994f, 21.0001f, 16.4474f, 21.0001f, 16.9994f)
                    verticalLineTo(18.9994f)
                    horizontalLineTo(23.0001f)
                    curveTo(23.5521f, 18.9994f, 24.0001f, 19.4474f, 24.0001f, 19.9994f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0351f, 20.0149f)
                    curveTo(14.0311f, 16.7179f, 16.7001f, 14.0419f, 19.9961f, 14.0369f)
                    curveTo(21.2791f, 14.0349f, 22.5291f, 14.4469f, 23.5591f, 15.2119f)
                    curveTo(25.3321f, 8.8269f, 21.5931f, 2.2139f, 15.2091f, 0.4409f)
                    curveTo(8.8251f, -1.3321f, 2.2131f, 2.4059f, 0.4401f, 8.7909f)
                    curveTo(-1.3329f, 15.1759f, 2.4061f, 21.7899f, 8.7901f, 23.5629f)
                    curveTo(10.8901f, 24.1459f, 13.1091f, 24.1459f, 15.2091f, 23.5629f)
                    curveTo(14.4471f, 22.5369f, 14.0351f, 21.2929f, 14.0351f, 20.0149f)
                    close()
                    moveTo(13.0001f, 12.0219f)
                    curveTo(13.0001f, 12.2879f, 12.8941f, 12.5419f, 12.7061f, 12.7299f)
                    lineTo(9.7011f, 15.7359f)
                    curveTo(9.3031f, 16.1199f, 8.6691f, 16.1089f, 8.2851f, 15.7109f)
                    curveTo(7.9101f, 15.3229f, 7.9101f, 14.7069f, 8.2851f, 14.3189f)
                    lineTo(10.9971f, 11.6069f)
                    verticalLineTo(7.0129f)
                    curveTo(10.9971f, 6.4599f, 11.4451f, 6.0109f, 11.9991f, 6.0109f)
                    curveTo(12.5521f, 6.0109f, 13.0001f, 6.4599f, 13.0001f, 7.0129f)
                    verticalLineTo(12.0219f)
                    close()
                }
            }
        }
        .build()
        return _timeAdd!!
    }

private var _timeAdd: ImageVector? = null
