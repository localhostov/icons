package me.localx.icons.rounded.bold

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

public val Icons.Bold.BowlSpoon: ImageVector
    get() {
        if (_bowlSpoon != null) {
            return _bowlSpoon!!
        }
        _bowlSpoon = Builder(name = "BowlSpoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.201f, 12.216f)
                curveToRelative(-0.654f, -0.772f, -1.609f, -1.216f, -2.619f, -1.216f)
                lineTo(3.418f, 11.0f)
                curveToRelative(-1.01f, 0.0f, -1.965f, 0.443f, -2.619f, 1.215f)
                curveToRelative(-0.642f, 0.759f, -0.917f, 1.75f, -0.756f, 2.721f)
                curveToRelative(0.494f, 2.97f, 2.225f, 5.56f, 5.004f, 7.49f)
                curveToRelative(1.481f, 1.03f, 3.293f, 1.574f, 5.239f, 1.574f)
                horizontalLineToRelative(3.427f)
                curveToRelative(1.946f, 0.0f, 3.758f, -0.544f, 5.238f, -1.573f)
                curveToRelative(2.78f, -1.931f, 4.51f, -4.521f, 5.005f, -7.491f)
                curveToRelative(0.162f, -0.971f, -0.114f, -1.962f, -0.756f, -2.72f)
                close()
                moveTo(20.998f, 14.444f)
                curveToRelative(-0.364f, 2.184f, -1.628f, 4.04f, -3.758f, 5.52f)
                curveToRelative(-0.976f, 0.679f, -2.195f, 1.037f, -3.526f, 1.037f)
                horizontalLineToRelative(-3.427f)
                curveToRelative(-1.331f, 0.0f, -2.55f, -0.358f, -3.527f, -1.038f)
                curveToRelative(-2.129f, -1.479f, -3.393f, -3.336f, -3.757f, -5.519f)
                curveToRelative(-0.021f, -0.13f, 0.035f, -0.229f, 0.086f, -0.289f)
                curveToRelative(0.039f, -0.046f, 0.15f, -0.154f, 0.33f, -0.154f)
                horizontalLineToRelative(17.164f)
                curveToRelative(0.18f, 0.0f, 0.291f, 0.108f, 0.33f, 0.154f)
                curveToRelative(0.051f, 0.061f, 0.107f, 0.159f, 0.086f, 0.289f)
                close()
                moveTo(6.457f, 9.045f)
                curveToRelative(1.98f, 0.0f, 3.668f, -1.273f, 4.289f, -3.044f)
                horizontalLineToRelative(11.755f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-11.755f)
                curveTo(10.124f, 1.229f, 8.437f, -0.044f, 6.457f, -0.044f)
                curveTo(4.18f, -0.044f, 0.0f, 1.682f, 0.0f, 4.5f)
                reflectiveCurveToRelative(4.18f, 4.544f, 6.457f, 4.544f)
                close()
                moveTo(6.457f, 2.957f)
                curveToRelative(0.851f, 0.0f, 1.543f, 0.692f, 1.543f, 1.544f)
                reflectiveCurveToRelative(-0.692f, 1.544f, -1.543f, 1.544f)
                curveToRelative(-1.257f, 0.0f, -3.287f, -1.01f, -3.461f, -1.505f)
                curveToRelative(0.174f, -0.573f, 2.204f, -1.583f, 3.461f, -1.583f)
                close()
            }
        }
        .build()
        return _bowlSpoon!!
    }

private var _bowlSpoon: ImageVector? = null
