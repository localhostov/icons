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

public val Icons.Filled.Invite: ImageVector
    get() {
        if (_invite != null) {
            return _invite!!
        }
        _invite = Builder(name = "Invite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 23.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                close()
                moveTo(6.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(17.0f, 15.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.122f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.122f, -2.5f, 2.5f)
                close()
                moveTo(2.0f, 15.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.122f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.122f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _invite!!
    }

private var _invite: ImageVector? = null
