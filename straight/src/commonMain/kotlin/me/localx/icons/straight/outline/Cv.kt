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

public val Icons.Outline.Cv: ImageVector
    get() {
        if (_cv != null) {
            return _cv!!
        }
        _cv = Builder(name = "Cv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 0.0f)
                verticalLineToRelative(21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(9.414f)
                lineToRelative(7.586f, -7.586f)
                lineTo(22.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                close()
                moveTo(15.0f, 20.586f)
                verticalLineToRelative(-3.586f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-3.586f, 3.586f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(4.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(12.76f, 10.469f)
                lineToRelative(-1.268f, -6.213f)
                horizontalLineToRelative(1.633f)
                lineToRelative(1.202f, 5.893f)
                curveToRelative(0.013f, 0.065f, 0.031f, 0.117f, 0.05f, 0.159f)
                curveToRelative(0.02f, -0.047f, 0.042f, -0.109f, 0.057f, -0.188f)
                lineToRelative(1.182f, -5.864f)
                horizontalLineToRelative(1.632f)
                lineToRelative(-1.244f, 6.169f)
                curveToRelative(-0.126f, 0.647f, -0.461f, 1.575f, -1.628f, 1.575f)
                reflectiveCurveToRelative(-1.51f, -0.97f, -1.618f, -1.531f)
                close()
                moveTo(6.0f, 9.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
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
                close()
            }
        }
        .build()
        return _cv!!
    }

private var _cv: ImageVector? = null
