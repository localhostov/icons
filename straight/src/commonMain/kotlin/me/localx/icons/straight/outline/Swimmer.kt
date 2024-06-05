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

public val Icons.Outline.Swimmer: ImageVector
    get() {
        if (_swimmer != null) {
            return _swimmer!!
        }
        _swimmer = Builder(name = "Swimmer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, -0.009f, 16.633f)
                lineTo(1.5f, 15.315f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.5f, 1.316f)
                lineToRelative(1.506f, 1.316f)
                arcTo(3.97f, 3.97f, 0.0f, false, true, 18.0f, 16.618f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, true, -6.0f, 0.0f)
                arcTo(3.974f, 3.974f, 0.0f, false, true, 3.0f, 18.0f)
                close()
                moveTo(21.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(17.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(11.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(5.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.5f, 1.315f)
                lineTo(-0.009f, 21.633f)
                arcTo(3.971f, 3.971f, 0.0f, false, false, 6.0f, 21.618f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, false, 6.009f, 0.014f)
                lineTo(22.5f, 20.316f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 21.0f)
                close()
                moveTo(4.744f, 12.0f)
                lineToRelative(7.415f, -5.191f)
                lineTo(15.809f, 12.0f)
                horizontalLineToRelative(2.445f)
                lineTo(11.416f, 2.274f)
                lineToRelative(-0.005f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.962f, 1.0f)
                lineTo(2.0f, 1.0f)
                lineTo(2.0f, 3.0f)
                lineTo(8.962f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.817f, 0.424f)
                horizontalLineToRelative(0.0f)
                lineToRelative(1.23f, 1.748f)
                lineTo(1.256f, 12.0f)
                close()
                moveTo(18.5f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 16.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 8.0f)
                close()
            }
        }
        .build()
        return _swimmer!!
    }

private var _swimmer: ImageVector? = null
