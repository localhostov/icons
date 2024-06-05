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

public val Icons.Filled.BackUp: ImageVector
    get() {
        if (_backUp != null) {
            return _backUp!!
        }
        _backUp = Builder(name = "BackUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.5f, 16.0f)
                curveToRelative(3.58f, 0.0f, 6.624f, -0.839f, 8.5f, -2.173f)
                verticalLineToRelative(1.74f)
                curveToRelative(0.0f, 1.621f, -3.635f, 3.434f, -8.5f, 3.434f)
                reflectiveCurveTo(0.0f, 17.188f, 0.0f, 15.566f)
                verticalLineToRelative(-1.74f)
                curveToRelative(1.876f, 1.334f, 4.92f, 2.174f, 8.5f, 2.174f)
                close()
                moveTo(0.0f, 18.826f)
                verticalLineToRelative(0.96f)
                curveToRelative(0.0f, 2.767f, 4.276f, 4.214f, 8.5f, 4.214f)
                reflectiveCurveToRelative(8.5f, -1.447f, 8.5f, -4.214f)
                verticalLineToRelative(-0.96f)
                curveToRelative(-1.876f, 1.334f, -4.92f, 2.174f, -8.5f, 2.174f)
                reflectiveCurveToRelative(-6.624f, -0.839f, -8.5f, -2.174f)
                close()
                moveTo(22.0f, 0.0f)
                verticalLineToRelative(1.534f)
                curveToRelative(-1.078f, -0.97f, -2.482f, -1.534f, -4.0f, -1.534f)
                curveToRelative(-2.967f, 0.0f, -5.431f, 2.167f, -5.91f, 5.0f)
                horizontalLineToRelative(2.052f)
                curveToRelative(0.447f, -1.72f, 1.999f, -3.0f, 3.858f, -3.0f)
                curveToRelative(1.0f, 0.0f, 1.928f, 0.367f, 2.644f, 1.0f)
                horizontalLineToRelative(-1.644f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(-0.994f, 0.0f, -1.929f, -0.368f, -2.646f, -1.0f)
                horizontalLineToRelative(1.646f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.531f)
                curveToRelative(1.08f, 0.966f, 2.494f, 1.531f, 4.0f, 1.531f)
                curveToRelative(2.967f, 0.0f, 5.431f, -2.167f, 5.91f, -5.0f)
                horizontalLineToRelative(-2.052f)
                curveToRelative(-0.447f, 1.72f, -1.999f, 3.0f, -3.858f, 3.0f)
                close()
                moveTo(8.5f, 9.0f)
                curveToRelative(0.513f, 0.0f, 1.012f, -0.028f, 1.5f, -0.074f)
                verticalLineToRelative(-2.926f)
                curveToRelative(0.0f, -2.151f, 0.854f, -4.1f, 2.235f, -5.538f)
                curveToRelative(-1.128f, -0.293f, -2.393f, -0.462f, -3.735f, -0.462f)
                curveTo(3.806f, 0.0f, 0.0f, 2.015f, 0.0f, 4.5f)
                reflectiveCurveToRelative(3.806f, 4.5f, 8.5f, 4.5f)
                close()
                moveTo(8.5f, 14.0f)
                curveToRelative(0.516f, 0.0f, 1.015f, -0.024f, 1.5f, -0.063f)
                verticalLineToRelative(-3.003f)
                curveToRelative(-0.489f, 0.04f, -0.987f, 0.066f, -1.5f, 0.066f)
                curveToRelative(-3.58f, 0.0f, -6.624f, -1.004f, -8.5f, -2.6f)
                verticalLineToRelative(2.167f)
                curveToRelative(0.0f, 1.621f, 3.635f, 3.433f, 8.5f, 3.433f)
                close()
            }
        }
        .build()
        return _backUp!!
    }

private var _backUp: ImageVector? = null
