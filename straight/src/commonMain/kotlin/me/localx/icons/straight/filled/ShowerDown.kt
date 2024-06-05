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

public val Icons.Filled.ShowerDown: ImageVector
    get() {
        if (_showerDown != null) {
            return _showerDown!!
        }
        _showerDown = Builder(name = "ShowerDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.414f, 20.586f)
                curveToRelative(0.781f, 0.781f, 0.781f, 2.047f, 0.0f, 2.828f)
                curveToRelative(-0.391f, 0.391f, -0.902f, 0.586f, -1.414f, 0.586f)
                curveToRelative(-0.512f, 0.0f, -1.024f, -0.195f, -1.414f, -0.586f)
                curveToRelative(-0.781f, -0.781f, -0.781f, -2.047f, 0.0f, -2.828f)
                lineToRelative(1.414f, -1.586f)
                lineToRelative(1.414f, 1.586f)
                close()
                moveTo(10.414f, 14.586f)
                lineToRelative(-1.414f, -1.586f)
                lineToRelative(-1.414f, 1.586f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.047f, 0.0f, 2.828f)
                curveToRelative(0.391f, 0.391f, 0.902f, 0.586f, 1.414f, 0.586f)
                curveToRelative(0.512f, 0.0f, 1.024f, -0.195f, 1.414f, -0.586f)
                curveToRelative(0.781f, -0.781f, 0.781f, -2.047f, 0.0f, -2.828f)
                close()
                moveTo(5.985f, 19.0f)
                lineToRelative(-1.414f, 1.586f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.047f, 0.0f, 2.828f)
                curveToRelative(0.391f, 0.391f, 0.902f, 0.586f, 1.414f, 0.586f)
                curveToRelative(0.512f, 0.0f, 1.024f, -0.195f, 1.414f, -0.586f)
                curveToRelative(0.781f, -0.781f, 0.781f, -2.047f, 0.0f, -2.828f)
                lineToRelative(-1.414f, -1.586f)
                close()
                moveTo(16.429f, 14.586f)
                lineToRelative(-1.414f, -1.586f)
                lineToRelative(-1.414f, 1.586f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.047f, 0.0f, 2.828f)
                curveToRelative(0.391f, 0.391f, 0.902f, 0.586f, 1.414f, 0.586f)
                curveToRelative(0.512f, 0.0f, 1.024f, -0.195f, 1.414f, -0.586f)
                curveToRelative(0.781f, -0.781f, 0.781f, -2.047f, 0.0f, -2.828f)
                close()
                moveTo(13.0f, 2.048f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.048f)
                curveTo(5.01f, 2.621f, 0.202f, 8.395f, 0.0f, 8.642f)
                verticalLineToRelative(3.358f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.358f)
                curveToRelative(-0.202f, -0.247f, -5.01f, -6.022f, -11.0f, -6.594f)
                close()
                moveTo(17.985f, 19.0f)
                lineToRelative(-1.414f, 1.586f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.047f, 0.0f, 2.828f)
                curveToRelative(0.391f, 0.391f, 0.902f, 0.586f, 1.414f, 0.586f)
                curveToRelative(0.512f, 0.0f, 1.024f, -0.195f, 1.414f, -0.586f)
                curveToRelative(0.781f, -0.781f, 0.781f, -2.047f, 0.0f, -2.828f)
                lineToRelative(-1.414f, -1.586f)
                close()
            }
        }
        .build()
        return _showerDown!!
    }

private var _showerDown: ImageVector? = null
