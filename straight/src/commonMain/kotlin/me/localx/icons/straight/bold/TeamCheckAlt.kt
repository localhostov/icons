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

public val Icons.Bold.TeamCheckAlt: ImageVector
    get() {
        if (_teamCheckAlt != null) {
            return _teamCheckAlt!!
        }
        _teamCheckAlt = Builder(name = "TeamCheckAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(15.0f, 6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(7.0f, 11.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                close()
                moveTo(7.031f, 7.0f)
                horizontalLineToRelative(-3.531f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.601f)
                curveToRelative(0.25f, -1.226f, 0.96f, -2.278f, 1.93f, -3.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(22.359f, 16.744f)
                lineToRelative(-1.398f, -1.43f)
                lineToRelative(-3.614f, 3.703f)
                lineToRelative(-2.216f, -2.301f)
                lineToRelative(-1.387f, 1.441f)
                lineToRelative(2.182f, 2.268f)
                curveToRelative(0.766f, 0.765f, 2.079f, 0.763f, 2.823f, 0.019f)
                lineToRelative(3.61f, -3.7f)
                close()
                moveTo(12.969f, 7.0f)
                curveToRelative(0.97f, 0.722f, 1.68f, 1.774f, 1.93f, 3.0f)
                horizontalLineToRelative(3.101f)
                curveToRelative(0.682f, 0.0f, 1.34f, 0.094f, 1.971f, 0.255f)
                curveToRelative(-0.129f, -1.813f, -1.626f, -3.255f, -3.471f, -3.255f)
                horizontalLineToRelative(-3.531f)
                close()
                moveTo(4.0f, 18.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.0f, -1.062f, 0.211f, -2.073f, 0.587f, -3.0f)
                horizontalLineToRelative(-3.087f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _teamCheckAlt!!
    }

private var _teamCheckAlt: ImageVector? = null
