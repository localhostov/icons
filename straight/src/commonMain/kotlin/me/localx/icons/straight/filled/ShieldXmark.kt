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

public val Icons.Filled.ShieldXmark: ImageVector
    get() {
        if (_shieldXmark != null) {
            return _shieldXmark!!
        }
        _shieldXmark = Builder(name = "ShieldXmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.259f, 2.404f)
                lineTo(12.0f, -0.002f)
                lineToRelative(-7.259f, 2.407f)
                curveToRelative(-1.64f, 0.543f, -2.741f, 2.068f, -2.741f, 3.796f)
                verticalLineToRelative(5.763f)
                curveToRelative(0.0f, 6.566f, 7.005f, 10.577f, 9.151f, 11.648f)
                lineToRelative(0.806f, 0.404f)
                lineToRelative(0.836f, -0.336f)
                curveToRelative(2.16f, -0.87f, 9.207f, -4.285f, 9.207f, -11.717f)
                verticalLineToRelative(-5.763f)
                curveToRelative(0.0f, -1.728f, -1.102f, -3.253f, -2.741f, -3.797f)
                close()
                moveTo(16.149f, 14.226f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.734f, -2.734f)
                lineToRelative(-2.734f, 2.734f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.734f, -2.734f)
                lineToRelative(-2.734f, -2.734f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.734f, 2.734f)
                lineToRelative(2.734f, -2.734f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.734f, 2.734f)
                lineToRelative(2.734f, 2.734f)
                close()
            }
        }
        .build()
        return _shieldXmark!!
    }

private var _shieldXmark: ImageVector? = null
