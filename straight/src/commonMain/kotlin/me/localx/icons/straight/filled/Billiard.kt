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

public val Icons.Filled.Billiard: ImageVector
    get() {
        if (_billiard != null) {
            return _billiard!!
        }
        _billiard = Builder(name = "Billiard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 6.0f)
                    curveTo(10.8133f, 6.0f, 9.6533f, 6.3519f, 8.6666f, 7.0112f)
                    curveTo(7.6799f, 7.6705f, 6.9109f, 8.6075f, 6.4567f, 9.7039f)
                    curveTo(6.0026f, 10.8003f, 5.8838f, 12.0067f, 6.1153f, 13.1705f)
                    curveTo(6.3468f, 14.3344f, 6.9183f, 15.4035f, 7.7574f, 16.2426f)
                    curveTo(8.5965f, 17.0818f, 9.6656f, 17.6532f, 10.8295f, 17.8847f)
                    curveTo(11.9934f, 18.1162f, 13.1997f, 17.9974f, 14.2961f, 17.5433f)
                    curveTo(15.3925f, 17.0892f, 16.3295f, 16.3201f, 16.9888f, 15.3334f)
                    curveTo(17.6481f, 14.3467f, 18.0f, 13.1867f, 18.0f, 12.0f)
                    curveTo(17.9984f, 10.4092f, 17.3658f, 8.884f, 16.2409f, 7.7591f)
                    curveTo(15.116f, 6.6342f, 13.5908f, 6.0016f, 12.0f, 6.0f)
                    close()
                    moveTo(15.0f, 10.448f)
                    lineTo(11.888f, 16.46f)
                    lineTo(10.112f, 15.54f)
                    lineTo(12.462f, 11.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(10.448f)
                    close()
                    moveTo(12.0f, 0.0f)
                    curveTo(9.6266f, 0.0f, 7.3066f, 0.7038f, 5.3332f, 2.0224f)
                    curveTo(3.3598f, 3.3409f, 1.8217f, 5.2151f, 0.9135f, 7.4078f)
                    curveTo(0.0052f, 9.6005f, -0.2324f, 12.0133f, 0.2306f, 14.3411f)
                    curveTo(0.6936f, 16.6689f, 1.8365f, 18.8071f, 3.5147f, 20.4853f)
                    curveTo(5.1929f, 22.1635f, 7.3312f, 23.3064f, 9.6589f, 23.7694f)
                    curveTo(11.9867f, 24.2324f, 14.3995f, 23.9948f, 16.5922f, 23.0866f)
                    curveTo(18.7849f, 22.1783f, 20.6591f, 20.6402f, 21.9776f, 18.6668f)
                    curveTo(23.2962f, 16.6935f, 24.0f, 14.3734f, 24.0f, 12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(12.0f, 20.0f)
                    curveTo(10.4178f, 20.0f, 8.871f, 19.5308f, 7.5554f, 18.6518f)
                    curveTo(6.2399f, 17.7727f, 5.2145f, 16.5233f, 4.609f, 15.0615f)
                    curveTo(4.0035f, 13.5997f, 3.845f, 11.9911f, 4.1537f, 10.4393f)
                    curveTo(4.4624f, 8.8874f, 5.2243f, 7.462f, 6.3432f, 6.3432f)
                    curveTo(7.462f, 5.2243f, 8.8874f, 4.4624f, 10.4393f, 4.1537f)
                    curveTo(11.9911f, 3.845f, 13.5997f, 4.0035f, 15.0615f, 4.609f)
                    curveTo(16.5233f, 5.2145f, 17.7727f, 6.2399f, 18.6518f, 7.5554f)
                    curveTo(19.5308f, 8.871f, 20.0f, 10.4178f, 20.0f, 12.0f)
                    curveTo(19.9976f, 14.121f, 19.154f, 16.1544f, 17.6542f, 17.6542f)
                    curveTo(16.1545f, 19.154f, 14.121f, 19.9976f, 12.0f, 20.0f)
                    close()
                }
            }
        }
        .build()
        return _billiard!!
    }

private var _billiard: ImageVector? = null
