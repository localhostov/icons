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
                moveTo(23.341f, 8.0f)
                curveToRelative(0.454f, 0.0f, 0.76f, -0.444f, 0.628f, -0.878f)
                curveToRelative(-0.376f, -1.228f, -1.518f, -2.122f, -2.869f, -2.122f)
                horizontalLineToRelative(-1.169f)
                curveToRelative(0.041f, 0.328f, 0.069f, 0.661f, 0.069f, 1.0f)
                curveToRelative(0.0f, 0.692f, -0.097f, 1.36f, -0.262f, 2.0f)
                horizontalLineToRelative(3.603f)
                close()
                moveTo(4.069f, 5.0f)
                horizontalLineToRelative(-1.154f)
                curveTo(1.533f, 5.0f, 0.368f, 5.935f, 0.021f, 7.208f)
                curveToRelative(-0.11f, 0.403f, 0.229f, 0.792f, 0.647f, 0.792f)
                horizontalLineToRelative(3.594f)
                curveToRelative(-0.165f, -0.64f, -0.262f, -1.308f, -0.262f, -2.0f)
                curveToRelative(0.0f, -0.339f, 0.028f, -0.672f, 0.069f, -1.0f)
                close()
                moveTo(23.0f, 23.407f)
                verticalLineToRelative(0.593f)
                lineTo(6.538f, 24.0f)
                lineToRelative(-1.821f, -1.628f)
                curveToRelative(-0.917f, -0.858f, -0.96f, -2.307f, -0.098f, -3.23f)
                curveToRelative(0.861f, -0.922f, 2.313f, -0.97f, 3.235f, -0.109f)
                curveToRelative(0.034f, 0.032f, 1.069f, 0.898f, 2.145f, 1.784f)
                verticalLineToRelative(-9.817f)
                curveToRelative(0.0f, -1.215f, 1.083f, -2.176f, 2.336f, -1.973f)
                curveToRelative(0.983f, 0.16f, 1.664f, 1.083f, 1.664f, 2.08f)
                verticalLineToRelative(5.355f)
                lineToRelative(5.829f, 2.292f)
                curveToRelative(1.913f, 0.752f, 3.171f, 2.598f, 3.171f, 4.653f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                curveToRelative(0.0f, 1.796f, 0.8f, 3.401f, 2.054f, 4.501f)
                curveToRelative(0.124f, -0.984f, 0.588f, -1.897f, 1.355f, -2.548f)
                curveToRelative(0.896f, -0.761f, 2.078f, -1.088f, 3.248f, -0.899f)
                curveToRelative(1.709f, 0.278f, 3.033f, 1.711f, 3.289f, 3.447f)
                curveToRelative(1.254f, -1.1f, 2.054f, -2.705f, 2.054f, -4.5f)
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
