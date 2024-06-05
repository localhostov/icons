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

public val Icons.Bold.SmartHomeAlt: ImageVector
    get() {
        if (_smartHomeAlt != null) {
            return _smartHomeAlt!!
        }
        _smartHomeAlt = Builder(name = "SmartHomeAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.657f, 7.407f)
                lineTo(14.157f, 0.756f)
                curveToRelative(-1.271f, -0.992f, -3.044f, -0.992f, -4.313f, 0.0f)
                lineTo(1.343f, 7.407f)
                curveToRelative(-0.854f, 0.668f, -1.343f, 1.673f, -1.343f, 2.757f)
                verticalLineToRelative(13.823f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.823f)
                curveToRelative(0.0f, -1.084f, -0.49f, -2.089f, -1.343f, -2.757f)
                close()
                moveTo(21.0f, 20.987f)
                lineTo(3.0f, 20.987f)
                verticalLineToRelative(-10.823f)
                curveToRelative(0.0f, -0.155f, 0.07f, -0.299f, 0.192f, -0.394f)
                lineTo(11.692f, 3.119f)
                curveToRelative(0.182f, -0.143f, 0.435f, -0.143f, 0.616f, 0.0f)
                lineToRelative(8.5f, 6.651f)
                curveToRelative(0.122f, 0.095f, 0.192f, 0.238f, 0.192f, 0.394f)
                verticalLineToRelative(10.823f)
                close()
                moveTo(13.5f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(18.0f, 13.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -2.215f, 1.21f, -4.149f, 3.0f, -5.188f)
                verticalLineToRelative(5.188f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-5.188f)
                curveToRelative(1.79f, 1.039f, 3.0f, 2.973f, 3.0f, 5.188f)
                close()
            }
        }
        .build()
        return _smartHomeAlt!!
    }

private var _smartHomeAlt: ImageVector? = null
