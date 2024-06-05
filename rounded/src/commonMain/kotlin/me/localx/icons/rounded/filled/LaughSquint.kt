package me.localx.icons.rounded.filled

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

public val Icons.Filled.LaughSquint: ImageVector
    get() {
        if (_laughSquint != null) {
            return _laughSquint!!
        }
        _laughSquint = Builder(name = "LaughSquint", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.828f)
                curveTo(114.678f, 0.981f, 0.153f, 115.506f, 0.0f, 256.828f)
                curveToRelative(12.8f, 339.2f, 499.2f, 339.051f, 512.0f, 0.0f)
                curveTo(511.847f, 115.506f, 397.322f, 0.981f, 256.0f, 0.828f)
                close()
                moveTo(133.227f, 242.407f)
                curveToRelative(-6.539f, -9.801f, -3.896f, -23.047f, 5.905f, -29.586f)
                curveToRelative(0.001f, -0.001f, 0.003f, -0.002f, 0.004f, -0.003f)
                lineToRelative(37.44f, -24.917f)
                lineToRelative(-37.44f, -24.917f)
                curveToRelative(-9.803f, -6.539f, -12.448f, -19.787f, -5.909f, -29.589f)
                curveToRelative(6.539f, -9.803f, 19.787f, -12.448f, 29.589f, -5.909f)
                lineToRelative(64.0f, 42.667f)
                curveToRelative(9.803f, 6.684f, 12.331f, 20.049f, 5.647f, 29.852f)
                curveToRelative(-1.513f, 2.219f, -3.428f, 4.134f, -5.647f, 5.647f)
                lineToRelative(-64.0f, 42.667f)
                curveToRelative(-9.801f, 6.539f, -23.047f, 3.896f, -29.586f, -5.905f)
                curveTo(133.229f, 242.41f, 133.228f, 242.408f, 133.227f, 242.407f)
                close()
                moveTo(363.221f, 322.151f)
                curveToRelative(-17.863f, 58.334f, -79.632f, 91.142f, -137.966f, 73.28f)
                curveToRelative(-35.027f, -10.726f, -62.458f, -38.118f, -73.234f, -73.13f)
                curveToRelative(-3.607f, -11.142f, 2.502f, -23.098f, 13.645f, -26.705f)
                curveToRelative(2.207f, -0.714f, 4.516f, -1.062f, 6.835f, -1.028f)
                horizontalLineToRelative(170.261f)
                curveToRelative(11.711f, -0.13f, 21.31f, 9.258f, 21.44f, 20.968f)
                curveTo(364.228f, 317.778f, 363.896f, 320.011f, 363.221f, 322.151f)
                lineTo(363.221f, 322.151f)
                close()
                moveTo(376.149f, 212.817f)
                curveToRelative(9.803f, 6.539f, 12.448f, 19.787f, 5.909f, 29.589f)
                curveToRelative(-6.539f, 9.803f, -19.787f, 12.448f, -29.589f, 5.909f)
                lineToRelative(-64.0f, -42.667f)
                curveToRelative(-9.803f, -6.684f, -12.331f, -20.049f, -5.647f, -29.852f)
                curveToRelative(1.513f, -2.219f, 3.428f, -4.134f, 5.647f, -5.647f)
                lineToRelative(64.0f, -42.667f)
                curveToRelative(9.803f, -6.539f, 23.05f, -3.893f, 29.589f, 5.909f)
                curveToRelative(6.539f, 9.803f, 3.893f, 23.05f, -5.909f, 29.589f)
                lineToRelative(-37.44f, 24.917f)
                lineTo(376.149f, 212.817f)
                close()
            }
        }
        .build()
        return _laughSquint!!
    }

private var _laughSquint: ImageVector? = null
