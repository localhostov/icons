package me.localx.icons.straight.filled

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
                moveTo(24.0f, 24.0f)
                curveToRelative(-1.54f, 0.0f, -2.29f, -1.12f, -2.83f, -1.95f)
                curveToRelative(-0.5f, -0.75f, -0.75f, -1.05f, -1.17f, -1.05f)
                curveToRelative(-0.51f, 0.0f, -0.9f, 0.44f, -1.51f, 1.15f)
                curveToRelative(-0.7f, 0.83f, -1.57f, 1.85f, -3.03f, 1.85f)
                reflectiveCurveToRelative(-2.32f, -1.03f, -3.0f, -1.87f)
                curveToRelative(-0.58f, -0.7f, -0.96f, -1.13f, -1.46f, -1.13f)
                reflectiveCurveToRelative(-0.97f, 0.39f, -1.71f, 1.03f)
                curveToRelative(-1.01f, 0.88f, -2.27f, 1.97f, -4.29f, 1.97f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.28f, 0.0f, 2.1f, -0.72f, 2.98f, -1.48f)
                curveToRelative(0.86f, -0.75f, 1.75f, -1.52f, 3.02f, -1.52f)
                curveToRelative(1.47f, 0.0f, 2.32f, 1.03f, 3.0f, 1.87f)
                curveToRelative(0.58f, 0.7f, 0.96f, 1.13f, 1.46f, 1.13f)
                reflectiveCurveToRelative(0.9f, -0.44f, 1.51f, -1.15f)
                curveToRelative(0.7f, -0.83f, 1.57f, -1.85f, 3.03f, -1.85f)
                reflectiveCurveToRelative(2.29f, 1.12f, 2.83f, 1.95f)
                curveToRelative(0.5f, 0.75f, 0.75f, 1.05f, 1.17f, 1.05f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.89f, 3.52f)
                lineTo(8.0f, 12.41f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineTo(20.48f, 7.11f)
                lineToRelative(-3.59f, -3.59f)
                close()
                moveTo(23.26f, 0.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-1.36f, 1.36f)
                lineToRelative(3.59f, 3.59f)
                lineToRelative(1.36f, -1.36f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.8f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                close()
            }
        }
        .build()
        return _attributionPencil!!
    }

private var _attributionPencil: ImageVector? = null
