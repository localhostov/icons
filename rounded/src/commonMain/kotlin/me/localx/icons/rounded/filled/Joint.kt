package me.localx.icons.rounded.filled

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

public val Icons.Filled.Joint: ImageVector
    get() {
        if (_joint != null) {
            return _joint!!
        }
        _joint = Builder(name = "Joint", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.586f, 23.0f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(-6.0f, -6.0f)
                horizontalLineToRelative(4.172f)
                lineToRelative(6.0f, 6.0f)
                close()
                moveTo(21.5f, 17.0f)
                horizontalLineToRelative(-6.086f)
                lineToRelative(6.0f, 6.0f)
                horizontalLineToRelative(0.086f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.69f, 17.104f)
                curveToRelative(-2.735f, 0.418f, -5.128f, 1.987f, -5.243f, 2.063f)
                curveToRelative(-0.28f, 0.186f, -0.447f, 0.499f, -0.447f, 0.834f)
                reflectiveCurveToRelative(0.169f, 0.648f, 0.449f, 0.833f)
                curveToRelative(0.134f, 0.088f, 3.316f, 2.166f, 6.522f, 2.166f)
                horizontalLineToRelative(4.615f)
                lineToRelative(-5.896f, -5.896f)
                close()
                moveTo(20.0f, 14.0f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0.0f, -1.397f, -0.744f, -2.711f, -1.942f, -3.43f)
                lineToRelative(-1.602f, -0.961f)
                curveToRelative(-0.898f, -0.54f, -1.457f, -1.525f, -1.457f, -2.573f)
                verticalLineToRelative(-1.856f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.856f)
                curveToRelative(0.0f, 1.746f, 0.93f, 3.389f, 2.427f, 4.288f)
                lineToRelative(1.602f, 0.961f)
                curveToRelative(0.599f, 0.359f, 0.971f, 1.016f, 0.971f, 1.715f)
                verticalLineToRelative(2.18f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(24.0f, 12.0f)
                verticalLineToRelative(-1.735f)
                curveToRelative(0.0f, -1.746f, -0.93f, -3.389f, -2.427f, -4.287f)
                lineToRelative(-2.087f, -1.252f)
                curveToRelative(-0.299f, -0.18f, -0.485f, -0.508f, -0.485f, -0.857f)
                lineTo(19.001f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.868f)
                curveToRelative(0.0f, 1.048f, 0.558f, 2.034f, 1.457f, 2.572f)
                lineToRelative(2.087f, 1.252f)
                curveToRelative(0.898f, 0.539f, 1.457f, 1.524f, 1.457f, 2.572f)
                verticalLineToRelative(1.735f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _joint!!
    }

private var _joint: ImageVector? = null
