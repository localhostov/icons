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

public val Icons.Outline.Z: ImageVector
    get() {
        if (_z != null) {
            return _z!!
        }
        _z = Builder(name = "Z", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 24.0f)
                horizontalLineTo(4.388f)
                curveToRelative(-0.976f, 0.0f, -1.847f, -0.583f, -2.221f, -1.484f)
                curveToRelative(-0.373f, -0.901f, -0.168f, -1.929f, 0.521f, -2.618f)
                lineTo(19.897f, 2.688f)
                curveToRelative(0.166f, -0.166f, 0.126f, -0.347f, 0.087f, -0.439f)
                reflectiveCurveToRelative(-0.138f, -0.249f, -0.373f, -0.249f)
                horizontalLineTo(2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(19.612f)
                curveToRelative(0.976f, 0.0f, 1.847f, 0.583f, 2.221f, 1.484f)
                curveToRelative(0.373f, 0.901f, 0.168f, 1.929f, -0.521f, 2.618f)
                lineTo(4.103f, 21.312f)
                curveToRelative(-0.166f, 0.166f, -0.126f, 0.347f, -0.087f, 0.439f)
                reflectiveCurveToRelative(0.138f, 0.249f, 0.373f, 0.249f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _z!!
    }

private var _z: ImageVector? = null
