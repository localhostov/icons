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

public val Icons.Bold.XRay: ImageVector
    get() {
        if (_xRay != null) {
            return _xRay!!
        }
        _xRay = Builder(name = "XRay", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(18.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(23.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(20.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                lineTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(18.0f)
                close()
                moveTo(10.5f, 8.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.41f, 0.0f, 2.536f, 0.0f, 2.541f, 0.0f)
                curveToRelative(1.813f, 0.029f, 2.614f, 2.344f, 1.332f, 3.626f)
                lineToRelative(-1.373f, 1.373f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-1.373f, -1.373f)
                curveToRelative(-1.282f, -1.282f, -0.481f, -3.597f, 1.332f, -3.626f)
                curveToRelative(0.005f, 0.0f, 1.131f, 0.0f, 2.541f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _xRay!!
    }

private var _xRay: ImageVector? = null
