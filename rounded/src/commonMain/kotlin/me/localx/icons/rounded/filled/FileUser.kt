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

public val Icons.Filled.FileUser: ImageVector
    get() {
        if (_fileUser != null) {
            return _fileUser!!
        }
        _fileUser = Builder(name = "FileUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 24.0f)
                curveToRelative(0.0f, 0.009f, 0.0f, 0.017f, 0.0f, 0.026f)
                horizontalLineToRelative(-6.001f)
                curveToRelative(0.0f, -0.009f, 0.0f, -0.017f, 0.0f, -0.026f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(14.923f, 8.026f)
                horizontalLineToRelative(6.54f)
                curveToRelative(-0.347f, -0.913f, -0.88f, -1.753f, -1.591f, -2.464f)
                lineToRelative(-3.484f, -3.486f)
                curveToRelative(-0.712f, -0.711f, -1.552f, -1.244f, -2.465f, -1.59f)
                verticalLineToRelative(6.54f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(21.923f, 10.511f)
                verticalLineToRelative(8.515f)
                curveToRelative(0.0f, 2.731f, -2.202f, 4.958f, -4.924f, 4.999f)
                curveToRelative(0.0f, -0.008f, 0.0f, -0.016f, 0.0f, -0.025f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 0.009f, 0.0f, 0.017f, 0.0f, 0.026f)
                horizontalLineToRelative(-0.078f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(1.921f, 5.026f)
                curveTo(1.923f, 2.269f, 4.166f, 0.026f, 6.923f, 0.026f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.163f, 0.0f, 0.324f, 0.013f, 0.485f, 0.024f)
                verticalLineToRelative(6.976f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.976f)
                curveToRelative(0.011f, 0.161f, 0.024f, 0.322f, 0.024f, 0.485f)
                close()
                moveTo(15.5f, 14.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _fileUser!!
    }

private var _fileUser: ImageVector? = null
