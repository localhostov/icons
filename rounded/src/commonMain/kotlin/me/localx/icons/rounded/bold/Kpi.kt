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

public val Icons.Bold.Kpi: ImageVector
    get() {
        if (_kpi != null) {
            return _kpi!!
        }
        _kpi = Builder(name = "Kpi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.562f, 7.0f)
                horizontalLineToRelative(-2.463f)
                curveToRelative(-0.607f, 0.0f, -1.1f, 0.492f, -1.1f, 1.1f)
                verticalLineToRelative(8.801f)
                curveToRelative(0.0f, 0.607f, 0.492f, 1.1f, 1.1f, 1.1f)
                reflectiveCurveToRelative(1.1f, -0.492f, 1.1f, -1.1f)
                verticalLineToRelative(-3.025f)
                horizontalLineToRelative(1.363f)
                curveToRelative(1.898f, 0.0f, 3.438f, -1.539f, 3.438f, -3.438f)
                reflectiveCurveToRelative(-1.539f, -3.438f, -3.438f, -3.438f)
                close()
                moveTo(14.562f, 11.675f)
                horizontalLineToRelative(-1.362f)
                verticalLineToRelative(-2.475f)
                horizontalLineToRelative(1.362f)
                curveToRelative(0.682f, 0.0f, 1.237f, 0.555f, 1.237f, 1.237f)
                reflectiveCurveToRelative(-0.555f, 1.237f, -1.237f, 1.237f)
                close()
                moveTo(21.5f, 8.1f)
                verticalLineToRelative(8.801f)
                curveToRelative(0.0f, 0.607f, -0.492f, 1.1f, -1.1f, 1.1f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.607f, 0.0f, -1.1f, -0.492f, -1.1f, -1.1f)
                verticalLineToRelative(-8.801f)
                curveToRelative(0.0f, -0.607f, 0.492f, -1.1f, 1.1f, -1.1f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.607f, 0.0f, 1.1f, 0.492f, 1.1f, 1.1f)
                close()
                moveTo(8.975f, 16.46f)
                curveToRelative(0.318f, 0.727f, -0.214f, 1.54f, -1.008f, 1.54f)
                horizontalLineToRelative(-0.025f)
                curveToRelative(-0.432f, 0.0f, -0.825f, -0.253f, -1.003f, -0.648f)
                lineToRelative(-1.898f, -4.21f)
                horizontalLineToRelative(-0.842f)
                verticalLineToRelative(3.758f)
                curveToRelative(0.0f, 0.607f, -0.492f, 1.1f, -1.1f, 1.1f)
                reflectiveCurveToRelative(-1.1f, -0.492f, -1.1f, -1.1f)
                verticalLineToRelative(-8.801f)
                curveToRelative(0.0f, -0.607f, 0.492f, -1.1f, 1.1f, -1.1f)
                reflectiveCurveToRelative(1.1f, 0.492f, 1.1f, 1.1f)
                verticalLineToRelative(2.843f)
                horizontalLineToRelative(0.487f)
                lineToRelative(1.998f, -3.4f)
                curveToRelative(0.198f, -0.336f, 0.558f, -0.542f, 0.948f, -0.542f)
                horizontalLineToRelative(0.048f)
                curveToRelative(0.841f, 0.0f, 1.371f, 0.906f, 0.958f, 1.639f)
                lineToRelative(-1.736f, 3.083f)
                lineToRelative(2.072f, 4.737f)
                close()
            }
        }
        .build()
        return _kpi!!
    }

private var _kpi: ImageVector? = null
