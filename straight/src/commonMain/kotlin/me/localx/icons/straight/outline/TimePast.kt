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

public val Icons.Outline.TimePast: ImageVector
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
                    curveTo(9.0459f, 0.0089f, 6.1983f, 1.1045f, 4.0f, 3.078f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(5.143f)
                    curveTo(2.0005f, 5.6354f, 2.1964f, 6.1074f, 2.5445f, 6.4555f)
                    curveTo(2.8926f, 6.8036f, 3.3647f, 6.9995f, 3.857f, 7.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(4.879f)
                    curveTo(6.5043f, 3.3536f, 8.6508f, 2.3226f, 10.9519f, 2.0832f)
                    curveTo(13.2529f, 1.8439f, 15.5657f, 2.4109f, 17.4951f, 3.6876f)
                    curveTo(19.4244f, 4.9643f, 20.8506f, 6.8713f, 21.5299f, 9.0828f)
                    curveTo(22.2092f, 11.2943f, 22.0994f, 13.6731f, 21.2195f, 15.8126f)
                    curveTo(20.3395f, 17.9522f, 18.7438f, 19.7199f, 16.7052f, 20.8135f)
                    curveTo(14.6665f, 21.9072f, 12.3113f, 22.259f, 10.0421f, 21.8088f)
                    curveTo(7.7728f, 21.3586f, 5.7303f, 20.1344f, 4.2635f, 18.3454f)
                    curveTo(2.7967f, 16.5564f, 1.9966f, 14.3135f, 2.0f, 12.0f)
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
                    moveTo(11.0002f, 6.9994f)
                    verticalLineTo(12.4134f)
                    lineTo(14.2932f, 15.7064f)
                    lineTo(15.7072f, 14.2924f)
                    lineTo(13.0002f, 11.5854f)
                    verticalLineTo(6.9994f)
                    horizontalLineTo(11.0002f)
                    close()
                }
            }
        }
        .build()
        return _timePast!!
    }

private var _timePast: ImageVector? = null
