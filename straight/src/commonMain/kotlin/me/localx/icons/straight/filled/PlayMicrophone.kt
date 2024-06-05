package me.localx.icons.straight.filled

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

public val Icons.Filled.PlayMicrophone: ImageVector
    get() {
        if (_playMicrophone != null) {
            return _playMicrophone!!
        }
        _playMicrophone = Builder(name = "PlayMicrophone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 21.978f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(4.935f, 23.978f, 0.0f, 19.043f, 0.0f, 12.978f)
                lineTo(2.0f, 12.978f)
                curveToRelative(0.0f, 4.962f, 4.038f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(24.0f, 12.978f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.744f, -0.101f, 1.463f, -0.272f, 2.155f)
                lineToRelative(1.802f, 1.013f)
                curveToRelative(0.303f, -1.004f, 0.47f, -2.067f, 0.47f, -3.168f)
                close()
                moveTo(14.0f, 24.0f)
                lineToRelative(9.708f, -5.459f)
                lineToRelative(-9.708f, -5.459f)
                verticalLineToRelative(10.919f)
                close()
                moveTo(14.38f, 11.0f)
                lineToRelative(5.414f, 3.045f)
                curveToRelative(0.09f, -0.34f, 0.161f, -0.688f, 0.206f, -1.045f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.931f)
                curveToRelative(-0.495f, -3.94f, -3.859f, -7.0f, -7.931f, -7.0f)
                reflectiveCurveTo(4.564f, 3.06f, 4.069f, 7.0f)
                horizontalLineToRelative(4.931f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.069f, 13.0f)
                curveToRelative(0.495f, 3.94f, 3.859f, 7.0f, 7.931f, 7.0f)
                lineTo(12.0f, 11.0f)
                horizontalLineToRelative(2.38f)
                close()
            }
        }
        .build()
        return _playMicrophone!!
    }

private var _playMicrophone: ImageVector? = null
