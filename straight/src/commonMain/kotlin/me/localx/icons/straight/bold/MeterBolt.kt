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

public val Icons.Bold.MeterBolt: ImageVector
    get() {
        if (_meterBolt != null) {
            return _meterBolt!!
        }
        _meterBolt = Builder(name = "MeterBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 12.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.092f)
                lineToRelative(-1.666f, 2.908f)
                horizontalLineToRelative(-1.334f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                curveToRelative(4.113f, 0.0f, 7.583f, 2.777f, 8.653f, 6.552f)
                lineToRelative(3.32f, 1.904f)
                curveToRelative(-0.288f, -6.364f, -5.54f, -11.455f, -11.972f, -11.455f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.155f, 0.0f, 2.269f, -0.173f, 3.328f, -0.479f)
                lineToRelative(1.516f, -2.656f)
                curveToRelative(-0.454f, -0.127f, -0.878f, -0.337f, -1.255f, -0.615f)
                curveToRelative(-1.101f, 0.481f, -2.313f, 0.751f, -3.589f, 0.751f)
                close()
                moveTo(9.0f, 12.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(10.5f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(23.702f, 16.888f)
                curveToRelative(-0.351f, -0.551f, -0.95f, -0.88f, -1.604f, -0.88f)
                horizontalLineToRelative(-2.299f)
                lineToRelative(2.002f, -3.492f)
                lineToRelative(-2.603f, -1.492f)
                lineToRelative(-2.998f, 5.233f)
                curveToRelative(-0.296f, 0.594f, -0.266f, 1.285f, 0.083f, 1.85f)
                curveToRelative(0.349f, 0.564f, 0.953f, 0.901f, 1.617f, 0.901f)
                horizontalLineToRelative(2.303f)
                lineToRelative(-2.007f, 3.519f)
                lineToRelative(2.605f, 1.486f)
                lineToRelative(3.019f, -5.3f)
                curveToRelative(0.276f, -0.592f, 0.231f, -1.274f, -0.119f, -1.825f)
                close()
            }
        }
        .build()
        return _meterBolt!!
    }

private var _meterBolt: ImageVector? = null
