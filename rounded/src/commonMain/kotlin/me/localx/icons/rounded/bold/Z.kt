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

public val Icons.Bold.Z: ImageVector
    get() {
        if (_z != null) {
            return _z!!
        }
        _z = Builder(name = "Z", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 24.0f)
                horizontalLineTo(6.257f)
                curveToRelative(-1.862f, 0.0f, -3.446f, -1.15f, -4.034f, -2.931f)
                curveToRelative(-0.594f, -1.796f, 0.0f, -3.683f, 1.512f, -4.805f)
                lineTo(18.476f, 5.326f)
                curveToRelative(0.695f, -0.516f, 0.522f, -1.243f, 0.452f, -1.454f)
                curveToRelative(-0.068f, -0.205f, -0.353f, -0.872f, -1.186f, -0.872f)
                horizontalLineTo(3.5f)
                curveTo(1.528f, 2.966f, 1.529f, 0.033f, 3.5f, 0.0f)
                horizontalLineToRelative(14.243f)
                curveToRelative(1.862f, 0.0f, 3.446f, 1.15f, 4.034f, 2.931f)
                curveToRelative(0.594f, 1.796f, 0.0f, 3.683f, -1.512f, 4.805f)
                lineTo(5.524f, 18.674f)
                curveToRelative(-0.695f, 0.516f, -0.522f, 1.243f, -0.452f, 1.454f)
                curveToRelative(0.068f, 0.205f, 0.353f, 0.872f, 1.186f, 0.872f)
                horizontalLineToRelative(14.243f)
                curveToRelative(1.972f, 0.034f, 1.971f, 2.967f, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _z!!
    }

private var _z: ImageVector? = null
