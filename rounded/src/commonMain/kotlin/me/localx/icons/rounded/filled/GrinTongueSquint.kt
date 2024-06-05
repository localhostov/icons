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

public val Icons.Filled.GrinTongueSquint: ImageVector
    get() {
        if (_grinTongueSquint != null) {
            return _grinTongueSquint!!
        }
        _grinTongueSquint = Builder(name = "GrinTongueSquint", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.6f)
                curveToRelative(-0.062f, 1.839f, -1.938f, 1.837f, -2.0f, 0.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(-3.9f, 23.4f, -3.893f, 0.6f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(7.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.554f, -0.168f)
                lineToRelative(3.0f, -2.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, 0.0f, -1.664f)
                lineToRelative(-3.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.11f, 1.664f)
                lineTo(8.2f, 9.0f)
                lineTo(6.445f, 10.168f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 12.0f)
                close()
                moveTo(17.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(8.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.133f, 4.495f, 5.869f, 4.49f, 6.0f, 0.0f)
                lineTo(15.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 15.0f)
                close()
                moveTo(15.8f, 9.0f)
                lineToRelative(1.752f, -1.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.11f, -1.664f)
                lineToRelative(-3.0f, 2.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, 0.0f, 1.664f)
                lineToRelative(3.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.11f, -1.664f)
                close()
            }
        }
        .build()
        return _grinTongueSquint!!
    }

private var _grinTongueSquint: ImageVector? = null
