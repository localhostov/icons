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
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.35f)
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
                moveTo(21.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.248f, -1.069f, -4.246f, -2.721f, -5.527f)
                lineToRelative(-1.147f, 2.105f)
                curveToRelative(-0.332f, 0.521f, -1.074f, 0.569f, -1.47f, 0.094f)
                lineToRelative(-1.701f, -2.041f)
                lineToRelative(-1.701f, 2.041f)
                curveToRelative(-0.395f, 0.474f, -1.138f, 0.427f, -1.47f, -0.094f)
                lineToRelative(-1.125f, -2.064f)
                curveToRelative(-1.621f, 1.283f, -2.666f, 3.263f, -2.666f, 5.487f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -4.962f, 4.038f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _userCoach!!
    }

private var _userCoach: ImageVector? = null
