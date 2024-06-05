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

public val Icons.Outline.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                lineTo(22.0f, 5.646f)
                arcTo(5.041f, 5.041f, 0.0f, false, false, 18.35f, 0.83f)
                arcToRelative(24.742f, 24.742f, 0.0f, false, false, -12.7f, 0.0f)
                arcTo(5.041f, 5.041f, 0.0f, false, false, 2.0f, 5.646f)
                lineTo(2.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.95f, 0.5f)
                horizontalLineToRelative(6.1f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.0f, 21.5f)
                lineTo(20.0f, 21.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, 2.0f, -4.0f)
                lineTo(22.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 10.0f)
                close()
                moveTo(13.0f, 13.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(4.0f, 13.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(6.2f, 2.752f)
                arcToRelative(22.75f, 22.75f, 0.0f, false, true, 11.6f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.931f, 5.0f)
                lineTo(4.069f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.2f, 2.752f)
                close()
                moveTo(17.0f, 20.0f)
                lineTo(7.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(4.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(8.0f, 15.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(18.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null
