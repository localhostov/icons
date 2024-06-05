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

public val Icons.Bold.Fog: ImageVector
    get() {
        if (_fog != null) {
            return _fog!!
        }
        _fog = Builder(name = "Fog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 24.0f)
                close()
                moveTo(15.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(19.0f, 21.0f)
                lineTo(15.0f, 21.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                lineTo(19.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                close()
                moveTo(5.0f, 16.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 19.0f)
                lineTo(9.0f, 16.0f)
                close()
                moveTo(24.0f, 12.478f)
                arcTo(7.411f, 7.411f, 0.0f, false, false, 17.584f, 5.1f)
                arcTo(8.294f, 8.294f, 0.0f, false, false, 10.091f, 0.0f)
                arcTo(7.96f, 7.96f, 0.0f, false, false, 2.0f, 8.0f)
                arcToRelative(11.943f, 11.943f, 0.0f, false, false, 0.133f, 1.893f)
                arcTo(5.768f, 5.768f, 0.0f, false, false, 0.0f, 14.387f)
                lineTo(0.005f, 14.387f)
                curveToRelative(0.0f, 0.037f, 0.0f, 0.075f, 0.0f, 0.113f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, 5.158f)
                lineTo(3.005f, 14.5f)
                curveToRelative(0.0f, -0.038f, 0.0f, -0.076f, 0.0f, -0.113f)
                lineTo(3.0f, 14.387f)
                arcTo(2.787f, 2.787f, 0.0f, false, true, 4.527f, 11.9f)
                lineToRelative(1.2f, -0.613f)
                lineToRelative(-0.48f, -1.258f)
                arcTo(5.955f, 5.955f, 0.0f, false, true, 5.0f, 8.0f)
                arcToRelative(4.935f, 4.935f, 0.0f, false, true, 5.091f, -5.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 4.971f, 3.927f)
                lineToRelative(0.308f, 1.038f)
                lineTo(16.452f, 8.0f)
                arcTo(4.517f, 4.517f, 0.0f, false, true, 21.0f, 12.478f)
                horizontalLineToRelative(0.0f)
                lineTo(21.0f, 18.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, -6.2f)
                verticalLineToRelative(-0.022f)
                close()
            }
        }
        .build()
        return _fog!!
    }

private var _fog: ImageVector? = null
