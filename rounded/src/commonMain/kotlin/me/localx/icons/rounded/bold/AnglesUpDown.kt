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

public val Icons.Bold.AnglesUpDown: ImageVector
    get() {
        if (_anglesUpDown != null) {
            return _anglesUpDown!!
        }
        _anglesUpDown = Builder(name = "AnglesUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.772f, 9.567f)
                curveToRelative(-0.589f, -0.583f, -0.595f, -1.532f, -0.012f, -2.122f)
                lineTo(8.812f, 1.324f)
                curveToRelative(0.855f, -0.856f, 1.985f, -1.324f, 3.188f, -1.324f)
                reflectiveCurveToRelative(2.332f, 0.468f, 3.182f, 1.318f)
                lineToRelative(6.058f, 6.127f)
                curveToRelative(0.583f, 0.589f, 0.577f, 1.539f, -0.012f, 2.122f)
                curveToRelative(-0.292f, 0.289f, -0.674f, 0.433f, -1.055f, 0.433f)
                curveToRelative(-0.387f, 0.0f, -0.773f, -0.148f, -1.066f, -0.445f)
                lineToRelative(-6.052f, -6.121f)
                curveToRelative(-0.555f, -0.555f, -1.549f, -0.561f, -2.115f, 0.006f)
                lineToRelative(-6.046f, 6.115f)
                curveToRelative(-0.582f, 0.589f, -1.533f, 0.594f, -2.121f, 0.012f)
                close()
                moveTo(19.106f, 14.445f)
                lineToRelative(-6.046f, 6.115f)
                curveToRelative(-0.566f, 0.566f, -1.561f, 0.561f, -2.115f, 0.006f)
                lineToRelative(-6.052f, -6.121f)
                curveToRelative(-0.582f, -0.59f, -1.533f, -0.594f, -2.121f, -0.012f)
                curveToRelative(-0.589f, 0.582f, -0.595f, 1.532f, -0.012f, 2.121f)
                lineToRelative(6.058f, 6.127f)
                curveToRelative(0.85f, 0.851f, 1.979f, 1.318f, 3.182f, 1.318f)
                reflectiveCurveToRelative(2.332f, -0.468f, 3.188f, -1.324f)
                lineToRelative(6.052f, -6.121f)
                curveToRelative(0.583f, -0.589f, 0.577f, -1.539f, -0.012f, -2.121f)
                reflectiveCurveToRelative(-1.539f, -0.578f, -2.121f, 0.012f)
                close()
            }
        }
        .build()
        return _anglesUpDown!!
    }

private var _anglesUpDown: ImageVector? = null
