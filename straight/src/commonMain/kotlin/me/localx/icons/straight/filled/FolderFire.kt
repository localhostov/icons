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

public val Icons.Filled.FolderFire: ImageVector
    get() {
        if (_folderFire != null) {
            return _folderFire!!
        }
        _folderFire = Builder(name = "FolderFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(5.236f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(8.764f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                curveToRelative(0.0f, -1.725f, 1.0f, -3.06f, 1.995f, -4.087f)
                curveToRelative(0.0f, 0.0f, 0.681f, 2.087f, 1.287f, 2.087f)
                curveToRelative(1.263f, 0.0f, 0.897f, -3.898f, 2.718f, -6.0f)
                curveToRelative(1.895f, 1.895f, 6.0f, 4.526f, 6.0f, 8.0f)
                close()
                moveTo(19.414f, 18.585f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.415f, -1.415f)
                lineToRelative(-1.415f, 1.415f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.048f, 0.0f, 2.829f)
                curveToRelative(0.781f, 0.781f, 2.048f, 0.781f, 2.829f, 0.0f)
                reflectiveCurveToRelative(0.781f, -2.048f, 0.0f, -2.829f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -2.542f, 1.46f, -4.345f, 2.559f, -5.479f)
                curveToRelative(0.0f, 0.0f, 3.318f, -3.126f, 3.929f, -3.831f)
                lineToRelative(0.598f, -0.69f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(14.0f)
                lineTo(11.082f, 22.0f)
                curveToRelative(-0.684f, -1.178f, -1.082f, -2.542f, -1.082f, -4.0f)
                close()
                moveTo(19.415f, 8.586f)
                curveToRelative(0.351f, 0.352f, 0.83f, 0.767f, 1.337f, 1.207f)
                curveToRelative(1.036f, 0.899f, 2.248f, 1.957f, 3.249f, 3.199f)
                verticalLineToRelative(-4.992f)
                horizontalLineToRelative(-5.171f)
                lineToRelative(0.586f, 0.586f)
                close()
            }
        }
        .build()
        return _folderFire!!
    }

private var _folderFire: ImageVector? = null
