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

public val Icons.Outline.ClapperboardPlay: ImageVector
    get() {
        if (_clapperboardPlay != null) {
            return _clapperboardPlay!!
        }
        _clapperboardPlay = Builder(name = "ClapperboardPlay", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 1.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(5.606f, 7.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(3.422f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(-3.422f)
                close()
                moveTo(15.856f, 3.0f)
                horizontalLineToRelative(3.422f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(-3.422f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(21.757f, 3.349f)
                curveToRelative(0.151f, 0.175f, 0.242f, 0.403f, 0.242f, 0.651f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.894f)
                lineToRelative(3.651f, -3.651f)
                close()
                moveTo(2.999f, 3.0f)
                horizontalLineToRelative(3.778f)
                lineTo(2.778f, 7.0f)
                horizontalLineToRelative(-0.778f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(1.999f, 21.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 21.0f)
                close()
                moveTo(9.999f, 11.5f)
                lineToRelative(5.833f, 3.5f)
                lineToRelative(-5.833f, 3.5f)
                verticalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _clapperboardPlay!!
    }

private var _clapperboardPlay: ImageVector? = null
