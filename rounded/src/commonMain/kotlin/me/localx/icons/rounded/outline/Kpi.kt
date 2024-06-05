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

public val Icons.Outline.Kpi: ImageVector
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
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.302f)
                curveToRelative(1.895f, 0.0f, 3.594f, -1.419f, 3.693f, -3.312f)
                curveToRelative(0.106f, -2.018f, -1.5f, -3.688f, -3.495f, -3.688f)
                close()
                moveTo(14.5f, 12.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.0f, 8.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(9.017f, 16.556f)
                curveToRelative(0.298f, 0.681f, -0.201f, 1.444f, -0.944f, 1.444f)
                curveToRelative(-0.405f, 0.0f, -0.773f, -0.238f, -0.94f, -0.607f)
                lineToRelative(-1.981f, -4.393f)
                horizontalLineToRelative(-1.153f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.829f)
                lineToRelative(2.048f, -3.485f)
                curveToRelative(0.187f, -0.319f, 0.53f, -0.515f, 0.9f, -0.515f)
                curveToRelative(0.799f, 0.0f, 1.301f, 0.86f, 0.909f, 1.556f)
                lineToRelative(-1.783f, 3.167f)
                lineToRelative(2.114f, 4.834f)
                close()
            }
        }
        .build()
        return _kpi!!
    }

private var _kpi: ImageVector? = null
