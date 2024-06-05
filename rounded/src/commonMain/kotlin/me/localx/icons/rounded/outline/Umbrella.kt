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

public val Icons.Outline.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.717f, 9.549f)
                arcToRelative(12.834f, 12.834f, 0.0f, false, false, -10.717f, -7.506f)
                verticalLineToRelative(-1.043f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.043f)
                arcToRelative(12.843f, 12.843f, 0.0f, false, false, -10.733f, 7.506f)
                arcToRelative(3.945f, 3.945f, 0.0f, false, false, 0.405f, 3.682f)
                arcToRelative(4.015f, 4.015f, 0.0f, false, false, 3.328f, 1.769f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(6.983f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, false, 3.329f, -1.769f)
                arcToRelative(3.948f, 3.948f, 0.0f, false, false, 0.405f, -3.682f)
                close()
                moveTo(21.656f, 12.11f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, true, -1.673f, 0.89f)
                horizontalLineToRelative(-15.983f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, true, -1.673f, -0.891f)
                arcToRelative(1.927f, 1.927f, 0.0f, false, true, -0.2f, -1.818f)
                curveToRelative(1.454f, -3.645f, 5.607f, -6.291f, 9.873f, -6.291f)
                arcToRelative(10.809f, 10.809f, 0.0f, false, true, 9.859f, 6.291f)
                arcToRelative(1.923f, 1.923f, 0.0f, false, true, -0.203f, 1.819f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
