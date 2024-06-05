package me.localx.icons.straight.outline

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

public val Icons.Outline.GrinTears: ImageVector
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
                moveTo(8.0f, 9.0f)
                curveToRelative(0.321f, 0.0f, 1.0f, 0.946f, 1.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.892f, -1.232f, -4.0f, -3.0f, -4.0f)
                reflectiveCurveTo(5.0f, 9.108f, 5.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                curveTo(7.0f, 9.946f, 7.679f, 9.0f, 8.0f, 9.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-1.768f, 0.0f, -3.0f, 2.108f, -3.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.054f, 0.68f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveTo(19.0f, 9.108f, 17.768f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(23.432f, 13.688f)
                curveTo(22.674f, 12.93f, 19.0f, 12.0f, 19.0f, 12.0f)
                reflectiveCurveToRelative(0.93f, 3.674f, 1.688f, 4.432f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 2.744f, -2.744f)
                close()
                moveTo(5.0f, 12.0f)
                reflectiveCurveToRelative(-3.674f, 0.93f, -4.432f, 1.688f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 2.744f, 2.744f)
                curveTo(4.07f, 15.674f, 5.0f, 12.0f, 5.0f, 12.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(9.982f, 9.982f, 0.0f, false, true, -7.783f, -3.735f)
                arcToRelative(3.888f, 3.888f, 0.0f, false, true, -1.966f, 0.7f)
                arcToRelative(11.963f, 11.963f, 0.0f, false, false, 19.5f, 0.0f)
                arcToRelative(3.906f, 3.906f, 0.0f, false, true, -1.966f, -0.706f)
                arcTo(9.979f, 9.979f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.909f, 8.771f)
                arcToRelative(12.933f, 12.933f, 0.0f, false, true, 2.073f, 0.888f)
                arcToRelative(11.986f, 11.986f, 0.0f, false, false, -23.964f, 0.0f)
                arcToRelative(12.894f, 12.894f, 0.0f, false, true, 2.073f, -0.888f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _grinTears!!
    }

private var _grinTears: ImageVector? = null
