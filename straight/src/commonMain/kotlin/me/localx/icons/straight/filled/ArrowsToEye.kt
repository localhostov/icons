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

public val Icons.Filled.ArrowsToEye: ImageVector
    get() {
        if (_arrowsToEye != null) {
            return _arrowsToEye!!
        }
        _arrowsToEye = Builder(name = "ArrowsToEye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.802f, 12.819f)
                curveToRelative(0.266f, -0.521f, 0.266f, -1.118f, 0.0f, -1.639f)
                lineToRelative(-0.002f, -0.003f)
                curveToRelative(-0.454f, -0.882f, -2.939f, -4.178f, -6.8f, -4.178f)
                reflectiveCurveToRelative(-6.346f, 3.296f, -6.798f, 4.175f)
                curveToRelative(-0.269f, 0.518f, -0.269f, 1.134f, -0.002f, 1.647f)
                curveToRelative(0.454f, 0.883f, 2.938f, 4.178f, 6.8f, 4.178f)
                reflectiveCurveToRelative(6.346f, -3.296f, 6.802f, -4.181f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(3.578f, 4.992f)
                lineTo(0.048f, 1.462f)
                lineTo(1.462f, 0.048f)
                lineToRelative(3.544f, 3.544f)
                lineToRelative(-0.006f, -2.592f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.097f, -0.892f, 1.988f, -1.988f, 1.988f)
                lineToRelative(-4.009f, 0.012f)
                lineToRelative(-0.006f, -2.0f)
                lineToRelative(2.581f, -0.008f)
                close()
                moveTo(17.011f, 5.011f)
                lineToRelative(-0.012f, -4.009f)
                lineToRelative(2.0f, -0.006f)
                lineToRelative(0.008f, 2.581f)
                lineTo(22.538f, 0.048f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.544f, 3.544f)
                lineToRelative(2.592f, -0.006f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.097f, 0.0f, -1.988f, -0.892f, -1.988f, -1.988f)
                close()
                moveTo(6.999f, 18.999f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.586f)
                lineToRelative(-3.538f, 3.538f)
                lineTo(0.048f, 22.538f)
                lineToRelative(3.538f, -3.538f)
                lineTo(0.997f, 19.0f)
                lineToRelative(0.006f, -2.0f)
                lineToRelative(4.012f, 0.012f)
                curveToRelative(1.094f, 0.0f, 1.985f, 0.892f, 1.985f, 1.988f)
                close()
                moveTo(20.413f, 18.999f)
                lineToRelative(3.538f, 3.538f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.538f, -3.538f)
                verticalLineToRelative(2.589f)
                lineToRelative(-2.0f, -0.006f)
                lineToRelative(0.012f, -4.012f)
                curveToRelative(0.0f, -1.094f, 0.892f, -1.985f, 1.988f, -1.985f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.586f)
                close()
            }
        }
        .build()
        return _arrowsToEye!!
    }

private var _arrowsToEye: ImageVector? = null
