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

public val Icons.Bold.ArrowFromBottom: ImageVector
    get() {
        if (_arrowFromBottom != null) {
            return _arrowFromBottom!!
        }
        _arrowFromBottom = Builder(name = "ArrowFromBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.7349f, 21.0159f)
                    horizontalLineTo(13.4999f)
                    verticalLineTo(4.543f)
                    lineTo(16.6849f, 7.728f)
                    curveTo(16.9663f, 8.0092f, 17.3479f, 8.1672f, 17.7458f, 8.1671f)
                    curveTo(17.9428f, 8.167f, 18.1378f, 8.1282f, 18.3198f, 8.0528f)
                    curveTo(18.5018f, 7.9773f, 18.6671f, 7.8668f, 18.8064f, 7.7274f)
                    curveTo(18.9457f, 7.5881f, 19.0561f, 7.4227f, 19.1315f, 7.2407f)
                    curveTo(19.2068f, 7.0587f, 19.2456f, 6.8636f, 19.2455f, 6.6666f)
                    curveTo(19.2455f, 6.4696f, 19.2066f, 6.2745f, 19.1312f, 6.0926f)
                    curveTo(19.0558f, 5.9106f, 18.9452f, 5.7452f, 18.8059f, 5.606f)
                    lineTo(14.0749f, 0.876f)
                    curveTo(13.5165f, 0.3414f, 12.7734f, 0.0431f, 12.0004f, 0.0431f)
                    curveTo(11.2274f, 0.0431f, 10.4843f, 0.3414f, 9.9259f, 0.876f)
                    lineTo(5.1939f, 5.606f)
                    curveTo(4.9125f, 5.8872f, 4.7544f, 6.2687f, 4.7543f, 6.6666f)
                    curveTo(4.7542f, 7.0645f, 4.9121f, 7.4461f, 5.1934f, 7.7274f)
                    curveTo(5.4747f, 8.0089f, 5.8562f, 8.167f, 6.254f, 8.1671f)
                    curveTo(6.6519f, 8.1672f, 7.0335f, 8.0092f, 7.3149f, 7.728f)
                    lineTo(10.4999f, 4.479f)
                    verticalLineTo(21.0159f)
                    horizontalLineTo(6.2649f)
                    curveTo(5.8671f, 21.0159f, 5.4855f, 21.174f, 5.2042f, 21.4553f)
                    curveTo(4.9229f, 21.7366f, 4.7649f, 22.1181f, 4.7649f, 22.5159f)
                    curveTo(4.7649f, 22.9138f, 4.9229f, 23.2953f, 5.2042f, 23.5766f)
                    curveTo(5.4855f, 23.8579f, 5.8671f, 24.0159f, 6.2649f, 24.0159f)
                    horizontalLineTo(17.7349f)
                    curveTo(18.1327f, 24.0159f, 18.5143f, 23.8579f, 18.7956f, 23.5766f)
                    curveTo(19.0769f, 23.2953f, 19.2349f, 22.9138f, 19.2349f, 22.5159f)
                    curveTo(19.2349f, 22.1181f, 19.0769f, 21.7366f, 18.7956f, 21.4553f)
                    curveTo(18.5143f, 21.174f, 18.1327f, 21.0159f, 17.7349f, 21.0159f)
                    close()
                }
            }
        }
        .build()
        return _arrowFromBottom!!
    }

private var _arrowFromBottom: ImageVector? = null
