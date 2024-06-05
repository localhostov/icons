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

public val Icons.Bold.Gif: ImageVector
    get() {
        if (_gif != null) {
            return _gif!!
        }
        _gif = Builder(name = "Gif", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(17.471f, 24.0f)
                lineTo(24.0f, 17.471f)
                lineTo(24.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(12.75f, 2.916f)
                horizontalLineToRelative(3.263f)
                verticalLineToRelative(1.25f)
                lineTo(14.0f, 4.166f)
                lineTo(14.0f, 5.3f)
                horizontalLineToRelative(1.864f)
                verticalLineToRelative(1.25f)
                lineTo(14.0f, 6.55f)
                lineTo(14.0f, 8.941f)
                lineTo(12.75f, 8.941f)
                close()
                moveTo(9.75f, 2.916f)
                lineTo(11.0f, 2.916f)
                lineTo(11.0f, 8.985f)
                lineTo(9.75f, 8.985f)
                close()
                moveTo(4.0f, 4.9f)
                arcTo(1.991f, 1.991f, 0.0f, false, true, 6.0f, 2.916f)
                lineTo(6.0f, 2.916f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(6.75f, 4.916f)
                arcTo(0.772f, 0.772f, 0.0f, false, false, 6.0f, 4.166f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, false, -0.749f, 0.751f)
                lineTo(5.251f, 6.984f)
                arcTo(0.742f, 0.742f, 0.0f, false, false, 6.0f, 7.735f)
                arcTo(0.759f, 0.759f, 0.0f, false, false, 6.75f, 7.0f)
                lineTo(6.75f, 6.916f)
                lineTo(6.0f, 6.916f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 5.916f)
                lineTo(8.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 8.984f)
                lineTo(6.0f, 8.984f)
                arcTo(1.991f, 1.991f, 0.0f, false, true, 4.0f, 7.0f)
                close()
                moveTo(21.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                verticalLineToRelative(6.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 11.0f)
                lineTo(21.0f, 11.0f)
                close()
            }
        }
        .build()
        return _gif!!
    }

private var _gif: ImageVector? = null
