package me.localx.icons.rounded.outline

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

public val Icons.Outline.ChairOffice: ImageVector
    get() {
        if (_chairOffice != null) {
            return _chairOffice!!
        }
        _chairOffice = Builder(name = "ChairOffice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.017f, 0.0f, 0.035f, 0.001f, 0.052f)
                curveToRelative(0.028f, 1.63f, 1.362f, 2.948f, 2.999f, 2.948f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.637f, 0.0f, 2.971f, -1.318f, 2.999f, -2.948f)
                curveToRelative(0.0f, -0.017f, 0.001f, -0.034f, 0.001f, -0.052f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(21.0f, 11.0f)
                verticalLineToRelative(2.172f)
                curveToRelative(-0.313f, -0.111f, -0.649f, -0.172f, -1.0f, -0.172f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(7.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                lineTo(17.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(5.0f, 9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.351f, 0.0f, -0.687f, 0.061f, -1.0f, 0.172f)
                verticalLineToRelative(-2.172f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(20.0f, 17.0f)
                lineTo(4.0f, 17.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(20.0f, 15.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _chairOffice!!
    }

private var _chairOffice: ImageVector? = null
