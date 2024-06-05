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

public val Icons.Bold.MartiniGlassCitrus: ImageVector
    get() {
        if (_martiniGlassCitrus != null) {
            return _martiniGlassCitrus!!
        }
        _martiniGlassCitrus = Builder(name = "MartiniGlassCitrus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                curveToRelative(-2.133f, 0.0f, -3.964f, 1.224f, -4.875f, 3.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.504f, 0.635f, 2.947f, 1.743f, 3.963f)
                lineToRelative(7.257f, 6.963f)
                verticalLineToRelative(5.574f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.575f)
                lineToRelative(4.869f, -4.672f)
                curveToRelative(0.516f, 0.16f, 1.063f, 0.246f, 1.632f, 0.246f)
                curveToRelative(3.038f, 0.0f, 5.5f, -2.462f, 5.5f, -5.5f)
                reflectiveCurveTo(21.538f, 0.0f, 18.5f, 0.0f)
                close()
                moveTo(3.777f, 6.258f)
                curveToRelative(-0.088f, -0.08f, -0.169f, -0.167f, -0.243f, -0.258f)
                horizontalLineToRelative(13.929f)
                curveToRelative(-0.081f, 0.1f, -0.171f, 0.196f, -0.269f, 0.285f)
                lineToRelative(-6.694f, 6.422f)
                lineTo(3.807f, 6.285f)
                lineToRelative(-0.029f, -0.027f)
                close()
            }
        }
        .build()
        return _martiniGlassCitrus!!
    }

private var _martiniGlassCitrus: ImageVector? = null
