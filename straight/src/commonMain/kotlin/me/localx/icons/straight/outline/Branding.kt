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

public val Icons.Outline.Branding: ImageVector
    get() {
        if (_branding != null) {
            return _branding!!
        }
        _branding = Builder(name = "Branding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(11.414f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                lineTo(6.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(4.0f, 13.586f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(10.586f)
                close()
                moveTo(19.414f, 0.0f)
                horizontalLineToRelative(-8.414f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 4.586f)
                lineTo(19.414f, 0.0f)
                close()
                moveTo(19.0f, 2.414f)
                lineToRelative(2.586f, 2.586f)
                horizontalLineToRelative(-2.586f)
                verticalLineToRelative(-2.586f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(17.071f, 15.014f)
                lineToRelative(-2.606f, 2.606f)
                curveToRelative(-0.533f, 0.533f, -1.398f, 0.533f, -1.932f, 0.0f)
                lineToRelative(-2.606f, -2.606f)
                curveToRelative(0.025f, -0.002f, 7.118f, -0.002f, 7.143f, 0.0f)
                close()
                moveTo(9.0f, 22.0f)
                verticalLineToRelative(-5.086f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.636f, 0.636f, 1.48f, 0.986f, 2.38f, 0.986f)
                reflectiveCurveToRelative(1.744f, -0.351f, 2.38f, -0.986f)
                lineToRelative(2.12f, -2.12f)
                verticalLineToRelative(5.086f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _branding!!
    }

private var _branding: ImageVector? = null
