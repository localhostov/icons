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

public val Icons.Bold.Monument: ImageVector
    get() {
        if (_monument != null) {
            return _monument!!
        }
        _monument = Builder(name = "Monument", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(24.0f, 21.0f)
                close()
                moveTo(22.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.905f)
                lineToRelative(1.239f, -10.528f)
                curveToRelative(0.091f, -0.777f, 0.446f, -1.512f, 1.001f, -2.066f)
                lineToRelative(2.381f, -2.38f)
                curveToRelative(1.321f, -1.322f, 3.627f, -1.322f, 4.95f, 0.0f)
                lineToRelative(2.38f, 2.38f)
                curveToRelative(0.555f, 0.554f, 0.91f, 1.289f, 1.001f, 2.067f)
                lineToRelative(1.239f, 10.527f)
                horizontalLineToRelative(2.905f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(13.5f, 6.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.574f)
                lineToRelative(-1.177f, -10.0f)
                horizontalLineToRelative(-1.398f)
                close()
                moveTo(7.926f, 16.0f)
                horizontalLineToRelative(2.574f)
                lineTo(10.5f, 6.0f)
                horizontalLineToRelative(-1.398f)
                lineToRelative(-1.176f, 10.0f)
                close()
            }
        }
        .build()
        return _monument!!
    }

private var _monument: ImageVector? = null
