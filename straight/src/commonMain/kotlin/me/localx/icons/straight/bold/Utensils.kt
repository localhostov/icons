package me.localx.icons.straight.bold

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

public val Icons.Bold.Utensils: ImageVector
    get() {
        if (_utensils != null) {
            return _utensils!!
        }
        _utensils = Builder(name = "Utensils", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 9.0E-4f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(9.5009f)
                    curveTo(13.0f, 10.4292f, 12.6313f, 11.3194f, 11.9749f, 11.9758f)
                    curveTo(11.3185f, 12.6322f, 10.4283f, 13.0009f, 9.5f, 13.0009f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(24.0009f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(13.0009f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 13.0009f, 1.6815f, 12.6322f, 1.0251f, 11.9758f)
                    curveTo(0.3687f, 11.3194f, 0.0f, 10.4292f, 0.0f, 9.5009f)
                    lineTo(0.0f, 9.0E-4f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.5009f)
                    curveTo(3.0f, 9.6335f, 3.0527f, 9.7607f, 3.1465f, 9.8545f)
                    curveTo(3.2402f, 9.9482f, 3.3674f, 10.0009f, 3.5f, 10.0009f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(9.0E-4f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(10.0009f)
                    horizontalLineTo(9.5f)
                    curveTo(9.6326f, 10.0009f, 9.7598f, 9.9482f, 9.8535f, 9.8545f)
                    curveTo(9.9473f, 9.7607f, 10.0f, 9.6335f, 10.0f, 9.5009f)
                    verticalLineTo(9.0E-4f)
                    close()
                    moveTo(24.0f, 9.7679f)
                    curveTo(24.0f, 14.6289f, 20.328f, 18.9679f, 19.0f, 20.3799f)
                    verticalLineTo(24.0009f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(2.5009f)
                    curveTo(15.9998f, 1.9746f, 16.1658f, 1.4616f, 16.4742f, 1.0351f)
                    curveTo(16.7827f, 0.6086f, 17.2179f, 0.2903f, 17.7178f, 0.1256f)
                    curveTo(18.2177f, -0.039f, 18.7569f, -0.0417f, 19.2584f, 0.1179f)
                    curveTo(19.76f, 0.2776f, 20.1983f, 0.5915f, 20.511f, 1.0149f)
                    curveTo(22.1f, 3.1499f, 24.0f, 6.4009f, 24.0f, 9.7679f)
                    close()
                    moveTo(19.0f, 15.5219f)
                    curveTo(20.2596f, 13.8847f, 20.9425f, 11.877f, 20.9425f, 9.8114f)
                    curveTo(20.9425f, 7.7458f, 20.2596f, 5.7381f, 19.0f, 4.1009f)
                    verticalLineTo(15.5219f)
                    close()
                }
            }
        }
        .build()
        return _utensils!!
    }

private var _utensils: ImageVector? = null
