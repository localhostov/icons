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

public val Icons.Filled.UserCoach: ImageVector
    get() {
        if (_userCoach != null) {
            return _userCoach!!
        }
        _userCoach = Builder(name = "UserCoach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.5f)
                verticalLineToRelative(5.5f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.103f, 1.456f, -3.86f, 3.409f, -4.351f)
                lineToRelative(3.053f, 4.851f)
                lineToRelative(2.5f, -3.0f)
                lineToRelative(2.5f, 3.0f)
                lineToRelative(3.122f, -4.853f)
                curveToRelative(1.957f, 0.488f, 3.416f, 2.247f, 3.416f, 4.353f)
                close()
                moveTo(6.084f, 5.0f)
                curveToRelative(0.477f, -2.834f, 2.948f, -5.0f, 5.916f, -5.0f)
                curveToRelative(2.216f, 0.0f, 4.155f, 1.208f, 5.194f, 3.0f)
                horizontalLineToRelative(2.806f)
                verticalLineToRelative(2.0f)
                lineTo(6.084f, 5.0f)
                close()
                moveTo(6.084f, 7.0f)
                horizontalLineToRelative(11.832f)
                curveToRelative(-0.477f, 2.834f, -2.948f, 5.0f, -5.916f, 5.0f)
                reflectiveCurveToRelative(-5.439f, -2.166f, -5.916f, -5.0f)
                close()
            }
        }
        .build()
        return _userCoach!!
    }

private var _userCoach: ImageVector? = null
