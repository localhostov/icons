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
                moveTo(7.9f, 9.0f)
                lineTo(6.375f, 10.219f)
                lineToRelative(1.25f, 1.562f)
                lineTo(11.1f, 9.0f)
                lineTo(7.625f, 6.219f)
                lineTo(6.375f, 7.781f)
                close()
                moveTo(17.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.133f, 4.495f, 5.869f, 4.49f, 6.0f, 0.0f)
                lineTo(15.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.1f, 9.0f)
                lineTo(17.624f, 7.781f)
                lineTo(16.374f, 6.219f)
                lineTo(12.9f, 9.0f)
                lineToRelative(3.476f, 2.781f)
                lineToRelative(1.25f, -1.562f)
                close()
            }
        }
        .build()
        return _grinTongueSquint!!
    }

private var _grinTongueSquint: ImageVector? = null
