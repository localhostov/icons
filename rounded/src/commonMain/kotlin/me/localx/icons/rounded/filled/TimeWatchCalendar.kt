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

public val Icons.Filled.TimeWatchCalendar: ImageVector
    get() {
        if (_timeWatchCalendar != null) {
            return _timeWatchCalendar!!
        }
        _timeWatchCalendar = Builder(name = "TimeWatchCalendar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 19.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 14.184f)
                verticalLineToRelative(-1.184f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.184f)
                curveToRelative(-1.163f, 0.413f, -2.0f, 1.512f, -2.0f, 2.816f)
                verticalLineToRelative(0.136f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.136f)
                curveToRelative(0.0f, -1.304f, -0.837f, -2.403f, -2.0f, -2.816f)
                close()
                moveTo(10.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.59f, 0.766f, -3.059f, 2.0f, -3.986f)
                verticalLineToRelative(-0.014f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(1.304f, 0.0f, 2.416f, 0.836f, 2.829f, 2.0f)
                horizontalLineToRelative(0.342f)
                curveToRelative(0.413f, -1.164f, 1.525f, -2.0f, 2.829f, -2.0f)
                curveToRelative(0.337f, 0.0f, 0.656f, 0.068f, 0.958f, 0.171f)
                curveToRelative(-0.425f, -5.687f, -5.163f, -10.171f, -10.958f, -10.171f)
                curveTo(4.925f, 0.0f, 0.0f, 4.925f, 0.0f, 11.0f)
                curveToRelative(0.0f, 5.77f, 4.445f, 10.494f, 10.096f, 10.954f)
                curveToRelative(-0.06f, -0.31f, -0.096f, -0.628f, -0.096f, -0.954f)
                close()
                moveTo(7.501f, 14.0f)
                curveToRelative(-0.348f, 0.0f, -0.685f, -0.181f, -0.869f, -0.504f)
                curveToRelative(-0.274f, -0.479f, -0.107f, -1.09f, 0.372f, -1.364f)
                lineToRelative(2.996f, -1.712f)
                verticalLineToRelative(-4.42f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.359f, -0.192f, 0.69f, -0.504f, 0.868f)
                lineToRelative(-3.5f, 2.0f)
                curveToRelative(-0.156f, 0.089f, -0.327f, 0.132f, -0.495f, 0.132f)
                close()
            }
        }
        .build()
        return _timeWatchCalendar!!
    }

private var _timeWatchCalendar: ImageVector? = null
