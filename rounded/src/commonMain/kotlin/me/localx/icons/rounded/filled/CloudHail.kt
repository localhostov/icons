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

public val Icons.Filled.CloudHail: ImageVector
    get() {
        if (_cloudHail != null) {
            return _cloudHail!!
        }
        _cloudHail = Builder(name = "CloudHail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 14.0f)
                close()
                moveTo(11.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 15.0f)
                close()
                moveTo(7.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 15.0f)
                close()
                moveTo(7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                close()
                moveTo(11.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 18.0f)
                close()
                moveTo(15.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 18.0f)
                close()
                moveTo(17.974f, 5.146f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, true, -0.742f, -0.569f)
                arcTo(8.062f, 8.062f, 0.0f, false, false, 8.5f, 0.137f)
                arcToRelative(7.946f, 7.946f, 0.0f, false, false, -6.384f, 6.5f)
                arcToRelative(8.147f, 8.147f, 0.0f, false, false, 0.033f, 2.889f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.345f, 0.9f)
                arcToRelative(5.538f, 5.538f, 0.0f, false, false, 2.327f, 9.39f)
                arcTo(2.943f, 2.943f, 0.0f, false, true, 4.771f, 17.0f)
                arcToRelative(1.437f, 1.437f, 0.0f, false, false, 0.3f, -1.351f)
                arcTo(3.005f, 3.005f, 0.0f, false, true, 8.0f, 12.0f)
                curveToRelative(1.091f, -0.112f, 1.5f, 0.892f, 2.708f, 0.3f)
                arcTo(2.476f, 2.476f, 0.0f, false, true, 12.0f, 12.0f)
                curveToRelative(1.125f, -0.073f, 1.413f, 0.806f, 2.75f, 0.28f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.506f, 4.687f)
                curveToRelative(-0.841f, 1.043f, 0.07f, 1.859f, -0.4f, 2.9f)
                curveTo(25.89f, 18.316f, 26.038f, 6.867f, 17.974f, 5.146f)
                close()
                moveTo(14.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 22.0f)
                close()
                moveTo(10.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 22.0f)
                close()
                moveTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 22.0f)
                close()
            }
        }
        .build()
        return _cloudHail!!
    }

private var _cloudHail: ImageVector? = null
