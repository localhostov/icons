package me.localx.icons.rounded.bold

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

public val Icons.Bold.WatchSmart: ImageVector
    get() {
        if (_watchSmart != null) {
            return _watchSmart!!
        }
        _watchSmart = Builder(name = "WatchSmart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 3.261f)
                verticalLineToRelative(-1.761f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.523f)
                curveToRelative(-0.165f, -0.015f, -0.331f, -0.023f, -0.5f, -0.023f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.169f, 0.0f, -0.335f, 0.008f, -0.5f, 0.023f)
                verticalLineToRelative(-0.523f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.761f)
                curveToRelative(-1.221f, 1.01f, -2.0f, 2.535f, -2.0f, 4.239f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.704f, 0.779f, 3.229f, 2.0f, 4.239f)
                verticalLineToRelative(1.761f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.523f)
                curveToRelative(0.165f, 0.015f, 0.331f, 0.023f, 0.5f, 0.023f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.169f, 0.0f, 0.335f, -0.008f, 0.5f, -0.023f)
                verticalLineToRelative(0.523f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.761f)
                curveToRelative(1.221f, -1.01f, 2.0f, -2.535f, 2.0f, -4.239f)
                lineTo(21.0f, 7.5f)
                curveToRelative(0.0f, -1.704f, -0.779f, -3.229f, -2.0f, -4.239f)
                close()
                moveTo(8.5f, 19.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(6.0f, 7.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(14.561f, 12.439f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(-0.281f, -0.281f, -0.439f, -0.663f, -0.439f, -1.061f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(2.879f)
                lineToRelative(1.061f, 1.061f)
                close()
            }
        }
        .build()
        return _watchSmart!!
    }

private var _watchSmart: ImageVector? = null
