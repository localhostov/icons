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
                moveTo(15.0f, 10.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 13.0f)
                curveToRelative(0.0f, 0.97f, -0.7f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-0.22f, 1.66f)
                curveToRelative(-0.33f, 2.48f, -2.46f, 4.34f, -4.96f, 4.34f)
                horizontalLineToRelative(-0.49f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0.0f, -0.9f, -0.26f, -1.73f, -0.74f, -2.36f)
                curveTo(0.58f, 15.48f, -0.2f, 12.75f, 0.05f, 9.98f)
                curveTo(0.5f, 4.95f, 4.46f, 0.79f, 9.45f, 0.11f)
                curveToRelative(4.04f, -0.56f, 7.91f, 1.06f, 10.35f, 4.31f)
                curveToRelative(1.27f, 1.57f, 4.2f, 7.16f, 4.2f, 8.58f)
                close()
                moveTo(22.0f, 13.0f)
                curveToRelative(-0.12f, -0.9f, -2.47f, -5.74f, -3.78f, -7.35f)
                curveToRelative(-1.76f, -2.34f, -4.38f, -3.65f, -7.22f, -3.65f)
                curveToRelative(-0.42f, 0.0f, -0.85f, 0.03f, -1.28f, 0.09f)
                curveToRelative(-4.08f, 0.56f, -7.31f, 3.96f, -7.69f, 8.07f)
                curveToRelative(-0.21f, 2.27f, 0.44f, 4.5f, 1.81f, 6.3f)
                curveToRelative(0.74f, 0.97f, 1.15f, 2.24f, 1.15f, 3.57f)
                verticalLineToRelative(0.97f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.49f)
                curveToRelative(1.5f, 0.0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.33f, -2.52f)
                curveToRelative(0.07f, -0.5f, 0.49f, -0.87f, 0.99f, -0.87f)
                horizontalLineToRelative(1.2f)
                close()
            }
        }
        .build()
        return _headSideMedical!!
    }

private var _headSideMedical: ImageVector? = null
