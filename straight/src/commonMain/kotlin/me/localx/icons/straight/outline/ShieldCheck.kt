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

public val Icons.Outline.ShieldCheck: ImageVector
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
                    moveTo(11.9482f, 24.0096f)
                    lineTo(11.5942f, 23.8526f)
                    curveTo(11.2002f, 23.6796f, 2.0001f, 19.5246f, 2.0001f, 12.0006f)
                    verticalLineTo(5.4766f)
                    curveTo(2.0005f, 4.8488f, 2.1989f, 4.237f, 2.5672f, 3.7286f)
                    curveTo(2.9355f, 3.2201f, 3.4548f, 2.8407f, 4.0511f, 2.6446f)
                    lineTo(12.0002f, 0.0096f)
                    lineTo(19.9492f, 2.6446f)
                    curveTo(20.5456f, 2.8407f, 21.0649f, 3.2201f, 21.4331f, 3.7286f)
                    curveTo(21.8014f, 4.237f, 21.9998f, 4.8488f, 22.0002f, 5.4766f)
                    verticalLineTo(12.0006f)
                    curveTo(22.0002f, 20.5776f, 12.7122f, 23.7556f, 12.3162f, 23.8876f)
                    lineTo(11.9482f, 24.0096f)
                    close()
                    moveTo(12.0002f, 2.1066f)
                    lineTo(4.6842f, 4.5326f)
                    curveTo(4.4851f, 4.5976f, 4.3117f, 4.7239f, 4.1889f, 4.8935f)
                    curveTo(4.066f, 5.0631f, 3.9999f, 5.2672f, 4.0002f, 5.4766f)
                    verticalLineTo(12.0006f)
                    curveTo(4.0002f, 17.4946f, 10.4402f, 21.0586f, 12.0472f, 21.8616f)
                    curveTo(13.6512f, 21.2166f, 20.0002f, 18.2636f, 20.0002f, 12.0006f)
                    verticalLineTo(5.4766f)
                    curveTo(20.0004f, 5.2672f, 19.9343f, 5.0631f, 19.8114f, 4.8935f)
                    curveTo(19.6886f, 4.7239f, 19.5152f, 4.5976f, 19.3162f, 4.5326f)
                    lineTo(12.0002f, 2.1066f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.1113f, 14.542f)
                    horizontalLineTo(11.0783f)
                    curveTo(10.8252f, 14.5382f, 10.5755f, 14.483f, 10.3443f, 14.3799f)
                    curveTo(10.1131f, 14.2767f, 9.9052f, 14.1278f, 9.7333f, 13.942f)
                    lineTo(7.4273f, 11.542f)
                    lineTo(8.8683f, 10.16f)
                    lineTo(11.1123f, 12.5f)
                    lineTo(16.2933f, 7.319f)
                    lineTo(17.7073f, 8.733f)
                    lineTo(12.4463f, 13.994f)
                    curveTo(12.271f, 14.1691f, 12.0628f, 14.3077f, 11.8337f, 14.4018f)
                    curveTo(11.6045f, 14.4958f, 11.359f, 14.5435f, 11.1113f, 14.542f)
                    close()
                }
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
