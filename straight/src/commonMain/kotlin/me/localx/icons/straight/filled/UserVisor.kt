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

public val Icons.Filled.UserVisor: ImageVector
    get() {
        if (_userVisor != null) {
            return _userVisor!!
        }
        _userVisor = Builder(name = "UserVisor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 14.0f)
                lineTo(7.5f, 14.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(16.329f, 21.5f)
                curveToRelative(-0.786f, 0.0f, -2.286f, 1.524f, -2.286f, 1.5f)
                curveToRelative(0.071f, -1.031f, 0.257f, -1.894f, 0.486f, -2.614f)
                curveToRelative(0.329f, -0.971f, 0.843f, -1.762f, 1.471f, -2.386f)
                curveToRelative(0.622f, 0.615f, 1.129f, 1.403f, 1.457f, 2.206f)
                curveToRelative(0.329f, 0.779f, 0.486f, 1.431f, 0.586f, 2.294f)
                curveToRelative(-0.347f, -0.413f, -1.121f, -1.0f, -1.714f, -1.0f)
                close()
                moveTo(18.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(7.54f, 2.0f)
                curveToRelative(1.099f, -1.224f, 2.688f, -2.0f, 4.46f, -2.0f)
                reflectiveCurveToRelative(3.36f, 0.776f, 4.46f, 2.0f)
                lineTo(7.54f, 2.0f)
                close()
                moveTo(16.459f, 10.0f)
                curveToRelative(-1.099f, 1.224f, -2.688f, 2.0f, -4.46f, 2.0f)
                reflectiveCurveToRelative(-3.36f, -0.776f, -4.46f, -2.0f)
                horizontalLineToRelative(8.919f)
                close()
            }
        }
        .build()
        return _userVisor!!
    }

private var _userVisor: ImageVector? = null
