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

public val Icons.Bold.PointOfSaleBill: ImageVector
    get() {
        if (_pointOfSaleBill != null) {
            return _pointOfSaleBill!!
        }
        _pointOfSaleBill = Builder(name = "PointOfSaleBill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 6.75f)
                verticalLineToRelative(11.732f)
                lineToRelative(-3.607f, -2.192f)
                lineToRelative(-2.217f, 1.541f)
                lineToRelative(-1.176f, -0.818f)
                verticalLineToRelative(-3.654f)
                lineToRelative(1.176f, 0.818f)
                lineToRelative(2.107f, -1.465f)
                lineToRelative(0.717f, 0.437f)
                verticalLineToRelative(-6.398f)
                curveToRelative(0.0f, -2.067f, -1.683f, -3.75f, -3.75f, -3.75f)
                curveToRelative(-1.722f, 0.0f, -3.162f, 1.174f, -3.6f, 2.759f)
                curveToRelative(0.816f, 0.641f, 1.35f, 1.625f, 1.35f, 2.741f)
                verticalLineToRelative(15.5f)
                lineTo(0.0f, 24.001f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0.0f, -1.185f, 0.596f, -2.231f, 1.5f, -2.865f)
                verticalLineToRelative(-0.135f)
                curveTo(1.5f, 2.468f, 3.968f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(10.25f)
                curveToRelative(3.722f, 0.0f, 6.75f, 3.028f, 6.75f, 6.75f)
                close()
                moveTo(4.551f, 5.0f)
                horizontalLineToRelative(6.188f)
                curveToRelative(0.194f, -0.72f, 0.498f, -1.396f, 0.903f, -2.0f)
                horizontalLineToRelative(-4.641f)
                curveToRelative(-1.208f, 0.0f, -2.217f, 0.86f, -2.449f, 2.0f)
                close()
                moveTo(12.0f, 8.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 8.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-12.5f)
                close()
            }
        }
        .build()
        return _pointOfSaleBill!!
    }

private var _pointOfSaleBill: ImageVector? = null
