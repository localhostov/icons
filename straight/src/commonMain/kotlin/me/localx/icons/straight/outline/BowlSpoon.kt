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

public val Icons.Outline.BowlSpoon: ImageVector
    get() {
        if (_bowlSpoon != null) {
            return _bowlSpoon!!
        }
        _bowlSpoon = Builder(name = "BowlSpoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.409f, 3.0f)
                curveToRelative(-0.473f, -1.724f, -2.139f, -3.0f, -4.116f, -3.0f)
                curveTo(4.132f, 0.0f, 0.0f, 1.558f, 0.0f, 4.0f)
                reflectiveCurveToRelative(4.132f, 4.0f, 6.293f, 4.0f)
                curveToRelative(1.977f, 0.0f, 3.643f, -1.276f, 4.116f, -3.0f)
                horizontalLineToRelative(13.634f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-13.634f)
                close()
                moveTo(6.293f, 6.0f)
                curveToRelative(-1.727f, 0.0f, -4.293f, -1.312f, -4.293f, -2.0f)
                reflectiveCurveToRelative(2.566f, -2.0f, 4.293f, -2.0f)
                curveToRelative(1.241f, 0.0f, 2.25f, 0.897f, 2.25f, 2.0f)
                reflectiveCurveToRelative(-1.009f, 2.0f, -2.25f, 2.0f)
                close()
                moveTo(20.99f, 11.023f)
                lineTo(3.009f, 11.023f)
                curveToRelative(-0.867f, 0.0f, -1.692f, 0.386f, -2.265f, 1.058f)
                curveToRelative(-0.594f, 0.698f, -0.851f, 1.62f, -0.704f, 2.531f)
                curveToRelative(0.808f, 5.004f, 4.743f, 7.914f, 7.726f, 9.388f)
                horizontalLineToRelative(8.468f)
                curveToRelative(2.982f, -1.474f, 6.917f, -4.384f, 7.725f, -9.388f)
                curveToRelative(0.147f, -0.91f, -0.109f, -1.833f, -0.704f, -2.53f)
                curveToRelative(-0.573f, -0.673f, -1.398f, -1.059f, -2.265f, -1.059f)
                close()
                moveTo(21.984f, 14.294f)
                curveToRelative(-0.654f, 4.052f, -3.698f, 6.416f, -6.221f, 7.706f)
                horizontalLineToRelative(-7.527f)
                curveToRelative(-2.524f, -1.29f, -5.567f, -3.654f, -6.222f, -7.706f)
                curveToRelative(-0.053f, -0.331f, 0.039f, -0.665f, 0.252f, -0.916f)
                curveToRelative(0.113f, -0.132f, 0.36f, -0.354f, 0.743f, -0.354f)
                horizontalLineToRelative(17.981f)
                curveToRelative(0.383f, 0.0f, 0.629f, 0.223f, 0.742f, 0.355f)
                curveToRelative(0.214f, 0.25f, 0.306f, 0.584f, 0.252f, 0.915f)
                close()
            }
        }
        .build()
        return _bowlSpoon!!
    }

private var _bowlSpoon: ImageVector? = null
