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

public val Icons.Outline.WindowRestore: ImageVector
    get() {
        if (_windowRestore != null) {
            return _windowRestore!!
        }
        _windowRestore = Builder(name = "WindowRestore", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                curveTo(2.24f, 6.0f, 0.0f, 8.24f, 0.0f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                lineTo(13.0f, 24.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(18.0f, 11.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(13.0f, 8.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                lineTo(2.0f, 11.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(13.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(24.0f, 5.0f)
                lineTo(24.0f, 13.54f)
                curveToRelative(0.0f, 1.78f, -0.96f, 3.44f, -2.5f, 4.33f)
                curveToRelative(-0.16f, 0.09f, -0.33f, 0.13f, -0.5f, 0.13f)
                curveToRelative(-0.35f, 0.0f, -0.68f, -0.18f, -0.87f, -0.5f)
                curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.36f, -1.37f)
                curveToRelative(0.93f, -0.54f, 1.5f, -1.53f, 1.5f, -2.6f)
                lineTo(21.99f, 5.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(10.46f, 2.0f)
                curveToRelative(-1.07f, 0.0f, -2.06f, 0.58f, -2.6f, 1.5f)
                curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.37f, 0.36f)
                curveToRelative(-0.48f, -0.28f, -0.64f, -0.89f, -0.36f, -1.37f)
                curveToRelative(0.89f, -1.54f, 2.55f, -2.5f, 4.33f, -2.5f)
                horizontalLineToRelative(8.54f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _windowRestore!!
    }

private var _windowRestore: ImageVector? = null
