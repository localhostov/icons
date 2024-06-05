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

public val Icons.Bold.UsersSlash: ImageVector
    get() {
        if (_usersSlash != null) {
            return _usersSlash!!
        }
        _usersSlash = Builder(name = "UsersSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.41f, 13.289f)
                lineToRelative(8.551f, 8.551f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.04f, 2.161f)
                lineTo(2.161f, 0.04f)
                lineToRelative(1.182f, 1.182f)
                curveToRelative(0.642f, -0.748f, 1.594f, -1.222f, 2.657f, -1.222f)
                curveToRelative(1.933f, 0.0f, 3.5f, 1.567f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.063f, -0.474f, 2.015f, -1.222f, 2.657f)
                lineToRelative(2.933f, 2.933f)
                curveToRelative(1.136f, -0.262f, 2.378f, 0.049f, 3.263f, 0.935f)
                reflectiveCurveToRelative(1.196f, 2.127f, 0.935f, 3.263f)
                close()
                moveTo(18.0f, 7.0f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(20.5f, 8.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.104f, 0.0f, -0.201f, 0.022f, -0.303f, 0.031f)
                curveToRelative(0.999f, 0.716f, 1.747f, 1.756f, 2.09f, 2.969f)
                horizontalLineToRelative(3.212f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.5f, 17.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.05f)
                lineToRelative(-5.95f, -5.95f)
                horizontalLineToRelative(-2.55f)
                close()
                moveTo(3.092f, 8.041f)
                curveToRelative(-1.736f, 0.205f, -3.092f, 1.669f, -3.092f, 3.459f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.55f)
                lineToRelative(-2.959f, -2.959f)
                close()
            }
        }
        .build()
        return _usersSlash!!
    }

private var _usersSlash: ImageVector? = null
