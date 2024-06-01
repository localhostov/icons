package me.localx.icons.straight.filled

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

public val Icons.Filled.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.4136f, 12.9999f)
                    lineTo(21.1586f, 19.7449f)
                    curveTo(22.77f, 17.8428f, 23.7459f, 15.4844f, 23.9496f, 12.9999f)
                    horizontalLineTo(14.4136f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.2925f, 12.707f)
                    lineTo(10.9995f, 12.414f)
                    verticalLineTo(0.05f)
                    curveTo(9.1153f, 0.2045f, 7.2943f, 0.8018f, 5.6848f, 1.7936f)
                    curveTo(4.0753f, 2.7853f, 2.7228f, 4.1432f, 1.7377f, 5.7568f)
                    curveTo(0.7525f, 7.3703f, 0.1625f, 9.1938f, 0.0158f, 11.0786f)
                    curveTo(-0.1309f, 12.9634f, 0.1698f, 14.8562f, 0.8933f, 16.6028f)
                    curveTo(1.6169f, 18.3493f, 2.7429f, 19.9002f, 4.1795f, 21.1291f)
                    curveTo(5.6162f, 22.3579f, 7.3228f, 23.23f, 9.1604f, 23.6741f)
                    curveTo(10.998f, 24.1182f, 12.9146f, 24.1219f, 14.7539f, 23.6849f)
                    curveTo(16.5932f, 23.2478f, 18.3032f, 22.3824f, 19.7445f, 21.159f)
                    lineTo(11.2925f, 12.707f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0003f, 11.0f)
                    horizontalLineTo(23.9503f)
                    curveTo(23.7142f, 8.1749f, 22.4848f, 5.5248f, 20.4801f, 3.5202f)
                    curveTo(18.4755f, 1.5156f, 15.8254f, 0.2861f, 13.0003f, 0.05f)
                    verticalLineTo(11.0f)
                    close()
                }
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
