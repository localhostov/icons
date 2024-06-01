package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.AngleSmallRight: ImageVector
    get() {
        if (_angleSmallRight != null) {
            return _angleSmallRight!!
        }
        _angleSmallRight = Builder(name = "AngleSmallRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 9.525f)
                lineTo(11.164f, 4.939f)
                curveTo(10.8827f, 4.6577f, 10.5011f, 4.4998f, 10.1032f, 4.4999f)
                curveTo(9.7053f, 4.5f, 9.3238f, 4.6581f, 9.0426f, 4.9395f)
                curveTo(8.7613f, 5.2209f, 8.6033f, 5.6025f, 8.6034f, 6.0004f)
                curveTo(8.6035f, 6.3982f, 8.7617f, 6.7797f, 9.043f, 7.061f)
                lineTo(13.629f, 11.646f)
                curveTo(13.6756f, 11.6925f, 13.7125f, 11.7476f, 13.7378f, 11.8084f)
                curveTo(13.763f, 11.8691f, 13.7759f, 11.9342f, 13.7759f, 12.0f)
                curveTo(13.7759f, 12.0658f, 13.763f, 12.1309f, 13.7378f, 12.1916f)
                curveTo(13.7125f, 12.2524f, 13.6756f, 12.3076f, 13.629f, 12.354f)
                lineTo(9.043f, 16.939f)
                curveTo(8.7617f, 17.2203f, 8.6035f, 17.6018f, 8.6034f, 17.9997f)
                curveTo(8.6033f, 18.3975f, 8.7613f, 18.7791f, 9.0426f, 19.0605f)
                curveTo(9.3238f, 19.3419f, 9.7053f, 19.5f, 10.1032f, 19.5001f)
                curveTo(10.5011f, 19.5002f, 10.8827f, 19.3423f, 11.164f, 19.061f)
                lineTo(15.75f, 14.475f)
                curveTo(16.4053f, 13.818f, 16.7732f, 12.9279f, 16.7732f, 12.0f)
                curveTo(16.7732f, 11.0721f, 16.4053f, 10.182f, 15.75f, 9.525f)
                close()
            }
        }
        .build()
        return _angleSmallRight!!
    }

private var _angleSmallRight: ImageVector? = null
