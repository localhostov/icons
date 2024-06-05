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

public val Icons.Bold.Spy: ImageVector
    get() {
        if (_spy != null) {
            return _spy!!
        }
        _spy = Builder(name = "Spy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.478f, 14.372f)
                lineToRelative(2.027f, -2.872f)
                reflectiveCurveToRelative(-0.659f, -0.633f, -1.937f, -1.263f)
                curveToRelative(0.279f, -0.692f, 0.437f, -1.446f, 0.437f, -2.237f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.044f)
                curveToRelative(-0.255f, -1.763f, -1.69f, -5.0f, -3.456f, -5.0f)
                curveToRelative(-1.036f, 0.0f, -1.679f, 0.794f, -2.196f, 1.432f)
                curveToRelative(-0.084f, 0.104f, -0.196f, 0.242f, -0.304f, 0.365f)
                curveToRelative(-0.107f, -0.123f, -0.22f, -0.262f, -0.304f, -0.365f)
                curveToRelative(-0.518f, -0.638f, -1.16f, -1.432f, -2.196f, -1.432f)
                curveToRelative(-1.765f, 0.0f, -3.201f, 3.237f, -3.456f, 5.0f)
                horizontalLineToRelative(-2.044f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.791f, 0.158f, 1.545f, 0.437f, 2.238f)
                curveToRelative(-1.278f, 0.629f, -1.937f, 1.262f, -1.937f, 1.262f)
                lineToRelative(2.027f, 2.872f)
                curveToRelative(-2.06f, 0.795f, -3.528f, 2.791f, -3.528f, 5.128f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.341f, 1.063f, -2.43f, 2.39f, -2.489f)
                lineToRelative(2.11f, 2.989f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.11f, -2.989f)
                curveToRelative(1.327f, 0.059f, 2.39f, 1.148f, 2.39f, 2.489f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -2.336f, -1.468f, -4.332f, -3.527f, -5.128f)
                close()
                moveTo(10.348f, 16.0f)
                lineToRelative(-0.962f, -2.61f)
                curveToRelative(0.793f, 0.387f, 1.679f, 0.61f, 2.619f, 0.61f)
                reflectiveCurveToRelative(1.827f, -0.224f, 2.62f, -0.611f)
                lineToRelative(-0.962f, 2.611f)
                horizontalLineToRelative(-3.316f)
                close()
                moveTo(15.006f, 8.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _spy!!
    }

private var _spy: ImageVector? = null
