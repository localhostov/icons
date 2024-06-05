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

public val Icons.Bold.WatchFitness: ImageVector
    get() {
        if (_watchFitness != null) {
            return _watchFitness!!
        }
        _watchFitness = Builder(name = "WatchFitness", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(16.0f, 11.16f)
                curveToRelative(0.0f, 1.729f, -2.338f, 3.76f, -3.439f, 4.621f)
                curveToRelative(-0.331f, 0.259f, -0.791f, 0.259f, -1.122f, 0.0f)
                curveToRelative(-1.101f, -0.861f, -3.439f, -2.891f, -3.439f, -4.621f)
                curveToRelative(0.0f, -1.193f, 0.895f, -2.16f, 2.0f, -2.16f)
                reflectiveCurveToRelative(2.0f, 0.807f, 2.0f, 2.0f)
                curveToRelative(0.0f, -1.193f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.967f, 2.0f, 2.16f)
                close()
            }
        }
        .build()
        return _watchFitness!!
    }

private var _watchFitness: ImageVector? = null
