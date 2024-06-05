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

public val Icons.Outline.PersonCv: ImageVector
    get() {
        if (_personCv != null) {
            return _personCv!!
        }
        _personCv = Builder(name = "PersonCv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(4.5f, 14.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(21.0f, 12.0f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                reflectiveCurveToRelative(-0.9f, 0.404f, -0.9f, 0.9f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.496f, 0.404f, 0.9f, 0.9f, 0.9f)
                reflectiveCurveToRelative(0.9f, -0.404f, 0.9f, -0.9f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(21.006f, 20.425f)
                curveToRelative(-0.126f, 0.647f, -0.635f, 1.575f, -1.628f, 1.575f)
                reflectiveCurveToRelative(-1.51f, -0.97f, -1.618f, -1.531f)
                lineToRelative(-1.268f, -6.213f)
                horizontalLineToRelative(1.633f)
                lineToRelative(1.202f, 5.893f)
                curveToRelative(0.013f, 0.065f, 0.031f, 0.117f, 0.05f, 0.159f)
                curveToRelative(0.02f, -0.047f, 0.042f, -0.109f, 0.057f, -0.188f)
                lineToRelative(1.182f, -5.864f)
                horizontalLineToRelative(1.632f)
                lineToRelative(-1.244f, 6.169f)
                close()
            }
        }
        .build()
        return _personCv!!
    }

private var _personCv: ImageVector? = null
