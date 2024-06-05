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

public val Icons.Bold.DollyFlatbedEmpty: ImageVector
    get() {
        if (_dollyFlatbedEmpty != null) {
            return _dollyFlatbedEmpty!!
        }
        _dollyFlatbedEmpty = Builder(name = "DollyFlatbedEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
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
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _dollyFlatbedEmpty!!
    }

private var _dollyFlatbedEmpty: ImageVector? = null
