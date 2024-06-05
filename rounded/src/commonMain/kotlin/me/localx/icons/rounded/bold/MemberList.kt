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

public val Icons.Bold.MemberList: ImageVector
    get() {
        if (_memberList != null) {
            return _memberList!!
        }
        _memberList = Builder(name = "MemberList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                horizontalLineToRelative(-5.001f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(7.001f)
                curveToRelative(0.0f, 1.656f, 1.343f, 2.999f, 2.999f, 3.0f)
                lineToRelative(5.0f, 0.003f)
                curveToRelative(1.657f, 0.0f, 3.002f, -1.343f, 3.002f, -3.0f)
                verticalLineToRelative(-7.003f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(16.999f, 13.997f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(19.999f, 20.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, -0.001f, -1.0f, -0.449f, -1.0f, -1.001f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.554f, 0.448f, -1.002f, 1.0f, -1.002f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(0.003f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(11.0f, 15.472f)
                curveToRelative(0.016f, 0.828f, -0.644f, 1.512f, -1.472f, 1.527f)
                lineToRelative(-1.047f, 0.02f)
                curveToRelative(-2.896f, 0.21f, -5.288f, 2.61f, -5.484f, 5.58f)
                curveToRelative(-0.053f, 0.793f, -0.713f, 1.401f, -1.495f, 1.401f)
                curveToRelative(-0.034f, 0.0f, -0.067f, 0.0f, -0.102f, -0.003f)
                curveToRelative(-0.826f, -0.055f, -1.452f, -0.769f, -1.397f, -1.596f)
                curveToRelative(0.296f, -4.457f, 3.882f, -8.058f, 8.343f, -8.377f)
                lineToRelative(1.126f, -0.023f)
                curveToRelative(0.845f, -0.048f, 1.513f, 0.643f, 1.528f, 1.472f)
                close()
            }
        }
        .build()
        return _memberList!!
    }

private var _memberList: ImageVector? = null
