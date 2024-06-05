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

public val Icons.Outline.BarberPole: ImageVector
    get() {
        if (_barberPole != null) {
            return _barberPole!!
        }
        _barberPole = Builder(name = "BarberPole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 18.0f)
                lineTo(18.0f, 6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.35f)
                curveToRelative(-0.826f, -2.327f, -3.043f, -4.0f, -5.65f, -4.0f)
                reflectiveCurveToRelative(-4.824f, 1.673f, -5.65f, 4.0f)
                horizontalLineToRelative(-0.35f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.35f)
                curveToRelative(0.826f, 2.327f, 3.043f, 4.0f, 5.65f, 4.0f)
                reflectiveCurveToRelative(4.824f, -1.673f, 5.65f, -4.0f)
                horizontalLineToRelative(0.35f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(13.914f, 18.0f)
                lineToRelative(-5.914f, -5.914f)
                verticalLineToRelative(-2.672f)
                lineToRelative(8.0f, 8.0f)
                verticalLineToRelative(0.586f)
                horizontalLineToRelative(-2.086f)
                close()
                moveTo(10.086f, 6.0f)
                lineToRelative(5.914f, 5.914f)
                verticalLineToRelative(2.672f)
                lineTo(8.0f, 6.586f)
                verticalLineToRelative(-0.586f)
                horizontalLineToRelative(2.086f)
                close()
                moveTo(16.0f, 9.086f)
                lineToRelative(-3.086f, -3.086f)
                horizontalLineToRelative(3.086f)
                verticalLineToRelative(3.086f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.474f, 0.0f, 2.75f, 0.81f, 3.444f, 2.0f)
                horizontalLineToRelative(-6.887f)
                curveToRelative(0.694f, -1.19f, 1.97f, -2.0f, 3.444f, -2.0f)
                close()
                moveTo(8.0f, 14.914f)
                lineToRelative(3.086f, 3.086f)
                horizontalLineToRelative(-3.086f)
                verticalLineToRelative(-3.086f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-1.474f, 0.0f, -2.75f, -0.81f, -3.444f, -2.0f)
                horizontalLineToRelative(6.887f)
                curveToRelative(-0.694f, 1.19f, -1.97f, 2.0f, -3.444f, 2.0f)
                close()
            }
        }
        .build()
        return _barberPole!!
    }

private var _barberPole: ImageVector? = null
