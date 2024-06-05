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

public val Icons.Filled.UserAlien: ImageVector
    get() {
        if (_userAlien != null) {
            return _userAlien!!
        }
        _userAlien = Builder(name = "UserAlien", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.038f, 0.0f)
                curveTo(7.627f, 0.0f, 4.038f, 3.526f, 4.038f, 7.861f)
                curveToRelative(0.0f, 4.093f, 3.606f, 8.17f, 5.756f, 10.236f)
                curveToRelative(0.63f, 0.605f, 1.437f, 0.907f, 2.244f, 0.907f)
                reflectiveCurveToRelative(1.615f, -0.302f, 2.244f, -0.907f)
                curveToRelative(2.149f, -2.066f, 5.756f, -6.144f, 5.756f, -10.236f)
                curveToRelative(0.0f, -4.335f, -3.589f, -7.861f, -8.0f, -7.861f)
                close()
                moveTo(10.28f, 9.999f)
                curveToRelative(-0.637f, -0.032f, -1.548f, -0.176f, -2.076f, -0.704f)
                curveToRelative(-0.528f, -0.528f, -0.672f, -1.44f, -0.704f, -2.076f)
                curveToRelative(-0.02f, -0.406f, 0.313f, -0.739f, 0.718f, -0.718f)
                curveToRelative(0.637f, 0.032f, 1.548f, 0.176f, 2.076f, 0.704f)
                curveToRelative(0.528f, 0.528f, 0.672f, 1.44f, 0.704f, 2.076f)
                curveToRelative(0.02f, 0.406f, -0.313f, 0.739f, -0.718f, 0.718f)
                close()
                moveTo(15.795f, 9.295f)
                curveToRelative(-0.528f, 0.528f, -1.44f, 0.672f, -2.076f, 0.704f)
                curveToRelative(-0.406f, 0.02f, -0.739f, -0.313f, -0.718f, -0.718f)
                curveToRelative(0.032f, -0.637f, 0.176f, -1.548f, 0.704f, -2.076f)
                curveToRelative(0.528f, -0.528f, 1.44f, -0.672f, 2.076f, -0.704f)
                curveToRelative(0.406f, -0.02f, 0.739f, 0.313f, 0.718f, 0.718f)
                curveToRelative(-0.032f, 0.637f, -0.176f, 1.548f, -0.704f, 2.076f)
                close()
                moveTo(20.999f, 21.999f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 23.999f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.185f, 0.909f, -4.241f, 2.418f, -5.722f)
                curveToRelative(0.946f, 1.225f, 1.98f, 2.327f, 2.952f, 3.261f)
                curveToRelative(0.982f, 0.945f, 2.272f, 1.466f, 3.63f, 1.466f)
                reflectiveCurveToRelative(2.649f, -0.521f, 3.63f, -1.466f)
                curveToRelative(0.972f, -0.934f, 2.006f, -2.036f, 2.952f, -3.261f)
                curveToRelative(1.509f, 1.481f, 2.418f, 3.537f, 2.418f, 5.722f)
                close()
            }
        }
        .build()
        return _userAlien!!
    }

private var _userAlien: ImageVector? = null
