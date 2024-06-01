package me.localx.icons.straight.bold

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

public val Icons.Bold.TimePast: ImageVector
    get() {
        if (_timePast != null) {
            return _timePast!!
        }
        _timePast = Builder(name = "TimePast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(8.821f, 0.0111f, 5.7756f, 1.2798f, 3.529f, 3.529f)
                    lineTo(1.0f, 1.0f)
                    verticalLineTo(6.909f)
                    curveTo(0.9999f, 7.0523f, 1.028f, 7.1942f, 1.0828f, 7.3267f)
                    curveTo(1.1376f, 7.4591f, 1.2179f, 7.5794f, 1.3192f, 7.6807f)
                    curveTo(1.4206f, 7.7821f, 1.5409f, 7.8624f, 1.6733f, 7.9172f)
                    curveTo(1.8058f, 7.972f, 1.9477f, 8.0001f, 2.091f, 8.0f)
                    horizontalLineTo(8.0f)
                    lineTo(5.647f, 5.647f)
                    curveTo(7.1203f, 4.1809f, 9.0562f, 3.2708f, 11.1252f, 3.0719f)
                    curveTo(13.1941f, 2.873f, 15.268f, 3.3976f, 16.9936f, 4.5562f)
                    curveTo(18.7192f, 5.7148f, 19.9897f, 7.4358f, 20.5887f, 9.4261f)
                    curveTo(21.1878f, 11.4164f, 21.0783f, 13.5528f, 20.2789f, 15.4714f)
                    curveTo(19.4795f, 17.39f, 18.0397f, 18.9721f, 16.2047f, 19.9482f)
                    curveTo(14.3697f, 20.9243f, 12.253f, 21.2341f, 10.2152f, 20.8247f)
                    curveTo(8.1775f, 20.4153f, 6.3447f, 19.3121f, 5.0291f, 17.703f)
                    curveTo(3.7134f, 16.0939f, 2.9964f, 14.0785f, 3.0f, 12.0f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 14.3734f, 0.7038f, 16.6935f, 2.0224f, 18.6668f)
                    curveTo(3.3409f, 20.6402f, 5.2151f, 22.1783f, 7.4078f, 23.0866f)
                    curveTo(9.6005f, 23.9948f, 12.0133f, 24.2324f, 14.3411f, 23.7694f)
                    curveTo(16.6689f, 23.3064f, 18.8071f, 22.1635f, 20.4853f, 20.4853f)
                    curveTo(22.1635f, 18.8071f, 23.3064f, 16.6689f, 23.7694f, 14.3411f)
                    curveTo(24.2324f, 12.0133f, 23.9948f, 9.6005f, 23.0866f, 7.4078f)
                    curveTo(22.1783f, 5.2151f, 20.6402f, 3.3409f, 18.6668f, 2.0224f)
                    curveTo(16.6935f, 0.7038f, 14.3734f, 0.0f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0001f, 6.9994f)
                    verticalLineTo(13.6204f)
                    lineTo(13.4391f, 17.0604f)
                    lineTo(15.5611f, 14.9384f)
                    lineTo(13.0001f, 12.3784f)
                    verticalLineTo(6.9994f)
                    horizontalLineTo(10.0001f)
                    close()
                }
            }
        }
        .build()
        return _timePast!!
    }

private var _timePast: ImageVector? = null
