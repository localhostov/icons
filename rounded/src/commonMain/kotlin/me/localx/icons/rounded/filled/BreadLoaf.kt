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

public val Icons.Filled.BreadLoaf: ImageVector
    get() {
        if (_breadLoaf != null) {
            return _breadLoaf!!
        }
        _breadLoaf = Builder(name = "BreadLoaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.67f)
                curveTo(0.6f, 9.01f, -0.22f, 7.49f, 0.05f, 5.89f)
                curveToRelative(0.29f, -1.67f, 1.78f, -2.89f, 3.55f, -2.89f)
                lineTo(13.4f, 3.0f)
                curveToRelative(1.77f, 0.0f, 3.26f, 1.21f, 3.55f, 2.89f)
                curveToRelative(0.25f, 1.44f, -0.4f, 2.81f, -1.54f, 3.55f)
                curveToRelative(-0.27f, 0.17f, -0.41f, 0.49f, -0.41f, 0.8f)
                verticalLineToRelative(6.76f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                lineTo(6.0f, 21.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-7.33f)
                close()
                moveTo(23.95f, 5.89f)
                curveToRelative(-0.29f, -1.67f, -1.78f, -2.89f, -3.55f, -2.89f)
                horizontalLineToRelative(-2.67f)
                curveToRelative(0.6f, 0.71f, 1.02f, 1.58f, 1.19f, 2.55f)
                curveToRelative(0.34f, 1.98f, -0.43f, 3.96f, -1.92f, 5.2f)
                verticalLineToRelative(6.25f)
                curveToRelative(0.0f, 1.54f, -0.58f, 2.94f, -1.54f, 4.0f)
                horizontalLineToRelative(2.54f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-7.33f)
                curveToRelative(1.4f, -0.66f, 2.22f, -2.18f, 1.95f, -3.78f)
                close()
            }
        }
        .build()
        return _breadLoaf!!
    }

private var _breadLoaf: ImageVector? = null
