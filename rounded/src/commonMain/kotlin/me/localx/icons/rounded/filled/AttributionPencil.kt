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

public val Icons.Filled.AttributionPencil: ImageVector
    get() {
        if (_attributionPencil != null) {
            return _attributionPencil!!
        }
        _attributionPencil = Builder(name = "AttributionPencil", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-1.54f, 0.0f, -2.29f, -1.12f, -2.83f, -1.95f)
                curveToRelative(-0.5f, -0.75f, -0.75f, -1.05f, -1.17f, -1.05f)
                curveToRelative(-0.51f, 0.0f, -0.9f, 0.44f, -1.51f, 1.15f)
                curveToRelative(-0.7f, 0.83f, -1.57f, 1.85f, -3.03f, 1.85f)
                reflectiveCurveToRelative(-2.32f, -1.03f, -3.0f, -1.87f)
                curveToRelative(-0.58f, -0.7f, -0.96f, -1.13f, -1.46f, -1.13f)
                curveToRelative(-0.39f, 0.0f, -0.63f, 0.25f, -1.16f, 0.91f)
                curveToRelative(-0.72f, 0.88f, -1.71f, 2.09f, -3.84f, 2.09f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.18f, 0.0f, 1.67f, -0.6f, 2.29f, -1.36f)
                curveToRelative(0.6f, -0.73f, 1.34f, -1.64f, 2.71f, -1.64f)
                curveToRelative(1.47f, 0.0f, 2.32f, 1.03f, 3.0f, 1.87f)
                curveToRelative(0.58f, 0.7f, 0.96f, 1.13f, 1.46f, 1.13f)
                reflectiveCurveToRelative(0.9f, -0.44f, 1.51f, -1.15f)
                curveToRelative(0.7f, -0.83f, 1.57f, -1.85f, 3.03f, -1.85f)
                reflectiveCurveToRelative(2.29f, 1.12f, 2.83f, 1.95f)
                curveToRelative(0.5f, 0.75f, 0.75f, 1.05f, 1.17f, 1.05f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(8.99f, 16.0f)
                horizontalLineToRelative(0.94f)
                curveToRelative(1.06f, 0.0f, 2.08f, -0.42f, 2.83f, -1.17f)
                lineToRelative(7.72f, -7.72f)
                lineToRelative(-3.59f, -3.59f)
                lineToRelative(-7.72f, 7.72f)
                curveToRelative(-0.75f, 0.75f, -1.17f, 1.77f, -1.17f, 2.83f)
                verticalLineToRelative(0.94f)
                curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                close()
                moveTo(23.26f, 4.33f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.8f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-1.36f, 1.36f)
                lineToRelative(3.59f, 3.59f)
                lineToRelative(1.36f, -1.36f)
                close()
            }
        }
        .build()
        return _attributionPencil!!
    }

private var _attributionPencil: ImageVector? = null
