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
                horizontalLineToRelative(-3.562f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.199f)
                verticalLineToRelative(-4.125f)
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
                moveTo(21.5f, 7.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.2f)
                lineTo(19.3f, 7.0f)
                horizontalLineToRelative(2.2f)
                close()
                moveTo(6.903f, 11.723f)
                lineToRelative(2.746f, 6.277f)
                horizontalLineToRelative(-2.417f)
                lineToRelative(-2.19f, -4.858f)
                horizontalLineToRelative(-0.842f)
                verticalLineToRelative(4.858f)
                horizontalLineToRelative(-2.199f)
                lineTo(2.001f, 7.0f)
                horizontalLineToRelative(2.199f)
                verticalLineToRelative(3.942f)
                horizontalLineToRelative(0.487f)
                lineToRelative(2.317f, -3.942f)
                horizontalLineToRelative(2.559f)
                lineToRelative(-2.66f, 4.723f)
                close()
            }
        }
        .build()
        return _kpi!!
    }

private var _kpi: ImageVector? = null
