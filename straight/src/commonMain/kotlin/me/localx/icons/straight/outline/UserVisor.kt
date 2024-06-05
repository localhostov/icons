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

public val Icons.Outline.UserVisor: ImageVector
    get() {
        if (_userVisor != null) {
            return _userVisor!!
        }
        _userVisor = Builder(name = "UserVisor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 16.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(14.957f, 19.0f)
                curveToRelative(-0.629f, 0.623f, -1.143f, 1.415f, -1.471f, 2.386f)
                curveToRelative(-0.229f, 0.719f, -0.414f, 1.583f, -0.486f, 2.614f)
                curveToRelative(0.0f, 0.024f, 1.5f, -1.5f, 2.286f, -1.5f)
                curveToRelative(0.593f, 0.0f, 1.367f, 0.587f, 1.714f, 1.0f)
                curveToRelative(-0.1f, -0.863f, -0.257f, -1.515f, -0.586f, -2.294f)
                curveToRelative(-0.329f, -0.803f, -0.836f, -1.591f, -1.457f, -2.206f)
                close()
                moveTo(5.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.35f)
                curveToRelative(0.826f, -2.327f, 3.043f, -4.0f, 5.65f, -4.0f)
                reflectiveCurveToRelative(4.824f, 1.673f, 5.65f, 4.0f)
                horizontalLineToRelative(0.35f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.35f)
                curveToRelative(-0.826f, 2.327f, -3.043f, 4.0f, -5.65f, 4.0f)
                reflectiveCurveToRelative(-4.824f, -1.673f, -5.65f, -4.0f)
                horizontalLineToRelative(-0.35f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(15.444f, 8.0f)
                horizontalLineToRelative(-6.888f)
                curveToRelative(0.694f, 1.19f, 1.97f, 2.0f, 3.444f, 2.0f)
                reflectiveCurveToRelative(2.75f, -0.81f, 3.444f, -2.0f)
                close()
                moveTo(8.556f, 4.0f)
                horizontalLineToRelative(6.888f)
                curveToRelative(-0.694f, -1.19f, -1.97f, -2.0f, -3.444f, -2.0f)
                reflectiveCurveToRelative(-2.75f, 0.81f, -3.444f, 2.0f)
                close()
            }
        }
        .build()
        return _userVisor!!
    }

private var _userVisor: ImageVector? = null
