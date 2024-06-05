package me.localx.icons.straight.bold

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

public val Icons.Bold.UnderConstruction: ImageVector
    get() {
        if (_underConstruction != null) {
            return _underConstruction!!
        }
        _underConstruction = Builder(name = "UnderConstruction", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.933f, 9.422f)
                lineTo(14.576f, 1.065f)
                curveToRelative(-1.373f, -1.374f, -3.78f, -1.374f, -5.153f, 0.0f)
                lineTo(1.067f, 9.421f)
                curveToRelative(-0.688f, 0.688f, -1.067f, 1.604f, -1.067f, 2.577f)
                reflectiveCurveToRelative(0.379f, 1.889f, 1.067f, 2.577f)
                lineToRelative(8.356f, 8.358f)
                curveToRelative(0.71f, 0.71f, 1.644f, 1.066f, 2.577f, 1.066f)
                reflectiveCurveToRelative(1.866f, -0.355f, 2.577f, -1.066f)
                lineToRelative(8.356f, -8.357f)
                curveToRelative(1.421f, -1.421f, 1.421f, -3.732f, 0.0f, -5.153f)
                close()
                moveTo(20.812f, 12.454f)
                lineToRelative(-8.356f, 8.357f)
                curveToRelative(-0.251f, 0.251f, -0.66f, 0.251f, -0.911f, 0.0f)
                lineTo(3.188f, 12.453f)
                curveToRelative(-0.164f, -0.164f, -0.188f, -0.355f, -0.188f, -0.455f)
                reflectiveCurveToRelative(0.024f, -0.291f, 0.188f, -0.456f)
                lineTo(11.544f, 3.186f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.162f, -0.162f, 0.354f, -0.186f, 0.455f, -0.186f)
                reflectiveCurveToRelative(0.293f, 0.024f, 0.456f, 0.186f)
                lineToRelative(8.356f, 8.357f)
                curveToRelative(0.251f, 0.251f, 0.251f, 0.66f, 0.0f, 0.911f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.518f, 12.0f)
                horizontalLineToRelative(-5.036f)
                lineToRelative(1.5f, -5.346f)
                curveToRelative(0.199f, -0.436f, 0.609f, -0.654f, 1.018f, -0.654f)
                reflectiveCurveToRelative(0.819f, 0.218f, 1.018f, 0.654f)
                lineToRelative(1.5f, 5.346f)
                close()
            }
        }
        .build()
        return _underConstruction!!
    }

private var _underConstruction: ImageVector? = null
