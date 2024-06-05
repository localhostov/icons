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

public val Icons.Outline.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.344f, 19.93f)
                curveToRelative(0.687f, -0.15f, 1.3f, -0.538f, 1.738f, -1.114f)
                curveToRelative(0.572f, -0.753f, 0.755f, -1.707f, 0.502f, -2.618f)
                lineToRelative(-2.603f, -9.371f)
                curveTo(19.865f, 2.807f, 16.171f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-2.884f, 0.0f, -5.475f, 1.296f, -7.191f, 3.395f)
                lineTo(1.433f, 0.019f)
                lineTo(0.019f, 1.433f)
                lineToRelative(22.548f, 22.548f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.637f, -2.637f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.276f, 0.0f, 6.177f, 2.205f, 7.054f, 5.361f)
                lineToRelative(2.603f, 9.371f)
                curveToRelative(0.084f, 0.304f, 0.023f, 0.622f, -0.167f, 0.873f)
                reflectiveCurveToRelative(-0.481f, 0.395f, -0.796f, 0.395f)
                horizontalLineToRelative(-1.279f)
                lineTo(6.229f, 4.815f)
                curveToRelative(1.345f, -1.738f, 3.436f, -2.815f, 5.771f, -2.815f)
                close()
                moveTo(3.818f, 18.0f)
                curveToRelative(-0.305f, 0.0f, -0.589f, -0.137f, -0.78f, -0.374f)
                curveToRelative(-0.19f, -0.238f, -0.262f, -0.545f, -0.196f, -0.843f)
                lineToRelative(1.751f, -7.883f)
                lineToRelative(-1.673f, -1.673f)
                curveToRelative(-0.006f, 0.025f, -0.014f, 0.048f, -0.019f, 0.073f)
                lineTo(0.89f, 16.35f)
                curveToRelative(-0.199f, 0.893f, 0.016f, 1.813f, 0.588f, 2.527f)
                reflectiveCurveToRelative(1.425f, 1.123f, 2.34f, 1.123f)
                horizontalLineToRelative(3.608f)
                curveToRelative(0.465f, 2.279f, 2.484f, 4.0f, 4.899f, 4.0f)
                curveToRelative(1.991f, 0.0f, 3.698f, -1.178f, 4.502f, -2.867f)
                lineToRelative(-3.133f, -3.133f)
                lineTo(3.818f, 18.0f)
                close()
                moveTo(12.325f, 22.0f)
                curveToRelative(-1.302f, 0.0f, -2.402f, -0.839f, -2.816f, -2.0f)
                horizontalLineToRelative(5.631f)
                curveToRelative(-0.414f, 1.161f, -1.514f, 2.0f, -2.816f, 2.0f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
