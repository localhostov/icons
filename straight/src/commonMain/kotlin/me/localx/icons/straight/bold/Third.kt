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

public val Icons.Bold.Third: ImageVector
    get() {
        if (_third != null) {
            return _third!!
        }
        _third = Builder(name = "Third", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 16.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.192f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.192f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.192f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                curveToRelative(0.0f, 1.352f, -0.491f, 2.592f, -1.304f, 3.551f)
                curveToRelative(1.576f, 1.082f, 2.612f, 2.897f, 2.612f, 4.949f)
                close()
                moveTo(9.995f, 16.0f)
                lineToRelative(0.005f, 1.996f)
                lineToRelative(-3.0f, 0.008f)
                lineToRelative(-0.005f, -2.004f)
                horizontalLineToRelative(-1.969f)
                lineToRelative(0.005f, 1.996f)
                lineToRelative(-3.0f, 0.008f)
                lineToRelative(-0.005f, -2.004f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.018f)
                lineToRelative(-0.005f, -2.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.005f)
                lineToRelative(-0.005f, -1.996f)
                lineToRelative(3.0f, -0.008f)
                lineToRelative(0.005f, 2.004f)
                horizontalLineToRelative(1.969f)
                lineToRelative(-0.005f, -1.996f)
                lineToRelative(3.0f, -0.008f)
                lineToRelative(0.005f, 2.004f)
                horizontalLineToRelative(2.026f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.018f)
                lineToRelative(0.005f, 2.0f)
                horizontalLineToRelative(2.013f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.005f)
                close()
                moveTo(6.987f, 13.0f)
                lineToRelative(-0.005f, -2.0f)
                horizontalLineToRelative(-1.969f)
                lineToRelative(0.005f, 2.0f)
                horizontalLineToRelative(1.969f)
                close()
            }
        }
        .build()
        return _third!!
    }

private var _third: ImageVector? = null
