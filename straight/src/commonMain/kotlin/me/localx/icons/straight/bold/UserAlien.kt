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

public val Icons.Bold.UserAlien: ImageVector
    get() {
        if (_userAlien != null) {
            return _userAlien!!
        }
        _userAlien = Builder(name = "UserAlien", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.844f, 14.228f)
                curveToRelative(1.203f, -1.91f, 2.156f, -4.095f, 2.156f, -6.228f)
                curveTo(20.0f, 3.589f, 16.411f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.0f, 3.589f, 4.0f, 8.0f)
                curveToRelative(0.0f, 2.133f, 0.953f, 4.318f, 2.156f, 6.228f)
                curveToRelative(-1.822f, 0.576f, -3.156f, 2.262f, -3.156f, 4.272f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.692f)
                curveToRelative(1.423f, 1.703f, 2.691f, 2.847f, 2.811f, 2.954f)
                lineToRelative(0.996f, 0.886f)
                lineToRelative(0.996f, -0.886f)
                curveToRelative(0.121f, -0.107f, 1.389f, -1.251f, 2.811f, -2.954f)
                horizontalLineToRelative(0.692f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.01f, -1.334f, -3.697f, -3.156f, -4.272f)
                close()
                moveTo(11.999f, 16.754f)
                curveToRelative(-1.967f, -2.008f, -4.999f, -5.745f, -4.999f, -8.754f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 2.999f, -3.034f, 6.742f, -5.001f, 8.754f)
                close()
                moveTo(15.392f, 9.393f)
                curveToRelative(-0.744f, 0.744f, -2.381f, 0.595f, -2.381f, 0.595f)
                curveToRelative(0.0f, 0.0f, -0.149f, -1.637f, 0.595f, -2.381f)
                curveToRelative(0.744f, -0.744f, 2.381f, -0.595f, 2.381f, -0.595f)
                curveToRelative(0.0f, 0.0f, 0.149f, 1.637f, -0.595f, 2.381f)
                close()
                moveTo(10.403f, 7.61f)
                curveToRelative(0.747f, 0.747f, 0.598f, 2.392f, 0.598f, 2.392f)
                curveToRelative(0.0f, 0.0f, -1.644f, 0.15f, -2.392f, -0.598f)
                curveToRelative(-0.747f, -0.747f, -0.598f, -2.392f, -0.598f, -2.392f)
                curveToRelative(0.0f, 0.0f, 1.644f, -0.149f, 2.392f, 0.598f)
                close()
            }
        }
        .build()
        return _userAlien!!
    }

private var _userAlien: ImageVector? = null
