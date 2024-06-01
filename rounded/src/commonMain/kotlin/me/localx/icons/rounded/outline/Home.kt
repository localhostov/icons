package me.localx.icons.rounded.outline

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

public val Icons.Outline.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.1212f, 9.0689f)
                    lineTo(15.5362f, 1.4829f)
                    curveTo(14.5975f, 0.5469f, 13.3259f, 0.0212f, 12.0002f, 0.0212f)
                    curveTo(10.6746f, 0.0212f, 9.403f, 0.5469f, 8.4642f, 1.4829f)
                    lineTo(0.8792f, 9.0689f)
                    curveTo(0.5997f, 9.3467f, 0.378f, 9.6772f, 0.2271f, 10.0413f)
                    curveTo(0.0762f, 10.4053f, -9.0E-4f, 10.7958f, 2.0E-4f, 11.1899f)
                    verticalLineTo(21.0069f)
                    curveTo(2.0E-4f, 21.8025f, 0.3163f, 22.5656f, 0.8789f, 23.1282f)
                    curveTo(1.4415f, 23.6908f, 2.2046f, 24.0069f, 3.0002f, 24.0069f)
                    horizontalLineTo(21.0002f)
                    curveTo(21.7959f, 24.0069f, 22.5589f, 23.6908f, 23.1215f, 23.1282f)
                    curveTo(23.6842f, 22.5656f, 24.0002f, 21.8025f, 24.0002f, 21.0069f)
                    verticalLineTo(11.1899f)
                    curveTo(24.0014f, 10.7958f, 23.9242f, 10.4053f, 23.7733f, 10.0413f)
                    curveTo(23.6225f, 9.6772f, 23.4008f, 9.3467f, 23.1212f, 9.0689f)
                    close()
                    moveTo(15.0002f, 22.0069f)
                    horizontalLineTo(9.0002f)
                    verticalLineTo(18.0729f)
                    curveTo(9.0002f, 17.2772f, 9.3163f, 16.5142f, 9.8789f, 15.9515f)
                    curveTo(10.4415f, 15.3889f, 11.2046f, 15.0729f, 12.0002f, 15.0729f)
                    curveTo(12.7959f, 15.0729f, 13.5589f, 15.3889f, 14.1215f, 15.9515f)
                    curveTo(14.6842f, 16.5142f, 15.0002f, 17.2772f, 15.0002f, 18.0729f)
                    verticalLineTo(22.0069f)
                    close()
                    moveTo(22.0002f, 21.0069f)
                    curveTo(22.0002f, 21.2721f, 21.8949f, 21.5264f, 21.7073f, 21.714f)
                    curveTo(21.5198f, 21.9015f, 21.2654f, 22.0069f, 21.0002f, 22.0069f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(18.0729f)
                    curveTo(17.0002f, 16.7468f, 16.4734f, 15.475f, 15.5358f, 14.5373f)
                    curveTo(14.5981f, 13.5997f, 13.3263f, 13.0729f, 12.0002f, 13.0729f)
                    curveTo(10.6741f, 13.0729f, 9.4024f, 13.5997f, 8.4647f, 14.5373f)
                    curveTo(7.527f, 15.475f, 7.0002f, 16.7468f, 7.0002f, 18.0729f)
                    verticalLineTo(22.0069f)
                    horizontalLineTo(3.0002f)
                    curveTo(2.735f, 22.0069f, 2.4807f, 21.9015f, 2.2931f, 21.714f)
                    curveTo(2.1056f, 21.5264f, 2.0002f, 21.2721f, 2.0002f, 21.0069f)
                    verticalLineTo(11.1899f)
                    curveTo(2.0011f, 10.9248f, 2.1064f, 10.6709f, 2.2932f, 10.4829f)
                    lineTo(9.8782f, 2.8999f)
                    curveTo(10.4419f, 2.3388f, 11.2049f, 2.0238f, 12.0002f, 2.0238f)
                    curveTo(12.7956f, 2.0238f, 13.5585f, 2.3388f, 14.1222f, 2.8999f)
                    lineTo(21.7072f, 10.4859f)
                    curveTo(21.8933f, 10.6731f, 21.9985f, 10.9259f, 22.0002f, 11.1899f)
                    verticalLineTo(21.0069f)
                    close()
                }
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
