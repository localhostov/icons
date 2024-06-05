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

public val Icons.Outline.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 1.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 6.0f)
                verticalLineTo(18.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(6.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 1.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.78f, 1.887f)
                lineToRelative(-7.658f, 7.659f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, -4.244f, 0.0f)
                lineTo(2.22f, 4.887f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 3.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(7.5f)
                lineTo(8.464f, 13.96f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, false, 7.072f, 0.0f)
                lineTo(22.0f, 7.5f)
                verticalLineTo(18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 21.0f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
