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

public val Icons.Bold.GrinTears: ImageVector
    get() {
        if (_grinTears != null) {
            return _grinTears!!
        }
        _grinTears = Builder(name = "GrinTears", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.993f, 14.0f)
                arcToRelative(21.841f, 21.841f, 0.0f, false, false, 6.0f, 1.0f)
                arcTo(21.923f, 21.923f, 0.0f, false, false, 18.0f, 14.0f)
                curveToRelative(-0.615f, 2.28f, -2.664f, 5.0f, -6.0f, 5.0f)
                reflectiveCurveTo(6.608f, 16.28f, 5.993f, 14.0f)
                close()
                moveTo(19.5f, 13.5f)
                reflectiveCurveToRelative(0.43f, 3.174f, 1.188f, 3.932f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 2.744f, -2.744f)
                curveTo(22.674f, 13.93f, 19.5f, 13.5f, 19.5f, 13.5f)
                close()
                moveTo(4.5f, 13.5f)
                reflectiveCurveToRelative(-3.174f, 0.43f, -3.932f, 1.188f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 2.744f, 2.744f)
                curveTo(4.07f, 16.674f, 4.5f, 13.5f, 4.5f, 13.5f)
                close()
                moveTo(3.014f, 11.718f)
                curveTo(3.742f, 0.173f, 20.262f, 0.182f, 20.986f, 11.718f)
                arcToRelative(11.129f, 11.129f, 0.0f, false, true, 2.981f, 0.941f)
                arcToRelative(11.986f, 11.986f, 0.0f, true, false, -23.934f, 0.0f)
                arcTo(11.129f, 11.129f, 0.0f, false, true, 3.014f, 11.718f)
                close()
                moveTo(18.683f, 18.007f)
                curveToRelative(-3.224f, 3.926f, -10.143f, 3.925f, -13.366f, 0.0f)
                arcToRelative(3.625f, 3.625f, 0.0f, false, true, -0.591f, 0.839f)
                arcToRelative(3.905f, 3.905f, 0.0f, false, true, -1.778f, 1.008f)
                curveToRelative(4.448f, 5.464f, 13.661f, 5.461f, 18.106f, 0.0f)
                arcToRelative(3.886f, 3.886f, 0.0f, false, true, -1.781f, -1.0f)
                arcTo(3.623f, 3.623f, 0.0f, false, true, 18.683f, 18.007f)
                close()
                moveTo(8.0f, 7.0f)
                curveToRelative(-2.267f, 0.0f, -3.0f, 3.369f, -3.0f, 5.0f)
                curveToRelative(2.759f, -2.607f, 3.254f, -2.59f, 6.0f, 0.0f)
                curveTo(11.0f, 10.369f, 10.267f, 7.0f, 8.0f, 7.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-2.267f, 0.0f, -3.0f, 3.369f, -3.0f, 5.0f)
                curveToRelative(2.759f, -2.607f, 3.254f, -2.59f, 6.0f, 0.0f)
                curveTo(19.0f, 10.369f, 18.267f, 7.0f, 16.0f, 7.0f)
                close()
            }
        }
        .build()
        return _grinTears!!
    }

private var _grinTears: ImageVector? = null
