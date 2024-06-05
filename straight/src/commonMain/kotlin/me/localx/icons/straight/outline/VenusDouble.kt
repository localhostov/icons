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

public val Icons.Outline.VenusDouble: ImageVector
    get() {
        if (_venusDouble != null) {
            return _venusDouble!!
        }
        _venusDouble = Builder(name = "VenusDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.5f)
                arcTo(7.486f, 7.486f, 0.0f, false, false, 12.005f, 1.51f)
                arcTo(7.5f, 7.5f, 0.0f, true, false, 6.0f, 14.849f)
                lineTo(6.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 14.976f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, 4.005f, -1.486f)
                arcTo(7.456f, 7.456f, 0.0f, false, false, 16.0f, 14.975f)
                lineTo(16.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                lineTo(21.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                lineTo(18.0f, 14.849f)
                arcTo(7.513f, 7.513f, 0.0f, false, false, 24.0f, 7.5f)
                close()
                moveTo(22.0f, 7.5f)
                arcTo(5.5f, 5.5f, 0.0f, true, true, 16.5f, 2.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 22.0f, 7.5f)
                close()
                moveTo(2.0f, 7.5f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, true, 8.56f, -4.561f)
                arcToRelative(7.448f, 7.448f, 0.0f, false, false, 0.0f, 9.122f)
                arcTo(5.49f, 5.49f, 0.0f, false, true, 2.0f, 7.5f)
                close()
            }
        }
        .build()
        return _venusDouble!!
    }

private var _venusDouble: ImageVector? = null
