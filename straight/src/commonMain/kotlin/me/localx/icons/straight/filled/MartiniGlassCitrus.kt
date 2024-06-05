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
                moveToRelative(18.462f, 8.477f)
                curveToRelative(0.977f, -0.888f, 1.537f, -2.155f, 1.537f, -3.477f)
                verticalLineToRelative(-1.0f)
                lineTo(-0.001f, 4.0f)
                verticalLineToRelative(1.0f)
                curveTo(-0.001f, 6.32f, 0.559f, 7.588f, 1.537f, 8.477f)
                lineToRelative(7.462f, 6.784f)
                verticalLineToRelative(6.739f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.739f)
                lineToRelative(7.463f, -6.784f)
                close()
                moveTo(23.883f, 4.72f)
                curveToRelative(0.806f, 3.882f, -2.135f, 7.297f, -5.874f, 7.297f)
                curveToRelative(-0.149f, 0.0f, -0.296f, -0.012f, -0.442f, -0.022f)
                lineToRelative(2.242f, -2.038f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.393f, -1.267f, 2.191f, -3.074f, 2.191f, -4.957f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-5.458f)
                curveToRelative(1.357f, -1.511f, 3.46f, -2.337f, 5.736f, -1.869f)
                reflectiveCurveToRelative(4.131f, 2.308f, 4.605f, 4.589f)
                close()
            }
        }
        .build()
        return _martiniGlassCitrus!!
    }

private var _martiniGlassCitrus: ImageVector? = null
