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

public val Icons.Bold.HoseReel: ImageVector
    get() {
        if (_hoseReel != null) {
            return _hoseReel!!
        }
        _hoseReel = Builder(name = "HoseReel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 5.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(11.0f, 14.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(23.461f, 16.135f)
                lineToRelative(-1.461f, 7.865f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-1.461f, -7.865f)
                curveToRelative(-0.099f, -0.594f, 0.359f, -1.135f, 0.961f, -1.135f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveTo(3.0f, 6.589f, 3.0f, 11.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                curveToRelative(1.777f, 0.0f, 3.415f, -0.59f, 4.744f, -1.574f)
                lineToRelative(0.592f, 3.185f)
                curveToRelative(-1.582f, 0.882f, -3.4f, 1.389f, -5.336f, 1.389f)
                curveTo(4.935f, 22.0f, 0.0f, 17.065f, 0.0f, 11.0f)
                reflectiveCurveTo(4.935f, 0.0f, 11.0f, 0.0f)
                reflectiveCurveToRelative(11.0f, 4.935f, 11.0f, 11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.602f, 0.0f, 1.06f, 0.541f, 0.961f, 1.135f)
                close()
            }
        }
        .build()
        return _hoseReel!!
    }

private var _hoseReel: ImageVector? = null
