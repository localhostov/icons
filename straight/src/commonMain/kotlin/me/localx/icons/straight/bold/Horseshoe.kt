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

public val Icons.Bold.Horseshoe: ImageVector
    get() {
        if (_horseshoe != null) {
            return _horseshoe!!
        }
        _horseshoe = Builder(name = "Horseshoe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                curveTo(23.0f, 4.935f, 18.065f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 3.633f, 1.303f, 7.616f, 2.234f, 10.0f)
                lineTo(1.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(11.0f, 24.0f)
                verticalLineToRelative(-2.71f)
                lineToRelative(-0.058f, -0.202f)
                curveToRelative(-0.02f, -0.068f, -1.942f, -6.84f, -1.942f, -10.088f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 3.248f, -1.923f, 10.02f, -1.942f, 10.088f)
                lineToRelative(-0.058f, 0.202f)
                verticalLineToRelative(2.71f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.234f)
                curveToRelative(0.931f, -2.384f, 2.234f, -6.367f, 2.234f, -10.0f)
                close()
                moveTo(17.553f, 8.735f)
                lineToRelative(1.655f, -1.182f)
                curveToRelative(0.502f, 1.046f, 0.792f, 2.212f, 0.792f, 3.448f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.802f, -0.161f, -1.566f, -0.447f, -2.265f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.236f, 0.29f, -2.402f, 0.792f, -3.448f)
                lineToRelative(1.655f, 1.182f)
                curveToRelative(-0.286f, 0.7f, -0.447f, 1.464f, -0.447f, 2.265f)
                close()
                moveTo(6.475f, 21.0f)
                curveToRelative(-0.573f, -1.345f, -1.651f, -4.115f, -2.175f, -7.0f)
                horizontalLineToRelative(1.978f)
                curveToRelative(0.402f, 2.625f, 1.14f, 5.548f, 1.529f, 7.0f)
                horizontalLineToRelative(-1.333f)
                close()
                moveTo(8.243f, 6.329f)
                lineToRelative(-1.668f, -1.191f)
                curveToRelative(1.078f, -0.998f, 2.426f, -1.706f, 3.926f, -1.992f)
                verticalLineToRelative(2.051f)
                curveToRelative(-0.837f, 0.216f, -1.604f, 0.605f, -2.258f, 1.132f)
                close()
                moveTo(13.501f, 5.197f)
                lineTo(13.501f, 3.146f)
                curveToRelative(1.5f, 0.286f, 2.848f, 0.994f, 3.926f, 1.992f)
                lineToRelative(-1.668f, 1.191f)
                curveToRelative(-0.654f, -0.527f, -1.421f, -0.915f, -2.258f, -1.132f)
                close()
                moveTo(17.723f, 14.0f)
                horizontalLineToRelative(1.977f)
                curveToRelative(-0.524f, 2.881f, -1.602f, 5.654f, -2.174f, 7.0f)
                horizontalLineToRelative(-1.332f)
                curveToRelative(0.389f, -1.452f, 1.127f, -4.375f, 1.529f, -7.0f)
                close()
            }
        }
        .build()
        return _horseshoe!!
    }

private var _horseshoe: ImageVector? = null
