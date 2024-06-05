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

public val Icons.Filled.Staff: ImageVector
    get() {
        if (_staff != null) {
            return _staff!!
        }
        _staff = Builder(name = "Staff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.447f, 23.967f)
                lineTo(0.033f, 22.553f)
                lineToRelative(11.537f, -11.538f)
                curveToRelative(0.808f, -0.808f, 1.336f, -1.875f, 1.486f, -3.007f)
                lineToRelative(0.663f, -4.971f)
                curveToRelative(0.23f, -1.731f, 1.722f, -3.037f, 3.469f, -3.037f)
                horizontalLineToRelative(3.312f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.312f)
                curveToRelative(-0.749f, 0.0f, -1.388f, 0.56f, -1.486f, 1.301f)
                lineToRelative(-0.663f, 4.971f)
                curveToRelative(-0.208f, 1.564f, -0.938f, 3.041f, -2.055f, 4.157f)
                lineTo(1.447f, 23.967f)
                close()
            }
        }
        .build()
        return _staff!!
    }

private var _staff: ImageVector? = null
