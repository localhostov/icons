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

public val Icons.Bold.UserMdChat: ImageVector
    get() {
        if (_userMdChat != null) {
            return _userMdChat!!
        }
        _userMdChat = Builder(name = "UserMdChat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 11.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -3.032f, 2.468f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.468f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.468f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(11.0f, 8.22f)
                curveToRelative(-0.532f, 0.48f, -1.229f, 0.78f, -2.0f, 0.78f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.853f, 0.0f, 1.62f, 0.362f, 2.167f, 0.936f)
                curveToRelative(0.223f, -1.045f, 0.668f, -2.006f, 1.277f, -2.841f)
                curveToRelative(-0.976f, -0.687f, -2.162f, -1.094f, -3.444f, -1.094f)
                curveTo(5.691f, 0.0f, 3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(0.702f, 0.0f, 1.373f, -0.128f, 2.0f, -0.35f)
                verticalLineToRelative(-3.43f)
                close()
                moveTo(9.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.749f, 2.232f, -4.986f, 4.979f, -4.998f)
                verticalLineToRelative(4.275f)
                curveToRelative(-0.595f, 0.346f, -1.0f, 0.984f, -1.0f, 1.723f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.738f, -0.405f, -1.376f, -1.0f, -1.723f)
                verticalLineToRelative(-4.277f)
                horizontalLineToRelative(4.021f)
                verticalLineToRelative(4.184f)
                curveToRelative(-1.161f, 0.414f, -2.0f, 1.514f, -2.0f, 2.816f)
                close()
                moveTo(14.0f, 14.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.184f)
                curveToRelative(1.161f, 0.414f, 2.0f, 1.514f, 2.0f, 2.816f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _userMdChat!!
    }

private var _userMdChat: ImageVector? = null
