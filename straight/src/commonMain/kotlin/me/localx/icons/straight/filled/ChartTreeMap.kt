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

public val Icons.Filled.ChartTreeMap: ImageVector
    get() {
        if (_chartTreeMap != null) {
            return _chartTreeMap!!
        }
        _chartTreeMap = Builder(name = "ChartTreeMap", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
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
                moveTo(8.0f, 13.0f)
                lineTo(3.0f, 13.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                lineTo(11.0f, 24.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                lineTo(11.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _chartTreeMap!!
    }

private var _chartTreeMap: ImageVector? = null
