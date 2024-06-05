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
                moveToRelative(8.414f, 17.0f)
                horizontalLineToRelative(4.758f)
                lineToRelative(6.0f, 6.0f)
                horizontalLineToRelative(-4.758f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(5.688f, 17.102f)
                curveToRelative(-2.732f, 0.412f, -5.121f, 1.957f, -5.236f, 2.032f)
                lineToRelative(-0.452f, 0.354f)
                verticalLineToRelative(1.083f)
                lineToRelative(0.455f, 0.295f)
                curveToRelative(0.134f, 0.087f, 3.314f, 2.133f, 6.517f, 2.133f)
                horizontalLineToRelative(4.615f)
                lineToRelative(-5.898f, -5.898f)
                close()
                moveTo(16.0f, 17.0f)
                lineToRelative(6.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(20.0f, 12.82f)
                curveToRelative(0.0f, -1.397f, -0.744f, -2.711f, -1.942f, -3.43f)
                lineToRelative(-1.602f, -0.961f)
                curveToRelative(-0.898f, -0.54f, -1.457f, -1.525f, -1.457f, -2.573f)
                verticalLineToRelative(-2.856f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.856f)
                curveToRelative(0.0f, 1.746f, 0.93f, 3.389f, 2.427f, 4.288f)
                lineToRelative(1.602f, 0.961f)
                curveToRelative(0.599f, 0.359f, 0.971f, 1.016f, 0.971f, 1.715f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.18f)
                close()
                moveTo(24.0f, 11.265f)
                curveToRelative(0.0f, -1.746f, -0.93f, -3.389f, -2.427f, -4.287f)
                lineToRelative(-2.087f, -1.252f)
                curveToRelative(-0.299f, -0.18f, -0.485f, -0.508f, -0.485f, -0.857f)
                lineTo(19.001f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.868f)
                curveToRelative(0.0f, 1.048f, 0.558f, 2.034f, 1.457f, 2.572f)
                lineToRelative(2.087f, 1.252f)
                curveToRelative(0.898f, 0.539f, 1.457f, 1.524f, 1.457f, 2.572f)
                verticalLineToRelative(1.735f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.735f)
                close()
            }
        }
        .build()
        return _joint!!
    }

private var _joint: ImageVector? = null
