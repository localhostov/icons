package me.localx.icons.rounded.filled

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

public val Icons.Filled.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 1.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(-2.965f)
                lineToRelative(-1.7f, 2.555f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.835f, 0.445f)
                curveToRelative(-0.021f, 0.0f, -0.042f, 0.0f, -0.062f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.833f, -0.551f)
                lineToRelative(-2.229f, -4.461f)
                lineToRelative(-1.044f, 1.567f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.832f, 0.445f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.965f)
                lineToRelative(1.7f, -2.555f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, true, 0.897f, -0.445f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.833f, 0.551f)
                lineToRelative(2.229f, 4.459f)
                lineToRelative(1.044f, -1.567f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.832f, -0.443f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
