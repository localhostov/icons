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

public val Icons.Bold.ChartArea: ImageVector
    get() {
        if (_chartArea != null) {
            return _chartArea!!
        }
        _chartArea = Builder(name = "ChartArea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 21.0f)
                lineTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 20.5f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(24.0f, 8.05f)
                verticalLineToRelative(10.95f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 8.05f)
                lineToRelative(3.025f, -3.024f)
                curveToRelative(1.321f, -1.322f, 3.627f, -1.322f, 4.95f, 0.0f)
                lineToRelative(2.525f, 2.525f)
                lineToRelative(1.525f, -1.525f)
                curveToRelative(1.321f, -1.322f, 3.627f, -1.322f, 4.95f, 0.0f)
                lineToRelative(2.025f, 2.024f)
                close()
                moveTo(21.0f, 9.293f)
                lineToRelative(-1.146f, -1.146f)
                curveToRelative(-0.127f, -0.128f, -0.276f, -0.147f, -0.354f, -0.147f)
                reflectiveCurveToRelative(-0.226f, 0.019f, -0.353f, 0.146f)
                lineToRelative(-3.647f, 3.646f)
                lineToRelative(-4.646f, -4.646f)
                curveToRelative(-0.127f, -0.127f, -0.276f, -0.146f, -0.354f, -0.146f)
                reflectiveCurveToRelative(-0.226f, 0.019f, -0.353f, 0.146f)
                lineToRelative(-2.147f, 2.146f)
                verticalLineToRelative(6.707f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-6.707f)
                close()
            }
        }
        .build()
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
