package me.localx.icons.straight.filled

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

public val Icons.Filled.Kpi: ImageVector
    get() {
        if (_kpi != null) {
            return _kpi!!
        }
        _kpi = Builder(name = "Kpi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 7.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.567f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(14.5f, 12.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.903f, 11.723f)
                lineToRelative(2.746f, 6.277f)
                horizontalLineToRelative(-2.242f)
                lineToRelative(-2.254f, -5.0f)
                horizontalLineToRelative(-1.153f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(0.829f)
                lineToRelative(2.351f, -4.0f)
                horizontalLineToRelative(2.383f)
                lineToRelative(-2.66f, 4.723f)
                close()
            }
        }
        .build()
        return _kpi!!
    }

private var _kpi: ImageVector? = null
