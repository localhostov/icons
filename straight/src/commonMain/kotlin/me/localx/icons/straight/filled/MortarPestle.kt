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
                moveToRelative(19.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.283f, -0.307f, -0.729f, -0.648f, -1.0f)
                horizontalLineToRelative(13.297f)
                curveToRelative(-0.342f, 0.271f, -0.648f, 0.717f, -0.648f, 1.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(0.0f, 9.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.979f, 1.123f, 5.819f, 3.078f, 8.0f)
                horizontalLineToRelative(17.844f)
                curveToRelative(1.955f, -2.181f, 3.078f, -5.021f, 3.078f, -8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(0.0f)
                close()
                moveTo(23.268f, 0.732f)
                curveToRelative(-0.976f, -0.976f, -2.559f, -0.976f, -3.536f, 0.0f)
                lineToRelative(-5.178f, 6.268f)
                horizontalLineToRelative(5.406f)
                lineToRelative(3.307f, -2.732f)
                curveToRelative(0.976f, -0.976f, 0.976f, -2.559f, 0.0f, -3.536f)
                close()
            }
        }
        .build()
        return _mortarPestle!!
    }

private var _mortarPestle: ImageVector? = null
