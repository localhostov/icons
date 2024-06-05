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

public val Icons.Filled.MartiniGlassCitrus: ImageVector
    get() {
        if (_martiniGlassCitrus != null) {
            return _martiniGlassCitrus!!
        }
        _martiniGlassCitrus = Builder(name = "MartiniGlassCitrus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.809f, 5.771f)
                curveToRelative(-0.421f, -1.076f, -1.432f, -1.771f, -2.573f, -1.771f)
                lineTo(2.765f, 4.0f)
                curveToRelative(-1.142f, 0.0f, -2.152f, 0.695f, -2.573f, 1.771f)
                curveToRelative(-0.41f, 1.045f, -0.16f, 2.161f, 0.676f, 2.934f)
                lineToRelative(6.668f, 6.16f)
                curveToRelative(0.434f, 0.395f, 0.936f, 0.667f, 1.465f, 0.818f)
                verticalLineToRelative(6.317f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.318f)
                curveToRelative(0.53f, -0.152f, 1.034f, -0.425f, 1.471f, -0.823f)
                lineToRelative(6.688f, -6.178f)
                curveToRelative(0.811f, -0.75f, 1.061f, -1.865f, 0.65f, -2.91f)
                close()
                moveTo(24.0f, 6.0f)
                curveToRelative(0.0f, 3.127f, -2.404f, 5.702f, -5.46f, 5.975f)
                lineToRelative(1.976f, -1.826f)
                curveToRelative(1.408f, -1.301f, 1.861f, -3.306f, 1.155f, -5.107f)
                curveToRelative(-0.723f, -1.849f, -2.464f, -3.043f, -4.436f, -3.043f)
                horizontalLineToRelative(-3.716f)
                curveToRelative(1.108f, -1.242f, 2.716f, -2.0f, 4.481f, -2.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _martiniGlassCitrus!!
    }

private var _martiniGlassCitrus: ImageVector? = null
