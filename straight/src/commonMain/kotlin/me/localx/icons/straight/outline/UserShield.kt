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

public val Icons.Outline.UserShield: ImageVector
    get() {
        if (_userShield != null) {
            return _userShield!!
        }
        _userShield = Builder(name = "UserShield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 0.0f)
                curveTo(4.691f, 0.0f, 2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(22.286f, 11.601f)
                lineToRelative(-3.786f, -1.255f)
                lineToRelative(-3.786f, 1.255f)
                curveToRelative(-1.025f, 0.34f, -1.714f, 1.293f, -1.714f, 2.373f)
                verticalLineToRelative(3.426f)
                curveToRelative(0.0f, 3.569f, 3.714f, 5.703f, 4.853f, 6.272f)
                lineToRelative(0.604f, 0.302f)
                lineToRelative(0.627f, -0.252f)
                curveToRelative(1.153f, -0.464f, 4.917f, -2.292f, 4.917f, -6.322f)
                verticalLineToRelative(-3.426f)
                curveToRelative(0.0f, -1.08f, -0.688f, -2.033f, -1.714f, -2.373f)
                close()
                moveTo(22.0f, 17.4f)
                curveToRelative(0.0f, 2.582f, -2.424f, 3.925f, -3.455f, 4.379f)
                curveToRelative(-0.916f, -0.491f, -3.545f, -2.099f, -3.545f, -4.379f)
                verticalLineToRelative(-3.426f)
                curveToRelative(0.0f, -0.216f, 0.138f, -0.407f, 0.343f, -0.475f)
                lineToRelative(3.157f, -1.046f)
                lineToRelative(3.157f, 1.046f)
                curveToRelative(0.205f, 0.068f, 0.343f, 0.259f, 0.343f, 0.475f)
                verticalLineToRelative(3.426f)
                close()
            }
        }
        .build()
        return _userShield!!
    }

private var _userShield: ImageVector? = null
