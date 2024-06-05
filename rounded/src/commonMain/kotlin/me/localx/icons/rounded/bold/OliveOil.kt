package me.localx.icons.rounded.bold

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

public val Icons.Bold.OliveOil: ImageVector
    get() {
        if (_oliveOil != null) {
            return _oliveOil!!
        }
        _oliveOil = Builder(name = "OliveOil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 17.5f, 4.0f)
                arcToRelative(4.459f, 4.459f, 0.0f, false, false, -1.5f, 0.267f)
                lineTo(16.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                lineTo(8.0f, 7.5f)
                curveToRelative(0.0f, 0.429f, -1.368f, 1.578f, -2.1f, 2.2f)
                curveTo(4.161f, 11.155f, 2.0f, 12.971f, 2.0f, 15.5f)
                curveToRelative(0.0f, 2.793f, 1.567f, 4.921f, 3.1f, 6.635f)
                arcTo(5.561f, 5.561f, 0.0f, false, false, 9.232f, 24.0f)
                horizontalLineToRelative(5.536f)
                arcToRelative(5.559f, 5.559f, 0.0f, false, false, 4.13f, -1.866f)
                curveTo(20.433f, 20.421f, 22.0f, 18.293f, 22.0f, 15.5f)
                arcToRelative(5.512f, 5.512f, 0.0f, false, false, -1.564f, -3.608f)
                arcTo(4.493f, 4.493f, 0.0f, false, false, 22.0f, 8.5f)
                close()
                moveTo(17.5f, 7.0f)
                arcToRelative(1.488f, 1.488f, 0.0f, false, true, 0.721f, 2.8f)
                lineTo(18.1f, 9.7f)
                arcTo(13.858f, 13.858f, 0.0f, false, true, 16.166f, 7.85f)
                arcTo(1.493f, 1.493f, 0.0f, false, true, 17.5f, 7.0f)
                close()
                moveTo(7.827f, 11.992f)
                curveTo(9.459f, 10.621f, 11.0f, 9.326f, 11.0f, 7.5f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.826f, 1.541f, 3.121f, 3.173f, 4.492f)
                curveToRelative(0.387f, 0.326f, 0.785f, 0.664f, 1.161f, 1.008f)
                lineTo(6.666f, 13.0f)
                curveTo(7.042f, 12.656f, 7.44f, 12.318f, 7.827f, 11.992f)
                close()
                moveTo(16.664f, 20.133f)
                arcToRelative(2.559f, 2.559f, 0.0f, false, true, -1.9f, 0.867f)
                lineTo(9.232f, 21.0f)
                arcToRelative(2.562f, 2.562f, 0.0f, false, true, -1.9f, -0.866f)
                curveTo(5.87f, 18.5f, 5.173f, 17.257f, 5.03f, 16.0f)
                lineTo(18.97f, 16.0f)
                curveTo(18.827f, 17.257f, 18.13f, 18.5f, 16.664f, 20.133f)
                close()
            }
        }
        .build()
        return _oliveOil!!
    }

private var _oliveOil: ImageVector? = null
