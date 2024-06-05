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

public val Icons.Bold.BreadLoaf: ImageVector
    get() {
        if (_breadLoaf != null) {
            return _breadLoaf!!
        }
        _breadLoaf = Builder(name = "BreadLoaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveTo(1.79f, 2.0f, 0.0f, 3.79f, 0.0f, 6.0f)
                curveToRelative(0.0f, 1.45f, 0.79f, 2.76f, 2.0f, 3.46f)
                verticalLineToRelative(12.54f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 9.46f)
                curveToRelative(1.21f, -0.7f, 2.0f, -2.01f, 2.0f, -3.46f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(3.8f, 6.98f)
                curveToRelative(-0.46f, -0.09f, -0.8f, -0.51f, -0.8f, -0.98f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(13.0f, 5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.47f, -0.34f, 0.89f, -0.8f, 0.98f)
                lineToRelative(-1.2f, 0.24f)
                verticalLineToRelative(11.78f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 7.22f)
                lineToRelative(-1.2f, -0.24f)
                close()
                moveTo(20.2f, 6.98f)
                lineToRelative(-1.2f, 0.24f)
                verticalLineToRelative(11.78f)
                horizontalLineToRelative(-4.0f)
                lineTo(15.0f, 9.46f)
                curveToRelative(1.21f, -0.7f, 2.0f, -2.01f, 2.0f, -3.46f)
                curveToRelative(0.0f, -0.35f, -0.04f, -0.68f, -0.13f, -1.0f)
                horizontalLineToRelative(3.13f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.47f, -0.34f, 0.89f, -0.8f, 0.98f)
                close()
            }
        }
        .build()
        return _breadLoaf!!
    }

private var _breadLoaf: ImageVector? = null
