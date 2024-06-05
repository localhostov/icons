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

public val Icons.Bold.Z: ImageVector
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
                lineTo(4.842f, 24.0f)
                curveToRelative(-1.153f, 0.0f, -2.183f, -0.688f, -2.624f, -1.753f)
                reflectiveCurveToRelative(-0.199f, -2.279f, 0.616f, -3.094f)
                lineTo(18.773f, 3.0f)
                lineTo(2.0f, 3.0f)
                lineTo(2.0f, 0.0f)
                lineTo(19.158f, 0.0f)
                curveToRelative(1.153f, 0.0f, 2.183f, 0.688f, 2.624f, 1.753f)
                reflectiveCurveToRelative(0.199f, 2.279f, -0.616f, 3.094f)
                lineTo(5.227f, 21.0f)
                lineTo(22.0f, 21.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(4.963f, 21.267f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(19.037f, 2.732f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _z!!
    }

private var _z: ImageVector? = null
