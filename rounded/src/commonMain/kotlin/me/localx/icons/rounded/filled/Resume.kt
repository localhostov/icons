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

public val Icons.Filled.Resume: ImageVector
    get() {
        if (_resume != null) {
            return _resume!!
        }
        _resume = Builder(name = "Resume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.976f, 9.0f)
                horizontalLineToRelative(-5.976f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(13.0f, 0.024f)
                curveToRelative(-0.161f, -0.011f, -1.322f, -0.024f, -1.485f, -0.024f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 9.485f)
                curveToRelative(0.0f, -0.163f, -0.013f, -0.324f, -0.024f, -0.485f)
                close()
                moveTo(9.0f, 4.999f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(6.256f, 11.391f)
                curveToRelative(0.109f, -0.143f, 1.113f, -1.392f, 2.77f, -1.392f)
                reflectiveCurveToRelative(2.659f, 1.25f, 2.769f, 1.392f)
                curveToRelative(0.336f, 0.438f, 0.253f, 1.066f, -0.186f, 1.402f)
                curveToRelative(-0.182f, 0.139f, -0.396f, 0.206f, -0.607f, 0.206f)
                curveToRelative(-0.301f, 0.0f, -0.598f, -0.135f, -0.795f, -0.392f)
                curveToRelative(0.0f, 0.0f, -0.497f, -0.608f, -1.181f, -0.608f)
                reflectiveCurveToRelative(-1.177f, 0.602f, -1.182f, 0.608f)
                curveToRelative(-0.336f, 0.439f, -0.962f, 0.523f, -1.402f, 0.186f)
                curveToRelative(-0.438f, -0.335f, -0.521f, -0.963f, -0.186f, -1.402f)
                close()
                moveTo(17.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(15.0f, 0.942f)
                curveToRelative(0.527f, 0.302f, 1.023f, 0.666f, 1.465f, 1.107f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(0.442f, 0.441f, 0.806f, 0.937f, 1.108f, 1.464f)
                horizontalLineToRelative(-5.057f)
                close()
            }
        }
        .build()
        return _resume!!
    }

private var _resume: ImageVector? = null
