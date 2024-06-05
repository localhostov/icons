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

public val Icons.Filled.MortarPestle: ImageVector
    get() {
        if (_mortarPestle != null) {
            return _mortarPestle!!
        }
        _mortarPestle = Builder(name = "MortarPestle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.281f, -0.301f, -0.727f, -0.639f, -1.0f)
                horizontalLineToRelative(13.286f)
                curveToRelative(-0.365f, 0.302f, -0.647f, 0.73f, -0.647f, 1.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(3.038f, 18.0f)
                horizontalLineToRelative(17.934f)
                curveToRelative(1.462f, -1.552f, 2.504f, -3.384f, 2.945f, -5.282f)
                curveToRelative(0.213f, -0.915f, 0.002f, -1.859f, -0.578f, -2.589f)
                curveToRelative(-0.569f, -0.717f, -1.422f, -1.128f, -2.339f, -1.128f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.917f, 0.0f, -1.77f, 0.411f, -2.339f, 1.128f)
                curveToRelative(-0.58f, 0.73f, -0.791f, 1.674f, -0.578f, 2.59f)
                curveToRelative(0.439f, 1.891f, 1.476f, 3.718f, 2.955f, 5.282f)
                close()
                moveTo(23.268f, 4.268f)
                lineToRelative(-3.307f, 2.732f)
                horizontalLineToRelative(-5.406f)
                lineTo(19.732f, 0.732f)
                curveToRelative(0.976f, -0.976f, 2.559f, -0.976f, 3.536f, 0.0f)
                reflectiveCurveToRelative(0.976f, 2.559f, 0.0f, 3.536f)
                close()
            }
        }
        .build()
        return _mortarPestle!!
    }

private var _mortarPestle: ImageVector? = null
