package me.localx.icons.straight.outline

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

public val Icons.Outline.FolderFire: ImageVector
    get() {
        if (_folderFire != null) {
            return _folderFire!!
        }
        _folderFire = Builder(name = "FolderFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                lineTo(12.236f, 2.0f)
                lineTo(8.236f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(11.082f, 22.0f)
                curveToRelative(-0.36f, -0.619f, -0.635f, -1.29f, -0.819f, -2.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 8.0f)
                lineTo(22.0f, 8.0f)
                verticalLineToRelative(2.87f)
                curveToRelative(0.655f, 0.585f, 1.363f, 1.258f, 2.0f, 2.037f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(7.764f, 2.0f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(9.236f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(20.045f, 11.814f)
                curveToRelative(-0.411f, -0.357f, -0.796f, -0.692f, -1.113f, -1.009f)
                lineToRelative(-0.855f, -0.855f)
                lineToRelative(-0.679f, 1.001f)
                curveToRelative(-0.688f, 1.015f, -0.94f, 2.06f, -1.144f, 2.898f)
                curveToRelative(-0.077f, 0.317f, -0.196f, 0.81f, -0.307f, 1.031f)
                curveToRelative(-0.114f, -0.265f, -0.236f, -0.679f, -0.298f, -1.038f)
                lineToRelative(-0.334f, -1.94f)
                lineToRelative(-1.369f, 1.412f)
                curveToRelative(-0.967f, 0.997f, -1.945f, 2.927f, -1.945f, 4.686f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -2.742f, -2.286f, -4.732f, -3.955f, -6.186f)
                close()
                moveTo(19.874f, 21.512f)
                curveToRelative(0.257f, -0.708f, 0.107f, -1.53f, -0.46f, -2.097f)
                lineToRelative(-1.414f, -1.415f)
                lineToRelative(-1.415f, 1.415f)
                curveToRelative(-0.567f, 0.567f, -0.717f, 1.389f, -0.46f, 2.097f)
                curveToRelative(-1.258f, -0.675f, -2.125f, -1.987f, -2.125f, -3.512f)
                curveToRelative(0.0f, -0.558f, 0.167f, -1.186f, 0.416f, -1.763f)
                curveToRelative(0.311f, 0.445f, 0.737f, 0.763f, 1.319f, 0.763f)
                curveToRelative(1.816f, 0.0f, 2.19f, -1.549f, 2.464f, -2.681f)
                curveToRelative(0.094f, -0.39f, 0.19f, -0.785f, 0.327f, -1.177f)
                curveToRelative(0.068f, 0.06f, 0.137f, 0.119f, 0.206f, 0.18f)
                curveToRelative(1.532f, 1.334f, 3.268f, 2.846f, 3.268f, 4.678f)
                curveToRelative(0.0f, 1.525f, -0.868f, 2.838f, -2.126f, 3.512f)
                close()
            }
        }
        .build()
        return _folderFire!!
    }

private var _folderFire: ImageVector? = null
