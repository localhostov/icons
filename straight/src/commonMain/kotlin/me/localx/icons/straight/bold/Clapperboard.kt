package me.localx.icons.straight.bold

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
                moveToRelative(20.5f, 1.0f)
                lineTo(3.5f, 1.0f)
                curveTo(1.57f, 1.0f, 0.0f, 2.57f, 0.0f, 4.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.379f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(0.879f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                close()
                moveTo(8.621f, 7.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(3.758f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-3.758f)
                close()
                moveTo(3.5f, 4.0f)
                horizontalLineToRelative(3.879f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-1.379f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3.0f, 20.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(10.0f)
                lineTo(3.0f, 20.0f)
                close()
            }
        }
        .build()
        return _clapperboard!!
    }

private var _clapperboard: ImageVector? = null
