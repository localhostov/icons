package me.localx.icons.straight.outline

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

public val Icons.Outline.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0002f, 2.0001f)
                    curveTo(13.3267f, 2.0044f, 14.6392f, 2.2718f, 15.8617f, 2.7868f)
                    curveTo(17.0842f, 3.3017f, 18.1924f, 4.054f, 19.1222f, 5.0001f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(7.0001f)
                    horizontalLineTo(20.1432f)
                    curveTo(20.6355f, 6.9996f, 21.1076f, 6.8037f, 21.4557f, 6.4556f)
                    curveTo(21.8039f, 6.1075f, 21.9997f, 5.6354f, 22.0002f, 5.1431f)
                    verticalLineTo(1.0E-4f)
                    horizontalLineTo(20.0002f)
                    verticalLineTo(3.0781f)
                    curveTo(18.2777f, 1.527f, 16.1422f, 0.5087f, 13.8526f, 0.1469f)
                    curveTo(11.563f, -0.2149f, 9.2176f, 0.0951f, 7.1007f, 1.0395f)
                    curveTo(4.9838f, 1.9838f, 3.1862f, 3.5219f, 1.9259f, 5.4674f)
                    curveTo(0.6656f, 7.4128f, -0.0033f, 9.6821f, 2.0E-4f, 12.0001f)
                    horizontalLineTo(2.0002f)
                    curveTo(2.0031f, 9.3488f, 3.0576f, 6.807f, 4.9323f, 4.9322f)
                    curveTo(6.8071f, 3.0575f, 9.3489f, 2.003f, 12.0002f, 2.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0002f, 12.0f)
                    curveTo(22.0031f, 13.9853f, 21.4141f, 15.9265f, 20.3085f, 17.5755f)
                    curveTo(19.2029f, 19.2245f, 17.6309f, 20.5065f, 15.7932f, 21.2578f)
                    curveTo(13.9555f, 22.0091f, 11.9355f, 22.1956f, 9.9914f, 21.7934f)
                    curveTo(8.0472f, 21.3913f, 6.267f, 20.4187f, 4.8782f, 19.0f)
                    horizontalLineTo(9.0002f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(3.8572f)
                    curveTo(3.3648f, 17.0005f, 2.8928f, 17.1963f, 2.5447f, 17.5445f)
                    curveTo(2.1965f, 17.8926f, 2.0007f, 18.3647f, 2.0002f, 18.857f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(4.0002f)
                    verticalLineTo(20.922f)
                    curveTo(5.7227f, 22.4731f, 7.8582f, 23.4913f, 10.1478f, 23.8532f)
                    curveTo(12.4374f, 24.215f, 14.7828f, 23.905f, 16.8997f, 22.9606f)
                    curveTo(19.0166f, 22.0163f, 20.8141f, 20.4782f, 22.0744f, 18.5327f)
                    curveTo(23.3347f, 16.5873f, 24.0037f, 14.318f, 24.0002f, 12.0f)
                    horizontalLineTo(22.0002f)
                    close()
                }
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
