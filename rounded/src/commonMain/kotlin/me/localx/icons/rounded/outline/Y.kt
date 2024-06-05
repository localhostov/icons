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

public val Icons.Outline.Y: ImageVector
    get() {
        if (_y != null) {
            return _y!!
        }
        _y = Builder(name = "Y", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.633f, 0.226f)
                curveToRelative(-0.427f, -0.348f, -1.057f, -0.287f, -1.407f, 0.142f)
                lineTo(12.0f, 10.421f)
                lineTo(3.774f, 0.367f)
                curveToRelative(-0.351f, -0.429f, -0.98f, -0.49f, -1.407f, -0.142f)
                curveToRelative(-0.428f, 0.351f, -0.491f, 0.98f, -0.142f, 1.407f)
                lineTo(11.0f, 12.357f)
                verticalLineToRelative(10.643f)
                curveToRelative(0.005f, 1.308f, 1.995f, 1.307f, 2.0f, 0.0f)
                verticalLineTo(12.357f)
                lineTo(21.774f, 1.633f)
                curveToRelative(0.35f, -0.427f, 0.286f, -1.057f, -0.142f, -1.407f)
                close()
            }
        }
        .build()
        return _y!!
    }

private var _y: ImageVector? = null
