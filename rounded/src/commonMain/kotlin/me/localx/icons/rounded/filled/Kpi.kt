package me.localx.icons.rounded.filled

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
                moveToRelative(14.5f, 9.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(0.0f, -2.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.302f)
                curveToRelative(1.895f, 0.0f, 3.594f, -1.419f, 3.693f, -3.312f)
                curveToRelative(0.106f, -2.018f, -1.5f, -3.688f, -3.495f, -3.688f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(21.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(9.017f, 16.556f)
                lineToRelative(-2.114f, -4.834f)
                lineToRelative(1.783f, -3.167f)
                curveToRelative(0.392f, -0.696f, -0.111f, -1.556f, -0.909f, -1.556f)
                curveToRelative(-0.37f, 0.0f, -0.712f, 0.196f, -0.9f, 0.515f)
                lineToRelative(-2.048f, 3.485f)
                horizontalLineToRelative(-0.829f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.153f)
                lineToRelative(1.981f, 4.393f)
                curveToRelative(0.167f, 0.369f, 0.534f, 0.607f, 0.94f, 0.607f)
                curveToRelative(0.743f, 0.0f, 1.242f, -0.763f, 0.944f, -1.444f)
                close()
            }
        }
        .build()
        return _kpi!!
    }

private var _kpi: ImageVector? = null
