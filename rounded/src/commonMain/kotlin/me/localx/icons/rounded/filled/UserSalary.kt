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

public val Icons.Filled.UserSalary: ImageVector
    get() {
        if (_userSalary != null) {
            return _userSalary!!
        }
        _userSalary = Builder(name = "UserSalary", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 6.0f)
                curveTo(5.0f, 2.691f, 7.691f, 0.0f, 11.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(21.685f, 16.267f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-0.373f, -0.062f, -0.644f, -0.382f, -0.644f, -0.76f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 0.999f, -1.0f)
                lineToRelative(2.271f, 0.003f)
                curveToRelative(0.36f, 0.0f, 0.684f, 0.187f, 0.866f, 0.5f)
                curveToRelative(0.276f, 0.477f, 0.89f, 0.64f, 1.367f, 0.362f)
                curveToRelative(0.478f, -0.277f, 0.64f, -0.89f, 0.361f, -1.367f)
                curveToRelative(-0.536f, -0.922f, -1.53f, -1.495f, -2.594f, -1.495f)
                horizontalLineToRelative(-0.271f)
                verticalLineToRelative(-1.003f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.36f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(0.373f, 0.062f, 0.644f, 0.382f, 0.644f, 0.76f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -0.999f, 1.0f)
                lineToRelative(-2.27f, -0.002f)
                curveToRelative(-0.356f, 0.0f, -0.688f, -0.191f, -0.866f, -0.499f)
                curveToRelative(-0.276f, -0.478f, -0.889f, -0.64f, -1.366f, -0.364f)
                curveToRelative(-0.479f, 0.277f, -0.642f, 0.889f, -0.364f, 1.367f)
                curveToRelative(0.535f, 0.923f, 1.529f, 1.496f, 2.596f, 1.496f)
                horizontalLineToRelative(0.27f)
                verticalLineToRelative(1.002f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.36f, -0.974f, -2.51f, -2.315f, -2.733f)
                close()
                moveTo(14.405f, 21.505f)
                curveToRelative(-0.402f, -0.693f, -0.51f, -1.502f, -0.304f, -2.277f)
                curveToRelative(0.145f, -0.541f, 0.43f, -1.02f, 0.824f, -1.396f)
                curveToRelative(-0.585f, -0.795f, -0.925f, -1.776f, -0.925f, -2.832f)
                curveToRelative(0.0f, -0.157f, 0.032f, -0.305f, 0.046f, -0.458f)
                curveToRelative(-0.953f, -0.344f, -1.976f, -0.542f, -3.046f, -0.542f)
                curveToRelative(-4.963f, 0.0f, -9.0f, 4.038f, -9.0f, 9.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.184f)
                curveToRelative(-0.034f, -0.095f, -0.066f, -0.191f, -0.09f, -0.291f)
                curveToRelative(-1.114f, -0.389f, -2.082f, -1.156f, -2.69f, -2.205f)
                close()
            }
        }
        .build()
        return _userSalary!!
    }

private var _userSalary: ImageVector? = null
