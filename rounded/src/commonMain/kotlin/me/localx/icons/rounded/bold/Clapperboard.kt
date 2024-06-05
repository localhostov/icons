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

public val Icons.Bold.Clapperboard: ImageVector
    get() {
        if (_clapperboard != null) {
            return _clapperboard!!
        }
        _clapperboard = Builder(name = "Clapperboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 1.0f)
                lineTo(5.5f, 1.0f)
                curveTo(2.467f, 1.0f, 0.0f, 3.467f, 0.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 6.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 7.0f)
                horizontalLineToRelative(-3.879f)
                lineToRelative(2.651f, -2.651f)
                curveToRelative(0.734f, 0.436f, 1.228f, 1.237f, 1.228f, 2.151f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(9.121f, 7.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(3.758f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-3.758f)
                close()
                moveTo(5.5f, 4.0f)
                horizontalLineToRelative(2.379f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-1.879f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(18.5f, 20.0f)
                lineTo(5.5f, 20.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _clapperboard!!
    }

private var _clapperboard: ImageVector? = null
