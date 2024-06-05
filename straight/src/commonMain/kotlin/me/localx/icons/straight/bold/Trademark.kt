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

public val Icons.Bold.Trademark: ImageVector
    get() {
        if (_trademark != null) {
            return _trademark!!
        }
        _trademark = Builder(name = "Trademark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(11.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(22.48f, 5.09f)
                curveToRelative(-0.91f, -0.27f, -1.89f, 0.09f, -2.45f, 0.95f)
                lineToRelative(-2.53f, 4.13f)
                lineToRelative(-2.55f, -4.17f)
                curveToRelative(-0.54f, -0.82f, -1.51f, -1.18f, -2.42f, -0.91f)
                curveToRelative(-0.91f, 0.27f, -1.52f, 1.13f, -1.52f, 2.13f)
                verticalLineToRelative(11.78f)
                horizontalLineToRelative(3.0f)
                lineTo(14.01f, 10.2f)
                lineToRelative(3.5f, 5.73f)
                lineToRelative(3.5f, -5.73f)
                verticalLineToRelative(8.8f)
                horizontalLineToRelative(3.0f)
                lineTo(24.01f, 7.22f)
                curveToRelative(0.0f, -1.0f, -0.61f, -1.86f, -1.52f, -2.13f)
                close()
            }
        }
        .build()
        return _trademark!!
    }

private var _trademark: ImageVector? = null
