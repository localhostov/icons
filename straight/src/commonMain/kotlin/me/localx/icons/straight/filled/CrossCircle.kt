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

public val Icons.Filled.CrossCircle: ImageVector
    get() {
        if (_crossCircle != null) {
            return _crossCircle!!
        }
        _crossCircle = Builder(name = "CrossCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(9.6266f, 0.0f, 7.3066f, 0.7038f, 5.3332f, 2.0224f)
                    curveTo(3.3598f, 3.3409f, 1.8217f, 5.2151f, 0.9135f, 7.4078f)
                    curveTo(0.0052f, 9.6005f, -0.2324f, 12.0133f, 0.2306f, 14.3411f)
                    curveTo(0.6936f, 16.6689f, 1.8365f, 18.8071f, 3.5147f, 20.4853f)
                    curveTo(5.1929f, 22.1635f, 7.3312f, 23.3064f, 9.6589f, 23.7694f)
                    curveTo(11.9867f, 24.2324f, 14.3995f, 23.9948f, 16.5922f, 23.0866f)
                    curveTo(18.7849f, 22.1783f, 20.6591f, 20.6402f, 21.9776f, 18.6668f)
                    curveTo(23.2962f, 16.6935f, 24.0f, 14.3734f, 24.0f, 12.0f)
                    curveTo(24.0f, 8.8174f, 22.7357f, 5.7652f, 20.4853f, 3.5147f)
                    curveTo(18.2348f, 1.2643f, 15.1826f, 0.0f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(16.707f, 15.293f)
                    lineTo(15.293f, 16.707f)
                    lineTo(12.0f, 13.414f)
                    lineTo(8.707f, 16.707f)
                    lineTo(7.293f, 15.293f)
                    lineTo(10.586f, 12.0f)
                    lineTo(7.293f, 8.707f)
                    lineTo(8.707f, 7.293f)
                    lineTo(12.0f, 10.586f)
                    lineTo(15.293f, 7.293f)
                    lineTo(16.707f, 8.707f)
                    lineTo(13.414f, 12.0f)
                    lineTo(16.707f, 15.293f)
                    close()
                }
            }
        }
        .build()
        return _crossCircle!!
    }

private var _crossCircle: ImageVector? = null
