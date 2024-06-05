package me.localx.icons.straight.filled

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

public val Icons.Filled.ClapperboardPlay: ImageVector
    get() {
        if (_clapperboardPlay != null) {
            return _clapperboardPlay!!
        }
        _clapperboardPlay = Builder(name = "ClapperboardPlay", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.727f, 7.0f)
                lineTo(13.727f, 1.0f)
                horizontalLineToRelative(3.422f)
                lineToRelative(-6.0f, 6.0f)
                horizontalLineToRelative(-3.422f)
                close()
                moveTo(17.399f, 7.0f)
                lineToRelative(5.4f, -5.4f)
                curveToRelative(-0.501f, -0.377f, -1.124f, -0.6f, -1.798f, -0.6f)
                horizontalLineToRelative(-1.023f)
                lineToRelative(-6.0f, 6.0f)
                horizontalLineToRelative(3.422f)
                close()
                moveTo(23.919f, 3.308f)
                lineToRelative(-3.692f, 3.692f)
                horizontalLineToRelative(3.773f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.238f, -0.029f, -0.47f, -0.081f, -0.692f)
                close()
                moveTo(4.898f, 7.0f)
                lineTo(10.898f, 1.0f)
                horizontalLineToRelative(-3.403f)
                lineTo(1.496f, 7.0f)
                horizontalLineToRelative(3.403f)
                close()
                moveTo(3.0f, 1.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(1.667f)
                lineTo(4.667f, 1.0f)
                horizontalLineToRelative(-1.667f)
                close()
                moveTo(0.0f, 9.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(14.0f)
                lineTo(0.0f, 23.0f)
                verticalLineToRelative(-14.0f)
                close()
                moveTo(10.0f, 19.5f)
                lineToRelative(5.833f, -3.5f)
                lineToRelative(-5.833f, -3.5f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _clapperboardPlay!!
    }

private var _clapperboardPlay: ImageVector? = null
