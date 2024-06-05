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

public val Icons.Bold.DollyFlatbed: ImageVector
    get() {
        if (_dollyFlatbed != null) {
            return _dollyFlatbed!!
        }
        _dollyFlatbed = Builder(name = "DollyFlatbed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.5f, 18.0f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.55f)
                curveToRelative(0.033f, 0.162f, 0.05f, 0.329f, 0.05f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.171f, 0.017f, -0.338f, 0.05f, -0.5f)
                horizontalLineToRelative(-5.6f)
                curveToRelative(0.033f, 0.162f, 0.05f, 0.329f, 0.05f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.181f, 0.02f, -0.358f, 0.056f, -0.528f)
                curveToRelative(-1.721f, -0.219f, -3.056f, -1.693f, -3.056f, -3.472f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(9.5f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 6.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 6.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _dollyFlatbed!!
    }

private var _dollyFlatbed: ImageVector? = null
