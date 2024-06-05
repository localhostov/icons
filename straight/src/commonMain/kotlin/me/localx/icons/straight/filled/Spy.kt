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

public val Icons.Filled.Spy: ImageVector
    get() {
        if (_spy != null) {
            return _spy!!
        }
        _spy = Builder(name = "Spy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.887f, 15.119f)
                lineToRelative(6.113f, 7.633f)
                verticalLineToRelative(1.249f)
                lineTo(3.0f, 24.001f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.574f, 0.746f, -2.964f, 1.887f, -3.881f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(-2.405f)
                curveToRelative(-0.573f, -1.817f, -1.709f, -4.0f, -3.095f, -4.0f)
                curveToRelative(-0.978f, 0.0f, -1.857f, 0.578f, -2.5f, 1.128f)
                curveToRelative(-0.643f, -0.55f, -1.522f, -1.128f, -2.5f, -1.128f)
                curveToRelative(-1.386f, 0.0f, -2.522f, 2.183f, -3.095f, 4.0f)
                horizontalLineToRelative(-2.405f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.113f, 15.119f)
                lineToRelative(-6.113f, 7.633f)
                verticalLineToRelative(1.249f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.574f, -0.746f, -2.964f, -1.887f, -3.881f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-3.824f, -5.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-2.676f, -3.5f)
                reflectiveCurveToRelative(0.795f, -0.768f, 2.344f, -1.453f)
                curveToRelative(-0.367f, -0.621f, -0.63f, -1.309f, -0.754f, -2.047f)
                horizontalLineToRelative(11.82f)
                curveToRelative(-0.124f, 0.738f, -0.388f, 1.426f, -0.754f, 2.047f)
                curveToRelative(1.549f, 0.685f, 2.344f, 1.453f, 2.344f, 1.453f)
                lineToRelative(-2.676f, 3.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-3.824f, 5.0f)
                close()
                moveTo(14.026f, 15.0f)
                lineToRelative(1.051f, -2.854f)
                curveToRelative(-0.9f, 0.541f, -1.951f, 0.854f, -3.078f, 0.854f)
                reflectiveCurveToRelative(-2.178f, -0.313f, -3.078f, -0.854f)
                lineToRelative(1.051f, 2.854f)
                horizontalLineToRelative(4.053f)
                close()
            }
        }
        .build()
        return _spy!!
    }

private var _spy: ImageVector? = null
