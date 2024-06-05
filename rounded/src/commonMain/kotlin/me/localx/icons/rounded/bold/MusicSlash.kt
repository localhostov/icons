package me.localx.icons.rounded.bold

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

public val Icons.Bold.MusicSlash: ImageVector
    get() {
        if (_musicSlash != null) {
            return _musicSlash!!
        }
        _musicSlash = Builder(name = "MusicSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.5f, 12.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(5.5f, 20.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(24.0f, 6.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.833f, 0.0f, -5.173f, 2.154f, -5.468f, 4.911f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                curveTo(-0.146f, 1.025f, -0.146f, 1.975f, 0.439f, 2.561f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(-0.65f, -0.65f)
                curveToRelative(0.703f, -0.939f, 1.09f, -2.085f, 1.09f, -3.289f)
                lineTo(24.001f, 6.5f)
                close()
                moveTo(11.0f, 6.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(6.102f)
                curveToRelative(-0.751f, -0.385f, -1.6f, -0.602f, -2.5f, -0.602f)
                curveToRelative(-1.205f, 0.0f, -2.35f, 0.387f, -3.289f, 1.09f)
                lineToRelative(-4.211f, -4.211f)
                verticalLineToRelative(-2.379f)
                close()
                moveTo(17.384f, 15.263f)
                curveToRelative(0.342f, -0.171f, 0.722f, -0.263f, 1.116f, -0.263f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.394f, -0.092f, 0.775f, -0.263f, 1.116f)
                lineToRelative(-3.354f, -3.354f)
                close()
            }
        }
        .build()
        return _musicSlash!!
    }

private var _musicSlash: ImageVector? = null
