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

public val Icons.Filled.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.021f, 6.1051f)
                    lineTo(9.793f, 1.8781f)
                    curveTo(9.5153f, 1.5984f, 9.1848f, 1.3767f, 8.8207f, 1.2258f)
                    curveTo(8.4566f, 1.0749f, 8.0661f, 0.9978f, 7.672f, 0.9991f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 0.9991f, 0.4804f, 1.1044f, 0.2929f, 1.292f)
                    curveTo(0.1054f, 1.4795f, 0.0f, 1.7339f, 0.0f, 1.9991f)
                    curveTo(0.0f, 2.2643f, 0.1054f, 2.5186f, 0.2929f, 2.7062f)
                    curveTo(0.4804f, 2.8937f, 0.7348f, 2.9991f, 1.0f, 2.9991f)
                    horizontalLineTo(7.672f)
                    curveTo(7.9371f, 2.9998f, 8.1911f, 3.1051f, 8.379f, 3.2921f)
                    lineTo(11.086f, 5.9991f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 6.0007f, 2.4036f, 6.5279f, 1.4662f, 7.4653f)
                    curveTo(0.5289f, 8.4026f, 0.0016f, 9.6735f, 0.0f, 10.9991f)
                    lineTo(0.0f, 18.9991f)
                    curveTo(0.0016f, 20.3247f, 0.5289f, 21.5955f, 1.4662f, 22.5329f)
                    curveTo(2.4036f, 23.4702f, 3.6744f, 23.9975f, 5.0f, 23.9991f)
                    horizontalLineTo(13.0f)
                    curveTo(14.3256f, 23.9975f, 15.5964f, 23.4702f, 16.5338f, 22.5329f)
                    curveTo(17.4711f, 21.5955f, 17.9984f, 20.3247f, 18.0f, 18.9991f)
                    verticalLineTo(10.9991f)
                    curveTo(17.9984f, 9.8508f, 17.6022f, 8.7379f, 16.8778f, 7.847f)
                    curveTo(16.1534f, 6.956f, 15.1448f, 6.341f, 14.021f, 6.1051f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.8999f, 8.9559f)
                    curveTo(22.5688f, 8.7881f, 22.1974f, 8.7164f, 21.8276f, 8.7489f)
                    curveTo(21.4579f, 8.7814f, 21.1046f, 8.9169f, 20.8079f, 9.1399f)
                    lineTo(20.0079f, 9.7399f)
                    verticalLineTo(20.2619f)
                    lineTo(20.8079f, 20.8619f)
                    curveTo(21.1051f, 21.0847f, 21.4584f, 21.2204f, 21.8283f, 21.2538f)
                    curveTo(22.1982f, 21.2871f, 22.5701f, 21.2168f, 22.9024f, 21.0507f)
                    curveTo(23.2346f, 20.8846f, 23.514f, 20.6293f, 23.7092f, 20.3133f)
                    curveTo(23.9045f, 19.9974f, 24.0079f, 19.6333f, 24.0079f, 19.2619f)
                    verticalLineTo(10.7439f)
                    curveTo(24.0089f, 10.372f, 23.9056f, 10.0074f, 23.7098f, 9.6913f)
                    curveTo(23.5139f, 9.3753f, 23.2333f, 9.1205f, 22.8999f, 8.9559f)
                    close()
                }
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
