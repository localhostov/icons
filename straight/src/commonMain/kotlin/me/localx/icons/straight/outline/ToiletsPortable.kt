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

public val Icons.Outline.ToiletsPortable: ImageVector
    get() {
        if (_toiletsPortable != null) {
            return _toiletsPortable!!
        }
        _toiletsPortable = Builder(name = "ToiletsPortable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.624f, 2.219f)
                curveTo(23.511f, 2.129f, 20.812f, 0.0f, 17.499f, 0.0f)
                curveTo(15.082f, 0.0f, 12.997f, 1.131f, 11.999f, 1.779f)
                curveTo(11.001f, 1.131f, 8.916f, 0.0f, 6.499f, 0.0f)
                curveTo(3.187f, 0.0f, 0.487f, 2.129f, 0.374f, 2.219f)
                lineTo(0.0f, 2.52f)
                verticalLineToRelative(21.48f)
                lineTo(1.999f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.999f, 2.52f)
                lineToRelative(-0.375f, -0.3f)
                close()
                moveTo(21.999f, 3.515f)
                verticalLineToRelative(1.484f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.486f)
                curveToRelative(0.741f, -0.495f, 2.505f, -1.514f, 4.5f, -1.514f)
                curveToRelative(1.975f, 0.0f, 3.751f, 1.019f, 4.5f, 1.516f)
                close()
                moveTo(6.499f, 1.999f)
                curveToRelative(1.975f, 0.0f, 3.751f, 1.019f, 4.5f, 1.516f)
                verticalLineToRelative(1.484f)
                lineTo(1.999f, 4.999f)
                verticalLineToRelative(-1.487f)
                curveToRelative(0.745f, -0.497f, 2.512f, -1.513f, 4.5f, -1.513f)
                close()
                moveTo(1.999f, 20.0f)
                lineTo(1.999f, 7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                lineTo(1.999f, 20.0f)
                close()
                moveTo(12.999f, 20.0f)
                lineTo(12.999f, 7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _toiletsPortable!!
    }

private var _toiletsPortable: ImageVector? = null
