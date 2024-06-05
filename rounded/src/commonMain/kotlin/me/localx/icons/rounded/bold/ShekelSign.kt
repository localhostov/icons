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

public val Icons.Bold.ShekelSign: ImageVector
    get() {
        if (_shekelSign != null) {
            return _shekelSign!!
        }
        _shekelSign = Builder(name = "ShekelSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 24.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(1.0f, 3.5f)
                curveTo(1.0f, 1.57f, 2.57f, 0.0f, 4.5f, 0.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(-0.034f, 1.972f, -2.966f, 1.971f, -3.0f, 0.0f)
                lineTo(14.0f, 8.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                lineTo(4.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                lineTo(4.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.5f, 24.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(7.0f, 7.5f)
                curveToRelative(0.034f, -1.972f, 2.966f, -1.971f, 3.0f, 0.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(20.0f, 1.5f)
                curveToRelative(0.034f, -1.972f, 2.966f, -1.971f, 3.0f, 0.0f)
                lineTo(23.0f, 15.5f)
                curveToRelative(0.0f, 4.687f, -3.813f, 8.5f, -8.5f, 8.5f)
                close()
            }
        }
        .build()
        return _shekelSign!!
    }

private var _shekelSign: ImageVector? = null
