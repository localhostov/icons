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

public val Icons.Outline.Joint: ImageVector
    get() {
        if (_joint != null) {
            return _joint!!
        }
        _joint = Builder(name = "Joint", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 17.0f)
                lineTo(6.971f, 17.0f)
                curveToRelative(-3.226f, 0.0f, -6.392f, 2.079f, -6.524f, 2.167f)
                curveTo(0.167f, 19.353f, 0.0f, 19.666f, 0.0f, 20.001f)
                reflectiveCurveToRelative(0.169f, 0.648f, 0.449f, 0.833f)
                curveToRelative(0.134f, 0.088f, 3.316f, 2.166f, 6.522f, 2.166f)
                horizontalLineToRelative(14.529f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12.414f, 21.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(4.172f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-4.172f)
                close()
                moveTo(3.094f, 19.997f)
                curveToRelative(1.042f, -0.483f, 2.478f, -0.997f, 3.877f, -0.997f)
                horizontalLineToRelative(0.615f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-2.615f)
                curveToRelative(-1.386f, 0.0f, -2.829f, -0.518f, -3.877f, -1.003f)
                close()
                moveTo(22.0f, 20.5f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.086f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(4.086f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 4.856f)
                verticalLineToRelative(-1.856f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.856f)
                curveToRelative(0.0f, 1.047f, 0.558f, 2.033f, 1.457f, 2.573f)
                lineToRelative(1.602f, 0.961f)
                curveToRelative(1.198f, 0.718f, 1.942f, 2.033f, 1.942f, 3.43f)
                verticalLineToRelative(2.18f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0.0f, -0.699f, -0.372f, -1.355f, -0.971f, -1.715f)
                lineToRelative(-1.602f, -0.961f)
                curveToRelative(-1.497f, -0.899f, -2.427f, -2.542f, -2.427f, -4.288f)
                close()
                moveTo(24.0f, 10.264f)
                verticalLineToRelative(1.735f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.735f)
                curveToRelative(0.0f, -1.048f, -0.558f, -2.033f, -1.457f, -2.572f)
                lineToRelative(-2.087f, -1.252f)
                curveToRelative(-0.898f, -0.539f, -1.457f, -1.524f, -1.457f, -2.572f)
                lineTo(16.999f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.868f)
                curveToRelative(0.0f, 0.349f, 0.186f, 0.678f, 0.485f, 0.857f)
                lineToRelative(2.087f, 1.252f)
                curveToRelative(1.497f, 0.898f, 2.427f, 2.541f, 2.427f, 4.287f)
                close()
            }
        }
        .build()
        return _joint!!
    }

private var _joint: ImageVector? = null
