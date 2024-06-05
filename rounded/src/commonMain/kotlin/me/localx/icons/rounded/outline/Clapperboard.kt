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
                moveToRelative(19.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                curveTo(2.243f, 1.0f, 0.0f, 3.243f, 0.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(19.0f, 3.0f)
                curveToRelative(0.068f, 0.0f, 0.136f, 0.003f, 0.203f, 0.008f)
                lineToRelative(-3.992f, 3.992f)
                horizontalLineToRelative(-3.422f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(3.211f)
                close()
                moveTo(12.961f, 3.0f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(-3.519f)
                lineToRelative(4.093f, -4.0f)
                horizontalLineToRelative(3.426f)
                close()
                moveTo(2.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.674f)
                lineTo(2.596f, 7.0f)
                horizontalLineToRelative(-0.596f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.0f, 18.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(22.0f, 7.0f)
                horizontalLineToRelative(-3.961f)
                lineToRelative(3.1f, -3.1f)
                curveToRelative(0.532f, 0.542f, 0.861f, 1.283f, 0.861f, 2.1f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _clapperboard!!
    }

private var _clapperboard: ImageVector? = null
