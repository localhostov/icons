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

public val Icons.Outline.ManScientist: ImageVector
    get() {
        if (_manScientist != null) {
            return _manScientist!!
        }
        _manScientist = Builder(name = "ManScientist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(9.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(23.544f, 20.796f)
                lineToRelative(-3.544f, -4.246f)
                verticalLineToRelative(-2.55f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.55f)
                lineToRelative(-3.544f, 4.245f)
                curveToRelative(-0.49f, 0.587f, -0.594f, 1.421f, -0.265f, 2.125f)
                curveToRelative(0.312f, 0.666f, 0.945f, 1.08f, 1.653f, 1.08f)
                horizontalLineToRelative(7.311f)
                curveToRelative(0.708f, 0.0f, 1.342f, -0.414f, 1.653f, -1.08f)
                curveToRelative(0.329f, -0.704f, 0.226f, -1.538f, -0.265f, -2.124f)
                close()
                moveTo(15.056f, 22.0f)
                lineToRelative(3.444f, -4.126f)
                lineToRelative(3.437f, 4.126f)
                horizontalLineToRelative(-6.881f)
                close()
                moveTo(14.0f, 15.371f)
                lineToRelative(-4.98f, 5.719f)
                lineToRelative(-4.445f, -5.06f)
                curveToRelative(-1.453f, 0.207f, -2.574f, 1.46f, -2.574f, 2.97f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(0.452f)
                lineToRelative(3.562f, 4.053f)
                lineToRelative(3.531f, -4.053f)
                horizontalLineToRelative(1.455f)
                verticalLineToRelative(1.371f)
                close()
            }
        }
        .build()
        return _manScientist!!
    }

private var _manScientist: ImageVector? = null
