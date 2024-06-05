package me.localx.icons.straight.outline

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

public val Icons.Outline.MartiniGlassCitrus: ImageVector
    get() {
        if (_martiniGlassCitrus != null) {
            return _martiniGlassCitrus!!
        }
        _martiniGlassCitrus = Builder(name = "MartiniGlassCitrus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                curveToRelative(-2.573f, 0.0f, -4.797f, 1.622f, -5.637f, 4.0f)
                lineTo(0.0f, 4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.32f, 0.561f, 2.587f, 1.538f, 3.477f)
                lineToRelative(7.462f, 6.784f)
                verticalLineToRelative(6.739f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.739f)
                lineToRelative(4.299f, -3.908f)
                curveToRelative(0.832f, 0.422f, 1.748f, 0.647f, 2.701f, 0.647f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(21.309f, 0.0f, 18.0f, 0.0f)
                close()
                moveTo(2.192f, 6.0f)
                horizontalLineToRelative(15.615f)
                curveToRelative(-0.15f, 0.377f, -0.385f, 0.719f, -0.69f, 0.998f)
                lineToRelative(-7.117f, 6.469f)
                lineTo(2.884f, 6.998f)
                curveToRelative(-0.306f, -0.278f, -0.54f, -0.621f, -0.691f, -0.998f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(-0.36f, 0.0f, -0.709f, -0.058f, -1.048f, -0.15f)
                lineToRelative(1.51f, -1.373f)
                curveToRelative(0.977f, -0.889f, 1.537f, -2.156f, 1.537f, -3.477f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.454f)
                curveToRelative(0.699f, -1.212f, 1.991f, -2.0f, 3.454f, -2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _martiniGlassCitrus!!
    }

private var _martiniGlassCitrus: ImageVector? = null
