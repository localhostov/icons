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

public val Icons.Outline.HeadVr: ImageVector
    get() {
        if (_headVr != null) {
            return _headVr!!
        }
        _headVr = Builder(name = "HeadVr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                horizontalLineToRelative(-0.773f)
                curveToRelative(-0.16f, -0.234f, -0.304f, -0.431f, -0.427f, -0.581f)
                curveTo(17.363f, 1.164f, 13.486f, -0.451f, 9.453f, 0.106f)
                curveTo(4.457f, 0.793f, 0.501f, 4.946f, 0.046f, 9.982f)
                curveToRelative(-0.25f, 2.77f, 0.536f, 5.501f, 2.215f, 7.691f)
                curveToRelative(0.477f, 0.624f, 0.739f, 1.46f, 0.739f, 2.355f)
                verticalLineToRelative(0.971f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                horizontalLineToRelative(0.494f)
                curveToRelative(2.498f, 0.0f, 4.629f, -1.867f, 4.957f, -4.345f)
                lineToRelative(0.069f, -0.524f)
                curveToRelative(0.072f, -0.547f, -0.312f, -1.05f, -0.86f, -1.122f)
                curveToRelative(-0.548f, -0.074f, -1.05f, 0.313f, -1.122f, 0.86f)
                lineToRelative(-0.069f, 0.523f)
                curveToRelative(-0.197f, 1.486f, -1.476f, 2.607f, -2.975f, 2.607f)
                horizontalLineToRelative(-1.494f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 21.998f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-0.971f)
                curveToRelative(0.0f, -1.332f, -0.409f, -2.601f, -1.151f, -3.571f)
                curveToRelative(-1.372f, -1.791f, -2.016f, -4.027f, -1.811f, -6.296f)
                curveToRelative(0.005f, -0.054f, 0.011f, -0.108f, 0.016f, -0.162f)
                lineTo(10.126f, 9.998f)
                curveToRelative(0.445f, 1.724f, 2.013f, 3.0f, 3.874f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(9.725f, 2.088f)
                curveToRelative(3.032f, -0.42f, 5.947f, 0.656f, 7.967f, 2.912f)
                horizontalLineToRelative(-3.692f)
                curveToRelative(-1.861f, 0.0f, -3.429f, 1.276f, -3.874f, 3.0f)
                lineTo(2.513f, 8.0f)
                curveToRelative(1.101f, -3.097f, 3.872f, -5.453f, 7.211f, -5.912f)
                close()
                moveTo(22.0f, 10.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _headVr!!
    }

private var _headVr: ImageVector? = null
