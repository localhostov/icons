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

public val Icons.Bold.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.64f, 0.005f)
                curveToRelative(-3.783f, 0.0f, -8.046f, 2.006f, -11.4f, 5.365f)
                arcToRelative(37.3f, 37.3f, 0.0f, false, false, -7.892f, 11.487f)
                arcToRelative(4.349f, 4.349f, 0.0f, false, false, 0.927f, 4.811f)
                lineToRelative(1.057f, 1.057f)
                arcToRelative(4.345f, 4.345f, 0.0f, false, false, 4.806f, 0.928f)
                arcToRelative(37.171f, 37.171f, 0.0f, false, false, 11.492f, -7.887f)
                curveToRelative(3.359f, -3.36f, 5.37f, -7.623f, 5.37f, -11.406f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.36f, -4.355f)
                close()
                moveTo(16.509f, 13.645f)
                arcToRelative(34.193f, 34.193f, 0.0f, false, true, -10.552f, 7.255f)
                arcToRelative(1.345f, 1.345f, 0.0f, false, true, -0.81f, 0.078f)
                lineToRelative(11.414f, -11.417f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineToRelative(-11.412f, 11.413f)
                arcToRelative(1.363f, 1.363f, 0.0f, false, true, 0.078f, -0.811f)
                arcToRelative(34.249f, 34.249f, 0.0f, false, true, 7.251f, -10.55f)
                curveToRelative(3.308f, -3.307f, 6.964f, -4.486f, 9.284f, -4.486f)
                curveToRelative(1.077f, 0.0f, 1.36f, 0.278f, 1.36f, 1.355f)
                curveToRelative(0.0f, 2.32f, -1.184f, 5.977f, -4.491f, 9.285f)
                close()
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
