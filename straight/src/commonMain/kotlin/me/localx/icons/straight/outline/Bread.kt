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

public val Icons.Outline.Bread: ImageVector
    get() {
        if (_bread != null) {
            return _bread!!
        }
        _bread = Builder(name = "Bread", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.028f, 24.0f)
                arcToRelative(6.005f, 6.005f, 0.0f, false, true, -4.387f, -1.641f)
                curveTo(-0.036f, 20.682f, -0.444f, 18.005f, 0.493f, 14.821f)
                arcTo(21.552f, 21.552f, 0.0f, false, true, 6.028f, 6.028f)
                arcTo(21.552f, 21.552f, 0.0f, false, true, 14.821f, 0.493f)
                curveTo(18.0f, -0.445f, 20.682f, -0.036f, 22.359f, 1.641f)
                horizontalLineToRelative(0.0f)
                curveTo(24.036f, 3.318f, 24.444f, 6.0f, 23.507f, 9.179f)
                arcToRelative(21.552f, 21.552f, 0.0f, false, true, -5.535f, 8.793f)
                arcToRelative(21.552f, 21.552f, 0.0f, false, true, -8.793f, 5.535f)
                arcTo(11.207f, 11.207f, 0.0f, false, true, 6.028f, 24.0f)
                close()
                moveTo(17.969f, 2.0f)
                arcToRelative(9.258f, 9.258f, 0.0f, false, false, -2.585f, 0.413f)
                arcTo(19.539f, 19.539f, 0.0f, false, false, 7.442f, 7.442f)
                arcToRelative(19.539f, 19.539f, 0.0f, false, false, -5.031f, 7.942f)
                curveToRelative(-0.721f, 2.451f, -0.492f, 4.426f, 0.644f, 5.561f)
                reflectiveCurveToRelative(3.11f, 1.364f, 5.561f, 0.644f)
                arcToRelative(19.539f, 19.539f, 0.0f, false, false, 7.942f, -5.031f)
                arcToRelative(19.539f, 19.539f, 0.0f, false, false, 5.031f, -7.942f)
                curveToRelative(0.721f, -2.451f, 0.492f, -4.426f, -0.644f, -5.561f)
                horizontalLineToRelative(0.0f)
                arcTo(4.072f, 4.072f, 0.0f, false, false, 17.969f, 2.0f)
                close()
                moveTo(9.0f, 9.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.748f, 3.748f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                arcTo(5.74f, 5.74f, 0.0f, false, false, 9.0f, 9.0f)
                close()
                moveTo(13.0f, 5.0f)
                lineTo(13.0f, 7.0f)
                arcToRelative(3.748f, 3.748f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                arcTo(5.74f, 5.74f, 0.0f, false, false, 13.0f, 5.0f)
                close()
                moveTo(5.0f, 13.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.748f, 3.748f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                arcTo(5.74f, 5.74f, 0.0f, false, false, 5.0f, 13.0f)
                close()
            }
        }
        .build()
        return _bread!!
    }

private var _bread: ImageVector? = null
