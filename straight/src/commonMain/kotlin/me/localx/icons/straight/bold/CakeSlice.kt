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

public val Icons.Bold.CakeSlice: ImageVector
    get() {
        if (_cakeSlice != null) {
            return _cakeSlice!!
        }
        _cakeSlice = Builder(name = "CakeSlice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.511f, 9.633f)
                curveToRelative(-0.78f, -1.53f, -3.047f, -5.428f, -7.254f, -8.573f)
                curveTo(15.312f, 0.353f, 14.177f, 0.0f, 12.983f, 0.0f)
                curveToRelative(-1.073f, 0.012f, -2.115f, 0.335f, -3.012f, 0.933f)
                lineTo(0.0f, 10.879f)
                verticalLineToRelative(13.121f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-12.325f)
                curveToRelative(0.0f, -0.717f, -0.165f, -1.403f, -0.489f, -2.042f)
                close()
                moveTo(11.747f, 3.358f)
                curveToRelative(0.386f, -0.23f, 0.822f, -0.354f, 1.27f, -0.358f)
                curveToRelative(0.511f, -0.02f, 1.03f, 0.154f, 1.444f, 0.463f)
                curveToRelative(3.702f, 2.767f, 5.693f, 6.189f, 6.377f, 7.531f)
                curveToRelative(0.0f, 0.002f, 0.001f, 0.004f, 0.002f, 0.006f)
                lineTo(4.119f, 11.0f)
                lineToRelative(7.628f, -7.642f)
                close()
                moveTo(21.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                close()
            }
        }
        .build()
        return _cakeSlice!!
    }

private var _cakeSlice: ImageVector? = null
