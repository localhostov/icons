package me.localx.icons.rounded.bold

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

public val Icons.Bold.Hastag: ImageVector
    get() {
        if (_hastag != null) {
            return _hastag!!
        }
        _hastag = Builder(name = "Hastag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(18.872f, 6.0f)
                lineToRelative(0.613f, -4.288f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.97f, -0.424f)
                lineTo(15.842f, 6.0f)
                lineTo(9.872f, 6.0f)
                lineToRelative(0.613f, -4.288f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.97f, -0.424f)
                lineTo(6.842f, 6.0f)
                lineTo(2.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(6.413f, 9.0f)
                lineToRelative(-0.857f, 6.0f)
                lineTo(1.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(5.128f, 18.0f)
                lineToRelative(-0.613f, 4.288f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.97f, 0.424f)
                lineTo(8.158f, 18.0f)
                horizontalLineToRelative(5.97f)
                lineToRelative(-0.613f, 4.288f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.97f, 0.424f)
                lineTo(17.158f, 18.0f)
                lineTo(21.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(17.587f, 15.0f)
                lineToRelative(0.857f, -6.0f)
                close()
                moveTo(14.556f, 15.0f)
                lineTo(8.587f, 15.0f)
                lineToRelative(0.857f, -6.0f)
                horizontalLineToRelative(5.969f)
                close()
            }
        }
        .build()
        return _hastag!!
    }

private var _hastag: ImageVector? = null
