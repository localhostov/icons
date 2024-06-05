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

public val Icons.Filled.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.084f, 17.442f)
                curveToRelative(1.171f, 1.169f, 2.987f, 3.847f, 1.037f, 5.679f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, true, -4.243f, 0.0f)
                curveToRelative(-1.941f, -1.812f, -0.136f, -4.486f, 1.0f, -5.639f)
                arcTo(1.573f, 1.573f, 0.0f, false, true, 9.084f, 17.442f)
                close()
                moveTo(14.876f, 17.482f)
                curveToRelative(-1.137f, 1.158f, -2.938f, 3.826f, -1.0f, 5.639f)
                arcTo(3.019f, 3.019f, 0.0f, false, false, 19.0f, 21.0f)
                curveToRelative(0.0f, -1.387f, -1.439f, -3.047f, -1.916f, -3.559f)
                arcTo(1.557f, 1.557f, 0.0f, false, false, 14.876f, 17.482f)
                close()
                moveTo(24.0f, 12.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -3.527f, 6.35f)
                arcToRelative(11.325f, 11.325f, 0.0f, false, false, -1.992f, -2.839f)
                arcToRelative(3.556f, 3.556f, 0.0f, false, false, -5.0f, 0.042f)
                arcTo(13.555f, 13.555f, 0.0f, false, false, 12.0f, 17.984f)
                arcToRelative(12.783f, 12.783f, 0.0f, false, false, -1.52f, -1.974f)
                arcToRelative(3.558f, 3.558f, 0.0f, false, false, -5.0f, 0.044f)
                arcTo(10.746f, 10.746f, 0.0f, false, false, 3.263f, 19.52f)
                arcTo(5.543f, 5.543f, 0.0f, false, true, 1.8f, 10.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.345f, -0.9f)
                arcToRelative(8.147f, 8.147f, 0.0f, false, true, -0.033f, -2.889f)
                arcTo(7.946f, 7.946f, 0.0f, false, true, 8.5f, 0.137f)
                arcToRelative(8.056f, 8.056f, 0.0f, false, true, 8.734f, 4.44f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 0.743f, 0.569f)
                arcTo(7.514f, 7.514f, 0.0f, false, true, 24.0f, 12.5f)
                close()
                moveTo(15.0f, 11.0f)
                curveToRelative(0.0f, -1.387f, -1.439f, -3.047f, -1.915f, -3.558f)
                arcToRelative(1.573f, 1.573f, 0.0f, false, false, -2.209f, 0.04f)
                curveToRelative(-1.138f, 1.158f, -2.938f, 3.826f, -1.0f, 5.639f)
                arcTo(3.019f, 3.019f, 0.0f, false, false, 15.0f, 11.0f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
