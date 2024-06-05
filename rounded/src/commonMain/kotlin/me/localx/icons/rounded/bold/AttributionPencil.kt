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

public val Icons.Bold.AttributionPencil: ImageVector
    get() {
        if (_attributionPencil != null) {
            return _attributionPencil!!
        }
        _attributionPencil = Builder(name = "AttributionPencil", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.53f, 16.0f)
                horizontalLineToRelative(-1.53f)
                curveToRelative(-0.56f, 0.0f, -1.01f, -0.45f, -1.01f, -1.01f)
                verticalLineToRelative(-1.53f)
                curveToRelative(0.0f, -0.8f, 0.32f, -1.56f, 0.88f, -2.12f)
                lineToRelative(6.58f, -6.57f)
                lineToRelative(3.78f, 3.78f)
                lineToRelative(-6.57f, 6.58f)
                curveToRelative(-0.56f, 0.56f, -1.33f, 0.88f, -2.12f, 0.88f)
                close()
                moveTo(23.22f, 4.56f)
                curveToRelative(1.04f, -1.04f, 1.04f, -2.73f, 0.0f, -3.78f)
                curveToRelative(-1.04f, -1.04f, -2.73f, -1.04f, -3.78f, 0.0f)
                lineToRelative(-1.87f, 1.87f)
                lineToRelative(3.78f, 3.78f)
                lineToRelative(1.87f, -1.87f)
                close()
                moveTo(22.5f, 21.0f)
                curveToRelative(-0.17f, 0.0f, -0.36f, -0.25f, -0.75f, -0.83f)
                curveToRelative(-0.58f, -0.86f, -1.45f, -2.17f, -3.25f, -2.17f)
                reflectiveCurveToRelative(-2.67f, 1.3f, -3.25f, 2.17f)
                curveToRelative(-0.78f, 1.17f, -0.72f, 1.17f, -1.5f, 0.0f)
                curveToRelative(-0.58f, -0.86f, -1.45f, -2.17f, -3.25f, -2.17f)
                curveToRelative(-1.61f, 0.0f, -2.47f, 1.05f, -3.1f, 1.82f)
                curveToRelative(-0.65f, 0.79f, -1.0f, 1.18f, -1.9f, 1.18f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.14f, 0.77f, -2.14f, 1.87f, -2.42f)
                curveToRelative(0.8f, -0.21f, 1.29f, -1.02f, 1.08f, -1.83f)
                reflectiveCurveToRelative(-1.02f, -1.28f, -1.83f, -1.08f)
                curveToRelative(-2.43f, 0.63f, -4.13f, 2.82f, -4.13f, 5.33f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.36f, 0.0f, 3.48f, -1.37f, 4.22f, -2.28f)
                curveToRelative(0.44f, -0.54f, 0.62f, -0.72f, 0.78f, -0.72f)
                curveToRelative(0.17f, 0.0f, 0.36f, 0.25f, 0.75f, 0.83f)
                curveToRelative(0.58f, 0.86f, 1.45f, 2.17f, 3.25f, 2.17f)
                reflectiveCurveToRelative(2.67f, -1.3f, 3.25f, -2.17f)
                curveToRelative(0.78f, -1.17f, 0.72f, -1.17f, 1.5f, 0.0f)
                curveToRelative(0.58f, 0.86f, 1.45f, 2.17f, 3.25f, 2.17f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _attributionPencil!!
    }

private var _attributionPencil: ImageVector? = null
