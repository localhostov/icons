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

public val Icons.Bold.Bowling: ImageVector
    get() {
        if (_bowling != null) {
            return _bowling!!
        }
        _bowling = Builder(name = "Bowling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 15.5f)
                close()
                moveTo(17.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 18.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 15.5f)
                close()
                moveTo(18.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 16.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 12.5f)
                close()
                moveTo(24.0f, 15.5f)
                arcToRelative(8.487f, 8.487f, 0.0f, false, true, -13.479f, 6.877f)
                arcToRelative(9.522f, 9.522f, 0.0f, false, true, -0.6f, 1.0f)
                lineTo(9.469f, 24.0f)
                lineTo(2.531f, 24.0f)
                lineToRelative(-0.448f, -0.624f)
                arcTo(12.344f, 12.344f, 0.0f, false, true, 0.0f, 16.773f)
                arcTo(10.433f, 10.433f, 0.0f, false, true, 1.825f, 11.42f)
                arcTo(6.542f, 6.542f, 0.0f, false, false, 3.0f, 8.5f)
                arcToRelative(19.136f, 19.136f, 0.0f, false, false, -0.548f, -2.381f)
                arcTo(9.61f, 9.61f, 0.0f, false, true, 2.0f, 4.0f)
                arcTo(3.827f, 3.827f, 0.0f, false, true, 6.0f, 0.0f)
                arcToRelative(3.827f, 3.827f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(9.61f, 9.61f, 0.0f, false, true, -0.452f, 2.119f)
                arcTo(19.105f, 19.105f, 0.0f, false, false, 9.0f, 8.5f)
                arcToRelative(3.258f, 3.258f, 0.0f, false, false, 0.285f, 1.2f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 24.0f, 15.5f)
                close()
                moveTo(5.0f, 4.0f)
                curveToRelative(0.02f, 0.117f, 0.21f, 0.824f, 0.349f, 1.339f)
                arcTo(22.384f, 22.384f, 0.0f, false, true, 5.96f, 8.0f)
                horizontalLineToRelative(0.08f)
                arcToRelative(22.384f, 22.384f, 0.0f, false, true, 0.611f, -2.661f)
                curveTo(6.79f, 4.824f, 6.98f, 4.117f, 7.0f, 3.922f)
                curveTo(7.0f, 3.29f, 6.71f, 3.0f, 6.0f, 3.0f)
                reflectiveCurveTo(5.0f, 3.29f, 5.0f, 4.0f)
                close()
                moveTo(7.856f, 21.0f)
                arcTo(9.184f, 9.184f, 0.0f, false, false, 9.0f, 16.773f)
                arcToRelative(7.864f, 7.864f, 0.0f, false, false, -1.423f, -3.854f)
                arcTo(18.806f, 18.806f, 0.0f, false, true, 6.57f, 11.0f)
                lineTo(5.43f, 11.0f)
                arcToRelative(18.806f, 18.806f, 0.0f, false, true, -1.007f, 1.919f)
                arcTo(7.864f, 7.864f, 0.0f, false, false, 3.0f, 16.773f)
                arcTo(9.183f, 9.183f, 0.0f, false, false, 4.144f, 21.0f)
                close()
                moveTo(21.0f, 15.5f)
                arcToRelative(5.491f, 5.491f, 0.0f, false, false, -10.163f, -2.895f)
                arcTo(8.775f, 8.775f, 0.0f, false, true, 12.0f, 16.773f)
                arcToRelative(10.969f, 10.969f, 0.0f, false, true, -0.339f, 2.66f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 21.0f, 15.5f)
                close()
            }
        }
        .build()
        return _bowling!!
    }

private var _bowling: ImageVector? = null
