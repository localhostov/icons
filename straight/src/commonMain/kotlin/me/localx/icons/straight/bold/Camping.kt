package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Camping: ImageVector
    get() {
        if (_camping != null) {
            return _camping!!
        }
        _camping = Builder(name = "Camping", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.007f, 0.131f)
                lineTo(10.592f, 404.684f)
                lineToRelative(-0.192f, 0.319f)
                curveToRelative(-19.897f, 33.686f, -8.718f, 77.124f, 24.968f, 97.021f)
                curveToRelative(10.908f, 6.443f, 23.344f, 9.843f, 36.013f, 9.845f)
                horizontalLineToRelative(369.25f)
                curveToRelative(39.123f, -0.008f, 70.832f, -31.731f, 70.824f, -70.854f)
                curveToRelative(-0.003f, -12.794f, -3.47f, -25.349f, -10.035f, -36.331f)
                lineTo(256.007f, 0.131f)
                close()
                moveTo(446.657f, 444.521f)
                curveToRelative(-1.192f, 2.204f, -3.52f, 3.553f, -6.026f, 3.492f)
                horizontalLineTo(350.14f)
                lineToRelative(-94.133f, -150.046f)
                lineToRelative(-94.154f, 150.046f)
                horizontalLineTo(71.382f)
                curveToRelative(-3.845f, -0.007f, -6.957f, -3.13f, -6.949f, -6.976f)
                curveToRelative(0.002f, -1.197f, 0.313f, -2.373f, 0.902f, -3.415f)
                lineToRelative(190.672f, -314.252f)
                lineToRelative(190.608f, 314.231f)
                curveTo(447.91f, 439.722f, 447.926f, 442.385f, 446.657f, 444.521f)
                close()
            }
        }
        .build()
        return _camping!!
    }

private var _camping: ImageVector? = null
