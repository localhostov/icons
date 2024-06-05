package me.localx.icons.straight.outline

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

public val Icons.Outline.BackUp: ImageVector
    get() {
        if (_backUp != null) {
            return _backUp!!
        }
        _backUp = Builder(name = "BackUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.644f)
                curveToRelative(-0.716f, -0.633f, -1.643f, -1.0f, -2.644f, -1.0f)
                curveToRelative(-1.859f, 0.0f, -3.411f, 1.28f, -3.858f, 3.0f)
                horizontalLineToRelative(-2.052f)
                curveToRelative(0.478f, -2.833f, 2.942f, -5.0f, 5.91f, -5.0f)
                curveToRelative(1.518f, 0.0f, 2.922f, 0.564f, 4.0f, 1.534f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(2.0f)
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
                moveTo(15.0f, 13.413f)
                curveToRelative(0.631f, 0.256f, 1.301f, 0.431f, 2.0f, 0.518f)
                verticalLineToRelative(5.855f)
                curveToRelative(0.0f, 2.767f, -4.276f, 4.214f, -8.5f, 4.214f)
                reflectiveCurveTo(0.0f, 22.553f, 0.0f, 19.786f)
                lineTo(0.0f, 4.5f)
                curveToRelative(0.0f, -0.192f, 0.127f, -0.786f, 0.127f, -0.786f)
                curveTo(0.791f, 1.551f, 4.164f, 0.0f, 8.5f, 0.0f)
                curveToRelative(1.368f, 0.0f, 2.635f, 0.159f, 3.757f, 0.438f)
                curveToRelative(-0.51f, 0.526f, -0.951f, 1.12f, -1.302f, 1.77f)
                curveToRelative(-0.738f, -0.129f, -1.558f, -0.208f, -2.455f, -0.208f)
                curveToRelative(-3.968f, 0.0f, -6.5f, 1.48f, -6.5f, 2.5f)
                reflectiveCurveToRelative(2.532f, 2.5f, 6.5f, 2.5f)
                curveToRelative(0.528f, 0.0f, 1.025f, -0.031f, 1.5f, -0.079f)
                verticalLineToRelative(2.004f)
                curveToRelative(-0.486f, 0.044f, -0.982f, 0.075f, -1.5f, 0.075f)
                curveToRelative(-2.665f, 0.0f, -4.965f, -0.588f, -6.5f, -1.541f)
                verticalLineToRelative(2.041f)
                curveToRelative(0.0f, 1.02f, 2.532f, 2.5f, 6.5f, 2.5f)
                curveToRelative(0.527f, 0.0f, 1.026f, -0.028f, 1.5f, -0.075f)
                verticalLineToRelative(2.007f)
                curveToRelative(-0.486f, 0.042f, -0.984f, 0.069f, -1.5f, 0.069f)
                curveToRelative(-2.665f, 0.0f, -4.965f, -0.588f, -6.5f, -1.541f)
                verticalLineToRelative(2.041f)
                curveToRelative(0.0f, 1.02f, 2.532f, 2.5f, 6.5f, 2.5f)
                reflectiveCurveToRelative(6.5f, -1.48f, 6.5f, -2.5f)
                verticalLineToRelative(-1.087f)
                close()
                moveTo(15.0f, 19.786f)
                verticalLineToRelative(-2.327f)
                curveToRelative(-1.535f, 0.954f, -3.835f, 1.541f, -6.5f, 1.541f)
                reflectiveCurveToRelative(-4.965f, -0.588f, -6.5f, -1.541f)
                verticalLineToRelative(2.327f)
                curveToRelative(0.0f, 0.751f, 2.294f, 2.214f, 6.5f, 2.214f)
                reflectiveCurveToRelative(6.5f, -1.463f, 6.5f, -2.214f)
                close()
            }
        }
        .build()
        return _backUp!!
    }

private var _backUp: ImageVector? = null
