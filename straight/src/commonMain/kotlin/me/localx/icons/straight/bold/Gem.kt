package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.442f, 7.436f)
                lineTo(0.658f, 9.927f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 0.416f, 4.49f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.994f, -9.641f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 0.287f, -4.5f)
                lineTo(21.24f, 7.422f)
                arcTo(3.416f, 3.416f, 0.0f, false, false, 18.5f, 6.03f)
                lineTo(5.2f, 6.03f)
                arcTo(3.425f, 3.425f, 0.0f, false, false, 2.442f, 7.436f)
                close()
                moveTo(3.088f, 11.687f)
                lineTo(4.872f, 9.2f)
                arcTo(0.4f, 0.4f, 0.0f, false, true, 5.2f, 9.03f)
                lineTo(9.188f, 9.03f)
                lineTo(8.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                lineTo(14.812f, 9.03f)
                lineTo(18.5f, 9.03f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, 0.386f, 0.242f)
                lineTo(20.922f, 11.7f)
                arcTo(0.427f, 0.427f, 0.0f, false, true, 21.0f, 12.0f)
                lineTo(16.0f, 12.0f)
                lineToRelative(-4.0f, 8.006f)
                lineTo(8.0f, 12.0f)
                lineTo(3.018f, 12.0f)
                arcTo(0.4f, 0.4f, 0.0f, false, true, 3.088f, 11.687f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7351f, 3.4444f)
                lineToRelative(1.9998f, -3.1431f)
                lineToRelative(2.5328f, 1.6115f)
                lineToRelative(-1.9998f, 3.1431f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7345f, 1.9204f)
                lineToRelative(2.5315f, -1.6116f)
                lineToRelative(1.9999f, 3.1414f)
                lineToRelative(-2.5315f, 1.6116f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
