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

public val Icons.Outline.ReflectHorizontal: ImageVector
    get() {
        if (_reflectHorizontal != null) {
            return _reflectHorizontal!!
        }
        _reflectHorizontal = Builder(name = "ReflectHorizontal", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 1.0f)
                lineTo(13.0f, 23.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(0.0f, 0.65f, -0.28f, 1.28f, -0.76f, 1.71f)
                lineToRelative(-5.08f, 4.79f)
                curveToRelative(-0.36f, 0.33f, -0.81f, 0.5f, -1.27f, 0.5f)
                curveToRelative(-0.26f, 0.0f, -0.51f, -0.05f, -0.76f, -0.16f)
                curveToRelative(-0.69f, -0.3f, -1.12f, -0.96f, -1.12f, -1.72f)
                lineTo(0.01f, 6.88f)
                curveToRelative(0.0f, -0.75f, 0.43f, -1.41f, 1.12f, -1.72f)
                curveToRelative(0.69f, -0.3f, 1.47f, -0.18f, 2.02f, 0.33f)
                lineToRelative(5.11f, 4.81f)
                curveToRelative(0.47f, 0.42f, 0.75f, 1.04f, 0.75f, 1.69f)
                close()
                moveTo(7.0f, 12.0f)
                reflectiveCurveToRelative(-0.01f, -0.14f, -0.1f, -0.22f)
                lineTo(2.0f, 7.17f)
                verticalLineToRelative(9.67f)
                lineToRelative(4.88f, -4.6f)
                curveToRelative(0.1f, -0.09f, 0.12f, -0.19f, 0.12f, -0.24f)
                close()
                moveTo(24.0f, 6.88f)
                verticalLineToRelative(10.25f)
                curveToRelative(0.0f, 0.75f, -0.43f, 1.41f, -1.12f, 1.72f)
                curveToRelative(-0.25f, 0.11f, -0.51f, 0.16f, -0.76f, 0.16f)
                curveToRelative(-0.46f, 0.0f, -0.9f, -0.17f, -1.26f, -0.5f)
                lineToRelative(-5.11f, -4.81f)
                curveToRelative(-0.47f, -0.42f, -0.75f, -1.04f, -0.75f, -1.69f)
                reflectiveCurveToRelative(0.28f, -1.27f, 0.76f, -1.71f)
                lineToRelative(5.08f, -4.79f)
                curveToRelative(0.57f, -0.52f, 1.34f, -0.65f, 2.03f, -0.34f)
                curveToRelative(0.69f, 0.3f, 1.12f, 0.96f, 1.12f, 1.72f)
                close()
            }
        }
        .build()
        return _reflectHorizontal!!
    }

private var _reflectHorizontal: ImageVector? = null
