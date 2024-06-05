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

public val Icons.Bold.DollyFlatbedAlt: ImageVector
    get() {
        if (_dollyFlatbedAlt != null) {
            return _dollyFlatbedAlt!!
        }
        _dollyFlatbedAlt = Builder(name = "DollyFlatbedAlt", defaultWidth = 24.0.dp, defaultHeight =
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
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(8.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.94f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(13.94f, 0.0f)
                close()
                moveTo(16.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 2.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _dollyFlatbedAlt!!
    }

private var _dollyFlatbedAlt: ImageVector? = null
