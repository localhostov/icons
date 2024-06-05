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

public val Icons.Filled.UserPen: ImageVector
    get() {
        if (_userPen != null) {
            return _userPen!!
        }
        _userPen = Builder(name = "UserPen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(16.086f, 24.0f)
                horizontalLineToRelative(-3.086f)
                reflectiveCurveToRelative(0.0f, -3.086f, 0.0f, -3.086f)
                lineToRelative(7.275f, -7.275f)
                curveToRelative(0.852f, -0.852f, 2.234f, -0.852f, 3.086f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.852f, 0.852f, 0.852f, 2.234f, 0.0f, 3.086f)
                lineToRelative(-7.275f, 7.275f)
                close()
                moveTo(11.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                lineTo(13.0f, 14.0f)
                curveToRelative(1.145f, 0.0f, 2.189f, 0.403f, 3.033f, 1.053f)
                lineToRelative(-5.033f, 5.033f)
                verticalLineToRelative(3.914f)
                close()
            }
        }
        .build()
        return _userPen!!
    }

private var _userPen: ImageVector? = null
