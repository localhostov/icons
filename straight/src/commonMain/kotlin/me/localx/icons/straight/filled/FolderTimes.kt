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
                moveTo(0.0f, 9.0f)
                verticalLineToRelative(14.0f)
                lineTo(24.0f, 23.0f)
                lineTo(24.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.239f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.239f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.239f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveTo(0.0f, 2.343f, 1.343f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(5.236f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(8.764f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(12.793f, 18.207f)
                lineToRelative(-1.793f, -1.793f)
                verticalLineToRelative(-3.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.207f, 1.207f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _folderTimes!!
    }

private var _folderTimes: ImageVector? = null
