package me.localx.icons.rounded.bold

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

public val Icons.Bold.HeadSideMedical: ImageVector
    get() {
        if (_headSideMedical != null) {
            return _headSideMedical!!
        }
        _headSideMedical = Builder(name = "HeadSideMedical", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 12.55f)
                curveToRelative(0.0f, 1.15f, -0.8f, 2.36f, -2.28f, 2.45f)
                lineToRelative(-0.15f, 1.19f)
                curveToRelative(-0.31f, 2.45f, -2.22f, 4.37f, -4.59f, 4.74f)
                curveToRelative(-0.21f, 1.73f, -1.69f, 3.07f, -3.47f, 3.07f)
                lineTo(6.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-1.12f)
                curveToRelative(0.0f, -0.71f, -0.33f, -1.28f, -0.61f, -1.64f)
                curveTo(0.22f, 14.95f, -0.51f, 11.43f, 0.39f, 8.1f)
                curveTo(1.5f, 3.97f, 4.95f, 0.85f, 9.18f, 0.15f)
                curveToRelative(4.11f, -0.68f, 8.2f, 0.96f, 10.69f, 4.26f)
                curveToRelative(1.04f, 1.3f, 4.13f, 6.48f, 4.13f, 8.13f)
                close()
                moveTo(20.78f, 12.0f)
                curveToRelative(-0.61f, -1.47f, -2.3f, -4.53f, -3.27f, -5.72f)
                curveToRelative(-0.01f, -0.01f, -0.02f, -0.03f, -0.03f, -0.04f)
                curveToRelative(-1.54f, -2.06f, -3.94f, -3.23f, -6.47f, -3.23f)
                curveToRelative(-0.45f, 0.0f, -0.89f, 0.04f, -1.34f, 0.11f)
                curveToRelative(-3.03f, 0.5f, -5.59f, 2.82f, -6.38f, 5.76f)
                curveToRelative(-0.89f, 3.31f, 0.54f, 5.82f, 1.47f, 7.02f)
                curveToRelative(0.81f, 1.04f, 1.24f, 2.25f, 1.24f, 3.48f)
                verticalLineToRelative(1.12f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.61f)
                curveToRelative(1.26f, 0.0f, 2.32f, -0.94f, 2.48f, -2.19f)
                lineToRelative(0.32f, -2.5f)
                curveToRelative(0.09f, -0.75f, 0.73f, -1.31f, 1.49f, -1.31f)
                horizontalLineToRelative(0.39f)
                close()
            }
        }
        .build()
        return _headSideMedical!!
    }

private var _headSideMedical: ImageVector? = null
