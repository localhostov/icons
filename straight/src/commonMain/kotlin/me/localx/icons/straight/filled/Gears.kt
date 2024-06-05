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

public val Icons.Filled.Gears: ImageVector
    get() {
        if (_gears != null) {
            return _gears!!
        }
        _gears = Builder(name = "Gears", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.73f, 10.3f)
                lineToRelative(1.84f, 1.06f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-1.84f, -1.06f)
                curveToRelative(0.17f, -0.5f, 0.28f, -1.02f, 0.28f, -1.57f)
                reflectiveCurveToRelative(-0.11f, -1.07f, -0.28f, -1.57f)
                lineToRelative(1.84f, -1.06f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.84f, 1.06f)
                curveToRelative(-0.71f, -0.8f, -1.65f, -1.38f, -2.73f, -1.6f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 2.1f)
                curveToRelative(-1.08f, 0.22f, -2.02f, 0.8f, -2.73f, 1.6f)
                lineToRelative(-1.84f, -1.06f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(1.84f, 1.06f)
                curveToRelative(-0.17f, 0.5f, -0.28f, 1.02f, -0.28f, 1.57f)
                reflectiveCurveToRelative(0.11f, 1.07f, 0.28f, 1.57f)
                lineToRelative(-1.84f, 1.06f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(1.84f, -1.06f)
                curveToRelative(0.71f, 0.8f, 1.65f, 1.38f, 2.73f, 1.6f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.1f)
                curveToRelative(1.08f, -0.22f, 2.02f, -0.8f, 2.73f, -1.6f)
                close()
                moveTo(5.5f, 7.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -0.55f, -0.11f, -1.07f, -0.28f, -1.57f)
                lineToRelative(1.84f, -1.06f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.84f, 1.06f)
                curveToRelative(-0.71f, -0.8f, -1.65f, -1.38f, -2.73f, -1.6f)
                verticalLineToRelative(-2.1f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.1f)
                curveToRelative(-1.08f, 0.22f, -2.02f, 0.8f, -2.73f, 1.6f)
                lineToRelative(-1.84f, -1.06f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(1.84f, 1.06f)
                curveToRelative(-0.17f, 0.5f, -0.28f, 1.02f, -0.28f, 1.57f)
                reflectiveCurveToRelative(0.11f, 1.07f, 0.28f, 1.57f)
                lineToRelative(-1.84f, 1.06f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(1.84f, -1.06f)
                curveToRelative(0.71f, 0.8f, 1.65f, 1.38f, 2.73f, 1.6f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.1f)
                curveToRelative(1.08f, -0.22f, 2.02f, -0.8f, 2.73f, -1.6f)
                lineToRelative(1.84f, 1.06f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-1.84f, -1.06f)
                curveToRelative(0.17f, -0.5f, 0.28f, -1.02f, 0.28f, -1.57f)
                close()
                moveTo(17.0f, 18.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _gears!!
    }

private var _gears: ImageVector? = null
