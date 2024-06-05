package me.localx.icons.rounded.outline

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

public val Icons.Outline.CodeFork: ImageVector
    get() {
        if (_codeFork != null) {
            return _codeFork!!
        }
        _codeFork = Builder(name = "CodeFork", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.86f, 1.277f, 3.428f, 3.0f, 3.873f)
                verticalLineToRelative(0.127f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.193f, 0.0f, -2.267f, 0.525f, -3.0f, 1.357f)
                curveToRelative(-0.733f, -0.832f, -1.807f, -1.357f, -3.0f, -1.357f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-0.127f)
                curveToRelative(1.723f, -0.445f, 3.0f, -2.013f, 3.0f, -3.873f)
                curveTo(8.0f, 1.794f, 6.206f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveTo(0.0f, 1.794f, 0.0f, 4.0f)
                curveToRelative(0.0f, 1.86f, 1.277f, 3.428f, 3.0f, 3.873f)
                verticalLineToRelative(0.127f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(1.127f)
                curveToRelative(-1.723f, 0.445f, -3.0f, 2.013f, -3.0f, 3.873f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.86f, -1.277f, -3.428f, -3.0f, -3.873f)
                verticalLineToRelative(-1.127f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-0.127f)
                curveToRelative(1.723f, -0.445f, 3.0f, -2.013f, 3.0f, -3.873f)
                close()
                moveTo(2.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(14.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _codeFork!!
    }

private var _codeFork: ImageVector? = null
