package me.localx.icons.rounded.bold

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

public val Icons.Bold.SmileBeam: ImageVector
    get() {
        if (_smileBeam != null) {
            return _smileBeam!!
        }
        _smileBeam = Builder(name = "SmileBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(0.6f, -3.9f, 23.4f, -3.894f, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, -9.0f, 9.0f)
                curveToRelative(0.452f, 11.923f, 17.55f, 11.92f, 18.0f, 0.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(17.557f, 16.564f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.109f, -2.133f)
                arcToRelative(4.648f, 4.648f, 0.0f, false, true, -6.891f, 0.005f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.114f, 2.128f)
                arcTo(8.813f, 8.813f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(8.813f, 8.813f, 0.0f, false, false, 17.557f, 16.564f)
                close()
                moveTo(9.808f, 11.964f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.16f, -1.776f)
                curveToRelative(-0.889f, -4.216f, -5.049f, -4.21f, -5.936f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.936f, 0.616f)
                curveToRelative(0.01f, -0.046f, 0.02f, -0.091f, 0.032f, -0.134f)
                curveToRelative(0.012f, 0.043f, 0.022f, 0.088f, 0.032f, 0.134f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.776f, 1.16f)
                close()
                moveTo(17.808f, 11.964f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.16f, -1.776f)
                curveToRelative(-0.889f, -4.216f, -5.049f, -4.21f, -5.936f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.936f, 0.616f)
                curveToRelative(0.01f, -0.046f, 0.02f, -0.091f, 0.032f, -0.134f)
                curveToRelative(0.012f, 0.043f, 0.022f, 0.088f, 0.032f, 0.134f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.776f, 1.16f)
                close()
            }
        }
        .build()
        return _smileBeam!!
    }

private var _smileBeam: ImageVector? = null
