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

public val Icons.Outline.Clapperboard: ImageVector
    get() {
        if (_clapperboard != null) {
            return _clapperboard!!
        }
        _clapperboard = Builder(name = "Clapperboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(11.789f, 7.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(3.422f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(-3.422f)
                close()
                moveTo(5.539f, 7.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(3.422f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(-3.422f)
                close()
                moveTo(21.726f, 3.313f)
                curveToRelative(0.17f, 0.179f, 0.274f, 0.421f, 0.274f, 0.687f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.961f)
                lineToRelative(3.687f, -3.687f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(3.711f)
                lineTo(2.711f, 7.0f)
                horizontalLineToRelative(-0.711f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 21.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 21.0f)
                close()
            }
        }
        .build()
        return _clapperboard!!
    }

private var _clapperboard: ImageVector? = null
