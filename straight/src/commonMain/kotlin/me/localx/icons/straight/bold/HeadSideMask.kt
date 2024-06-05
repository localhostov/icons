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

public val Icons.Bold.HeadSideMask: ImageVector
    get() {
        if (_headSideMask != null) {
            return _headSideMask!!
        }
        _headSideMask = Builder(name = "HeadSideMask", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.68f)
                verticalLineToRelative(5.82f)
                curveToRelative(0.0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-4.6f)
                lineToRelative(-2.69f, -8.62f)
                lineTo(3.26f, 9.02f)
                curveToRelative(-0.62f, 2.48f, 0.0f, 5.07f, 1.7f, 7.11f)
                curveToRelative(0.67f, 0.81f, 1.05f, 1.83f, 1.05f, 2.88f)
                verticalLineToRelative(1.99f)
                horizontalLineToRelative(4.86f)
                lineToRelative(0.94f, 3.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-4.99f)
                curveToRelative(0.0f, -0.34f, -0.12f, -0.68f, -0.35f, -0.95f)
                curveTo(0.27f, 15.21f, -0.55f, 11.58f, 0.39f, 8.1f)
                curveTo(1.5f, 3.97f, 4.95f, 0.85f, 9.18f, 0.15f)
                curveToRelative(4.12f, -0.68f, 8.22f, 0.96f, 10.7f, 4.28f)
                curveToRelative(1.14f, 1.41f, 2.2f, 3.85f, 3.32f, 6.42f)
                curveToRelative(0.22f, 0.51f, 0.8f, 1.82f, 0.8f, 1.82f)
                close()
                moveTo(14.17f, 13.0f)
                curveToRelative(2.1f, 0.0f, 4.18f, -0.59f, 5.97f, -1.67f)
                curveToRelative(-0.89f, -2.04f, -1.8f, -4.03f, -2.62f, -5.05f)
                curveToRelative(-1.85f, -2.46f, -4.84f, -3.66f, -7.85f, -3.17f)
                curveToRelative(-2.04f, 0.34f, -3.86f, 1.51f, -5.08f, 3.14f)
                lineToRelative(8.43f, 6.75f)
                horizontalLineToRelative(1.14f)
                close()
                moveTo(21.0f, 14.29f)
                curveToRelative(-1.98f, 1.06f, -4.21f, 1.65f, -6.46f, 1.71f)
                lineToRelative(1.56f, 5.0f)
                horizontalLineToRelative(2.4f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4.21f)
                close()
            }
        }
        .build()
        return _headSideMask!!
    }

private var _headSideMask: ImageVector? = null
