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

public val Icons.Bold.ChartTreeMap: ImageVector
    get() {
        if (_chartTreeMap != null) {
            return _chartTreeMap!!
        }
        _chartTreeMap = Builder(name = "ChartTreeMap", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                lineTo(13.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(22.0f, 0.0f)
                lineTo(13.0f, 0.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(24.0f, 2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(22.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(11.0f, 16.5f)
                verticalLineToRelative(7.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(7.5f, 13.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8.0f, 16.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 16.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(11.0f, 3.5f)
                verticalLineToRelative(7.5f)
                lineTo(0.0f, 11.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(7.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(5.0f)
                lineTo(8.0f, 3.5f)
                close()
            }
        }
        .build()
        return _chartTreeMap!!
    }

private var _chartTreeMap: ImageVector? = null
