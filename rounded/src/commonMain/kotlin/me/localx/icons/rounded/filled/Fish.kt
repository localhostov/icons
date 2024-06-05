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

public val Icons.Filled.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.272f)
                arcToRelative(16.493f, 16.493f, 0.0f, false, false, -7.755f, 2.62f)
                arcTo(6.55f, 6.55f, 0.0f, false, true, 8.367f, 3.053f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 11.0f, 5.272f)
                close()
                moveTo(23.654f, 5.249f)
                arcToRelative(4.529f, 4.529f, 0.0f, false, false, -3.083f, -1.82f)
                arcTo(4.529f, 4.529f, 0.0f, false, false, 18.751f, 0.346f)
                arcTo(1.718f, 1.718f, 0.0f, false, false, 16.0f, 1.715f)
                lineTo(16.0f, 7.0f)
                curveTo(8.483f, 7.0f, 4.194f, 8.437f, 1.963f, 12.194f)
                arcTo(13.756f, 13.756f, 0.0f, false, true, 11.8f, 22.043f)
                curveTo(15.561f, 19.813f, 17.0f, 15.523f, 17.0f, 8.0f)
                horizontalLineToRelative(5.285f)
                arcTo(1.718f, 1.718f, 0.0f, false, false, 23.654f, 5.249f)
                close()
                moveTo(19.2f, 13.0f)
                horizontalLineToRelative(-0.475f)
                arcToRelative(22.8f, 22.8f, 0.0f, false, true, -0.813f, 4.0f)
                horizontalLineToRelative(0.814f)
                curveTo(21.213f, 17.077f, 22.012f, 13.124f, 19.2f, 13.0f)
                close()
                moveTo(9.951f, 22.911f)
                curveToRelative(-2.4f, 0.688f, -6.537f, 2.143f, -8.78f, -0.082f)
                arcTo(3.983f, 3.983f, 0.0f, false, true, 0.009f, 19.743f)
                arcToRelative(20.836f, 20.836f, 0.0f, false, true, 1.081f, -5.7f)
                arcTo(11.724f, 11.724f, 0.0f, false, true, 9.951f, 22.911f)
                close()
                moveTo(5.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
