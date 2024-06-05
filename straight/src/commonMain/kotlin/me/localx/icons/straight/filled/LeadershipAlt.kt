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

public val Icons.Filled.LeadershipAlt: ImageVector
    get() {
        if (_leadershipAlt != null) {
            return _leadershipAlt!!
        }
        _leadershipAlt = Builder(name = "LeadershipAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(17.5f, 16.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                close()
                moveTo(1.5f, 16.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                close()
                moveTo(21.5f, 20.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(8.0f, 14.479f)
                curveToRelative(0.742f, -1.465f, 2.246f, -2.479f, 4.0f, -2.479f)
                reflectiveCurveToRelative(3.258f, 1.014f, 4.0f, 2.479f)
                verticalLineToRelative(-5.59f)
                lineToRelative(7.151f, -6.13f)
                lineToRelative(-1.302f, -1.518f)
                lineToRelative(-6.719f, 5.759f)
                horizontalLineToRelative(-6.26f)
                lineTo(2.151f, 1.241f)
                lineToRelative(-1.302f, 1.518f)
                lineToRelative(7.151f, 6.13f)
                verticalLineToRelative(5.59f)
                close()
            }
        }
        .build()
        return _leadershipAlt!!
    }

private var _leadershipAlt: ImageVector? = null
