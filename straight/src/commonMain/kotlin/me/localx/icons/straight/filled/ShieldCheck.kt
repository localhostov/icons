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

public val Icons.Filled.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9442f, 2.6426f)
                    lineTo(12.0002f, 0.0096f)
                    lineTo(4.0561f, 2.6426f)
                    curveTo(3.4576f, 2.841f, 2.9368f, 3.223f, 2.5677f, 3.7342f)
                    curveTo(2.1987f, 4.2455f, 2.0001f, 4.86f, 2.0001f, 5.4906f)
                    verticalLineTo(12.0006f)
                    curveTo(2.0001f, 19.5246f, 11.2002f, 23.6796f, 11.5942f, 23.8526f)
                    lineTo(11.9482f, 24.0096f)
                    lineTo(12.3162f, 23.8876f)
                    curveTo(12.7122f, 23.7556f, 22.0002f, 20.5776f, 22.0002f, 12.0006f)
                    verticalLineTo(5.4906f)
                    curveTo(22.0002f, 4.86f, 21.8016f, 4.2455f, 21.4326f, 3.7342f)
                    curveTo(21.0635f, 3.223f, 20.5427f, 2.841f, 19.9442f, 2.6426f)
                    close()
                    moveTo(12.4442f, 13.9896f)
                    curveTo(12.2693f, 14.1656f, 12.0613f, 14.3051f, 11.8321f, 14.4f)
                    curveTo(11.603f, 14.4949f, 11.3572f, 14.5434f, 11.1092f, 14.5426f)
                    horizontalLineTo(11.0762f)
                    curveTo(10.823f, 14.5387f, 10.5733f, 14.4835f, 10.3422f, 14.3804f)
                    curveTo(10.111f, 14.2773f, 9.9031f, 14.1283f, 9.7311f, 13.9426f)
                    lineTo(7.4251f, 11.5426f)
                    lineTo(8.8681f, 10.1606f)
                    lineTo(11.1122f, 12.5006f)
                    lineTo(16.2932f, 7.3196f)
                    lineTo(17.7072f, 8.7336f)
                    lineTo(12.4442f, 13.9896f)
                    close()
                }
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
