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

public val Icons.Filled.LinkAlt: ImageVector
    get() {
        if (_linkAlt != null) {
            return _linkAlt!!
        }
        _linkAlt = Builder(name = "LinkAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.834f, 16.169f)
                curveToRelative(-0.557f, -0.557f, -0.975f, -1.207f, -1.281f, -1.901f)
                lineToRelative(1.57f, -1.57f)
                curveToRelative(0.175f, 0.761f, 0.548f, 1.48f, 1.125f, 2.057f)
                curveToRelative(0.803f, 0.803f, 1.87f, 1.245f, 3.005f, 1.245f)
                reflectiveCurveToRelative(2.203f, -0.442f, 3.005f, -1.245f)
                lineToRelative(5.5f, -5.5f)
                curveToRelative(0.803f, -0.803f, 1.245f, -1.87f, 1.245f, -3.005f)
                reflectiveCurveToRelative(-0.442f, -2.203f, -1.245f, -3.005f)
                curveToRelative(-1.657f, -1.657f, -4.352f, -1.657f, -6.01f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.005f, 1.006f)
                curveToRelative(-0.644f, -0.159f, -1.309f, -0.25f, -1.99f, -0.25f)
                curveToRelative(-0.208f, 0.0f, -0.413f, 0.015f, -0.618f, 0.03f)
                lineToRelative(2.199f, -2.199f)
                horizontalLineToRelative(0.0f)
                curveToRelative(2.437f, -2.438f, 6.402f, -2.438f, 8.839f, 0.0f)
                curveToRelative(2.437f, 2.437f, 2.437f, 6.402f, 0.0f, 8.839f)
                lineToRelative(-5.5f, 5.5f)
                curveToRelative(-1.18f, 1.181f, -2.75f, 1.831f, -4.419f, 1.831f)
                reflectiveCurveToRelative(-3.239f, -0.65f, -4.419f, -1.831f)
                close()
                moveTo(0.003f, 17.75f)
                curveToRelative(0.0f, 1.669f, 0.65f, 3.239f, 1.831f, 4.419f)
                curveToRelative(1.18f, 1.181f, 2.749f, 1.831f, 4.419f, 1.831f)
                reflectiveCurveToRelative(3.239f, -0.65f, 4.419f, -1.831f)
                lineToRelative(2.2f, -2.2f)
                curveToRelative(-0.205f, 0.015f, -0.411f, 0.03f, -0.618f, 0.03f)
                curveToRelative(-0.681f, 0.0f, -1.346f, -0.091f, -1.99f, -0.25f)
                lineToRelative(-1.006f, 1.006f)
                curveToRelative(-0.803f, 0.803f, -1.87f, 1.245f, -3.005f, 1.245f)
                reflectiveCurveToRelative(-2.202f, -0.442f, -3.005f, -1.245f)
                reflectiveCurveToRelative(-1.245f, -1.87f, -1.245f, -3.005f)
                reflectiveCurveToRelative(0.442f, -2.203f, 1.245f, -3.005f)
                lineToRelative(5.5f, -5.5f)
                curveToRelative(0.803f, -0.803f, 1.87f, -1.245f, 3.005f, -1.245f)
                reflectiveCurveToRelative(2.202f, 0.442f, 3.004f, 1.244f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.577f, 0.578f, 0.95f, 1.297f, 1.125f, 2.058f)
                lineToRelative(1.57f, -1.57f)
                curveToRelative(-0.306f, -0.694f, -0.724f, -1.344f, -1.281f, -1.901f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.18f, -1.181f, -2.75f, -1.831f, -4.419f, -1.831f)
                reflectiveCurveToRelative(-3.239f, 0.65f, -4.419f, 1.831f)
                lineTo(1.834f, 13.331f)
                curveTo(0.653f, 14.511f, 0.003f, 16.081f, 0.003f, 17.75f)
                close()
            }
        }
        .build()
        return _linkAlt!!
    }

private var _linkAlt: ImageVector? = null
