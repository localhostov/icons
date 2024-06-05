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

public val Icons.Bold.JarWheat: ImageVector
    get() {
        if (_jarWheat != null) {
            return _jarWheat!!
        }
        _jarWheat = Builder(name = "JarWheat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 3.261f)
                lineTo(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                verticalLineToRelative(3.261f)
                curveToRelative(-1.221f, 1.01f, -2.0f, 2.535f, -2.0f, 4.239f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(22.0f, 7.5f)
                curveToRelative(0.0f, -1.704f, -0.779f, -3.23f, -2.0f, -4.239f)
                close()
                moveTo(19.0f, 20.5f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.845f)
                curveToRelative(0.549f, -1.246f, 0.841f, -3.5f, 0.841f, -3.5f)
                curveToRelative(0.0f, 0.0f, -3.017f, 0.391f, -3.999f, 1.118f)
                verticalLineToRelative(-1.386f)
                curveToRelative(0.925f, -0.417f, 2.229f, -1.057f, 2.723f, -1.552f)
                curveToRelative(0.801f, -0.801f, 1.279f, -4.18f, 1.279f, -4.18f)
                curveToRelative(0.0f, 0.0f, -3.02f, 0.391f, -4.001f, 1.12f)
                verticalLineToRelative(-0.931f)
                curveToRelative(0.532f, -0.739f, 1.001f, -1.552f, 1.001f, -2.116f)
                curveToRelative(0.0f, -1.304f, -2.5f, -4.541f, -2.5f, -4.541f)
                curveToRelative(0.0f, 0.0f, -2.5f, 3.238f, -2.5f, 4.541f)
                curveToRelative(0.0f, 0.564f, 0.468f, 1.375f, 0.999f, 2.114f)
                verticalLineToRelative(0.929f)
                curveToRelative(-0.975f, -0.731f, -3.999f, -1.116f, -3.999f, -1.116f)
                curveToRelative(0.0f, 0.0f, 0.424f, 3.325f, 1.225f, 4.126f)
                curveToRelative(0.498f, 0.498f, 1.833f, 1.161f, 2.772f, 1.591f)
                verticalLineToRelative(1.4f)
                curveToRelative(-0.974f, -0.731f, -4.001f, -1.118f, -4.001f, -1.118f)
                curveToRelative(0.0f, 0.0f, 0.288f, 2.257f, 0.838f, 3.5f)
                horizontalLineToRelative(-1.834f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                lineTo(4.999f, 7.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _jarWheat!!
    }

private var _jarWheat: ImageVector? = null
