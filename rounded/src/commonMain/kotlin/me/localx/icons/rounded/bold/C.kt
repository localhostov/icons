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

public val Icons.Bold.C: ImageVector
    get() {
        if (_c != null) {
            return _c!!
        }
        _c = Builder(name = "C", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.956f, 24.0f)
                horizontalLineToRelative(-0.955f)
                curveToRelative(-5.515f, 0.0f, -10.001f, -4.527f, -10.001f, -10.091f)
                verticalLineToRelative(-3.818f)
                curveTo(2.0f, 4.527f, 6.487f, 0.0f, 12.001f, 0.0f)
                horizontalLineToRelative(0.955f)
                curveToRelative(3.763f, 0.0f, 7.168f, 2.147f, 8.887f, 5.604f)
                curveToRelative(0.369f, 0.742f, 0.066f, 1.643f, -0.675f, 2.011f)
                curveToRelative(-0.741f, 0.37f, -1.643f, 0.067f, -2.011f, -0.675f)
                curveToRelative(-1.227f, -2.467f, -3.545f, -3.94f, -6.201f, -3.94f)
                horizontalLineToRelative(-0.955f)
                curveToRelative(-3.861f, 0.0f, -7.001f, 3.181f, -7.001f, 7.091f)
                verticalLineToRelative(3.818f)
                curveToRelative(0.0f, 3.91f, 3.141f, 7.091f, 7.001f, 7.091f)
                horizontalLineToRelative(0.955f)
                curveToRelative(2.646f, 0.0f, 4.969f, -1.436f, 6.211f, -3.84f)
                curveToRelative(0.381f, -0.737f, 1.29f, -1.023f, 2.021f, -0.644f)
                curveToRelative(0.736f, 0.38f, 1.024f, 1.285f, 0.645f, 2.021f)
                curveToRelative(-1.741f, 3.37f, -5.143f, 5.463f, -8.877f, 5.463f)
                close()
            }
        }
        .build()
        return _c!!
    }

private var _c: ImageVector? = null
