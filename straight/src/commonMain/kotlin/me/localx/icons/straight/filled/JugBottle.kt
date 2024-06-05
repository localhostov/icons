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

public val Icons.Filled.JugBottle: ImageVector
    get() {
        if (_jugBottle != null) {
            return _jugBottle!!
        }
        _jugBottle = Builder(name = "JugBottle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.493f, 6.105f)
                lineToRelative(-6.493f, -1.082f)
                verticalLineToRelative(-3.023f)
                horizontalLineToRelative(1.0f)
                lineTo(14.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.178f)
                lineToRelative(-2.053f, 0.77f)
                curveToRelative(-1.165f, 0.437f, -1.947f, 1.565f, -1.947f, 2.809f)
                verticalLineToRelative(15.244f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-14.936f)
                curveToRelative(0.0f, -1.473f, -1.054f, -2.717f, -2.507f, -2.959f)
                close()
                moveTo(17.0f, 9.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }
        .build()
        return _jugBottle!!
    }

private var _jugBottle: ImageVector? = null
