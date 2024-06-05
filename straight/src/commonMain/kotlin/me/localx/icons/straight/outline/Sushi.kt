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

public val Icons.Outline.Sushi: ImageVector
    get() {
        if (_sushi != null) {
            return _sushi!!
        }
        _sushi = Builder(name = "Sushi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 12.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, true, -4.2f, -1.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, true, 4.2f, -1.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, true, 4.2f, 1.0f)
                arcTo(7.863f, 7.863f, 0.0f, false, true, 8.5f, 12.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.493f, -2.948f, 4.519f, -7.0f, 4.925f)
                lineTo(17.0f, 19.0f)
                curveToRelative(0.0f, 2.8f, -3.733f, 5.0f, -8.5f, 5.0f)
                reflectiveCurveTo(0.0f, 21.8f, 0.0f, 19.0f)
                lineTo(0.0f, 11.0f)
                curveTo(0.0f, 8.5f, 2.973f, 6.48f, 7.0f, 6.075f)
                lineTo(7.0f, 5.0f)
                curveToRelative(0.0f, -2.8f, 3.733f, -5.0f, 8.5f, -5.0f)
                reflectiveCurveTo(24.0f, 2.2f, 24.0f, 5.0f)
                close()
                moveTo(9.0f, 5.0f)
                arcToRelative(1.577f, 1.577f, 0.0f, false, false, 0.451f, 1.03f)
                arcTo(10.678f, 10.678f, 0.0f, false, true, 15.343f, 8.0f)
                lineTo(15.5f, 8.0f)
                curveTo(19.33f, 8.0f, 22.0f, 6.419f, 22.0f, 5.0f)
                reflectiveCurveToRelative(-2.67f, -3.0f, -6.5f, -3.0f)
                reflectiveCurveTo(9.0f, 3.581f, 9.0f, 5.0f)
                close()
                moveTo(2.0f, 11.0f)
                curveToRelative(0.0f, 1.419f, 2.67f, 3.0f, 6.5f, 3.0f)
                reflectiveCurveTo(15.0f, 12.419f, 15.0f, 11.0f)
                reflectiveCurveTo(12.33f, 8.0f, 8.5f, 8.0f)
                reflectiveCurveTo(2.0f, 9.581f, 2.0f, 11.0f)
                close()
                moveTo(15.0f, 19.0f)
                lineTo(15.0f, 14.255f)
                arcTo(11.612f, 11.612f, 0.0f, false, true, 8.5f, 16.0f)
                arcTo(11.612f, 11.612f, 0.0f, false, true, 2.0f, 14.255f)
                lineTo(2.0f, 19.0f)
                curveToRelative(0.0f, 1.419f, 2.67f, 3.0f, 6.5f, 3.0f)
                reflectiveCurveTo(15.0f, 20.419f, 15.0f, 19.0f)
                close()
                moveTo(22.0f, 13.0f)
                lineTo(22.0f, 8.255f)
                arcToRelative(10.866f, 10.866f, 0.0f, false, true, -5.183f, 1.688f)
                arcTo(3.158f, 3.158f, 0.0f, false, true, 17.0f, 11.0f)
                verticalLineToRelative(4.915f)
                curveTo(20.031f, 15.566f, 22.0f, 14.21f, 22.0f, 13.0f)
                close()
                moveTo(19.7f, 5.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, false, -4.2f, -1.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, false, -4.2f, 1.0f)
                arcToRelative(7.863f, 7.863f, 0.0f, false, false, 4.2f, 1.0f)
                arcTo(7.863f, 7.863f, 0.0f, false, false, 19.7f, 5.0f)
                close()
            }
        }
        .build()
        return _sushi!!
    }

private var _sushi: ImageVector? = null
