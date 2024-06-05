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

public val Icons.Bold.LaptopMobile: ImageVector
    get() {
        if (_laptopMobile != null) {
            return _laptopMobile!!
        }
        _laptopMobile = Builder(name = "LaptopMobile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 9.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(10.0f)
                lineTo(24.0f, 12.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 12.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(9.23f, 14.0f)
                horizontalLineToRelative(2.77f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 18.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 0.0f)
                lineTo(22.0f, 0.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 13.0f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.92f, 1.0f)
                close()
            }
        }
        .build()
        return _laptopMobile!!
    }

private var _laptopMobile: ImageVector? = null
