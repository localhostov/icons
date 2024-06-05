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

public val Icons.Outline.FolderUpload: ImageVector
    get() {
        if (_folderUpload != null) {
            return _folderUpload!!
        }
        _folderUpload = Builder(name = "FolderUpload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-6.528f)
                curveToRelative(-0.154f, 0.0f, -0.31f, -0.036f, -0.447f, -0.105f)
                lineToRelative(-3.153f, -1.576f)
                curveToRelative(-0.415f, -0.208f, -0.879f, -0.318f, -1.344f, -0.318f)
                horizontalLineToRelative(-2.528f)
                curveTo(2.243f, 1.0f, 0.0f, 3.243f, 0.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(2.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.528f)
                curveToRelative(0.154f, 0.0f, 0.308f, 0.036f, 0.447f, 0.106f)
                lineToRelative(3.156f, 1.577f)
                curveToRelative(0.415f, 0.207f, 0.878f, 0.316f, 1.341f, 0.316f)
                horizontalLineToRelative(6.528f)
                curveToRelative(1.302f, 0.0f, 2.402f, 0.839f, 2.816f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(14.293f, 15.896f)
                lineToRelative(-1.293f, -1.293f)
                verticalLineToRelative(7.397f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-7.397f)
                lineToRelative(-1.293f, 1.293f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.613f, -1.613f)
                curveToRelative(1.118f, -1.119f, 3.069f, -1.119f, 4.188f, 0.0f)
                lineToRelative(1.613f, 1.613f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                reflectiveCurveToRelative(-1.023f, 0.391f, -1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _folderUpload!!
    }

private var _folderUpload: ImageVector? = null
