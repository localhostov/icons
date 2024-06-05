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

public val Icons.Filled.LightbulbOn: ImageVector
    get() {
        if (_lightbulbOn != null) {
            return _lightbulbOn!!
        }
        _lightbulbOn = Builder(name = "LightbulbOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.989f, 4.341f)
                lineToRelative(-1.709f, -1.041f)
                lineTo(18.266f, 0.04f)
                lineToRelative(1.709f, 1.041f)
                lineToRelative(-1.985f, 3.26f)
                close()
                moveTo(23.972f, 6.369f)
                lineToRelative(-0.822f, -1.822f)
                lineToRelative(-3.331f, 1.504f)
                lineToRelative(0.822f, 1.822f)
                lineToRelative(3.331f, -1.504f)
                close()
                moveTo(7.725f, 3.3f)
                lineTo(5.739f, 0.04f)
                lineToRelative(-1.709f, 1.041f)
                lineToRelative(1.985f, 3.26f)
                lineToRelative(1.709f, -1.041f)
                close()
                moveTo(4.185f, 6.051f)
                lineToRelative(-3.33f, -1.504f)
                lineTo(0.032f, 6.369f)
                lineToRelative(3.33f, 1.504f)
                lineToRelative(0.822f, -1.822f)
                close()
                moveTo(8.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.937f)
                curveToRelative(0.0f, -0.022f, 0.006f, -0.042f, 0.006f, -0.063f)
                horizontalLineToRelative(-8.006f)
                close()
                moveTo(6.756f, 18.032f)
                curveToRelative(0.308f, 0.268f, 0.548f, 0.604f, 0.747f, 0.968f)
                horizontalLineToRelative(3.497f)
                verticalLineToRelative(-5.184f)
                curveToRelative(-1.161f, -0.414f, -2.0f, -1.514f, -2.0f, -2.816f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.302f, -0.839f, 2.402f, -2.0f, 2.816f)
                verticalLineToRelative(5.184f)
                horizontalLineToRelative(3.522f)
                curveToRelative(0.204f, -0.377f, 0.447f, -0.725f, 0.76f, -1.001f)
                curveToRelative(1.728f, -1.518f, 2.718f, -3.704f, 2.718f, -5.999f)
                curveToRelative(0.0f, -2.161f, -0.849f, -4.187f, -2.39f, -5.703f)
                reflectiveCurveToRelative(-3.596f, -2.338f, -5.746f, -2.296f)
                curveToRelative(-4.184f, 0.069f, -7.709f, 3.526f, -7.858f, 7.705f)
                curveToRelative(-0.088f, 2.428f, 0.914f, 4.733f, 2.75f, 6.326f)
                close()
            }
        }
        .build()
        return _lightbulbOn!!
    }

private var _lightbulbOn: ImageVector? = null
