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

public val Icons.Filled.HeadSideMask: ImageVector
    get() {
        if (_headSideMask != null) {
            return _headSideMask!!
        }
        _headSideMask = Builder(name = "HeadSideMask", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.35f, 13.0f)
                horizontalLineToRelative(1.32f)
                curveToRelative(2.58f, 0.0f, 5.14f, -0.85f, 7.2f, -2.4f)
                lineToRelative(1.79f, -1.26f)
                curveToRelative(-0.94f, -1.95f, -2.16f, -4.05f, -2.86f, -4.92f)
                curveTo(17.36f, 1.16f, 13.5f, -0.45f, 9.45f, 0.11f)
                curveTo(6.36f, 0.53f, 3.66f, 2.29f, 1.95f, 4.77f)
                lineTo(12.35f, 13.0f)
                close()
                moveTo(11.15f, 14.6f)
                lineToRelative(3.13f, 9.4f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0.0f, -0.89f, -0.26f, -1.73f, -0.74f, -2.36f)
                curveTo(0.58f, 15.48f, -0.2f, 12.75f, 0.05f, 9.98f)
                curveToRelative(0.11f, -1.21f, 0.42f, -2.38f, 0.91f, -3.45f)
                lineTo(11.15f, 14.6f)
                close()
                moveTo(23.49f, 11.2f)
                curveToRelative(0.31f, 0.79f, 0.51f, 1.43f, 0.51f, 1.8f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 4.28f, -3.38f, 7.79f, -7.62f, 7.99f)
                lineToRelative(-3.0f, -8.99f)
                horizontalLineToRelative(0.28f)
                curveToRelative(3.01f, 0.0f, 5.99f, -0.99f, 8.38f, -2.78f)
                lineToRelative(1.45f, -1.02f)
                close()
            }
        }
        .build()
        return _headSideMask!!
    }

private var _headSideMask: ImageVector? = null
