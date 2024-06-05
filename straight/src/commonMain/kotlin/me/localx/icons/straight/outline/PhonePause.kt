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

public val Icons.Outline.PhonePause: ImageVector
    get() {
        if (_phonePause != null) {
            return _phonePause!!
        }
        _phonePause = Builder(name = "PhonePause", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.613f, 12.848f)
                lineTo(14.2f, 16.262f)
                arcTo(12.138f, 12.138f, 0.0f, false, true, 7.746f, 9.793f)
                lineToRelative(3.4f, -3.406f)
                lineTo(4.887f, 0.122f)
                lineToRelative(-3.17f, 3.17f)
                arcTo(5.887f, 5.887f, 0.0f, false, false, 0.0f, 7.5f)
                curveTo(0.0f, 14.748f, 9.252f, 24.0f, 16.5f, 24.0f)
                arcToRelative(5.893f, 5.893f, 0.0f, false, false, 4.207f, -1.715f)
                lineToRelative(3.171f, -3.172f)
                close()
                moveTo(19.292f, 20.871f)
                arcTo(3.906f, 3.906f, 0.0f, false, true, 16.5f, 22.0f)
                curveTo(10.267f, 22.0f, 2.0f, 13.734f, 2.0f, 7.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 3.13f, 4.708f)
                lineTo(4.887f, 2.951f)
                lineTo(8.323f, 6.387f)
                lineTo(5.389f, 9.323f)
                lineToRelative(0.246f, 0.613f)
                arcToRelative(14.362f, 14.362f, 0.0f, false, false, 8.446f, 8.436f)
                lineToRelative(0.606f, 0.232f)
                lineToRelative(2.926f, -2.928f)
                lineToRelative(3.437f, 3.437f)
                close()
                moveTo(22.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 8.0f)
                lineTo(16.0f, 8.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
