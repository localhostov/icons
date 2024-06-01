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

public val Icons.Filled.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.9998f, 13.0f)
                    curveTo(22.9998f, 12.2044f, 22.6838f, 11.4413f, 22.1212f, 10.8787f)
                    curveTo(21.5586f, 10.3161f, 20.7955f, 10.0f, 19.9998f, 10.0f)
                    horizontalLineTo(18.9998f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(10.9998f)
                    verticalLineTo(13.0f)
                    curveTo(10.9998f, 13.7957f, 10.6838f, 14.5587f, 10.1212f, 15.1213f)
                    curveTo(9.5586f, 15.6839f, 8.7955f, 16.0f, 7.9998f, 16.0f)
                    curveTo(7.2042f, 16.0f, 6.4411f, 15.6839f, 5.8785f, 15.1213f)
                    curveTo(5.3159f, 14.5587f, 4.9998f, 13.7957f, 4.9998f, 13.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(0.9998f)
                    verticalLineTo(21.0f)
                    curveTo(0.9998f, 21.7957f, 1.3159f, 22.5587f, 1.8785f, 23.1213f)
                    curveTo(2.4411f, 23.6839f, 3.2042f, 24.0f, 3.9999f, 24.0f)
                    horizontalLineTo(15.9998f)
                    curveTo(16.7955f, 24.0f, 17.5586f, 23.6839f, 18.1212f, 23.1213f)
                    curveTo(18.6838f, 22.5587f, 18.9998f, 21.7957f, 18.9998f, 21.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(22.9998f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(20.9998f, 18.0f)
                    horizontalLineTo(18.9998f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(19.9998f)
                    curveTo(20.2651f, 12.0f, 20.5194f, 12.1054f, 20.707f, 12.2929f)
                    curveTo(20.8945f, 12.4804f, 20.9998f, 12.7348f, 20.9998f, 13.0f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(6.9998f, 6.0f)
                    horizontalLineTo(1.9999f)
                    curveTo(1.9999f, 4.9798f, 2.3897f, 3.9982f, 3.0896f, 3.256f)
                    curveTo(3.7894f, 2.5137f, 4.7464f, 2.0669f, 5.7649f, 2.007f)
                    curveTo(6.1824f, 1.393f, 6.7449f, 0.8914f, 7.4025f, 0.5467f)
                    curveTo(8.0602f, 0.2021f, 8.7927f, 0.0249f, 9.5351f, 0.0309f)
                    curveTo(10.2776f, 0.0369f, 11.0072f, 0.226f, 11.6591f, 0.5813f)
                    curveTo(12.3111f, 0.9367f, 12.8654f, 1.4473f, 13.2728f, 2.068f)
                    curveTo(13.8496f, 1.9635f, 14.4421f, 1.9867f, 15.0089f, 2.1359f)
                    curveTo(15.5757f, 2.285f, 16.103f, 2.5566f, 16.5535f, 2.9314f)
                    curveTo(17.0041f, 3.3062f, 17.3671f, 3.7751f, 17.617f, 4.3053f)
                    curveTo(17.8669f, 4.8355f, 17.9975f, 5.4139f, 17.9998f, 6.0f)
                    horizontalLineTo(8.9999f)
                    verticalLineTo(13.0f)
                    curveTo(8.9999f, 13.2652f, 8.8945f, 13.5196f, 8.707f, 13.7071f)
                    curveTo(8.5194f, 13.8946f, 8.2651f, 14.0f, 7.9998f, 14.0f)
                    curveTo(7.7346f, 14.0f, 7.4803f, 13.8946f, 7.2927f, 13.7071f)
                    curveTo(7.1052f, 13.5196f, 6.9998f, 13.2652f, 6.9998f, 13.0f)
                    verticalLineTo(6.0f)
                    close()
                }
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
