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

public val Icons.Outline.EnvelopePlus: ImageVector
    get() {
        if (_envelopePlus != null) {
            return _envelopePlus!!
        }
        _envelopePlus = Builder(name = "EnvelopePlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineTo(8.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(5.0f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 2.361f, 6.6f)
                lineToRelative(7.517f, 7.518f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, 4.244f, 0.0f)
                lineTo(17.943f, 10.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineToRelative(-3.821f, 3.822f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, true, -7.072f, 0.0f)
                lineTo(2.0f, 9.071f)
                verticalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 24.0f, 10.0f)
                close()
                moveTo(17.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 5.0f)
                close()
            }
        }
        .build()
        return _envelopePlus!!
    }

private var _envelopePlus: ImageVector? = null
