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

public val Icons.Filled.UserRobotXmarks: ImageVector
    get() {
        if (_userRobotXmarks != null) {
            return _userRobotXmarks!!
        }
        _userRobotXmarks = Builder(name = "UserRobotXmarks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.601f, 11.014f)
                lineToRelative(-1.101f, -1.101f)
                lineToRelative(-1.082f, 1.081f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.081f, -1.081f)
                lineToRelative(-1.081f, -1.081f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.082f, 1.081f)
                lineToRelative(1.086f, -1.086f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.086f, 1.086f)
                lineToRelative(1.101f, 1.1f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(9.601f, 11.014f)
                lineToRelative(-1.101f, -1.101f)
                lineToRelative(-1.082f, 1.081f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.081f, -1.081f)
                lineToRelative(-1.081f, -1.081f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.082f, 1.081f)
                lineToRelative(1.086f, -1.086f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.086f, 1.086f)
                lineToRelative(1.101f, 1.1f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(21.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _userRobotXmarks!!
    }

private var _userRobotXmarks: ImageVector? = null
