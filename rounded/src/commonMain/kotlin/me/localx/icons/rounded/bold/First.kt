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

public val Icons.Bold.First: ImageVector
    get() {
        if (_first != null) {
            return _first!!
        }
        _first = Builder(name = "First", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 12.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.998f)
                lineToRelative(-0.002f, -0.505f)
                curveToRelative(-0.003f, -0.827f, -0.674f, -1.495f, -1.5f, -1.495f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-0.828f, 0.003f, -1.498f, 0.677f, -1.495f, 1.505f)
                lineToRelative(0.002f, 0.495f)
                horizontalLineToRelative(-0.502f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.512f)
                lineToRelative(0.007f, 2.0f)
                horizontalLineToRelative(-0.519f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.529f)
                lineToRelative(0.002f, 0.505f)
                curveToRelative(0.003f, 0.827f, 0.674f, 1.495f, 1.5f, 1.495f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.828f, -0.003f, 1.498f, -0.677f, 1.495f, -1.505f)
                lineToRelative(-0.002f, -0.495f)
                horizontalLineToRelative(1.97f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(-1.981f)
                lineToRelative(-0.007f, -2.0f)
                horizontalLineToRelative(1.988f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 4.225f)
                verticalLineToRelative(16.275f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(19.0f, 6.11f)
                lineToRelative(-1.436f, 1.446f)
                curveToRelative(-0.583f, 0.587f, -1.532f, 0.593f, -2.121f, 0.008f)
                curveToRelative(-0.588f, -0.583f, -0.592f, -1.533f, -0.008f, -2.121f)
                lineToRelative(2.765f, -2.786f)
                curveToRelative(0.643f, -0.644f, 1.595f, -0.832f, 2.428f, -0.486f)
                reflectiveCurveToRelative(1.372f, 1.151f, 1.372f, 2.054f)
                close()
            }
        }
        .build()
        return _first!!
    }

private var _first: ImageVector? = null
