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

public val Icons.Bold.Pie: ImageVector
    get() {
        if (_pie != null) {
            return _pie!!
        }
        _pie = Builder(name = "Pie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.364f, 12.636f)
                arcToRelative(1.243f, 1.243f, 0.0f, false, true, 0.0f, -1.757f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 11.0f, 10.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -0.879f, 2.636f)
                arcTo(1.243f, 1.243f, 0.0f, false, true, 8.364f, 12.636f)
                close()
                moveTo(15.636f, 12.636f)
                arcToRelative(1.243f, 1.243f, 0.0f, false, false, 0.0f, -1.757f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 13.0f, 10.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 0.879f, 2.636f)
                arcTo(1.243f, 1.243f, 0.0f, false, false, 15.636f, 12.636f)
                close()
                moveTo(22.318f, 17.531f)
                lineTo(21.555f, 21.211f)
                arcTo(3.514f, 3.514f, 0.0f, false, true, 18.128f, 24.0f)
                lineTo(5.873f, 24.0f)
                arcToRelative(3.514f, 3.514f, 0.0f, false, true, -3.427f, -2.79f)
                lineToRelative(-0.764f, -3.679f)
                arcTo(3.564f, 3.564f, 0.0f, false, true, 0.0f, 14.5f)
                curveTo(0.0f, 10.569f, 5.242f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(12.0f, 4.569f, 12.0f, 8.5f)
                arcTo(3.564f, 3.564f, 0.0f, false, true, 22.318f, 17.531f)
                close()
                moveTo(3.0f, 14.5f)
                curveToRelative(0.022f, 0.5f, 0.276f, 0.5f, 0.5f, 0.5f)
                lineTo(6.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.224f, 0.0f, 0.478f, 0.0f, 0.5f, -0.529f)
                curveTo(21.0f, 12.611f, 17.5f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(3.0f, 12.611f, 3.0f, 14.5f)
                close()
                moveTo(18.617f, 20.6f)
                lineTo(19.073f, 18.4f)
                arcTo(3.908f, 3.908f, 0.0f, false, true, 14.5f, 18.1f)
                arcToRelative(3.912f, 3.912f, 0.0f, false, true, -5.0f, 0.0f)
                arcToRelative(3.907f, 3.907f, 0.0f, false, true, -4.572f, 0.307f)
                lineToRelative(0.456f, 2.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.489f, 0.4f)
                lineTo(18.128f, 21.007f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 18.617f, 20.6f)
                close()
                moveTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 0.0f)
                lineTo(16.0f, 0.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                lineTo(5.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _pie!!
    }

private var _pie: ImageVector? = null
