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

public val Icons.Filled.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) {
            return _waveTriangle!!
        }
        _waveTriangle = Builder(name = "WaveTriangle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 22.0f)
                horizontalLineToRelative(-0.017f)
                curveToRelative(-0.357f, -0.006f, -0.684f, -0.202f, -0.857f, -0.514f)
                lineTo(6.967f, 4.999f)
                lineTo(1.857f, 13.515f)
                curveToRelative(-0.285f, 0.474f, -0.899f, 0.626f, -1.372f, 0.343f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.898f, -0.343f, -1.372f)
                lineTo(6.143f, 2.485f)
                curveToRelative(0.184f, -0.306f, 0.516f, -0.501f, 0.874f, -0.485f)
                curveToRelative(0.357f, 0.006f, 0.684f, 0.202f, 0.857f, 0.514f)
                lineToRelative(9.159f, 16.487f)
                lineToRelative(5.109f, -8.516f)
                curveToRelative(0.284f, -0.475f, 0.897f, -0.627f, 1.372f, -0.343f)
                curveToRelative(0.474f, 0.284f, 0.627f, 0.898f, 0.343f, 1.372f)
                lineToRelative(-6.0f, 10.0f)
                curveToRelative(-0.181f, 0.301f, -0.506f, 0.485f, -0.857f, 0.485f)
                close()
            }
        }
        .build()
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
