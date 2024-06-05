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

public val Icons.Outline.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.359f, 9.8f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, false, 0.082f, -3.6f)
                lineToRelative(-3.531f, -4.943f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.441f, -1.257f)
                horizontalLineToRelative(-10.938f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.441f, 1.257f)
                lineToRelative(-3.531f, 4.943f)
                arcToRelative(3.018f, 3.018f, 0.0f, false, false, 0.085f, 3.6f)
                lineToRelative(11.356f, 14.308f)
                close()
                moveTo(7.253f, 9.0f)
                lineTo(10.053f, 18.432f)
                lineTo(2.562f, 9.0f)
                close()
                moveTo(21.438f, 9.0f)
                lineTo(13.952f, 18.432f)
                lineTo(16.747f, 9.0f)
                close()
                moveTo(14.661f, 9.0f)
                lineTo(12.0f, 17.979f)
                lineTo(9.339f, 9.0f)
                close()
                moveTo(9.326f, 7.0f)
                lineTo(10.754f, 2.0f)
                horizontalLineToRelative(2.492f)
                lineToRelative(1.428f, 5.0f)
                close()
                moveTo(18.283f, 2.419f)
                lineTo(21.555f, 7.0f)
                horizontalLineToRelative(-4.8f)
                lineToRelative(-1.429f, -5.0f)
                horizontalLineToRelative(2.143f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.814f, 0.419f)
                close()
                moveTo(5.717f, 2.419f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.814f, -0.419f)
                horizontalLineToRelative(2.143f)
                lineToRelative(-1.428f, 5.0f)
                horizontalLineToRelative(-4.8f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
