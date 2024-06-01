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

public val Icons.Filled.TimeDelete: ImageVector
    get() {
        if (_timeDelete != null) {
            return _timeDelete!!
        }
        _timeDelete = Builder(name = "TimeDelete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.7072f, 22.7076f)
                    curveTo(22.3172f, 23.0976f, 21.6832f, 23.0976f, 21.2932f, 22.7076f)
                    lineTo(19.8792f, 21.2936f)
                    lineTo(18.4642f, 22.7076f)
                    curveTo(18.0802f, 23.1046f, 17.4472f, 23.1156f, 17.0502f, 22.7326f)
                    curveTo(16.6532f, 22.3486f, 16.6422f, 21.7156f, 17.0252f, 21.3186f)
                    curveTo(17.0332f, 21.3106f, 17.0412f, 21.3016f, 17.0502f, 21.2936f)
                    lineTo(18.4642f, 19.8796f)
                    lineTo(17.0502f, 18.4646f)
                    curveTo(16.6532f, 18.0806f, 16.6422f, 17.4476f, 17.0252f, 17.0506f)
                    curveTo(17.4092f, 16.6536f, 18.0422f, 16.6426f, 18.4392f, 17.0256f)
                    curveTo(18.4472f, 17.0336f, 18.4562f, 17.0416f, 18.4642f, 17.0506f)
                    lineTo(19.8792f, 18.4646f)
                    lineTo(21.2932f, 17.0506f)
                    curveTo(21.6772f, 16.6536f, 22.3102f, 16.6426f, 22.7072f, 17.0256f)
                    curveTo(23.1042f, 17.4096f, 23.1152f, 18.0426f, 22.7322f, 18.4396f)
                    curveTo(22.7242f, 18.4476f, 22.7162f, 18.4566f, 22.7072f, 18.4646f)
                    lineTo(21.2932f, 19.8796f)
                    lineTo(22.7072f, 21.2936f)
                    curveTo(23.0992f, 21.6826f, 23.1042f, 22.3126f, 22.7152f, 22.7046f)
                    curveTo(22.7132f, 22.7066f, 22.7122f, 22.7086f, 22.7072f, 22.7076f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0351f, 20.0149f)
                    curveTo(14.0311f, 16.7179f, 16.7001f, 14.0419f, 19.9961f, 14.0369f)
                    curveTo(21.2791f, 14.0349f, 22.5291f, 14.4469f, 23.5591f, 15.2119f)
                    curveTo(25.3321f, 8.8269f, 21.5931f, 2.2139f, 15.2091f, 0.4409f)
                    curveTo(8.8251f, -1.3321f, 2.2131f, 2.4059f, 0.4401f, 8.7909f)
                    curveTo(-1.3329f, 15.1759f, 2.4061f, 21.7899f, 8.7901f, 23.5629f)
                    curveTo(10.8901f, 24.1459f, 13.1091f, 24.1459f, 15.2091f, 23.5629f)
                    curveTo(14.4471f, 22.5369f, 14.0351f, 21.2929f, 14.0351f, 20.0149f)
                    close()
                    moveTo(13.0001f, 12.0219f)
                    curveTo(13.0001f, 12.2879f, 12.8941f, 12.5419f, 12.7061f, 12.7299f)
                    lineTo(9.7011f, 15.7359f)
                    curveTo(9.3031f, 16.1199f, 8.6691f, 16.1089f, 8.2851f, 15.7109f)
                    curveTo(7.9101f, 15.3229f, 7.9101f, 14.7069f, 8.2851f, 14.3189f)
                    lineTo(10.9971f, 11.6069f)
                    verticalLineTo(7.0129f)
                    curveTo(10.9971f, 6.4599f, 11.4451f, 6.0109f, 11.9991f, 6.0109f)
                    curveTo(12.5521f, 6.0109f, 13.0001f, 6.4599f, 13.0001f, 7.0129f)
                    verticalLineTo(12.0219f)
                    close()
                }
            }
        }
        .build()
        return _timeDelete!!
    }

private var _timeDelete: ImageVector? = null
