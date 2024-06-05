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

public val Icons.Outline.IconStar: ImageVector
    get() {
        if (_iconStar != null) {
            return _iconStar!!
        }
        _iconStar = Builder(name = "IconStar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveTo(0.0f, 2.24f, 2.24f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(7.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(23.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(19.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(15.9f, 16.14f)
                lineToRelative(-0.9f, -2.73f)
                lineToRelative(2.17f, -1.77f)
                curveToRelative(0.29f, -0.25f, 0.4f, -0.65f, 0.27f, -1.02f)
                reflectiveCurveToRelative(-0.48f, -0.6f, -0.86f, -0.6f)
                horizontalLineToRelative(-2.75f)
                lineToRelative(-0.97f, -2.61f)
                curveToRelative(-0.13f, -0.36f, -0.48f, -0.6f, -0.86f, -0.6f)
                reflectiveCurveToRelative(-0.73f, 0.24f, -0.86f, 0.6f)
                lineToRelative(-0.97f, 2.61f)
                horizontalLineToRelative(-2.75f)
                curveToRelative(-0.38f, 0.0f, -0.73f, 0.24f, -0.86f, 0.6f)
                curveToRelative(-0.13f, 0.36f, -0.03f, 0.77f, 0.27f, 1.01f)
                lineToRelative(2.18f, 1.77f)
                lineToRelative(-0.86f, 2.76f)
                curveToRelative(-0.12f, 0.37f, 0.01f, 0.78f, 0.32f, 1.01f)
                curveToRelative(0.16f, 0.12f, 0.36f, 0.18f, 0.55f, 0.18f)
                curveToRelative(0.18f, 0.0f, 0.36f, -0.05f, 0.51f, -0.15f)
                lineToRelative(2.48f, -1.66f)
                lineToRelative(2.52f, 1.64f)
                curveToRelative(0.33f, 0.21f, 0.75f, 0.2f, 1.06f, -0.04f)
                curveToRelative(0.31f, -0.24f, 0.43f, -0.64f, 0.31f, -1.01f)
                close()
            }
        }
        .build()
        return _iconStar!!
    }

private var _iconStar: ImageVector? = null
