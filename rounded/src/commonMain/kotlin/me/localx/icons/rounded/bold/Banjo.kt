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

public val Icons.Bold.Banjo: ImageVector
    get() {
        if (_banjo != null) {
            return _banjo!!
        }
        _banjo = Builder(name = "Banjo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.368f, 1.151f)
                lineToRelative(-0.526f, -0.526f)
                curveToRelative(-0.837f, -0.837f, -2.194f, -0.839f, -3.032f, -0.003f)
                lineToRelative(-0.581f, 0.583f)
                curveToRelative(-0.708f, 0.711f, -1.118f, 1.651f, -1.198f, 2.644f)
                lineToRelative(-5.537f, 5.537f)
                curveToRelative(-1.282f, -0.874f, -2.828f, -1.386f, -4.493f, -1.386f)
                curveTo(3.589f, 8.0f, 0.0f, 11.589f, 0.0f, 16.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -1.665f, -0.512f, -3.211f, -1.386f, -4.493f)
                lineToRelative(5.538f, -5.538f)
                curveToRelative(0.994f, -0.083f, 1.935f, -0.496f, 2.644f, -1.208f)
                lineToRelative(0.568f, -0.57f)
                curveToRelative(0.841f, -0.838f, 0.843f, -2.199f, 0.003f, -3.039f)
                close()
                moveTo(8.0f, 21.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(9.561f, 16.439f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-2.0f, -2.0f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _banjo!!
    }

private var _banjo: ImageVector? = null
