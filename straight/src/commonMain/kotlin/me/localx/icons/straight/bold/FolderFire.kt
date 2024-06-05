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

public val Icons.Bold.FolderFire: ImageVector
    get() {
        if (_folderFire != null) {
            return _folderFire!!
        }
        _folderFire = Builder(name = "FolderFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                curveToRelative(-1.821f, 2.103f, -1.455f, 6.0f, -2.718f, 6.0f)
                curveToRelative(-0.606f, 0.0f, -1.287f, -2.087f, -1.287f, -2.087f)
                curveToRelative(-0.995f, 1.027f, -1.995f, 2.361f, -1.995f, 4.087f)
                curveToRelative(0.0f, 3.314f, 2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                curveToRelative(0.0f, -3.474f, -4.105f, -6.105f, -6.0f, -8.0f)
                close()
                moveTo(19.414f, 21.414f)
                curveToRelative(-0.781f, 0.781f, -2.048f, 0.781f, -2.829f, 0.0f)
                curveToRelative(-0.781f, -0.782f, -0.781f, -2.048f, 0.0f, -2.829f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(1.415f, 1.415f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.781f, 0.782f, 0.781f, 2.048f, 0.0f, 2.829f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(7.492f)
                curveToRelative(-0.922f, -1.145f, -2.021f, -2.131f, -3.0f, -2.983f)
                verticalLineToRelative(-3.009f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(7.069f)
                curveToRelative(0.136f, 1.082f, 0.488f, 2.096f, 1.013f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(4.854f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(8.146f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _folderFire!!
    }

private var _folderFire: ImageVector? = null
