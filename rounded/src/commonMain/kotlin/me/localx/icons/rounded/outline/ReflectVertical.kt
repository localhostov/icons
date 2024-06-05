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

public val Icons.Outline.ReflectVertical: ImageVector
    get() {
        if (_reflectVertical != null) {
            return _reflectVertical!!
        }
        _reflectVertical = Builder(name = "ReflectVertical", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(23.0f, 11.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(5.5f, 3.15f)
                curveToRelative(-0.52f, -0.57f, -0.65f, -1.34f, -0.34f, -2.03f)
                reflectiveCurveToRelative(0.96f, -1.12f, 1.72f, -1.12f)
                horizontalLineToRelative(10.25f)
                curveToRelative(0.75f, 0.0f, 1.41f, 0.43f, 1.72f, 1.12f)
                reflectiveCurveToRelative(0.18f, 1.46f, -0.33f, 2.02f)
                lineToRelative(-4.81f, 5.11f)
                curveToRelative(-0.42f, 0.47f, -1.04f, 0.75f, -1.69f, 0.75f)
                reflectiveCurveToRelative(-1.27f, -0.28f, -1.71f, -0.76f)
                lineTo(5.5f, 3.15f)
                close()
                moveTo(7.16f, 2.0f)
                lineToRelative(4.6f, 4.88f)
                curveToRelative(0.19f, 0.21f, 0.3f, 0.19f, 0.46f, 0.02f)
                lineToRelative(4.61f, -4.9f)
                lineTo(7.17f, 2.0f)
                close()
                moveTo(18.49f, 20.85f)
                curveToRelative(0.52f, 0.57f, 0.65f, 1.34f, 0.34f, 2.03f)
                reflectiveCurveToRelative(-0.96f, 1.12f, -1.72f, 1.12f)
                lineTo(6.88f, 24.0f)
                curveToRelative(-0.75f, 0.0f, -1.41f, -0.43f, -1.72f, -1.12f)
                reflectiveCurveToRelative(-0.18f, -1.46f, 0.33f, -2.02f)
                lineToRelative(4.81f, -5.11f)
                curveToRelative(0.84f, -0.93f, 2.53f, -0.95f, 3.4f, 0.02f)
                lineToRelative(4.79f, 5.08f)
                close()
            }
        }
        .build()
        return _reflectVertical!!
    }

private var _reflectVertical: ImageVector? = null
