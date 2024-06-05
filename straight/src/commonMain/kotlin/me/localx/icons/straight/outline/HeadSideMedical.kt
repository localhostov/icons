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

public val Icons.Outline.HeadSideMedical: ImageVector
    get() {
        if (_headSideMedical != null) {
            return _headSideMedical!!
        }
        _headSideMedical = Builder(name = "HeadSideMedical", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.27f, 11.13f)
                curveToRelative(-1.18f, -2.7f, -2.29f, -5.25f, -3.47f, -6.71f)
                curveTo(17.36f, 1.16f, 13.5f, -0.45f, 9.45f, 0.11f)
                curveTo(4.46f, 0.79f, 0.5f, 4.95f, 0.05f, 9.98f)
                curveToRelative(-0.27f, 2.93f, 0.62f, 5.79f, 2.5f, 8.05f)
                curveToRelative(0.29f, 0.35f, 0.46f, 0.8f, 0.46f, 1.26f)
                verticalLineToRelative(4.71f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.5f, 0.0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.45f, -3.39f)
                horizontalLineToRelative(2.33f)
                verticalLineToRelative(-2.21f)
                reflectiveCurveToRelative(-0.51f, -1.17f, -0.73f, -1.66f)
                close()
                moveTo(19.91f, 13.0f)
                lineToRelative(-0.68f, 5.13f)
                curveToRelative(-0.07f, 0.5f, -0.49f, 0.87f, -0.99f, 0.87f)
                horizontalLineToRelative(-4.25f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0.0f, -0.93f, -0.33f, -1.83f, -0.92f, -2.54f)
                curveToRelative(-1.53f, -1.84f, -2.26f, -4.18f, -2.04f, -6.59f)
                curveToRelative(0.37f, -4.12f, 3.6f, -7.51f, 7.69f, -8.08f)
                curveToRelative(3.31f, -0.46f, 6.48f, 0.87f, 8.5f, 3.56f)
                curveToRelative(1.03f, 1.28f, 2.14f, 3.82f, 3.22f, 6.28f)
                curveToRelative(0.16f, 0.36f, 0.31f, 0.71f, 0.47f, 1.07f)
                horizontalLineToRelative(-1.99f)
                close()
                moveTo(11.99f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _headSideMedical!!
    }

private var _headSideMedical: ImageVector? = null
