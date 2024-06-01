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

public val Icons.Bold.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.427f, 16.935f)
                    curveTo(18.1457f, 16.6538f, 17.7642f, 16.4958f, 17.3665f, 16.4958f)
                    curveTo(16.9687f, 16.4958f, 16.5873f, 16.6538f, 16.306f, 16.935f)
                    lineTo(13.525f, 19.714f)
                    lineTo(13.5f, 1.5f)
                    curveTo(13.5f, 1.1022f, 13.3419f, 0.7206f, 13.0606f, 0.4393f)
                    curveTo(12.7793f, 0.158f, 12.3978f, 0.0f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    curveTo(11.6021f, 0.0f, 11.2206f, 0.158f, 10.9393f, 0.4393f)
                    curveTo(10.658f, 0.7206f, 10.5f, 1.1022f, 10.5f, 1.5f)
                    lineTo(10.523f, 19.7f)
                    lineTo(7.76f, 16.935f)
                    curveTo(7.4771f, 16.6618f, 7.0982f, 16.5106f, 6.7049f, 16.514f)
                    curveTo(6.3116f, 16.5174f, 5.9353f, 16.6752f, 5.6572f, 16.9533f)
                    curveTo(5.3791f, 17.2314f, 5.2214f, 17.6076f, 5.2179f, 18.0009f)
                    curveTo(5.2145f, 18.3942f, 5.3657f, 18.7731f, 5.639f, 19.056f)
                    lineTo(9.558f, 22.975f)
                    curveTo(10.2143f, 23.6311f, 11.1044f, 23.9997f, 12.0325f, 23.9997f)
                    curveTo(12.9605f, 23.9997f, 13.8506f, 23.6311f, 14.507f, 22.975f)
                    lineTo(18.427f, 19.056f)
                    curveTo(18.7082f, 18.7747f, 18.8661f, 18.3932f, 18.8661f, 17.9955f)
                    curveTo(18.8661f, 17.5977f, 18.7082f, 17.2163f, 18.427f, 16.935f)
                    close()
                }
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
