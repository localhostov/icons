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

public val Icons.Filled.FolderTimes: ImageVector
    get() {
        if (_folderTimes != null) {
            return _folderTimes!!
        }
        _folderTimes = Builder(name = "FolderTimes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 3.243f, 2.243f, 1.0f, 5.0f, 1.0f)
                horizontalLineToRelative(2.528f)
                curveToRelative(0.463f, 0.0f, 0.927f, 0.109f, 1.341f, 0.316f)
                lineToRelative(3.156f, 1.578f)
                curveToRelative(0.138f, 0.069f, 0.292f, 0.105f, 0.446f, 0.105f)
                horizontalLineToRelative(6.528f)
                curveToRelative(2.414f, 0.0f, 4.434f, 1.721f, 4.899f, 4.0f)
                lineTo(0.0f, 6.999f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(17.0f, 16.0f)
                curveToRelative(-0.167f, -6.594f, -9.834f, -6.593f, -10.0f, 0.0f)
                curveToRelative(0.167f, 6.594f, 9.834f, 6.593f, 10.0f, 0.0f)
                close()
                moveTo(13.707f, 17.707f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-0.707f, -0.707f)
                verticalLineToRelative(-1.586f)
                curveToRelative(-0.005f, -1.308f, -1.995f, -1.307f, -2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.266f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                close()
            }
        }
        .build()
        return _folderTimes!!
    }

private var _folderTimes: ImageVector? = null
