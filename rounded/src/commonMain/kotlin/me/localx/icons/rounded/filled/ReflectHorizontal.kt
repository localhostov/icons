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

public val Icons.Filled.ReflectHorizontal: ImageVector
    get() {
        if (_reflectHorizontal != null) {
            return _reflectHorizontal!!
        }
        _reflectHorizontal = Builder(name = "ReflectHorizontal", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                lineTo(13.0f, 23.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(3.15f, 18.5f)
                lineToRelative(5.08f, -4.79f)
                curveToRelative(0.49f, -0.43f, 0.76f, -1.06f, 0.76f, -1.71f)
                reflectiveCurveToRelative(-0.28f, -1.28f, -0.75f, -1.69f)
                lineTo(3.14f, 5.49f)
                curveToRelative(-0.56f, -0.51f, -1.33f, -0.63f, -2.02f, -0.33f)
                curveToRelative(-0.69f, 0.3f, -1.12f, 0.96f, -1.12f, 1.72f)
                verticalLineToRelative(10.25f)
                curveToRelative(0.0f, 0.75f, 0.43f, 1.41f, 1.12f, 1.72f)
                curveToRelative(0.25f, 0.11f, 0.51f, 0.16f, 0.76f, 0.16f)
                curveToRelative(0.46f, 0.0f, 0.91f, -0.17f, 1.27f, -0.5f)
                close()
                moveTo(22.88f, 18.84f)
                curveToRelative(0.69f, -0.3f, 1.12f, -0.96f, 1.12f, -1.72f)
                lineTo(24.0f, 6.88f)
                curveToRelative(0.0f, -0.75f, -0.43f, -1.41f, -1.12f, -1.72f)
                curveToRelative(-0.69f, -0.3f, -1.46f, -0.18f, -2.03f, 0.34f)
                lineToRelative(-5.08f, 4.79f)
                curveToRelative(-0.49f, 0.44f, -0.76f, 1.06f, -0.76f, 1.71f)
                reflectiveCurveToRelative(0.28f, 1.27f, 0.75f, 1.69f)
                lineToRelative(5.11f, 4.81f)
                curveToRelative(0.36f, 0.33f, 0.8f, 0.5f, 1.26f, 0.5f)
                curveToRelative(0.26f, 0.0f, 0.52f, -0.05f, 0.76f, -0.16f)
                close()
            }
        }
        .build()
        return _reflectHorizontal!!
    }

private var _reflectHorizontal: ImageVector? = null
