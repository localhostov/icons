package me.localx.icons.straight.outline

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

public val Icons.Outline.ShieldExclamation: ImageVector
    get() {
        if (_shieldExclamation != null) {
            return _shieldExclamation!!
        }
        _shieldExclamation = Builder(name = "ShieldExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0002f, 14.9996f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(4.9996f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(14.9996f)
                    close()
                    moveTo(12.7932f, 23.7076f)
                    curveTo(14.9532f, 22.8396f, 22.0002f, 19.4276f, 22.0002f, 11.9906f)
                    verticalLineTo(5.4666f)
                    curveTo(22.0003f, 4.837f, 21.8019f, 4.2234f, 21.4331f, 3.7131f)
                    curveTo(21.0643f, 3.2029f, 20.544f, 2.8219f, 19.9462f, 2.6246f)
                    lineTo(12.0002f, -0.0104f)
                    lineTo(4.0542f, 2.6246f)
                    curveTo(3.4563f, 2.8219f, 2.936f, 3.2029f, 2.5672f, 3.7131f)
                    curveTo(2.1984f, 4.2234f, 2.0f, 4.837f, 2.0001f, 5.4666f)
                    verticalLineTo(11.9906f)
                    curveTo(2.0001f, 18.5536f, 9.0051f, 22.5666f, 11.1532f, 23.6416f)
                    lineTo(11.9532f, 24.0416f)
                    lineTo(12.7932f, 23.7076f)
                    close()
                    moveTo(19.3162f, 4.5226f)
                    curveTo(19.5146f, 4.5886f, 19.6872f, 4.7153f, 19.8099f, 4.8846f)
                    curveTo(19.9326f, 5.0539f, 19.9992f, 5.2575f, 20.0002f, 5.4666f)
                    verticalLineTo(11.9906f)
                    curveTo(20.0002f, 18.1736f, 13.9132f, 21.1026f, 12.0472f, 21.8526f)
                    curveTo(10.1592f, 20.9076f, 4.0002f, 17.4066f, 4.0002f, 11.9906f)
                    verticalLineTo(5.4666f)
                    curveTo(4.0012f, 5.2575f, 4.0677f, 5.0539f, 4.1904f, 4.8846f)
                    curveTo(4.3131f, 4.7153f, 4.4858f, 4.5886f, 4.6842f, 4.5226f)
                    lineTo(12.0002f, 2.0996f)
                    lineTo(19.3162f, 4.5226f)
                    close()
                    moveTo(13.0002f, 16.9996f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(18.9996f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(16.9996f)
                    close()
                }
            }
        }
        .build()
        return _shieldExclamation!!
    }

private var _shieldExclamation: ImageVector? = null
