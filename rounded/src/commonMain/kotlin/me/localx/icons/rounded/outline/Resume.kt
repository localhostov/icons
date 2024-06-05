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

public val Icons.Outline.Resume: ImageVector
    get() {
        if (_resume != null) {
            return _resume!!
        }
        _resume = Builder(name = "Resume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.949f, 5.536f)
                lineToRelative(-3.484f, -3.486f)
                curveToRelative(-1.323f, -1.322f, -3.081f, -2.05f, -4.95f, -2.05f)
                lineTo(7.0f, -0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 10.485f)
                curveToRelative(0.0f, -1.871f, -0.729f, -3.628f, -2.051f, -4.95f)
                close()
                moveTo(18.535f, 6.951f)
                curveToRelative(0.315f, 0.315f, 0.564f, 0.674f, 0.781f, 1.05f)
                horizontalLineToRelative(-4.316f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(14.0f, 2.684f)
                curveToRelative(0.376f, 0.217f, 0.735f, 0.466f, 1.051f, 0.781f)
                lineToRelative(3.484f, 3.486f)
                close()
                moveTo(20.0f, 19.001f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 22.001f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.165f, 0.0f, 0.323f, 0.032f, 0.485f, 0.047f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.953f)
                curveToRelative(0.016f, 0.162f, 0.047f, 0.32f, 0.047f, 0.485f)
                verticalLineToRelative(8.515f)
                close()
                moveTo(18.0f, 18.001f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(7.0f, 19.001f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(7.0f, 9.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(6.441f, 14.794f)
                curveToRelative(-0.438f, -0.335f, -0.521f, -0.963f, -0.186f, -1.402f)
                curveToRelative(0.109f, -0.143f, 1.113f, -1.392f, 2.77f, -1.392f)
                reflectiveCurveToRelative(2.659f, 1.25f, 2.769f, 1.392f)
                curveToRelative(0.336f, 0.438f, 0.253f, 1.066f, -0.186f, 1.402f)
                curveToRelative(-0.182f, 0.139f, -0.396f, 0.206f, -0.607f, 0.206f)
                curveToRelative(-0.301f, 0.0f, -0.598f, -0.135f, -0.795f, -0.392f)
                curveToRelative(0.0f, 0.0f, -0.497f, -0.608f, -1.181f, -0.608f)
                reflectiveCurveToRelative(-1.177f, 0.602f, -1.182f, 0.608f)
                curveToRelative(-0.336f, 0.439f, -0.962f, 0.523f, -1.402f, 0.186f)
                close()
            }
        }
        .build()
        return _resume!!
    }

private var _resume: ImageVector? = null
