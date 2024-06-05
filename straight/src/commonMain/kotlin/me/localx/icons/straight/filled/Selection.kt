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

public val Icons.Filled.Selection: ImageVector
    get() {
        if (_selection != null) {
            return _selection!!
        }
        _selection = Builder(name = "Selection", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 2.0f)
                curveTo(19.0f, 0.895f, 19.895f, 0.0f, 21.0f, 0.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(3.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveTo(4.105f, 0.0f, 3.0f, 0.0f)
                reflectiveCurveTo(1.0f, 0.895f, 1.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(22.5f, 5.0f)
                horizontalLineToRelative(-2.569f)
                curveToRelative(0.041f, 0.328f, 0.069f, 0.661f, 0.069f, 1.0f)
                curveToRelative(0.0f, 0.692f, -0.097f, 1.36f, -0.262f, 2.0f)
                horizontalLineToRelative(4.262f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(4.0f, 6.0f)
                curveToRelative(0.0f, -0.339f, 0.028f, -0.672f, 0.069f, -1.0f)
                lineTo(1.5f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.262f)
                curveToRelative(-0.165f, -0.64f, -0.262f, -1.308f, -0.262f, -2.0f)
                close()
                moveTo(14.0f, 11.107f)
                curveToRelative(0.0f, -0.996f, -0.681f, -1.92f, -1.664f, -2.08f)
                curveToRelative(-1.253f, -0.204f, -2.336f, 0.758f, -2.336f, 1.973f)
                verticalLineToRelative(9.817f)
                curveToRelative(-1.076f, -0.886f, -2.111f, -1.752f, -2.145f, -1.784f)
                curveToRelative(-0.922f, -0.861f, -2.373f, -0.813f, -3.235f, 0.109f)
                curveToRelative(-0.863f, 0.923f, -0.819f, 2.372f, 0.098f, 3.23f)
                lineToRelative(1.821f, 1.628f)
                horizontalLineToRelative(16.462f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-9.0f, -3.538f)
                verticalLineToRelative(-5.355f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                curveToRelative(0.0f, 1.788f, 0.787f, 3.396f, 2.032f, 4.496f)
                curveToRelative(0.125f, -0.984f, 0.611f, -1.892f, 1.377f, -2.544f)
                curveToRelative(0.896f, -0.761f, 2.078f, -1.088f, 3.248f, -0.899f)
                curveToRelative(1.713f, 0.279f, 3.046f, 1.714f, 3.3f, 3.454f)
                curveToRelative(1.252f, -1.1f, 2.044f, -2.713f, 2.044f, -4.507f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _selection!!
    }

private var _selection: ImageVector? = null
