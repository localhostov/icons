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

public val Icons.Bold.FileZipper: ImageVector
    get() {
        if (_fileZipper != null) {
            return _fileZipper!!
        }
        _fileZipper = Builder(name = "FileZipper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.448f, 16.482f)
                curveToRelative(0.227f, 0.757f, -0.34f, 1.519f, -1.13f, 1.519f)
                horizontalLineToRelative(-1.829f)
                curveToRelative(-0.79f, 0.0f, -1.357f, -0.762f, -1.13f, -1.519f)
                lineToRelative(0.757f, -2.524f)
                curveToRelative(0.171f, -0.568f, 0.694f, -0.958f, 1.287f, -0.958f)
                reflectiveCurveToRelative(1.117f, 0.389f, 1.287f, 0.958f)
                lineToRelative(0.757f, 2.524f)
                close()
                moveTo(21.903f, 8.158f)
                verticalLineToRelative(10.343f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(7.404f, 24.001f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(1.904f, 5.5f)
                curveTo(1.904f, 2.467f, 4.371f, 0.0f, 7.404f, 0.0f)
                horizontalLineToRelative(6.344f)
                curveToRelative(1.47f, 0.0f, 2.851f, 0.572f, 3.889f, 1.611f)
                lineToRelative(2.657f, 2.657f)
                curveToRelative(1.038f, 1.038f, 1.61f, 2.419f, 1.61f, 3.889f)
                close()
                moveTo(18.903f, 18.501f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                lineTo(12.903f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                close()
                moveTo(9.403f, 11.001f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _fileZipper!!
    }

private var _fileZipper: ImageVector? = null
