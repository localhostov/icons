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

public val Icons.Outline.MapMarkerHome: ImageVector
    get() {
        if (_mapMarkerHome != null) {
            return _mapMarkerHome!!
        }
        _mapMarkerHome = Builder(name = "MapMarkerHome", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 4.25f, 18.806f)
                lineToRelative(3.943f, 3.641f)
                arcToRelative(5.442f, 5.442f, 0.0f, false, false, 7.593f, 0.02f)
                lineToRelative(3.992f, -3.689f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(18.392f, 17.337f)
                lineTo(14.408f, 21.018f)
                arcTo(3.513f, 3.513f, 0.0f, false, true, 9.571f, 21.0f)
                lineTo(5.636f, 17.364f)
                arcTo(9.0f, 9.0f, 0.0f, true, true, 21.0f, 11.0f)
                arcTo(8.922f, 8.922f, 0.0f, false, true, 18.392f, 17.337f)
                close()
                moveTo(16.71f, 7.663f)
                lineToRelative(-3.0f, -2.081f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, -3.42f, 0.0f)
                lineToRelative(-3.0f, 2.081f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 10.128f)
                lineTo(6.0f, 13.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.5f, 16.0f)
                horizontalLineToRelative(7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 13.5f)
                lineTo(18.0f, 10.128f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.71f, 7.663f)
                close()
                moveTo(16.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(14.0f, 14.0f)
                lineTo(14.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(11.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(8.0f, 10.128f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.43f, -0.822f)
                lineToRelative(3.0f, -2.081f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, 1.14f, 0.0f)
                lineToRelative(3.0f, 2.081f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.43f, 0.822f)
                close()
            }
        }
        .build()
        return _mapMarkerHome!!
    }

private var _mapMarkerHome: ImageVector? = null
