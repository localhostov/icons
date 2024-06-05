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

public val Icons.Outline.PlayingCards: ImageVector
    get() {
        if (_playingCards != null) {
            return _playingCards!!
        }
        _playingCards = Builder(name = "PlayingCards", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.466f, 1.967f)
                lineTo(14.78f, 0.221f)
                arcToRelative(5.011f, 5.011f, 0.0f, false, false, -6.224f, 3.24f)
                lineTo(8.368f, 4.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 9.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(4.975f, 4.975f, 0.0f, false, false, 3.92f, -1.934f)
                arcToRelative(5.029f, 5.029f, 0.0f, false, false, 0.689f, 0.052f)
                arcToRelative(4.976f, 4.976f, 0.0f, false, false, 4.775f, -3.563f)
                lineTo(23.8f, 8.156f)
                arcTo(5.021f, 5.021f, 0.0f, false, false, 20.466f, 1.967f)
                close()
                moveTo(11.0f, 22.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineTo(19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 22.0f)
                close()
                moveTo(21.887f, 7.563f)
                lineToRelative(-3.412f, 10.4f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, true, -2.6f, 2.134f)
                arcTo(4.992f, 4.992f, 0.0f, false, false, 16.0f, 19.0f)
                verticalLineTo(9.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineToRelative(-0.507f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.7f, -1.867f)
                lineToRelative(5.686f, 1.746f)
                arcTo(3.006f, 3.006f, 0.0f, false, true, 21.887f, 7.563f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(0.0f, 1.45f, -1.544f, 3.391f, -2.714f, 4.378f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, true, -2.572f, 0.0f)
                curveTo(5.544f, 16.391f, 4.0f, 14.45f, 4.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _playingCards!!
    }

private var _playingCards: ImageVector? = null
