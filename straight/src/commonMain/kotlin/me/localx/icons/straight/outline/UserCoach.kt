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

public val Icons.Outline.UserCoach: ImageVector
    get() {
        if (_userCoach != null) {
            return _userCoach!!
        }
        _userCoach = Builder(name = "UserCoach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.35f)
                curveToRelative(-0.826f, -2.327f, -3.043f, -4.0f, -5.65f, -4.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.474f, 0.0f, 2.75f, 0.81f, 3.444f, 2.0f)
                horizontalLineToRelative(-6.887f)
                curveToRelative(0.694f, -1.19f, 1.97f, -2.0f, 3.444f, -2.0f)
                close()
                moveTo(21.0f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.215f, -0.873f, -2.229f, -2.024f, -2.452f)
                lineToRelative(-2.515f, 3.952f)
                lineToRelative(-2.5f, -3.0f)
                lineToRelative(-2.5f, 3.0f)
                lineToRelative(-2.505f, -3.937f)
                curveToRelative(-1.117f, 0.249f, -1.956f, 1.245f, -1.956f, 2.437f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _userCoach!!
    }

private var _userCoach: ImageVector? = null
