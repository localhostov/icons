package me.localx.icons.rounded.outline

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

public val Icons.Outline.FolderTimes: ImageVector
    get() {
        if (_folderTimes != null) {
            return _folderTimes!!
        }
        _folderTimes = Builder(name = "FolderTimes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.987f, 1.975f)
                horizontalLineToRelative(-6.528f)
                curveToRelative(-0.154f, 0.0f, -0.31f, -0.037f, -0.447f, -0.105f)
                lineTo(8.856f, 0.291f)
                curveToRelative(-0.414f, -0.207f, -0.878f, -0.316f, -1.342f, -0.316f)
                horizontalLineToRelative(-2.527f)
                curveTo(2.23f, -0.025f, -0.013f, 2.218f, -0.013f, 4.975f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.779f, 0.958f, 3.438f, 2.499f, 4.33f)
                curveToRelative(0.479f, 0.278f, 1.09f, 0.113f, 1.366f, -0.364f)
                curveToRelative(0.277f, -0.479f, 0.113f, -1.09f, -0.364f, -1.366f)
                curveToRelative(-0.926f, -0.536f, -1.501f, -1.532f, -1.501f, -2.6f)
                lineTo(1.987f, 7.975f)
                lineTo(21.987f, 7.975f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.067f, -0.575f, 2.063f, -1.501f, 2.6f)
                curveToRelative(-0.478f, 0.276f, -0.642f, 0.888f, -0.364f, 1.366f)
                curveToRelative(0.185f, 0.32f, 0.521f, 0.499f, 0.866f, 0.499f)
                curveToRelative(0.17f, 0.0f, 0.342f, -0.043f, 0.5f, -0.135f)
                curveToRelative(1.541f, -0.892f, 2.499f, -2.551f, 2.499f, -4.33f)
                lineTo(23.987f, 6.975f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(1.987f, 4.975f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.527f)
                curveToRelative(0.154f, 0.0f, 0.31f, 0.036f, 0.447f, 0.105f)
                lineToRelative(3.156f, 1.579f)
                curveToRelative(0.415f, 0.206f, 0.879f, 0.315f, 1.341f, 0.315f)
                horizontalLineToRelative(6.528f)
                curveToRelative(1.302f, 0.0f, 2.402f, 0.839f, 2.816f, 2.0f)
                lineTo(1.987f, 5.974f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.978f, 9.975f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(11.978f, 21.975f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(13.685f, 17.268f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.0f, -1.0f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.441f, -0.293f, -0.707f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.586f)
                lineToRelative(0.707f, 0.707f)
                close()
            }
        }
        .build()
        return _folderTimes!!
    }

private var _folderTimes: ImageVector? = null
