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

public val Icons.Bold.FolderTimes: ImageVector
    get() {
        if (_folderTimes != null) {
            return _folderTimes!!
        }
        _folderTimes = Builder(name = "FolderTimes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.5f)
                lineTo(24.0f, 23.0f)
                horizontalLineToRelative(-6.721f)
                curveToRelative(0.926f, -0.815f, 1.663f, -1.838f, 2.134f, -3.0f)
                horizontalLineToRelative(1.587f)
                lineTo(21.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(1.587f)
                curveToRelative(0.471f, 1.162f, 1.208f, 2.185f, 2.134f, 3.0f)
                lineTo(0.0f, 23.0f)
                lineTo(0.0f, 4.5f)
                curveTo(0.0f, 2.57f, 1.57f, 1.0f, 3.5f, 1.0f)
                horizontalLineToRelative(4.854f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(8.146f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(18.0f, 17.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(15.061f, 17.939f)
                lineToRelative(-1.561f, -1.561f)
                verticalLineToRelative(-2.379f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.621f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _folderTimes!!
    }

private var _folderTimes: ImageVector? = null
