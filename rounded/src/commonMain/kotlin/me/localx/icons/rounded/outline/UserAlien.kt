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

public val Icons.Outline.UserAlien: ImageVector
    get() {
        if (_userAlien != null) {
            return _userAlien!!
        }
        _userAlien = Builder(name = "UserAlien", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.985f, 15.062f)
                curveToRelative(1.592f, -2.064f, 3.015f, -4.63f, 3.015f, -7.201f)
                curveToRelative(0.0f, -4.335f, -3.589f, -7.861f, -8.0f, -7.861f)
                reflectiveCurveTo(4.0f, 3.526f, 4.0f, 7.861f)
                curveToRelative(0.0f, 2.572f, 1.424f, 5.137f, 3.015f, 7.201f)
                curveToRelative(-2.443f, 1.411f, -4.015f, 4.064f, -4.015f, 6.938f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.277f, 1.316f, -4.369f, 3.327f, -5.373f)
                curveToRelative(0.508f, 0.56f, 0.997f, 1.056f, 1.429f, 1.47f)
                curveToRelative(0.63f, 0.605f, 1.437f, 0.907f, 2.244f, 0.907f)
                reflectiveCurveToRelative(1.615f, -0.302f, 2.244f, -0.907f)
                curveToRelative(0.431f, -0.414f, 0.921f, -0.91f, 1.429f, -1.47f)
                curveToRelative(2.012f, 1.004f, 3.327f, 3.095f, 3.327f, 5.373f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.874f, -1.572f, -5.526f, -4.015f, -6.938f)
                close()
                moveTo(12.858f, 16.656f)
                curveToRelative(-0.48f, 0.463f, -1.234f, 0.463f, -1.715f, 0.0f)
                curveToRelative(-1.921f, -1.846f, -5.143f, -5.443f, -5.143f, -8.795f)
                curveToRelative(0.0f, -3.232f, 2.691f, -5.861f, 6.0f, -5.861f)
                reflectiveCurveToRelative(6.0f, 2.629f, 6.0f, 5.861f)
                curveToRelative(0.0f, 3.352f, -3.222f, 6.949f, -5.143f, 8.795f)
                close()
                moveTo(16.5f, 7.219f)
                curveToRelative(-0.032f, 0.637f, -0.176f, 1.548f, -0.704f, 2.076f)
                curveToRelative(-0.528f, 0.528f, -1.44f, 0.672f, -2.076f, 0.704f)
                curveToRelative(-0.406f, 0.02f, -0.739f, -0.313f, -0.718f, -0.718f)
                curveToRelative(0.032f, -0.637f, 0.176f, -1.548f, 0.704f, -2.076f)
                curveToRelative(0.528f, -0.528f, 1.44f, -0.672f, 2.076f, -0.704f)
                curveToRelative(0.406f, -0.02f, 0.739f, 0.313f, 0.718f, 0.718f)
                close()
                moveTo(10.296f, 7.204f)
                curveToRelative(0.528f, 0.528f, 0.672f, 1.44f, 0.704f, 2.076f)
                curveToRelative(0.02f, 0.406f, -0.313f, 0.739f, -0.718f, 0.718f)
                curveToRelative(-0.637f, -0.032f, -1.548f, -0.176f, -2.076f, -0.704f)
                curveToRelative(-0.528f, -0.528f, -0.672f, -1.44f, -0.704f, -2.076f)
                curveToRelative(-0.02f, -0.406f, 0.313f, -0.739f, 0.718f, -0.718f)
                curveToRelative(0.637f, 0.032f, 1.548f, 0.176f, 2.076f, 0.704f)
                close()
            }
        }
        .build()
        return _userAlien!!
    }

private var _userAlien: ImageVector? = null
