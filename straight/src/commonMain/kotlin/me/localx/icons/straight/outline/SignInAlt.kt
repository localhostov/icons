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

public val Icons.Outline.SignInAlt: ImageVector
    get() {
        if (_signInAlt != null) {
            return _signInAlt!!
        }
        _signInAlt = Builder(name = "SignInAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.9049f, 0.0f)
                    horizontalLineTo(3.1f)
                    curveTo(2.2718f, 0.0066f, 1.4802f, 0.3416f, 0.899f, 0.9315f)
                    curveTo(0.3177f, 1.5214f, -0.0056f, 2.3179f, -1.0E-4f, 3.146f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(3.146f)
                    curveTo(1.9969f, 2.9985f, 2.0229f, 2.8519f, 2.0766f, 2.7145f)
                    curveTo(2.1302f, 2.577f, 2.2104f, 2.4515f, 2.3125f, 2.3451f)
                    curveTo(2.4147f, 2.2387f, 2.5368f, 2.1534f, 2.6719f, 2.0942f)
                    curveTo(2.807f, 2.035f, 2.9525f, 2.003f, 3.1f, 2.0f)
                    horizontalLineTo(20.9099f)
                    curveTo(21.2061f, 2.0086f, 21.4867f, 2.1339f, 21.6909f, 2.3486f)
                    curveTo(21.8951f, 2.5632f, 22.0061f, 2.8498f, 21.9999f, 3.146f)
                    verticalLineTo(20.854f)
                    curveTo(22.0061f, 21.151f, 21.8944f, 21.4384f, 21.6891f, 21.6532f)
                    curveTo(21.4839f, 21.8679f, 21.2019f, 21.9927f, 20.9049f, 22.0f)
                    horizontalLineTo(3.1f)
                    curveTo(2.9525f, 21.997f, 2.807f, 21.965f, 2.6719f, 21.9058f)
                    curveTo(2.5368f, 21.8466f, 2.4147f, 21.7613f, 2.3125f, 21.6549f)
                    curveTo(2.2104f, 21.5485f, 2.1302f, 21.423f, 2.0766f, 21.2855f)
                    curveTo(2.0229f, 21.1481f, 1.9969f, 21.0015f, 2.0f, 20.854f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(20.854f)
                    curveTo(-0.0056f, 21.6821f, 0.3177f, 22.4786f, 0.899f, 23.0685f)
                    curveTo(1.4802f, 23.6584f, 2.2718f, 23.9934f, 3.1f, 24.0f)
                    horizontalLineTo(20.9099f)
                    curveTo(21.7363f, 23.9908f, 22.5254f, 23.6546f, 23.1045f, 23.065f)
                    curveTo(23.6836f, 22.4754f, 24.0056f, 21.6804f, 23.9999f, 20.854f)
                    verticalLineTo(3.146f)
                    curveTo(24.0055f, 2.3187f, 23.6829f, 1.523f, 23.1027f, 0.9333f)
                    curveTo(22.5225f, 0.3435f, 21.7322f, 0.0079f, 20.9049f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0f, 12.9991f)
                    horizontalLineTo(17.086f)
                    lineTo(12.786f, 17.2991f)
                    lineTo(14.2f, 18.7171f)
                    lineTo(19.149f, 13.7671f)
                    curveTo(19.3812f, 13.535f, 19.5654f, 13.2593f, 19.6911f, 12.956f)
                    curveTo(19.8168f, 12.6526f, 19.8815f, 12.3275f, 19.8815f, 11.9991f)
                    curveTo(19.8815f, 11.6708f, 19.8168f, 11.3456f, 19.6911f, 11.0423f)
                    curveTo(19.5654f, 10.7389f, 19.3812f, 10.4633f, 19.149f, 10.2311f)
                    lineTo(14.2f, 5.2811f)
                    lineTo(12.783f, 6.6991f)
                    lineTo(17.083f, 10.9991f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(12.9991f)
                    close()
                }
            }
        }
        .build()
        return _signInAlt!!
    }

private var _signInAlt: ImageVector? = null
