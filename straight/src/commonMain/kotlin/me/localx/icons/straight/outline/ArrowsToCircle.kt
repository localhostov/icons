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

public val Icons.Outline.ArrowsToCircle: ImageVector
    get() {
        if (_arrowsToCircle != null) {
            return _arrowsToCircle!!
        }
        _arrowsToCircle = Builder(name = "ArrowsToCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(2.998f, 8.0f)
                lineToRelative(0.005f, 2.0f)
                lineToRelative(5.009f, -0.011f)
                curveToRelative(1.097f, 0.0f, 1.989f, -0.892f, 1.989f, -1.989f)
                lineTo(10.001f, 3.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.006f, 3.592f)
                lineTo(1.462f, 0.048f)
                lineTo(0.048f, 1.462f)
                lineTo(6.578f, 7.992f)
                lineToRelative(-3.58f, 0.008f)
                close()
                moveTo(16.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-3.593f, 0.007f)
                lineTo(23.952f, 1.462f)
                lineTo(22.538f, 0.048f)
                lineToRelative(-6.53f, 6.53f)
                lineToRelative(-0.008f, -3.58f)
                lineToRelative(-2.0f, 0.005f)
                lineToRelative(0.012f, 5.009f)
                curveToRelative(0.0f, 1.096f, 0.892f, 1.988f, 1.988f, 1.988f)
                close()
                moveTo(8.014f, 14.012f)
                lineToRelative(-5.011f, -0.012f)
                lineToRelative(-0.005f, 2.0f)
                horizontalLineToRelative(3.588f)
                lineTo(0.048f, 22.538f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(6.538f, -6.538f)
                verticalLineToRelative(3.586f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.097f, -0.892f, -1.988f, -1.986f, -1.988f)
                close()
                moveTo(21.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.096f, 0.0f, -1.988f, 0.892f, -1.988f, 1.986f)
                lineToRelative(-0.012f, 5.012f)
                lineToRelative(2.0f, 0.004f)
                verticalLineToRelative(-3.588f)
                lineToRelative(6.538f, 6.538f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-6.538f, -6.538f)
                horizontalLineToRelative(3.586f)
                close()
            }
        }
        .build()
        return _arrowsToCircle!!
    }

private var _arrowsToCircle: ImageVector? = null
