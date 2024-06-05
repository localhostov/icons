package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Racquet: ImageVector
    get() {
        if (_racquet != null) {
            return _racquet!!
        }
        _racquet = Builder(name = "Racquet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.923f, 2.067f)
                curveTo(18.758f, -1.1f, 13.077f, -0.569f, 9.258f, 3.248f)
                arcTo(10.6f, 10.6f, 0.0f, false, false, 6.02f, 10.9f)
                arcToRelative(13.291f, 13.291f, 0.0f, false, false, 0.157f, 1.433f)
                curveToRelative(0.149f, 1.571f, 0.129f, 3.938f, -0.884f, 4.951f)
                lineToRelative(-5.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 1.707f, 23.7f)
                lineToRelative(5.0f, -5.0f)
                curveToRelative(1.025f, -1.023f, 3.433f, -1.033f, 5.0f, -0.879f)
                arcToRelative(13.448f, 13.448f, 0.0f, false, false, 1.62f, 0.163f)
                arcToRelative(10.667f, 10.667f, 0.0f, false, false, 7.412f, -3.249f)
                curveTo(24.56f, 10.915f, 25.089f, 5.234f, 21.923f, 2.067f)
                close()
                moveTo(21.406f, 10.221f)
                lineTo(19.924f, 8.739f)
                lineTo(21.967f, 6.7f)
                arcTo(7.444f, 7.444f, 0.0f, false, true, 21.406f, 10.221f)
                close()
                moveTo(21.306f, 4.532f)
                lineTo(18.51f, 7.325f)
                lineTo(16.584f, 5.4f)
                lineToRelative(2.753f, -2.753f)
                arcToRelative(4.838f, 4.838f, 0.0f, false, true, 1.172f, 0.835f)
                arcTo(4.831f, 4.831f, 0.0f, false, true, 21.3f, 4.532f)
                close()
                moveTo(13.037f, 15.98f)
                lineToRelative(-0.3f, -0.051f)
                lineToRelative(2.241f, -2.241f)
                lineToRelative(1.568f, 1.568f)
                arcTo(7.685f, 7.685f, 0.0f, false, true, 13.037f, 15.98f)
                close()
                moveTo(8.01f, 10.951f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 0.724f, -3.5f)
                lineToRelative(1.487f, 1.486f)
                lineTo(8.039f, 11.117f)
                curveTo(8.029f, 11.058f, 8.019f, 11.0f, 8.01f, 10.951f)
                close()
                moveTo(10.542f, 15.293f)
                arcToRelative(4.718f, 4.718f, 0.0f, false, true, -1.9f, -1.952f)
                lineToRelative(2.992f, -2.993f)
                lineToRelative(1.926f, 1.926f)
                close()
                moveTo(13.049f, 8.934f)
                lineTo(15.17f, 6.813f)
                lineTo(17.1f, 8.739f)
                lineTo(14.975f, 10.86f)
                close()
                moveTo(17.128f, 2.027f)
                lineTo(15.17f, 3.985f)
                lineToRelative(-1.4f, -1.4f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 2.891f, -0.6f)
                curveTo(16.823f, 1.988f, 16.973f, 2.016f, 17.128f, 2.027f)
                close()
                moveTo(11.949f, 3.592f)
                lineTo(13.756f, 5.4f)
                lineTo(11.635f, 7.52f)
                lineTo(9.793f, 5.679f)
                arcToRelative(9.381f, 9.381f, 0.0f, false, true, 2.156f, -2.087f)
                close()
                moveTo(8.049f, 15.938f)
                curveToRelative(0.0f, -0.014f, 0.005f, -0.029f, 0.008f, -0.043f)
                lineToRelative(0.017f, 0.019f)
                lineToRelative(0.018f, 0.017f)
                close()
                moveTo(18.309f, 14.198f)
                lineTo(16.386f, 12.274f)
                lineTo(18.507f, 10.153f)
                lineTo(20.4f, 12.044f)
                arcToRelative(9.879f, 9.879f, 0.0f, false, true, -1.073f, 1.275f)
                arcTo(10.035f, 10.035f, 0.0f, false, true, 18.312f, 14.2f)
                close()
            }
        }
        .build()
        return _racquet!!
    }

private var _racquet: ImageVector? = null
