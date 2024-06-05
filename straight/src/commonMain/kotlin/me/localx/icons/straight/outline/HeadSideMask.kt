package me.localx.icons.straight.outline

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

public val Icons.Outline.HeadSideMask: ImageVector
    get() {
        if (_headSideMask != null) {
            return _headSideMask!!
        }
        _headSideMask = Builder(name = "HeadSideMask", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.27f, 11.13f)
                curveToRelative(-1.18f, -2.7f, -2.29f, -5.25f, -3.47f, -6.71f)
                curveTo(17.36f, 1.16f, 13.5f, -0.45f, 9.45f, 0.11f)
                curveTo(4.46f, 0.79f, 0.5f, 4.95f, 0.05f, 9.98f)
                curveToRelative(-0.27f, 2.94f, 0.62f, 5.79f, 2.5f, 8.04f)
                curveToRelative(0.29f, 0.35f, 0.46f, 0.8f, 0.46f, 1.26f)
                verticalLineToRelative(4.71f)
                lineTo(12.17f, 23.99f)
                lineToRelative(-0.67f, -2.0f)
                lineTo(5.0f, 21.99f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0.0f, -0.93f, -0.33f, -1.83f, -0.92f, -2.54f)
                curveToRelative(-1.53f, -1.84f, -2.26f, -4.18f, -2.04f, -6.59f)
                curveToRelative(0.08f, -0.84f, 0.27f, -1.64f, 0.56f, -2.4f)
                lineToRelative(8.54f, 6.84f)
                lineToRelative(3.13f, 9.4f)
                horizontalLineToRelative(4.72f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-6.21f)
                reflectiveCurveToRelative(-0.51f, -1.17f, -0.73f, -1.66f)
                close()
                moveTo(9.72f, 2.09f)
                curveToRelative(3.31f, -0.46f, 6.48f, 0.87f, 8.5f, 3.56f)
                curveToRelative(0.85f, 1.05f, 1.75f, 2.95f, 2.64f, 4.96f)
                curveToRelative(-2.06f, 1.54f, -4.62f, 2.39f, -7.19f, 2.39f)
                horizontalLineToRelative(-1.32f)
                lineTo(3.55f, 5.96f)
                curveToRelative(1.4f, -2.06f, 3.62f, -3.52f, 6.18f, -3.87f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.28f)
                lineToRelative(-2.33f, -7.0f)
                horizontalLineToRelative(0.28f)
                curveToRelative(2.85f, 0.0f, 5.68f, -0.89f, 8.01f, -2.52f)
                curveToRelative(0.11f, 0.25f, 0.21f, 0.49f, 0.32f, 0.73f)
                verticalLineToRelative(5.79f)
                close()
            }
        }
        .build()
        return _headSideMask!!
    }

private var _headSideMask: ImageVector? = null
