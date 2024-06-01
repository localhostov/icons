package me.localx.icons.rounded.outline

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

public val Icons.Outline.ArrowSmallDown: ImageVector
    get() {
        if (_arrowSmallDown != null) {
            return _arrowSmallDown!!
        }
        _arrowSmallDown = Builder(name = "ArrowSmallDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7099f, 12.71f)
                curveTo(17.617f, 12.6163f, 17.5064f, 12.5419f, 17.3845f, 12.4911f)
                curveTo(17.2627f, 12.4403f, 17.1319f, 12.4142f, 16.9999f, 12.4142f)
                curveTo(16.8679f, 12.4142f, 16.7372f, 12.4403f, 16.6154f, 12.4911f)
                curveTo(16.4935f, 12.5419f, 16.3829f, 12.6163f, 16.2899f, 12.71f)
                lineTo(12.9999f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(12.9999f, 5.7348f, 12.8946f, 5.4804f, 12.707f, 5.2929f)
                curveTo(12.5195f, 5.1054f, 12.2652f, 5.0f, 11.9999f, 5.0f)
                curveTo(11.7347f, 5.0f, 11.4804f, 5.1054f, 11.2928f, 5.2929f)
                curveTo(11.1053f, 5.4804f, 10.9999f, 5.7348f, 10.9999f, 6.0f)
                verticalLineTo(16.0f)
                lineTo(7.7099f, 12.71f)
                curveTo(7.617f, 12.6163f, 7.5064f, 12.5419f, 7.3845f, 12.4911f)
                curveTo(7.2627f, 12.4403f, 7.1319f, 12.4142f, 6.9999f, 12.4142f)
                curveTo(6.8679f, 12.4142f, 6.7372f, 12.4403f, 6.6154f, 12.4911f)
                curveTo(6.4935f, 12.5419f, 6.3829f, 12.6163f, 6.2899f, 12.71f)
                curveTo(6.1037f, 12.8974f, 5.9991f, 13.1508f, 5.9991f, 13.415f)
                curveTo(5.9991f, 13.6792f, 6.1037f, 13.9326f, 6.2899f, 14.12f)
                lineTo(10.5899f, 18.41f)
                curveTo(10.9633f, 18.7856f, 11.4704f, 18.9978f, 11.9999f, 19.0f)
                curveTo(12.526f, 18.9951f, 13.029f, 18.7832f, 13.3999f, 18.41f)
                lineTo(17.6999f, 14.12f)
                curveTo(17.8875f, 13.934f, 17.9939f, 13.6813f, 17.9957f, 13.4171f)
                curveTo(17.9976f, 13.1529f, 17.8949f, 12.8987f, 17.7099f, 12.71f)
                close()
            }
        }
        .build()
        return _arrowSmallDown!!
    }

private var _arrowSmallDown: ImageVector? = null
