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

public val Icons.Outline.StreetView: ImageVector
    get() {
        if (_streetView != null) {
            return _streetView!!
        }
        _streetView = Builder(name = "StreetView", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(9.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(18.0f, 15.545f)
                verticalLineToRelative(2.036f)
                curveToRelative(2.648f, 0.579f, 4.0f, 1.448f, 4.0f, 1.919f)
                curveToRelative(0.0f, 0.748f, -3.402f, 2.5f, -10.0f, 2.5f)
                reflectiveCurveToRelative(-10.0f, -1.752f, -10.0f, -2.5f)
                curveToRelative(0.0f, -0.471f, 1.352f, -1.34f, 4.0f, -1.919f)
                verticalLineToRelative(-2.036f)
                curveToRelative(-3.398f, 0.666f, -6.0f, 1.957f, -6.0f, 3.955f)
                curveToRelative(0.0f, 3.092f, 6.221f, 4.5f, 12.0f, 4.5f)
                reflectiveCurveToRelative(12.0f, -1.408f, 12.0f, -4.5f)
                curveToRelative(0.0f, -1.998f, -2.602f, -3.289f, -6.0f, -3.955f)
                close()
            }
        }
        .build()
        return _streetView!!
    }

private var _streetView: ImageVector? = null
