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

public val Icons.Filled.Bread: ImageVector
    get() {
        if (_bread != null) {
            return _bread!!
        }
        _bread = Builder(name = "Bread", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.359f, 1.641f)
                curveTo(20.682f, -0.036f, 18.0f, -0.445f, 14.821f, 0.493f)
                arcTo(21.552f, 21.552f, 0.0f, false, false, 6.028f, 6.028f)
                arcTo(21.552f, 21.552f, 0.0f, false, false, 0.493f, 14.821f)
                curveToRelative(-0.937f, 3.184f, -0.529f, 5.861f, 1.148f, 7.538f)
                arcTo(6.005f, 6.005f, 0.0f, false, false, 6.028f, 24.0f)
                arcToRelative(11.207f, 11.207f, 0.0f, false, false, 3.151f, -0.493f)
                arcToRelative(21.552f, 21.552f, 0.0f, false, false, 8.793f, -5.535f)
                arcToRelative(21.552f, 21.552f, 0.0f, false, false, 5.535f, -8.793f)
                curveTo(24.444f, 6.0f, 24.036f, 3.318f, 22.359f, 1.641f)
                close()
                moveTo(9.0f, 19.0f)
                arcToRelative(3.748f, 3.748f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(5.0f, 13.0f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, true, 6.0f, 6.0f)
                close()
                moveTo(13.0f, 15.0f)
                arcToRelative(3.748f, 3.748f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(9.0f, 9.0f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, true, 6.0f, 6.0f)
                close()
                moveTo(17.0f, 11.0f)
                arcToRelative(3.748f, 3.748f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(13.0f, 5.0f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, true, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _bread!!
    }

private var _bread: ImageVector? = null
