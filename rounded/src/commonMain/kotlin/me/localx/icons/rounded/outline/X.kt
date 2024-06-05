package me.localx.icons.rounded.outline

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

public val Icons.Outline.X: ImageVector
    get() {
        if (_x != null) {
            return _x!!
        }
        _x = Builder(name = "X", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.292f, 12.0f)
                lineTo(21.774f, 1.633f)
                curveToRelative(0.35f, -0.427f, 0.286f, -1.057f, -0.142f, -1.407f)
                curveToRelative(-0.428f, -0.348f, -1.057f, -0.287f, -1.407f, 0.142f)
                lineTo(12.0f, 10.421f)
                lineTo(3.774f, 0.367f)
                curveToRelative(-0.351f, -0.429f, -0.98f, -0.49f, -1.407f, -0.142f)
                curveToRelative(-0.428f, 0.351f, -0.491f, 0.98f, -0.142f, 1.407f)
                lineTo(10.708f, 12.0f)
                lineTo(2.226f, 22.367f)
                curveToRelative(-0.35f, 0.427f, -0.286f, 1.057f, 0.142f, 1.407f)
                curveToRelative(0.425f, 0.348f, 1.056f, 0.288f, 1.407f, -0.142f)
                lineTo(12.0f, 13.579f)
                lineToRelative(8.226f, 10.053f)
                curveToRelative(0.351f, 0.43f, 0.982f, 0.489f, 1.407f, 0.142f)
                curveToRelative(0.428f, -0.351f, 0.491f, -0.98f, 0.142f, -1.407f)
                lineTo(13.292f, 12.0f)
                close()
            }
        }
        .build()
        return _x!!
    }

private var _x: ImageVector? = null
